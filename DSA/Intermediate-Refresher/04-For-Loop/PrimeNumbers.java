import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && n != 1)
            System.out.println("It's a prime number");

        else
            System.out.println("It's not a prime number");

        scn.close();
    }
}
