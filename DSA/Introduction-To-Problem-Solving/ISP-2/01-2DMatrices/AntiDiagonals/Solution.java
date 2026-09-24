package AntiDiagonals;

// TC => O(N^2)
// SC => O(N^2)
public class Solution {

    public int[][] diagonal(int[][] A) {

        int n = A.length, size = 2 * n - 1;
        int[][] res = new int[size][];
        int idx = 0;

        for (int j = 0; j < n; j++) {

            int row = 0, col = j, idx2 = 0;
            int[] temp = new int[n];

            while (row < n && col >= 0)
                temp[idx2++] = A[row++][col--];

            res[idx++] = temp;
        }

        for (int i = 1; i < n; i++) {

            int row = i, col = n - 1, idx2 = 0;
            int[] temp = new int[n];

            while (row < n && col >= 0)
                temp[idx2++] = A[row++][col--];

            res[idx++] = temp;
        }

        return res;
    }
}
