// TC => O(N)
// SC => O(1)
public class Solution2 {

    private int[] findMaxMin(int[] A) {

        int max = A[0], min = A[0];

        for (int val : A) {
            max = Math.max(max, val);
            min = Math.min(min, val);
        }

        return new int[] { max, min };
    }

    public int solve(int[] A) {

        int[] maxMin = findMaxMin(A);
        int max = maxMin[0], min = maxMin[1], last_min_idx = -1, last_max_idx = -1;
        int n = A.length, ans = n;

        if (max == min)
            return 1;

        for (int i = 0; i < n; i++) {

            if (A[i] == max) {

                if (last_min_idx != -1)
                    ans = Math.min(ans, i - last_min_idx + 1);

                last_max_idx = i;
            }

            else if (A[i] == min) {

                if (last_max_idx != -1)
                    ans = Math.min(ans, i - last_max_idx + 1);

                last_min_idx = i;
            }
        }

        return ans;
    }
}
