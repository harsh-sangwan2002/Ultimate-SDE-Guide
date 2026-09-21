package IsPrime;

// TC => O(sqrt(N))
// SC => O(1)
public class Solution {

    public int solve(int A) {

        if (A == 1)
            return 0;

        for (int i = 2; i <= A / i; i++) {

            if (A % i == 0)
                return 0;
        }

        return 1;
    }
}
