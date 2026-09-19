import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int r = 1; r <= n; r++) {
            System.out.print("* ");
        }

        System.out.println();
        scn.close();
    }
}