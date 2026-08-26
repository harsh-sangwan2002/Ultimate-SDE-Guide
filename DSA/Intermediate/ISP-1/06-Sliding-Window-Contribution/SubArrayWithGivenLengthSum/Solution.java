package SubArrayWithGivenLengthSum;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(int[] A, int B, int C) {

        int n = A.length, sum = 0;

        for (int s = 0; s < B; s++)
            sum += A[s];

        if (sum == C)
            return 1;

        for (int e = B; e < n; e++) {
            sum -= A[e - B];
            sum += A[e];

            if (sum == C)
                return 1;
        }

        return 0;
    }
}
