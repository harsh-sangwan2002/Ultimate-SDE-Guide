import java.util.Scanner;

public class RowSum {

    public static int[] rowSum(int mat[][]) {

        int n = mat.length, m = mat[0].length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            int rowSum = 0;
            for (int j = 0; j < m; j++)
                rowSum += mat[i][j];

            res[i] = rowSum;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();

        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++)
                mat[i][j] = scn.nextInt();
        }

        int[] ans = rowSum(mat);

        for (int val : ans)
            System.out.print(val + " ");

        System.out.println();

        scn.close();
    }
}
