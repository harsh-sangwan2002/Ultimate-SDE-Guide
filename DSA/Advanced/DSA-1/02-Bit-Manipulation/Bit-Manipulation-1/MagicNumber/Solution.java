package MagicNumber;

// TC => O(log(A))
// SC => O(1)
public class Solution {

    public int solve(int A) {

        int ans = 0, pow = 5;

        while (A != 0) {

            int ld = A % 2;
            A /= 2;

            ans += ld * pow;
            pow *= 5;
        }

        return ans;
    }
}
