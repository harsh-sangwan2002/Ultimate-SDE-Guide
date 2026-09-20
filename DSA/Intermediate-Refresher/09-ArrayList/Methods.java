import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(5);
        list.add(-1);
        list.add(2);
        System.out.println(list);

        // get
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        // size
        System.out.println(list.size());

        // remove
        list.remove(1);
        System.out.println(list);

        // set
        list.set(1, 10);
        System.out.println(list);

        // insert an element at a particular element
        list.add(2, 10);

        // clear
        list.clear();
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        int n = scn.nextInt();

        for (int i = 0; i < n; i++)
            list2.add(scn.nextInt());

        System.out.println(list2);
        scn.close();
    }
}