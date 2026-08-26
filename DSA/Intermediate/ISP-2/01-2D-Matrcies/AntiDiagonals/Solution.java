package AntiDiagonals;

// TC => O(N^2)
// SC => O(N^2)
public class Solution {

    public int[][] diagonal(int[][] A) {

        int n = A.length, size = 2 * n - 1;
        int[][] res = new int[size][];
        int idx1 = 0;

        for (int col = 0; col < n; col++) {

            int r = 0, c = col, idx2 = 0;
            int[] temp = new int[n];

            while (r < n && c >= 0)
                temp[idx2++] = A[r++][c--];

            res[idx1++] = temp;
        }

        for (int row = 1; row < n; row++) {

            int r = row, c = n - 1, idx2 = 0;
            int[] temp = new int[n];

            while (r < n && c >= 0)
                temp[idx2++] = A[r++][c--];

            res[idx1++] = temp;
        }

        return res;
    }
}
