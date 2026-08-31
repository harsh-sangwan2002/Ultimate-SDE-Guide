package MinXorValue;

import java.util.Arrays;

// TC => O(N*logN)
// SC => O(1)
public class Solution {

    public int findMinXor(int[] A) {

        Arrays.sort(A);
        int n = A.length;
        int xor = A[0] ^ A[1];

        for (int i = 2; i < n; i++) {

            xor = Math.min(xor, A[i] ^ A[i - 1]);
        }

        return xor;
    }
}
