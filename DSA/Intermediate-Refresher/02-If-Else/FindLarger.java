import java.util.Scanner;

public class FindLarger {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt(), num2 = scn.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " is bigger");
        else if (num1 < num2)
            System.out.println(num2 + " is bigger");
        else
            System.out.println("Both are euqal");

        scn.close();
    }
}
