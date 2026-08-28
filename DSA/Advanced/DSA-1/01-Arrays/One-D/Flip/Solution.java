package Flip;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int[] flip(String A) {

        int n = A.length(), cSum = 0, mSum = 0, l = 0, r = 0;
        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {

            char ch = A.charAt(i);

            if (ch == '1')
                cSum--;

            else
                cSum++;

            if (cSum > mSum) {
                mSum = cSum;
                ans[0] = l + 1;
                ans[1] = r + 1;
            }

            if (cSum < 0) {
                cSum = 0;
                l = i + 1;
                r = i + 1;
            }

            else
                r++;
        }

        if (ans[0] == 0)
            return new int[] {};

        return ans;
    }
}
