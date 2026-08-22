public class Array {

    public static void main(String[] args) {

        int[] arr = new int[3];
        int[] arr2 = arr;

        System.out.println(arr);
        System.out.println(arr2);
        arr2[0] = 100;

        System.out.println(arr[0]);
    }
}