package SubArrayOR;

// TC => O(N)
// SC => O(1)
public class Solution {

    private boolean checkBit(int n, int pos) {

        return ((n & (1 << pos)) != 0) ? true : false;
    }

    public int solve(int[] A) {

        long ans = 0L, mod = (long) (1e9 + 7);
        int n = A.length;

        for (int i = 0; i < 32; i++) {

            int idx = n;
            for (int j = n - 1; j >= 0; j--) {

                if (checkBit(A[j], i))
                    idx = j;

                ans = (ans + (n - idx) * 1L * (1 << i)) % mod;
            }
        }

        return (int) ans;
    }
}
