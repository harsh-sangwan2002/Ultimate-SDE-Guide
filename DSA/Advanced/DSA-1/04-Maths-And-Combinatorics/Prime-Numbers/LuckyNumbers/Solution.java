package LuckyNumbers;

// TC = O(A*log(log(A)))
// SC => O(A)
public class Solution {

    public int solve(int A) {

        int[] primes = new int[A + 1];
        int count = 0;

        for (int i = 2; i <= A; i++) {

            if (primes[i] == 0) {

                for (int j = i; j <= A; j += i)
                    primes[j]++;
            }

            if (primes[i] == 2)
                count++;
        }

        return count;
    }
}
