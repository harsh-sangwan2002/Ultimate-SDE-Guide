package GreatestCommonDivisor;

// TC => O(log min(A,B))
// SC => O(1)
public class Solution2 {

    public int gcd(int A, int B) {

        if (A == 0)
            return B;
        if (B == 0)
            return A;

        if (B > A)
            return gcd(B, A);

        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }

        return A;
    }
}
