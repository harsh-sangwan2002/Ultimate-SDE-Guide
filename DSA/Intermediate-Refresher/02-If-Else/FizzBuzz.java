import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        if (num % 3 == 0 && num % 5 == 0)
            System.out.println("FizzBuzz");

        else if (num % 3 == 0)
            System.out.println("Fizz");

        else if (num % 5 == 0)
            System.out.println("Buzz");

        scn.close();
    }
}
