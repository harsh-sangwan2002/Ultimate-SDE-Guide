package LargestCoPrimeDivisor;

// TC => O(N*log min(X,B))
// SC => O(log min(X,B))
public class Solution {

    private int GCD(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        return GCD(b, a % b);
    }

    public int cpFact(int A, int B) {

        for (int X = A; X >= 1; X--) {

            if (A % X == 0 && GCD(X, B) == 1)
                return X;
        }

        return 1;
    }
}
