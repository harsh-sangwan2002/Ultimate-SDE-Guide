public class IsPalindrome {

    public static void main(String[] args) {

        String str = "naman";
        int lo = 0, hi = str.length() - 1;

        while (lo < hi) {

            char first = str.charAt(lo);
            char last = str.charAt(hi);

            if (first != last) {
                System.out.println("No");
                System.exit(0);
            }

            lo++;
            hi--;
        }

        System.out.println("Yes");
    }
}
