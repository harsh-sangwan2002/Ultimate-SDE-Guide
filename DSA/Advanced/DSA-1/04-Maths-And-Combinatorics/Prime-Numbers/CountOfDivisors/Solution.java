package CountOfDivisors;

import java.util.HashMap;
import java.util.Map;

// TC => O(N*log(N))
// SC => O(N)
public class Solution {

    private int findMax(int[] A) {

        int max = A[0];

        for (int val : A)
            max = Math.max(max, val);

        return max;
    }

    public int[] solve(int[] A) {

        int max = findMax(A);

        int[] spf = new int[max + 1];
        for (int i = 0; i <= max; i++)
            spf[i] = i;

        for (int i = 2; i <= max / i; i++) {

            if (spf[i] == i) {

                for (int j = i * i; j <= max; j += i)
                    spf[j] = i;
            }
        }

        for (int i = 0; i < A.length; i++) {

            int val = A[i];
            Map<Integer, Integer> map = new HashMap<>();

            while (val != 1) {
                map.put(spf[val], map.getOrDefault(spf[val], 0) + 1);
                val /= spf[val];
            }

            int ans = 1;
            for (int x : map.values())
                ans = ans * (x + 1);

            A[i] = ans;
        }

        return A;
    }
}
