import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt(), sumOfDigits = 0;

        while (num != 0) {
            int ld = num % 10;
            sumOfDigits += ld;
            num /= 10;
        }

        System.out.println(sumOfDigits);
        scn.close();
    }
}
