public class Immutability {

    public static void main(String[] args) {

        /*
         * Strings are immutable that means they cannot be changed
         * It is thead safe
         */
        String str1 = "Hello";
        String str2 = str1.concat("World");

        System.out.println(str1); // Hello
        System.out.println(str2); // Hello World
    }
}