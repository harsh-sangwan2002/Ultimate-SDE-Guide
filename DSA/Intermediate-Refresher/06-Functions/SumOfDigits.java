import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(int n) {

        int sum = 0;

        while (n != 0) {
            int ld = n % 10;
            sum += ld;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt(), n2 = scn.nextInt(), n3 = scn.nextInt();

        int s1 = sumOfDigits(n1);
        int s2 = sumOfDigits(n2);
        int s3 = sumOfDigits(n3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        scn.close();
    }
}