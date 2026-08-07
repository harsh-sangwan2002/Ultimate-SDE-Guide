public class Demo {

    public static void main(String[] args) {

        /*
         * SB is a char array of 16 size
         * It's mutable
         * Chaining of multiple functions can be done
         * It's not thread safe
         */
        StringBuilder sb = new StringBuilder("");
        sb.append("Hello"); // Append text
        System.out.println(sb);

        sb.insert(1, "World"); // HWorldello
        System.out.println(sb);

        sb.replace(1, 4, "Harsh");
        System.out.println(sb);

        sb.delete(1, 2);
        System.out.println(sb);

        System.out.println(sb.substring(1, sb.length()));

        // String str1 = "Hello";
        // // String is immutable, cannot append in this
        // String str2 = str1.concat("World");

        // System.out.println(str1);
        // System.out.println(str2);

        // String res = "";

        // for (int i = 0; i < 10000; i++) {
        // res += "HELLO";
        // }
        // System.out.println(res);
    }
}
