package TwoMissingNumbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int[] solve(int[] A) {

        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int idx = 0;

        for (int val : A)
            set.add(val);

        for (int i = 1; i <= A.length + 2; i++) {

            if (!set.contains(i))
                res[idx++] = i;
        }

        Arrays.sort(res);
        return res;
    }
}
