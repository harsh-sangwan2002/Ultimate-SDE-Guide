package LongestCommonPrefix;

// TC => O(S*L^2)
/*
For a straightforward worst-case analysis, let:

S = number of strings
L = maximum string length

For each string, prefix can shrink up to L times:

prefix length:
L → L-1 → L-2 → ... → 1 → 0

And each indexOf(prefix) can itself take up to O(L) in a straightforward worst-case analysis.

Therefore, for one string:

O(L) × O(L)
= O(L²)

For S strings:

O(S × L²)
*/
// SC => O(N)
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
