package InPlacePrefixSum;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int[] solve(int[] A) {

        int n = A.length;

        for (int i = 1; i < n; i++)
            A[i] += A[i - 1];

        return A;
    }
}