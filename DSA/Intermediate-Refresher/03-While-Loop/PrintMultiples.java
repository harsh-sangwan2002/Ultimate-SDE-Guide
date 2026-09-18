import java.util.Scanner;

public class PrintMultiples {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), i = 4;

        while (i <= n) {
            System.out.print(i + " ");
            i += 4;
        }

        System.out.println();
        scn.close();
    }
}
