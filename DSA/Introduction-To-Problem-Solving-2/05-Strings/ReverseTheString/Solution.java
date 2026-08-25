package ReverseTheString;

import java.util.Stack;

// TC => O(N)
// SC => O(N)
public class Solution {

    public String solve(String A) {

        Stack<StringBuilder> st = new Stack<>();
        int i = 0, n = A.length();

        while (i < n) {

            StringBuilder temp = new StringBuilder();

            while (i < n && A.charAt(i) != ' ')
                temp.append(A.charAt(i++));

            st.push(temp);
            i++;
        }

        StringBuilder res = new StringBuilder();
        while (st.size() != 0) {

            StringBuilder temp = st.pop();
            res.append(temp);

            if (st.size() == 0)
                return res.toString().trim();

            res.append(" ");
        }

        return res.toString();
    }
}
