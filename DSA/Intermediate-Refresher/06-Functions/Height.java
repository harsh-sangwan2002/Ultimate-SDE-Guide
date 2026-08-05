import java.util.Scanner;

public class Height {

    public static String checkHeight(int height) {

        if (height < 10)
            return "Small";

        else if (height >= 10 && height <= 20)
            return "Medium";

        else
            return "Large";
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int height = scn.nextInt();

        System.out.println(checkHeight(height));
        scn.close();
    }
}
