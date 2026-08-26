package BuySellStock;

// TC => O(N)
// SC => O(1)
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {

        if (A == null || A.length <= 1)
            return 0;

        int minSoFar = A[0], ans = 0;

        for (int val : A) {

            minSoFar = Math.min(minSoFar, val);

            int currProfit = val - minSoFar;
            ans = Math.max(ans, currProfit);
        }

        return ans;
    }
}
