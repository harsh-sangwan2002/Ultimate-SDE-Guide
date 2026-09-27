package StringCompression;

public class Solution {

    public static String compression1(String str) {

        if (str == null || str.length() == 0)
            return "";

        StringBuilder sb = new StringBuilder("");
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {

            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (prev != curr)
                sb.append(curr);
        }

        return sb.toString();
    }

    public static String compression2(String str) {

        if (str == null || str.length() == 0)
            return "";

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (prev == curr)
                count++;

            else {

                if (count != 1)
                    sb.append(count);

                sb.append(curr);
                count = 1;
            }
        }

        if (count != 1)
            sb.append(count);

        return sb.toString();
    }

    public static void main(String[] args) {

        // aaabbcccddaeef
        String str = "aaabbcccddaeef";

        // Compression1 => abcdaef
        String res = compression1(str);
        System.out.println(res);

        // Compression1 => a3b2c3d2ae2f
        res = compression2(str);
        System.out.println(res);
    }
}
