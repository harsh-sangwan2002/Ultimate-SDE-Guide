import java.util.Scanner;

public class MultipleOf4 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 4;

        while (i <= n) {
            System.out.print(i + " ");
            i += 4;
        }

        System.out.println();
        scn.close();
    }
}
