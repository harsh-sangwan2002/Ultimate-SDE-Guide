package SimpleReverse;

// TC => O(N)
// SC => O(N)
public class Solution {

    public String solve(String A) {

        StringBuilder sb = new StringBuilder();
        int n = A.length();

        for (int i = n - 1; i >= 0; i--)
            sb.append(A.charAt(i));

        return sb.toString();
    }
}
