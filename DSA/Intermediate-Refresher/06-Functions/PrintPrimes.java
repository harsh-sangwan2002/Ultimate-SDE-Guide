import java.util.Scanner;

public class PrintPrimes {

    public static boolean checkPrime(int n) {

        for (int i = 2; i < n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void printPrimes(int n) {

        for (int i = 1; i <= n; i++) {

            if (checkPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printPrimes(n);
        scn.close();
    }
}
