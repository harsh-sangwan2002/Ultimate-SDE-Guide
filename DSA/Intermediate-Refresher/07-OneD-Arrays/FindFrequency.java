import java.util.Scanner;

public class FindFrequency {

    public static int findFrequency(int[] arr, int tar) {

        int count = 0;

        for (int val : arr) {

            if (val == tar)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        System.out.println(findFrequency(arr, tar));
        scn.close();
    }
}
