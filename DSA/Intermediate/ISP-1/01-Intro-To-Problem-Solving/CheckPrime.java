public class CheckPrime {

    public int solve(int A) {

        if (A <= 2)
            return 1;

        for (int i = 2; i * i <= A; i++) {

            if (A % i == 0)
                return 0;
        }

        return 1;
    }
}
