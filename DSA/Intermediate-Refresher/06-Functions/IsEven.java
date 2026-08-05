import java.util.Scanner;

public class IsEven {

    public static boolean checkEven(int n) {

        return n % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(checkEven(n));

        scn.close();
    }
}
