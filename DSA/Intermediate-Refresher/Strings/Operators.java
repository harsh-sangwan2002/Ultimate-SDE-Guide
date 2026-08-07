import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {

        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // ab
        System.out.println((char) ('a' + 3)); // d
        System.out.println("a" + 1); // a1

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));

        // At least one of the all the objects must be a string and res will also be a
        // string
        System.out.println(new ArrayList<>() + " " + new Integer(56));
    }
}
