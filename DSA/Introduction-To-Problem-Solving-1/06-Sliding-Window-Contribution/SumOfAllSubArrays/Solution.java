package SumOfAllSubArrays;

// TC => O(N)
// SC => O(1)
public class Solution {

    public long subarraySum(int[] A) {

        long ans = 0L;
        int n = A.length;

        for (int i = 0; i < n; i++) {

            long freq = (i + 1) * 1L * (n - i);
            long contri = 1L * freq * A[i];
            ans += contri;
        }

        return ans;
    }
}
