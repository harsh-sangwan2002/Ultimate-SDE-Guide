package SimpleReverse;

// TC => O(N)
// SC => O(N)
public class Solution {

    public String solve(String A) {

        int n = A.length();
        StringBuilder sb = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {

            char ch = A.charAt(i);
            sb.append(ch);
        }

        return sb.toString();
    }
}
