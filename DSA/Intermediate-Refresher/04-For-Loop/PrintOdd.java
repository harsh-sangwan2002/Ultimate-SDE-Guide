import java.util.Scanner;

public class PrintOdd {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i += 2)
            System.out.print(i + " ");

        System.out.println();
        scn.close();
    }
}
