import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt(), res = 0;

        while (num != 0) {

            int ld = num % 10;
            res = res * 10 + ld;
            num /= 10;
        }

        System.out.println(res);
        scn.close();
    }
}
