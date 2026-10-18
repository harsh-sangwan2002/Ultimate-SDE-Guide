package LargestCoPrimeDivisor;

// TC => O(A*log min(A,B))
// SC => O(log min(A,B))
public class Solution2 {

    private int GCD(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        return GCD(b, a % b);
    }

    public int cpFact(int A, int B) {

        while (GCD(A, B) != 1)
            A /= GCD(A, B);

        return A;
    }
}
