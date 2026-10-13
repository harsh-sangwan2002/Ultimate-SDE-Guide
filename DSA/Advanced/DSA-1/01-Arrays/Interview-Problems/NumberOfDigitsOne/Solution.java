package NumberOfDigitsOne;

// TC => O(log(N))
// SC => O(1)
public class Solution {

    public int solve(int A) {

        int ans = 0;

        for (int i = 1; i <= A; i *= 10) {

            int div = i * 10;
            ans += (A / div) * i + Math.min(Math.max((A % div) - (i - 1), 0), i);
        }

        return ans;
    }
}
