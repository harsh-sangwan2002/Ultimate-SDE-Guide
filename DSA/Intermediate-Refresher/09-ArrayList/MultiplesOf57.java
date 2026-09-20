import java.util.ArrayList;
import java.util.Scanner;

public class MultiplesOf57 {

    public static ArrayList<Integer> findMultiples(ArrayList<Integer> list) {

        ArrayList<Integer> res = new ArrayList<>();

        for (int val : list) {

            if (val % 5 == 0 || val % 7 == 0)
                res.add(val);
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(scn.nextInt());

        ArrayList<Integer> res = findMultiples(list);

        for (int val : res)
            System.out.print(val + " ");

        System.out.println();
        scn.close();
    }
}
