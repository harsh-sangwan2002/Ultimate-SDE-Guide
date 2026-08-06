import java.util.ArrayList;

public class Multiples {

    public static ArrayList<Integer> returnMultiples(ArrayList<Integer> list) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            int val = list.get(i);

            if (val % 5 == 0 || val % 7 == 0)
                ans.add(val);
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(1);
        list.add(7);

        ArrayList<Integer> res = returnMultiples(list);
        System.out.println(res);
    }

}
