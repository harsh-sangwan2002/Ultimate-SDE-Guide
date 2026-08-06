import java.util.ArrayList;
import java.util.Scanner;

public class TakingInputs {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        // int n = scn.nextInt();

        // for (int i = 0; i < n; i++)
        // list.add(scn.nextInt());

        // System.out.println(list);

        while (true) {

            int n = scn.nextInt();

            if (n == -1)
                break;

            list.add(n);
        }

        System.out.println(list);

        scn.close();
    }
}
