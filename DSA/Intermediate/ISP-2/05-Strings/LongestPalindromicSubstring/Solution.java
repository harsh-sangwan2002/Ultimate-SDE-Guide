package LongestPalindromicSubstring;

// TC => O(N^2)
// SC => O(N)
public class Solution {

    public String longestPalindrome(String A) {

        int n = A.length(), st = 0, et = 0, max = 1;

        // Odd length substring
        for (int c = 0; c < n; c++) {

            int i = c - 1, j = c + 1;

            while (i >= 0 && j < n) {

                if (A.charAt(i) != A.charAt(j))
                    break;

                i--;
                j++;
            }

            if (j - i - 1 > max) {
                max = j - i - 1;
                st = i + 1;
                et = j - 1;
            }
        }

        // Even length substring
        for (int c = 0; c < n; c++) {

            int i = c, j = c + 1;

            while (i >= 0 && j < n) {

                if (A.charAt(i) != A.charAt(j))
                    break;

                i--;
                j++;
            }

            if (j - i - 1 > max) {
                max = j - i - 1;
                st = i + 1;
                et = j - 1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = st; i <= et; i++)
            sb.append(A.charAt(i));

        return sb.toString();
    }
}
