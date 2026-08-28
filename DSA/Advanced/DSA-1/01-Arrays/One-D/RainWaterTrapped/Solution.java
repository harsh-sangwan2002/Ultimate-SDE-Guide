package RainWaterTrapped;

// TC => O(N)
// SC => O(N)
public class Solution {

    private int[] findLeftMax(int[] A, int n) {

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                res[i] = A[i];

            else
                res[i] = Math.max(res[i - 1], A[i]);
        }

        return res;
    }

    private int[] findRightMax(int[] A, int n) {

        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            if (i == n - 1)
                res[i] = A[i];

            else
                res[i] = Math.max(res[i + 1], A[i]);
        }

        return res;
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {

        int n = A.length;

        int[] lmax = findLeftMax(A, n);
        int[] rmax = findRightMax(A, n);
        int ans = 0;

        for (int i = 1; i < n - 1; i++) {

            int minHeight = Math.min(lmax[i - 1], rmax[i + 1]);
            int currWater = minHeight - A[i];

            if (currWater > 0)
                ans += currWater;
        }

        return ans;
    }
}
