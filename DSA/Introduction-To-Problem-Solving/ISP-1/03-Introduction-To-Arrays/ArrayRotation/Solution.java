package ArrayRotation;

// TC => O(N)
// SC => O(N)
public class Solution {

    public int[] solve(int[] A, int B) {

        int n = A.length, idx = 0;
        B = B % n;
        int[] res = new int[n];

        for (int i = n - B; i < n; i++)
            res[idx++] = A[i];

        for (int i = 0; i < n - B; i++)
            res[idx++] = A[i];

        return res;
    }
}
