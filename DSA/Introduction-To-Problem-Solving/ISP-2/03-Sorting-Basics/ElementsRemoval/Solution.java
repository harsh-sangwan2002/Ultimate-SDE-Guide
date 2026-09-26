package ElementsRemoval;

import java.util.Arrays;

// TC => O(N*log(N))
// SC => O(1)
public class Solution {

    public int solve(int[] A) {

        Arrays.sort(A);
        int n = A.length, count = 1, sum = 0;

        for (int i = n - 1; i >= 0; i--) {

            int val = A[i];
            sum += val * count;
            count++;
        }

        return sum;
    }
}
