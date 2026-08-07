import java.util.Scanner;

public class Main {

    public static int countDigits(int num) {

        int digits = 0;

        while (num != 0) {
            digits++;
            num /= 10;
        }

        return digits;
    }

    public static int reverse(int num) {

        int res = 0;

        while (num != 0) {

            int ld = num % 10;
            num /= 10;
            res = res * 10 + ld;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        double num = scn.nextDouble();

        int integerPart = (int) num;
        double fraction = num - integerPart;
        int fractionalPart = (int) (fraction * Math.pow(10, 12));
        System.out.println(fractionalPart);

        int reversedInteger = reverse(integerPart);
        int reversedFraction = reverse(fractionalPart);
        int nod = countDigits(reversedFraction);
        int res = (int) (Math.pow(10, nod)) * reversedFraction + reversedInteger;

        System.out.println(res);

        scn.close();
    }
}