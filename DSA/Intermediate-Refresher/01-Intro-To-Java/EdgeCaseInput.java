import java.util.Scanner;

public class EdgeCaseInput {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        // char ch = scn.next().charAt(0);
        String str = scn.nextLine();

        System.out.println(x);
        System.out.println(str);

        scn.close();
    }
}
