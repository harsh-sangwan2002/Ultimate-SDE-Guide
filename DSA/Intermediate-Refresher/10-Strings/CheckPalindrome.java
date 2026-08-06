public class CheckPalindrome {

    public static String reverseString(String str) {

        String res = "";

        for (int i = 0; i < str.length(); i++)
            res = res + str.charAt(i);

        return res;
    }

    public static void main(String[] args) {

        String str = "naman";

        String reversedString = reverseString(str);
        System.out.println(str == reversedString);
        System.out.println(str.equals(reversedString));
    }
}
