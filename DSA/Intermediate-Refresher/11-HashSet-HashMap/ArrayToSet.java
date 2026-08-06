import java.util.HashSet;

public class ArrayToSet {

    public static HashSet<Integer> convertToHashSet(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int val : arr)
            set.add(val);

        return set;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 4, 3, 3, 5, 9 };

        HashSet<Integer> set = convertToHashSet(arr);
        System.out.println(set);
    }
}
