import java.util.HashMap;

public class HashMapIntro {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Delhi", 10);
        map.put("Mumbai", 20);
        map.put("Bangalore", 30);
        map.put("Bathinda", 40);

        // for (String key : map.keySet())
        // System.out.println(key + " => " + map.get(key));

        // for (int val : map.values())
        // System.out.println(val);

        // put
        map.put("Lucknow", 50);

        // contains
        System.out.println(map.containsKey("Delhi"));
        // System.out.println(map.containsValue("Delhi"));
        System.out.println(map.containsValue(10));

        // size
        System.out.println(map.size());

        // clear
        map.clear();
        System.out.println(map);
    }
}
