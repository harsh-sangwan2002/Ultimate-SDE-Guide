package RotateMatrix;

// TC => O(N^2)
// SC => O(1)
public class Solution {

    private void reverse(int[] arr) {

        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }
    }

    private void tranpose(int[][] mat) {

        int n = mat.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public void solve(int[][] A) {

        tranpose(A);

        for (int[] arr : A)
            reverse(arr);
    }
}
