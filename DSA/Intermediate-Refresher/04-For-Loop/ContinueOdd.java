import java.util.Scanner;

public class ContinueOdd {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0)
                continue;

            System.out.print(i + " ");
        }

        System.out.println();
        scn.close();
    }
}
