package MinimumSwaps;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(int[] A, int B) {

        int size = 0, bad = 0, n = A.length;

        for (int val : A) {

            if (val <= B)
                size++;
        }

        for (int i = 0; i < size; i++) {

            if (A[i] > B)
                bad++;
        }

        int min = bad;
        for (int i = size; i < n; i++) {

            int prev = A[i - size];

            if (prev > B)
                bad--;

            if (A[i] > B)
                bad++;

            min = Math.min(min, bad);
        }

        return min;
    }
}
