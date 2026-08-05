public class MaxElement {

    public static void printMaximum(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println(max);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 3, 4, 5 };
        printMaximum(arr);
    }
}
