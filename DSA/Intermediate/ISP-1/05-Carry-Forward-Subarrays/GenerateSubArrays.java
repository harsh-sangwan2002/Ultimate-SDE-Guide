public class GenerateSubArrays {

    public static void printArray(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();
    }

    public static void printSubArrays(int[] arr, int n) {

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                for (int k = i; k <= j; k++)
                    System.out.print(arr[k] + " ");

                System.out.println();
            }
        }
    }

    public static int[][] generateSubArrays(int[] arr, int n) {

        int size = n * (n + 1) / 2, idx = 0;
        int[][] res = new int[size][];

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int[] temp = new int[j - i + 1];

                for (int k = i; k <= j; k++)
                    temp[k - i] = arr[k];

                res[idx++] = temp;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30 };
        int n = arr.length;

        // printSubArrays(arr, n);
        int[][] res = generateSubArrays(arr, n);
        System.out.println(res.length);

        for (int[] A : res) {

            for (int val : A)
                System.out.print(val + " ");

            System.out.println();
        }
    }
}