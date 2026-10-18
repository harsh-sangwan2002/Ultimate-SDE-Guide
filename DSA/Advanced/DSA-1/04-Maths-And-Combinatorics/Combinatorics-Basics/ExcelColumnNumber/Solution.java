package ExcelColumnNumber;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int titleToNumber(String A) {

        int ans = 0, pow = 1, n = A.length();

        for (int i = n - 1; i >= 0; i--) {

            char ch = A.charAt(i);
            ans = ans + (ch - 'A' + 1) * pow;
            pow *= 26;
        }

        return ans;
    }
}
