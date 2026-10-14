package MinXorValue;

import java.util.Arrays;

// TC => O(N*log(N))
// SC => O(1)
public class Solution {

    public int findMinXor(int[] A) {

        Arrays.sort(A);
        int n = A.length, minXor = A[0] ^ A[1];

        for (int i = 2; i < n; i++) {

            int currXor = A[i] ^ A[i - 1];
            minXor = Math.min(minXor, currXor);
        }

        return minXor;
    }
}
