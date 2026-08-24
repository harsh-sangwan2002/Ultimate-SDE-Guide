package ElementsRemoval;

import java.util.Arrays;

// TC => O(N*logN)
// SC => O(1)
public class Solution {

    public int solve(int[] A) {

        Arrays.sort(A);
        int n = A.length, cost = 0, count = 1;

        for (int i = n - 1; i >= 0; i--) {

            cost += count * A[i];
            count++;
        }

        return cost;
    }
}
