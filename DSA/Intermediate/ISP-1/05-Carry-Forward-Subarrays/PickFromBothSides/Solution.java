package PickFromBothSides;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(int[] A, int B) {

        int n = A.length, sum = 0;

        for (int i = 0; i < B; i++)
            sum += A[i];

        int ans = sum, i = B - 1, j = n - 1;

        while (i >= 0 && j >= 0) {

            sum -= A[i];
            sum += A[j];
            ans = Math.max(ans, sum);

            i--;
            j--;
        }

        return ans;
    }
}
