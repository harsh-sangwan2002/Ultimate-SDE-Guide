import java.util.Scanner;

public class CheckHeight {

    public static String checkHeight(int n) {

        if (n < 10)
            return "Small";

        else if (n >= 10 && n <= 20)
            return "Medium";

        return "Large";
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(checkHeight(n));
        scn.close();
    }
}
