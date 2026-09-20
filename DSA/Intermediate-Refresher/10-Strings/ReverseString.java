public class ReverseString {

    public static void main(String[] args) {

        String str = "Harsh";
        int n = str.length();

        String res = "";
        for (int i = n - 1; i >= 0; i--) {

            char ch = str.charAt(i);
            res = res + ch;
        }
        System.out.println(res);
    }
}
