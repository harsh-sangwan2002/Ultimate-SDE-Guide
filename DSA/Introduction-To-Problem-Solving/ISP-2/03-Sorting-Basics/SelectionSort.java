public class SelectionSort {

    public static void swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int minIdx = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }

            swap(arr, i, minIdx);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };
        selectionSort(arr);

        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();
    }
}