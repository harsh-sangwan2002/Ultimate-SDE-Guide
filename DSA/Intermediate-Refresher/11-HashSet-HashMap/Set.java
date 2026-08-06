import java.util.HashSet;

public class Set {

    public static void main(String[] args) {

        /*
         * ArrayList => Sequential collection of elements. Duplicates are allowed.
         * HashSet => Random collection of unique elements.
         */
        HashSet<Integer> set = new HashSet<>();

        // 1. add
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(-3);
        set.add(5);
        set.add(null);
        System.out.println(set);

        // 2. size
        System.out.println(set.size());

        // 3. contains
        System.out.println(set.contains(3));

        // 4. remove
        System.out.println(set.remove(3));
        // Nothing will happen if the element is not there
        set.remove(100);
        System.out.println(set);

        // forEach
        for (Integer val : set)
            System.out.println(val);
    }
}