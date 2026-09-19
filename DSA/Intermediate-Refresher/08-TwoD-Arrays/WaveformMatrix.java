public class WaveformMatrix {

    public static void waveformMatrix(int[][] mat) {

        int n = mat.length, m = mat[0].length;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < m; j++)
                    System.out.print(mat[i][j] + " ");

            }

            else {
                for (int j = m - 1; j >= 0; j--)
                    System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        waveformMatrix(mat);
    }
}
