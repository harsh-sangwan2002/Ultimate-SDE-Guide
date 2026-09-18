import java.util.Scanner;

public class OddValues {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), i = 1;

        while (i <= n) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println();
        scn.close();
    }
}
