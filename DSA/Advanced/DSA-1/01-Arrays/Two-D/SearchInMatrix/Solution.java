package SearchInMatrix;

// TC => O(N*M)
// SC => O(1)
public class Solution {

    public int solve(int[][] A, int B) {

        int n = A.length, m = A[0].length;
        int ans = Integer.MAX_VALUE, i = n - 1, j = 0;

        while (i >= 0 && j < m) {

            if (A[i][j] == B) {

                int val = (i + 1) * 1009 + j + 1;
                ans = Math.min(ans, val);
                i--;
            }

            else if (A[i][j] > B)
                i--;

            else
                j++;
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
