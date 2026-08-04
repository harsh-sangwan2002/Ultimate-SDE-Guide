import java.util.Scanner;

public class IsEligible {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        if (age < 18)
            System.out.println("The person is not eligible for voting.");

        else
            System.out.println("The person is eligible for voting.");
        scn.close();
    }
}