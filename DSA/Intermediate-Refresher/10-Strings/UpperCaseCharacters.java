public class UpperCaseCharacters {

    public static void main(String[] args) {

        String str = "ScALeRACademy";
        int n = str.length(), count = 0;

        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                count++;
        }

        System.out.println(count);
    }
}
