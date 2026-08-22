package RotateMatrix;

// TC => O(N^2)
// SC => O(1)
public class Solution {

    private void reverse(int[] A) {

        int lo = 0, hi = A.length - 1;

        while (lo < hi) {
            int temp = A[lo];
            A[lo] = A[hi];
            A[hi] = temp;

            lo++;
            hi--;
        }
    }

    private void transpose(int[][] A) {

        int n = A.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }

    public void solve(int[][] A) {

        transpose(A);

        for (int[] arr : A)
            reverse(arr);
    }
}
