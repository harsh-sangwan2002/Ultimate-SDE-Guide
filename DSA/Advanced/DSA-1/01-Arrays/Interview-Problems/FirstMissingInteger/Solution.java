package FirstMissingInteger;

import java.util.HashSet;
import java.util.Set;

// TC => O(N)
// SC => O(N)
public class Solution {

    public int firstMissingPositive(int[] A) {

        Set<Integer> set = new HashSet<>();
        int n = A.length;

        for (int val : A)
            set.add(val);

        for (int i = 1; i <= n + 1; i++) {

            if (!set.contains(i))
                return i;
        }

        return n + 1;
    }
}
