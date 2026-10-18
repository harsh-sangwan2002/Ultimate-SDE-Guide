package DivisorGame;

// TC => O(log min(B,C))
// SC => O(log min(B,C))
public class Solution {

    private int GCD(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        return GCD(b, a % b);
    }

    public int solve(int A, int B, int C) {

        int lcm = B * C / GCD(B, C);
        return A / lcm;
    }
}
