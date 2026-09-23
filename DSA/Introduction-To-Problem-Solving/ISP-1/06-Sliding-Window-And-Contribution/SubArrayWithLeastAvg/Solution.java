package SubArrayWithLeastAvg;

// TC => O(N^2)
// SC => O(1)
public class Solution {

    public int solve(int[] A, int B) {

        int n = A.length, sum = 0;

        for (int i = 0; i < B; i++)
            sum += A[i];

        int min = sum, st = 0;

        for (int i = B; i < n; i++) {

            sum -= A[i - B];
            sum += A[i];

            if (sum < min) {
                st = i - B + 1;
                min = sum;
            }
        }

        return st;
    }
}
