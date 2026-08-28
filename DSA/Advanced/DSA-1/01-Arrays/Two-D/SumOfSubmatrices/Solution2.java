package SumOfSubmatrices;

// TC => O(N^6)
// SC => O(1)
public class Solution2 {
    public int solve(int[][] A) {

        int totalSum = 0, n = A.length;

        for (int top = 0; top < n; top++) {

            for (int bottom = top; bottom < n; bottom++) {

                for (int left = 0; left < n; left++) {

                    for (int right = left; right < n; right++) {

                        int sum = 0;

                        for (int i = top; i <= bottom; i++) {

                            for (int j = left; j <= right; j++)
                                sum += A[i][j];
                        }

                        totalSum += sum;
                    }
                }
            }
        }

        return totalSum;
    }
}
