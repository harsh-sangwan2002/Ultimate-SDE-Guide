// TC => O(sqrt(N))
// SC => O(1)
public class Solution {

    public int solve(int A) {

        int factors = 0;

        for (int i = 1; i <= A / i; i++) {

            if (i * i == A)
                factors++;

            else if (A % i == 0)
                factors += 2;
        }

        return factors;
    }
}
