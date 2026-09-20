public class SpecialCharacters {

    public static void main(String[] args) {

        String str = "H@r$hCr07@226";
        int count = 0;

        for (char ch : str.toCharArray()) {

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
                continue;

            else
                count++;
        }

        System.out.println(count);
    }
}
