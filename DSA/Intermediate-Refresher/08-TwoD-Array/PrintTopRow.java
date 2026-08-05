public class PrintTopRow {

    public static void main(String[] args) {

        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int m = mat[0].length, j = 0;

        while (j < m) {
            System.out.print(mat[0][j] + " ");
            j++;
        }

        System.out.println();
    }
}