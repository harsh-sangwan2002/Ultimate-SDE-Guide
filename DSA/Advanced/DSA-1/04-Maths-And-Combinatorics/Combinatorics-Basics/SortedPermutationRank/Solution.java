package SortedPermutationRank;

// TC => O(N^2)
// SC => O(N)
public class Solution {

    private long mod = (long) (1e6 + 3);

    private long factorial(int n) {

        if (n <= 1)
            return 1L;

        return n * 1L * factorial(n - 1) % mod;
    }

    public int findRank(String A) {

        int n = A.length();
        long ans = 0L;

        for (int i = 0; i < n; i++) {

            char ch = A.charAt(i);
            int count = 0;

            for (int j = i + 1; j < n; j++) {

                if (A.charAt(j) < ch)
                    count++;
            }

            ans = (ans + 1L * count * factorial(n - i - 1)) % mod;
        }

        return (int) (ans + 1);
    }
}
