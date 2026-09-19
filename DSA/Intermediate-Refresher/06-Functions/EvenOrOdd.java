import java.util.Scanner;

public class EvenOrOdd {

    public static String checkEvenOdd(int n) {

        return n % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(checkEvenOdd(n));

        scn.close();
    }
}
