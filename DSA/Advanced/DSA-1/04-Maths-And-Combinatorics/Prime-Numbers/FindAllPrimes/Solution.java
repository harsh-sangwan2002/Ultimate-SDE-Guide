package FindAllPrimes;

import java.util.ArrayList;
import java.util.List;

// TC => O(N*log(log(N)))
// SC => O(N)
public class Solution {

    public int[] solve(int A) {

        boolean[] primes = new boolean[A + 1];
        List<Integer> res = new ArrayList<>();

        for (int i = 2; i <= A / i; i++) {

            if (!primes[i]) {

                for (int j = i * i; j <= A; j += i)
                    primes[j] = true;
            }
        }

        for (int i = 2; i <= A; i++) {

            if (!primes[i])
                res.add(i);
        }

        int[] ans = new int[res.size()];
        int idx = 0;

        for (int val : res)
            ans[idx++] = val;

        return ans;
    }
}
