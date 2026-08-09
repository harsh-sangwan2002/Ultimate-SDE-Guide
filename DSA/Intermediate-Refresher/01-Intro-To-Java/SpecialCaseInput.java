import java.util.Scanner;

public class SpecialCaseInput {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = Integer.parseInt(scn.nextLine());
        String str = scn.nextLine();

        System.out.println(num);
        System.out.println(str);

        scn.close();
    }
}
