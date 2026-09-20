import java.util.HashSet;

public class CreateSet {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 1, 2, 3, 4, 5 };
        HashSet<Integer> set = new HashSet<>();

        for (int val : arr)
            set.add(val);

        System.out.println(set);
    }
}
