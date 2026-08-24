package InsertionSort;

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

    public static void insetionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int j = i - 1;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                j--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 4, 7, 10, 8, 9 };
        printArray(arr);
        insetionSort(arr);
        printArray(arr);
    }
}
