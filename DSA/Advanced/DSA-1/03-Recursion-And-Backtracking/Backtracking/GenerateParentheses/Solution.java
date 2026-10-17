package GenerateParentheses;

import java.util.List;
import java.util.ArrayList;

// TC => O(2^n)
// SC => O(N)
public class Solution {

    private List<String> list;

    private void helper(String str, int n, int open, int closed) {

        if (str.length() == 2 * n) {
            list.add(new String(str));
            return;
        }

        if (open < n)
            helper(str + "(", n, open + 1, closed);

        if (closed < open)
            helper(str + ")", n, open, closed + 1);
    }

    public String[] generateParenthesis(int A) {

        list = new ArrayList<>();

        helper(new String(""), A, 0, 0);

        String[] res = new String[list.size()];
        int idx = 0;

        for (String str : list)
            res[idx++] = str;

        return res;
    }
}
