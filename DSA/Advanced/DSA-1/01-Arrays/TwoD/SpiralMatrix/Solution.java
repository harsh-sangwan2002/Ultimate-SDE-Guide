// TC => O(N^2)
// SC => O(N^2)
public class Solution {

    public int[][] generateMatrix(int A) {

        int[][] mat = new int[A][A];
        int minC = 0, minR = 0, maxR = A - 1, maxC = A - 1;
        int count = 1, te = A * A;

        while (count <= te) {

            // Top wall
            for (int col = minC; col <= maxC && count <= te; col++) {
                mat[minR][col] = count;
                count++;
            }
            minR++;

            // Right wall
            for (int row = minR; row <= maxR && count <= te; row++) {
                mat[row][maxC] = count;
                count++;
            }
            maxC--;

            // Bottom wall
            for (int col = maxC; col >= minC && count <= te; col--) {
                mat[maxR][col] = count;
                count++;
            }
            maxR--;

            // Left wall
            for (int row = maxR; row >= minR && count <= te; row--) {
                mat[row][minC] = count;
                count++;
            }
            minC++;
        }

        return mat;
    }
}
