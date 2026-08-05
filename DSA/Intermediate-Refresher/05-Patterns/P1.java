import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), nst = n;

        for (int cst = 1; cst <= nst; cst++)
            System.out.print("* ");

        System.out.println();
        scn.close();
    }
}