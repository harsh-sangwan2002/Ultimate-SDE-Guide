public class PrintString {

    public static void main(String[] args) {

        String str = "India";
        int n = str.length();

        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
