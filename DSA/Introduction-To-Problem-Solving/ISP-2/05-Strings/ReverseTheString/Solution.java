package ReverseTheString;

import java.util.Stack;

// TC => O(N)
// SC => O(N)
public class Solution {

    public String solve(String A) {

        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int idx = 0, n = A.length();

        while (idx < n) {

            StringBuilder temp = new StringBuilder("");

            while (idx < n && A.charAt(idx) != ' ') {
                temp.append(A.charAt(idx));
                idx++;
            }

            st.push(temp);
            idx++;
        }

        while (st.size() != 0) {

            StringBuilder temp = st.pop();

            if (st.size() == 0)
                sb.append(temp);

            else
                sb.append(temp + " ");
        }

        return sb.toString().trim();
    }
}
