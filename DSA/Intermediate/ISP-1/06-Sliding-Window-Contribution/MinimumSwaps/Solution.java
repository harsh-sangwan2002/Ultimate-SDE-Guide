package MinimumSwaps;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(int[] A, int B) {

        int k = 0, n = A.length;

        for (int val : A) {

            if (val <= B)
                k++;
        }

        int swaps = 0;
        for (int i = 0; i < k; i++) {

            if (A[i] > B)
                swaps++;
        }

        int minSwaps = swaps;
        for (int i = k; i < n; i++) {

            int prev = A[i - k];

            if (prev > B)
                swaps--;

            if (A[i] > B)
                swaps++;

            minSwaps = Math.min(minSwaps, swaps);
        }

        return minSwaps;
    }
}
