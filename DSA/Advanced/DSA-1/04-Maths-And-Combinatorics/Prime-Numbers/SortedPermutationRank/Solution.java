package SortedPermutationRank;

// TC => O(N^2)
// SC => O(1)
public class Solution {

    private long mod = (long) (1e6 + 3);

    private long factorial(int n) {

        if (n <= 1)
            return 1;

        return 1L * n * factorial(n - 1);
    }

    public int findRank(String A) {

        long ans = 0L;
        int n = A.length();

        for (int i = 0; i < n; i++) {

            int count = 0;
            char ch = A.charAt(i);

            for (int j = i + 1; j < n; j++) {

                if (A.charAt(j) < ch)
                    count++;
            }

            ans = (ans + 1L * count * factorial(n - i - 1)) % mod;
        }

        return (int) (ans + 1);
    }
}
