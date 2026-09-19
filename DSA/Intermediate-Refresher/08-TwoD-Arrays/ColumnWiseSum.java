public class ColumnWiseSum {

    public static void printArray(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();
    }

    public static int[] printColumnWiseSum(int[][] mat) {

        int n = mat.length, m = mat[0].length;
        int[] res = new int[n];

        for (int j = 0; j < m; j++) {

            int sum = 0;

            for (int i = 0; i < n; i++)
                sum += mat[i][j];

            res[j] = sum;
        }

        return res;
    }

    public static void main(String[] args) {

        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] res = printColumnWiseSum(mat);

        printArray(res);
    }
}
