package SingleNumber3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// TC => O(N)
// SC => O(N)
public class Solution {

    public int[] solve(int[] A) {

        int[] res = new int[2];
        int idx = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int val : A)
            map.put(val, map.getOrDefault(val, 0) + 1);

        for (int key : map.keySet()) {

            if (map.get(key) == 1)
                res[idx++] = key;
        }

        Arrays.sort(res);
        return res;
    }
}
