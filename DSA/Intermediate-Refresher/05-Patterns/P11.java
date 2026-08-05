import java.util.Scanner;

public class P11 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), nst = 1, nsp = n - 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print(" ");

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("* ");

            System.out.println();
            nst++;
            nsp--;
        }

        scn.close();
    }
}
