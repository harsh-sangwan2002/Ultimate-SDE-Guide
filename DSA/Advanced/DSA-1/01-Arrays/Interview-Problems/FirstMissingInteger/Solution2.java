package FirstMissingInteger;

import java.util.HashSet;
import java.util.Set;

// TC => O(N)
// SC => O(N)
public class Solution2 {

    public int firstMissingPositive(int[] A) {

        int n = A.length;
        Set<Integer> set = new HashSet<>();

        for (int val : A)
            set.add(val);

        for (int i = 1; i <= n + 2; i++) {

            if (!set.contains(i))
                return i;
        }

        return -1;
    }
}
