import java.util.Scanner;

public class PrintLarger {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt(), b = scn.nextInt();

        if (a > b)
            System.out.println(a + " is greater than " + b);

        else if (b > a)
            System.out.println(b + " is greater than " + a);

        else
            System.out.println("Both the numbers are equal");

        scn.close();
    }
}
