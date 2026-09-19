public class PrintTopRow {

    public static void printTopRow(int[][] mat) {

        int m = mat[0].length;

        for (int i = 0; i < m; i++)
            System.out.print(mat[0][i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printTopRow(mat);
    }
}
