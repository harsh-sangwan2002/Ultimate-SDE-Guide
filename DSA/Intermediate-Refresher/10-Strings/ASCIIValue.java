public class ASCIIValue {

    public static void main(String[] args) {

        // A E J  O  T  Y
        // 1 5 10 15 20 25
        String str = "India";

        for (int i = 0; i < str.length(); i++) {
            int code = str.charAt(i);
            System.out.println(code);
        }
    }
}
