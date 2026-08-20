package SpecialSubsequences;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(String A) {

        int countA = 0, ans = 0, mod = (int) (1e9 + 7);

        for (char ch : A.toCharArray()) {

            if (ch == 'A')
                countA = (countA + 1) % mod;

            else if (ch == 'G')
                ans = (ans + countA) % mod;
        }

        return ans;
    }
}
