import java.util.ArrayList;

public class TwoDArrayList {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(5);
        arr2.add(10);
        arr2.add(10);
        arr2.add(null);

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(-1);

        res.add(arr1);
        res.add(arr2);
        res.add(arr3);
        System.out.println(res);

        // 0th row
        System.out.println(res.get(0));

        // 0th row => 0th idx
        System.out.println(res.get(0).get(0));
    }
}
