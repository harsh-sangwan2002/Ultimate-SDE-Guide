package LongestCommonPrefix;

import java.util.ArrayList;

// TC => O(N*M)
// SC => O(M)
public class Solution2 {

    public String longestCommonPrefix(ArrayList<String> A) {

        if (A.size() == 0)
            return "";

        String res = "";
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); i++)
            min = Math.min(min, A.get(i).length());

        for (int i = 0; i < min; i++) {

            char ch = A.get(0).charAt(i);

            for (int j = 1; j < A.size(); j++) {

                if (ch != A.get(j).charAt(i))
                    return res;
            }

            res += ch;
        }

        return res;
    }
}
