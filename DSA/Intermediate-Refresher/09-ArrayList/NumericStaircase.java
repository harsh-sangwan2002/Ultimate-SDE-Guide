import java.util.ArrayList;
import java.util.Scanner;

public class NumericStaircase {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            list.add(i);
            System.out.println(list);
        }

        scn.close();
    }
}
