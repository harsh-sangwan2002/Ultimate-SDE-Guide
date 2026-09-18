import java.util.Scanner;

public class PrintPrimes {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t-- > 0) {

            int num = scn.nextInt();
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (num != 1 && isPrime)
                System.out.println(num + " is a prime number.");

            else
                System.out.println(num + " is not a prime number.");
        }

        System.out.println();
        scn.close();
    }
}
