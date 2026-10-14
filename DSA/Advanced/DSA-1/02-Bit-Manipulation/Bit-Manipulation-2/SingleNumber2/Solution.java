package SingleNumber2;

import java.util.HashMap;
import java.util.Map;

// TC => O(N)
// SC => O(N)
public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int val : A)
            map.put(val, map.getOrDefault(val, 0) + 1);

        for (int key : map.keySet()) {

            if (map.get(key) == 1)
                return key;
        }

        return -1;
    }
}
