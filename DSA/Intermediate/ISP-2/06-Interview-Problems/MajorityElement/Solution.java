package MajorityElement;

import java.util.Arrays;

// TC => O(N*logN)
// SC => O(1)
public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {

        Arrays.sort(A);
        return A[A.length / 2];
    }
}
