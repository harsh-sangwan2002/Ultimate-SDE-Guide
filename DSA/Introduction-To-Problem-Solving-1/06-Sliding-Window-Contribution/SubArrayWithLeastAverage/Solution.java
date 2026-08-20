package SubArrayWithLeastAverage;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(int[] A, int B) {

        int n = A.length, sum = 0, s = 0;

        while (s < B)
            sum += A[s++];

        int minSum = sum, idx = 0;

        for (int e = B; e < n; e++) {
            sum -= A[e - B];
            sum += A[e];

            if (sum < minSum) {
                minSum = sum;
                idx = e - B + 1;
            }
        }

        return idx;
    }
}
