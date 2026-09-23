package BuySellStock;

// TC => O(N)
// SC => O(1)
public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {

        if (A == null || A.length <= 1)
            return 0;

        int n = A.length, max = 0, min = A[0];

        for (int i = 1; i < n; i++) {

            min = Math.min(min, A[i]);
            int curr = A[i] - min;

            max = Math.max(max, curr);
        }

        return max;
    }
}
