package SearchInMatrix;

// TC => O(Max(N,M))
// SC => O(1)
public class Solution {

    public int solve(int[][] A, int B) {

        int n = A.length, m = A[0].length, i = 0, j = m - 1;
        int ans = Integer.MAX_VALUE;

        while (i < n && j >= 0) {

            if (A[i][j] == B) {

                int val = (i + 1) * 1009 + (j + 1);
                ans = Math.min(ans, val);
                j--;
            }

            else if (A[i][j] > B)
                j--;

            else
                i++;
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
