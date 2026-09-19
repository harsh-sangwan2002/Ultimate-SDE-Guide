import java.util.Scanner;

public class CheckArray {

    public static boolean checkArray(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            if (arr[i] <= arr[i - 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        System.out.println(checkArray(arr));
        scn.close();
    }
}
