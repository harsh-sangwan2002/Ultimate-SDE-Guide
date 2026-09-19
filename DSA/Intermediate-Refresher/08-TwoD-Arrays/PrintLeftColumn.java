public class PrintLeftColumn {

    public static void printLeftColumn(int[][] mat) {

        int n = mat.length;

        for (int i = 0; i < n; i++)
            System.out.print(mat[i][0] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printLeftColumn(mat);
    }
}
