import java.util.Scanner;

public class DigitsSum {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), sumOfDigits = 0;

        while (n > 0) {
            int ld = n % 10;
            sumOfDigits += ld;
            n /= 10;
        }

        System.out.println(sumOfDigits);
        scn.close();
    }
}
