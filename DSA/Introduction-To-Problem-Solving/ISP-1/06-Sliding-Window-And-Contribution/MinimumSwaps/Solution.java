package MinimumSwaps;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(int[] A, int B) {

        int n = A.length, size = 0;

        for (int i = 0; i < n; i++) {

            if (A[i] <= B)
                size++;
        }

        int bad = 0;
        for (int i = 0; i < size; i++) {

            if (A[i] > B)
                bad++;
        }

        int swaps = bad;

        for (int i = size; i < n; i++) {

            int prev = A[i - size];
            if (prev > B)
                bad--;

            if (A[i] > B)
                bad++;

            swaps = Math.min(swaps, bad);
        }

        return swaps;
    }
}
