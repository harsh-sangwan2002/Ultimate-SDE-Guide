package RainWaterTrapped;

// TC => O(N)
// SC => O(N)
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    private int[] findLeftMax(int[] A) {

        int n = A.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                res[i] = A[i];

            else
                res[i] = Math.max(res[i - 1], A[i]);
        }

        return res;
    }

    private int[] findRightMax(int[] A) {

        int n = A.length;
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            if (i == n - 1)
                res[i] = A[i];

            else
                res[i] = Math.max(res[i + 1], A[i]);
        }

        return res;
    }

    public int trap(final int[] A) {

        int n = A.length;
        int[] leftMax = findLeftMax(A), rightMax = findRightMax(A);
        int totalWater = 0;

        for (int i = 1; i < n - 1; i++) {

            int currWater = Math.min(leftMax[i - 1], rightMax[i + 1]) - A[i];

            if (currWater > 0)
                totalWater += currWater;
        }

        return totalWater;
    }
}
