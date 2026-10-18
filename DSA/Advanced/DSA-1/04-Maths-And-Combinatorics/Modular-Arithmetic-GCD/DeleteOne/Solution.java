package DeleteOne;

// TC => O(N*log min(A,B))
// SC => O(N)
public class Solution {

    private int GCD(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        return GCD(b, a % b);
    }

    public int solve(int[] A) {

        int n = A.length;
        int[] pre = new int[n], suf = new int[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                pre[i] = A[i];

            else
                pre[i] = GCD(pre[i - 1], A[i]);
        }

        for (int i = n - 1; i >= 0; i--) {

            if (i == n - 1)
                suf[i] = A[i];

            else
                suf[i] = GCD(suf[i + 1], A[i]);
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int gcd = 0;

            if (i == 0)
                gcd = suf[i + 1];

            else if (i == n - 1)
                gcd = pre[n - 2];

            else
                gcd = GCD(pre[i - 1], suf[i + 1]);

            max = Math.max(max, gcd);
        }

        return max;
    }
}
