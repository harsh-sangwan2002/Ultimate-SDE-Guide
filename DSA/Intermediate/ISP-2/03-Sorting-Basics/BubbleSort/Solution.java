package BubbleSort;

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

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = i; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 4, 7, 10, 8, 9 };
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }
}
