public class SpecialChars {

    public static void main(String[] args) {

        String str = "ABkjhJKH@#$%123";
        int specialChars = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                continue;

            else if (ch >= 'A' && ch <= 'Z')
                continue;

            else if (ch >= '0' && ch <= '9')
                continue;

            else
                specialChars++;
        }

        System.out.println(specialChars);
    }
}
