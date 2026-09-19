import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();
        scn.close();
    }
}
