import java.util.Scanner;

public class MatrixSum {

    public static int matrixSum(int mat[][]) {

        int n = mat.length, m = mat[0].length, sum = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++)
                sum += mat[i][j];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();

        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++)
                mat[i][j] = scn.nextInt();
        }

        System.out.println(matrixSum(mat));
        scn.close();
    }
}
