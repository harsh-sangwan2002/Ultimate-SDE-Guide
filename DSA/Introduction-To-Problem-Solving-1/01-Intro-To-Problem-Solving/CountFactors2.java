public class CountFactors2 {

    public int solve(int A) {

        int factors = 0;

        for (int i = 1; i * i <= A; i++) {

            if (i * i == A)
                factors++;

            else if (A % i == 0)
                factors += 2;
        }

        return factors;
    }
}
