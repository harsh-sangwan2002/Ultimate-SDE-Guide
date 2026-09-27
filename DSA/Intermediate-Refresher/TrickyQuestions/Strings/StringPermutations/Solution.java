package StringPermutations;

public class Solution {

    public static int factorial(int n) {

        int res = 1;

        for (int i = 1; i <= n; i++)
            res *= i;

        return res;
    }

    public static void printPermutations(String s) {

        int n = s.length(), f = factorial(n);

        for (int i = 0; i < f; i++) {

            StringBuilder sb = new StringBuilder(s);
            int temp = i;

            for (int div = n; div >= 1; div--) {

                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        String s = "abc";
        printPermutations(s);
    }
}
