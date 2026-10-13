package MinimumSwaps;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(int[] A, int B) {

        int size = 0, n = A.length;

        for (int i = 0; i < n; i++) {

            if (A[i] <= B)
                size++;
        }

        int bad = 0;

        for (int i = 0; i < size; i++) {

            if (A[i] > B)
                bad++;
        }

        int minSwaps = bad;

        for (int i = size; i < n; i++) {

            int prev = A[i - size];

            if (prev > B)
                bad--;

            if (A[i] > B)
                bad++;

            minSwaps = Math.min(minSwaps, bad);
        }

        return minSwaps;
    }
}
