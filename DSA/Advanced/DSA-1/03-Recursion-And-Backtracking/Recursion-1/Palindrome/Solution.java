package Palindrome;

// TC => O(N)
// SC => O(N)
public class Solution {

    private int helper(String str, int st, int et) {

        if (st >= et)
            return 1;

        if (str.charAt(st) != str.charAt(et))
            return 0;

        return helper(str, st + 1, et - 1);
    }

    public int solve(String A) {

        return helper(A, 0, A.length() - 1);
    }
}
