package MaximumAndPair;

// TC => O(N)
// SC => O(1)
public class Solution {

    private boolean checkBit(int n, int pos) {

        if ((n & (1 << pos)) != 0)
            return true;

        return false;
    }

    public int solve(int[] A) {

        int n = A.length, ans = 0;

        for (int i = 31; i >= 0; i--) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (checkBit(A[j], i))
                    count++;

                if (count >= 2)
                    break;
            }

            if (count >= 2) {

                ans += (1 << i);

                for (int j = 0; j < n; j++) {

                    if (!checkBit(A[j], i))
                        A[j] = 0;
                }
            }
        }

        return ans;
    }
}
