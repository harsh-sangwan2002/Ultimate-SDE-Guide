public class Main {

    public static void main(String[] args) {

        String a = "Kunal", b = "Kunal", c = a;
        System.out.println(a == b); // true
        System.out.println(a == c); // true

        a = "Kushwaha";
        System.out.println(a == b); // false

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
        System.out.println(name1 == name2); // false
        System.out.println(name1.equals(name2)); // true

        System.out.println(name1.charAt(0));
    }
}
