public class ASCIIValue {

    public static void main(String[] args) {

        String str = "ABCD";

        for (char ch : str.toCharArray()) {

            System.out.println((int) ch);
        }
    }
}
