import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), res = 0;

        while (n > 0) {
            int ld = n % 10;
            res = res * 10 + ld;
            n /= 10;
        }

        System.out.println(res);
        scn.close();
    }
}
