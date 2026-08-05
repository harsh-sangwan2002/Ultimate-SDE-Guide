import java.util.Scanner;

public class ColumnSum {

    public static int[] columnSum(int mat[][]) {

        int n = mat.length, m = mat[0].length;
        int[] res = new int[n];

        for (int j = 0; j < m; j++) {

            int columnSum = 0;
            for (int i = 0; i < n; i++)
                columnSum += mat[i][j];

            res[j] = columnSum;
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

        int[] ans = columnSum(mat);

        for (int val : ans)
            System.out.print(val + " ");

        System.out.println();

        scn.close();
    }
}
