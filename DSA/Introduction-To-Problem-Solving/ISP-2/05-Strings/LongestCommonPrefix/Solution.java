package LongestCommonPrefix;

// TC => O(N*M^2)
// SC => O(M)
public class Solution {

    public String longestCommonPrefix(String[] A) {

        if (A == null || A.length == 0)
            return "";

        String prefix = A[0];

        for (String str : A) {

            while (str.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);

            if (prefix == "")
                return "";
        }

        return prefix;
    }
}
