import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void printSubsets(int[] arr, int idx, List<Integer> list) {

        if (idx == arr.length) {
            System.out.println(new ArrayList<>(list));
            return;
        }

        list.add(arr[idx]);
        printSubsets(arr, idx + 1, list);
        list.remove(list.size() - 1);
        printSubsets(arr, idx + 1, list);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        printSubsets(arr, 0, new ArrayList<>());
    }
}