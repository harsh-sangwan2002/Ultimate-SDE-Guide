import java.util.HashSet;

public class PrintCommonElements {

    public static void printCommonElements(HashSet<Integer> hs1, HashSet<Integer> hs2) {

        for (Integer val : hs1) {

            if (hs2.contains(val))
                System.out.print(val + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        printCommonElements(set1, set2);
    }
}
