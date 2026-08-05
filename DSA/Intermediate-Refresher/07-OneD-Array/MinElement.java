public class MinElement {

    public static void printMinimum(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println(min);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        printMinimum(arr);
    }
}
