package ContinuousSumQuery;

// TC => O(Q+N)
// SC => O(N)
public class Solution {

    public int[] solve(int A, int[][] B) {

        int[] res = new int[A];
        int n = B.length;

        for (int i = 0; i < n; i++) {

            int st = B[i][0] - 1, et = B[i][1], val = B[i][2];

            res[st] += val;

            if (et < A)
                res[et] -= val;
        }

        for (int i = 1; i < A; i++)
            res[i] += res[i - 1];

        return res;
    }
}
