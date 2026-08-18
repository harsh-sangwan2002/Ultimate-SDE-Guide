package RotateArray;

// TC => O(N*B)
// SC => O(1)
public class Solution {

    public int[] solve(int[] A, int B) {

        int n = A.length;
        B = B % n;

        for (int k = 1; k <= B; k++) {

            int temp = A[n - 1];
            for (int i = n - 1; i > 0; i--)
                A[i] = A[i - 1];

            A[0] = temp;
        }

        return A;
    }
}
