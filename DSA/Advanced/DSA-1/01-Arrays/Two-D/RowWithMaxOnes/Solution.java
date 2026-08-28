package RowWithMaxOnes;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(int[][] A) {

        int ans = 0, n = A.length;
        int i = 0, j = n - 1;

        while (i < n && j >= 0) {

            while (j >= 0 && A[i][j] == 1) {
                ans = i;
                j--;
            }

            i++;
        }

        return ans;
    }
}
