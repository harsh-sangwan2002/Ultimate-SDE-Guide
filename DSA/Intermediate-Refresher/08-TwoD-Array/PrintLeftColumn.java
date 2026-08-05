public class PrintLeftColumn {

    public static void main(String[] args) {

        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = mat.length, i = 0;

        while (i < n) {
            System.out.print(mat[i][0] + " ");
            i++;
        }

        System.out.println();
    }
}
