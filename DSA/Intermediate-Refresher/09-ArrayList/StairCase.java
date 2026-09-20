import java.util.ArrayList;
import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
            res.add(new ArrayList<>(list));
        }

        System.out.println(res);
        scn.close();
    }
}
