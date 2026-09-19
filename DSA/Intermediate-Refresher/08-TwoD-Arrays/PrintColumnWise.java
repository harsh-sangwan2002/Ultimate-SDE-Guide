public class PrintColumnWise {

    public static void printColumnWiseMatrix(int[][] mat) {

        int n = mat.length, m = mat[0].length;

        for (int j = 0; j < m; j++) {

            for (int i = 0; i < n; i++)
                System.out.print(mat[i][j] + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printColumnWiseMatrix(mat);
    }
}
