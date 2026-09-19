import java.util.Scanner;

public class FindMaxElement {

    public static void findMaxElement(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int val : arr)
            max = Math.max(val, max);

        System.out.println(max);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        findMaxElement(arr);
        scn.close();
    }
}
