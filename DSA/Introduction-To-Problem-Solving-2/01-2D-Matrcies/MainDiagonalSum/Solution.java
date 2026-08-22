package MainDiagonalSum;

// TC => O(N)
// SC => O(1)
public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {

        int sum = 0, i = 0, n = A.length;

        while (i < n)
            sum += A[i][i++];

        return sum;
    }
}
