public class ReverseString {

    public static String reverseString(String str) {

        String res = "";

        // Approach-1
        // for (int i = str.length() - 1; i >= 0; i--)
        // res += str.charAt(i);

        // Approach-2
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            res = ch + res;
        }

        return res;
    }

    public static void main(String[] args) {

        String str = "HarshSangwan";

        String reversedString = reverseString(str);
        System.out.println(reversedString);
    }
}
