import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {

        String name = "Kunal Kushwaha Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('K'));
        System.out.println("Kunal.  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}