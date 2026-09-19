import java.util.Scanner;

public class LinearSearch {

    public static boolean linearSearch(int[] arr, int tar) {

        for (int val : arr) {

            if (val == tar)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        System.out.println(linearSearch(arr, tar));
        scn.close();
    }
}
