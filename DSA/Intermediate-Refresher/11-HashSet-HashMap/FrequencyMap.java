import java.util.HashMap;

public class FrequencyMap {

    public static void main(String[] args) {

        int[] arr = { 1, 4, 3, -2, 1, 1, 4, 5, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr)
            map.put(val, map.getOrDefault(val, 0) + 1);

        // System.out.println(map);

        char ch = (char) 97;
        System.out.println(ch);
    }
}
