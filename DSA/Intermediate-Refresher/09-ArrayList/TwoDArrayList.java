import java.util.ArrayList;

public class TwoDArrayList {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(10);
        list3.add(10);
        list3.add(100);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(-1);

        list.add(list2);
        list.add(list3);
        list.add(list4);

        System.out.println(list);
        // Access 0th row
        for (int val : list.get(0)) {

            System.out.print(val + " ");
        }

        // size
        System.out.println(list.size());

        // remove
        list.remove(0);
        System.out.println(list);

        for (ArrayList<Integer> l : list) {

            for (int val : l)
                System.out.print(val + " ");

            System.out.println();
        }
    }
}
