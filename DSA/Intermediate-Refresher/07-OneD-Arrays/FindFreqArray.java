import java.util.Scanner;

public class FindFreqArray {

    public static void printArray(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();
    }

    public static int[] findFreqArray(int[] arr) {

        int n = arr.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {

            int count = 0;
            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j])
                    count++;
            }

            freq[i] = count;
        }

        return freq;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] res = findFreqArray(arr);
        printArray(res);
        scn.close();
    }
}
