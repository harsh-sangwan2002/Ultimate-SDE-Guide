import java.util.Scanner;

public class PrintNTo1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = n;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        scn.close();
    }
}
