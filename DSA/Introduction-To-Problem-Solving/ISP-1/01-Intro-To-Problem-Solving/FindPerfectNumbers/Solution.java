package FindPerfectNumbers;

// TC => O(sqrt(N))
// SC => O(1)
public class Solution {

    public int solve(int A) {

        if (A == 1)
            return 0;

        int factorsSum = 0;

        for (int i = 1; i <= A / i; i++) {

            if (i * i == A)
                factorsSum += i;

            else if (A % i == 0)
                factorsSum += (i + A / i);
        }

        factorsSum -= A;
        return factorsSum == A ? 1 : 0;
    }
}
