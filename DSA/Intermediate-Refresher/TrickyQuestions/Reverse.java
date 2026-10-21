import java.util.Scanner;

public class Reverse {

    public static String reverse(String str) {

        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseInteger(int n) {

        StringBuilder sb = new StringBuilder("");
        int temp = n, zeroes = 0, res = 0;

        while (temp % 10 == 0) {
            zeroes++;
            temp /= 10;
        }

        while (n != 0) {
            int ld = n % 10;
            res = res * 10 + ld;
            n /= 10;
        }

        for (int i = 1; i <= zeroes; i++)
            sb.append('0');

        return sb.append(res).toString();
    }

    public static long reverseDecimal(double num) {

        String str = String.valueOf(num);
        int mul = str.length() - str.indexOf('.') - 1;
        long number = Math.round(num * Math.pow(10, mul)), res = 0L;

        while (number != 0) {
            long ld = number % 10;
            res = res * 10 + ld;
            number /= 10;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        System.out.println(reverse(str));

        int n = scn.nextInt();
        System.out.println(reverseInteger(n));

        double d = scn.nextDouble();
        System.out.println(reverseDecimal(d));

        scn.close();
    }
}
