import java.util.Scanner;

public class FindFreq {

    public static int findFreq(int[] arr, int n) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = { 1, 2, 1, 3, 1 };

        int freq = findFreq(arr, n);
        System.out.println(freq);

        scn.close();
    }
}
