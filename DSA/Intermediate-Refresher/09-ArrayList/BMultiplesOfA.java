import java.util.ArrayList;
import java.util.Scanner;

public class BMultiplesOfA {

    public static ArrayList<Integer> findMultiples(int a, int b) {

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i <= b; i++)
            res.add(a * i);

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt();

        ArrayList<Integer> res = findMultiples(a, b);

        for (int val : res)
            System.out.print(val + " ");

        System.out.println();
        scn.close();
    }
}
