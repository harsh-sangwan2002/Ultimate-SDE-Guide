package SelectionSort;

// TC => O(N^2)
// SC => O(1) in-place sorting algo
public class Solution {

    public static void printArray(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();
    }

    public static void swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIdx = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }

            if (i != minIdx) {
                System.out.println("Swapping " + arr[i] + " with " + arr[minIdx]);
                swap(arr, i, minIdx);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 4, 7, 10, 8, 9 };
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }
}
