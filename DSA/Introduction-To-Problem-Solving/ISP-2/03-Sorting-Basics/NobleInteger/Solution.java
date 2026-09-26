package NobleInteger;

import java.util.Arrays;

// TC => O(N*log(N))
// SC => O(1)
public class Solution {

    private void reverse(int[] A, int lo, int hi) {

        while (lo < hi) {
            int temp = A[lo];
            A[lo] = A[hi];
            A[hi] = temp;

            lo++;
            hi--;
        }
    }

    public int solve(int[] A) {

        Arrays.sort(A);
        reverse(A, 0, A.length - 1);

        if (A[0] == 0)
            return 1;

        int n = A.length, count = 0;

        for (int i = 1; i < n; i++) {

            if (A[i] != A[i - 1])
                count = i;

            if (A[i] == count)
                return 1;
        }

        return -1;
    }
}
