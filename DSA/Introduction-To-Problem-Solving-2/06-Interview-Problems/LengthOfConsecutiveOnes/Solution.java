// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(String A) {

        int max = 0, n = A.length(), ones = 0;

        for (char ch : A.toCharArray()) {

            if (ch == '1')
                ones++;
        }

        if (ones == n)
            return ones;

        for (int i = 0; i < n; i++) {

            char ch = A.charAt(i);

            if (ch == '0') {

                int left = 0, right = 0, j = i - 1;

                while (j >= 0 && A.charAt(j) == '1') {
                    left++;
                    j--;
                }

                j = i + 1;
                while (j < n && A.charAt(j) == '1') {
                    right++;
                    j++;
                }

                if (left + right == ones)
                    max = ones;

                else
                    max = Math.max(max, left + right + 1);
            }
        }

        return max;
    }
}
