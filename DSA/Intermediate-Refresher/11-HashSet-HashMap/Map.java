import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // put
        map.put("Delhi", 10);
        map.put("UP", 9);
        map.put("Punjab", 8);
        map.put("Hyderabad", 7);
        System.out.println(map);

        // updation
        map.put("UP", 30);
        System.out.println(map);

        // get
        System.out.println(map.get("UP"));
        System.out.println(map.get("Delhi"));

        // containsKey
        System.out.println(map.containsKey("Hyderabad"));
        System.out.println(map.containsKey("Rajasthan"));

        // size
        System.out.println(map.size());

        // remove
        System.out.println(map.remove("Bangalore"));
        System.out.println(map);

        // keySet => forEach
        for (String key : map.keySet()) {

            System.out.println(key + " => " + map.get(key));
        }

        for (int value : map.values()) {

            System.out.print(value + " ");
        }

        System.out.println();
    }
}
