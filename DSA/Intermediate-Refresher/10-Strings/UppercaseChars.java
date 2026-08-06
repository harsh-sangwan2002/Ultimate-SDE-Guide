public class UppercaseChars {

    public static void main(String[] args) {

        String str = "ABckjhJGS65123";
        int upperCaseCharCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                upperCaseCharCount++;
        }

        System.out.println(upperCaseCharCount);
    }
}
