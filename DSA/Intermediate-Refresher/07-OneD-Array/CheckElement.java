import java.util.Scanner;

public class CheckElement {

    public static boolean checkElement(int arr[], int n) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = { 1, 2, 3, 4, 5 };

        boolean isPresent = checkElement(arr, n);
        System.out.println(isPresent ? "Present" : "Not present");

        scn.close();
    }
}
