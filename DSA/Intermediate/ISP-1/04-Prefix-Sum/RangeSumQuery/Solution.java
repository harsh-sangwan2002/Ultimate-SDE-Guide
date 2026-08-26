// TC => O(N+Q)
// SC => O(N)
public class Solution {

    public long[] rangeSum(int[] A, int[][] B) {

        int n = A.length, m = B.length;
        long[] res = new long[m];
        long[] pre = new long[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                pre[i] = (long) A[i];

            else
                pre[i] = pre[i - 1] + A[i];
        }

        for (int i = 0; i < m; i++) {

            int st = B[i][0], et = B[i][1];

            if (st == 0)
                res[i] = pre[et];

            else
                res[i] = pre[et] - pre[st - 1];
        }

        return res;
    }
}
