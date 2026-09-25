public class BubbleSort {

    public static void swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);

        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();
    }
}