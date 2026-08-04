import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 2; i < n;) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                System.exit(0);
            }
            i++;
        }

        System.out.println(n + " is a prime number.");

        scn.close();
    }
}
