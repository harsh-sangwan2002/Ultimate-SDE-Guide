public class String_Builder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        char ch = sb.charAt(0); // get
        System.out.println(ch);

        sb.setCharAt(0, 'd'); // update
        System.out.println(sb);

        sb.insert(2, 'y'); // insert
        System.out.println(sb);

        sb.deleteCharAt(2); // delete
        System.out.println(sb);

        sb.append('g'); // append
        System.out.println(sb);

        System.out.println(sb.length()); // length
    }
}
