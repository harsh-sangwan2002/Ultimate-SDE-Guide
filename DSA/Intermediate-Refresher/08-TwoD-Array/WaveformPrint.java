import java.util.Scanner;

public class WaveformPrint {

    public static void printInWaveForm(int[][] mat) {

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

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();

        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++)
                mat[i][j] = scn.nextInt();
        }

        printInWaveForm(mat);

        scn.close();
    }
}
