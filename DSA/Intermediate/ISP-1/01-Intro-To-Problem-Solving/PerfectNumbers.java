public class PerfectNumbers {

    public int solve(int A) {

        int divisorSum = 0;

        for (int i = 1; i <= A / i; i++) {

            if (i * i == A)
                divisorSum += i;

            else if (A % i == 0)
                divisorSum += i + A / i;
        }

        divisorSum -= A;
        return divisorSum == A ? 1 : 0;
    }
}
