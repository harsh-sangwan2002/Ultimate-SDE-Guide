public class String_Builder {

    public static void main(String[] args) {

        /*
         * Stored as a character array of 16-bits
         * 1) Mutable
         * 2) Not thread safe
         * 3) Method chaining is possible
         */
        StringBuilder sb = new StringBuilder("Hello");

        // charAt
        System.out.println(sb.charAt(0));

        // length
        System.out.println(sb.length());

        // append
        sb.append(" World").append("!");
        System.out.println(sb);

        // reverse
        // System.out.println(sb.reverse());

        // insert
        sb.insert(1, "Ok");
        System.out.println(sb);

        // delete (start, end-1)
        sb.delete(1, 3);
        System.out.println(sb);

        // substring (start, end-1)
        System.out.println(sb.substring(0, 4));
    }
}
