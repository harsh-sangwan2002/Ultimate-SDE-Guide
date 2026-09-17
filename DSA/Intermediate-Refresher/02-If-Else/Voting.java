import java.util.Scanner;

public class Voting {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int age = scn.nextInt();

        if (age >= 18)
            System.out.println("Eligible");

        else
            System.out.println("Not Eligible");

        scn.close();
    }
}