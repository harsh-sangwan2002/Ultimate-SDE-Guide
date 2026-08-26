package KthSmallest;

import java.util.Arrays;

// TC => O(N*logN)
// SC => O(1)
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {

        Arrays.sort(A);
        return A[B - 1];
    }
}
