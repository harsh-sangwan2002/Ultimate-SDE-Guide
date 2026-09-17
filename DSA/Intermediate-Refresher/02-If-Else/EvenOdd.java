import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        if (num % 2 == 0)
            System.out.println("The number is even");

        else
            System.out.println("The number is odd");

        scn.close();
    }
}
