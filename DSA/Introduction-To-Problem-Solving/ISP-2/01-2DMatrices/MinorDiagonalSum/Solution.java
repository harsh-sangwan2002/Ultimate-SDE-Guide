package MinorDiagonalSum;

// TC => O(N)
// SC => O(1)
public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {

        int n = A.length, r = 0, c = n - 1;
        int sum = 0;

        while (r < n && c >= 0)
            sum += A[r++][c--];

        return sum;
    }
}
