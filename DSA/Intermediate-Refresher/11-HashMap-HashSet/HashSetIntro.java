import java.util.HashSet;

public class HashSetIntro {

    public static void main(String[] args) {

        /*
         * ArrayList => 1. Sequential Order 2. Duplicates are allowed
         * HashSet => 1. Random Order 2. No duplicates allowed
         */

        HashSet<Integer> set = new HashSet<>();
        System.out.println(set);

        // add
        set.add(1);
        set.add(1);
        set.add(-2);
        set.add(3);
        set.add(4);
        set.add(-5);
        set.add(null);
        System.out.println(set);

        // size
        System.out.println(set.size());

        // contains
        System.out.println(set.contains(-1));
        System.out.println(set.contains(-2));

        // remove
        System.out.println(set.remove(-2));

        // clear
        // set.clear();
        // System.out.println(set);

        HashSet<Integer> set2 = new HashSet<>();

        // addAll
        set2.addAll(set);
        System.out.println(set2);

        for (Integer val : set2) {
            System.out.println(val);
        }
    }
}