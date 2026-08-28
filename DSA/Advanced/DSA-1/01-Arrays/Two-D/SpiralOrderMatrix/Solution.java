package SpiralOrderMatrix;

// TC => O(N^2)
// SC => O(N^2)
public class Solution {

    public int[][] generateMatrix(int A) {

        int[][] mat = new int[A][A];
        int minR = 0, minC = 0, maxR = A - 1, maxC = A - 1;
        int te = A * A, count = 1;

        while (count <= te) {

            // Top boundary
            for (int j = minC; j <= maxC && count <= te; j++) {
                mat[minR][j] = count;
                count++;
            }
            minR++;

            // Right boundary
            for (int i = minR; i <= maxR && count <= te; i++) {
                mat[i][maxC] = count;
                count++;
            }
            maxC--;

            // Bottom boundary
            for (int j = maxC; j >= minC && count <= te; j--) {
                mat[maxR][j] = count;
                count++;
            }
            maxR--;

            // Left boundary
            for (int i = maxR; i >= minR && count <= te; i--) {
                mat[i][minC] = count;
                count++;
            }
            minC++;
        }

        return mat;
    }
}
