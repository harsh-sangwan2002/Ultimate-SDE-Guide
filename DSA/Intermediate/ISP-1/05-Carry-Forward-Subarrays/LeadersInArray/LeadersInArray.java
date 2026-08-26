package LeadersInArray;

// TC => O(N)
// SC => O(N)
public class LeadersInArray {

    public int[] solve(int[] A) {

        int n = A.length, count = 1;
        int[] maxSoFar = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            if (i == n - 1)
                maxSoFar[i] = A[i];

            else if (A[i] > maxSoFar[i + 1]) {
                maxSoFar[i] = A[i];
                count++;
            }

            else
                maxSoFar[i] = maxSoFar[i + 1];
        }

        int[] res = new int[count];
        int idx = 0;

        for (int i = 0; i < n; i++) {

            if (i == 0)
                res[idx++] = maxSoFar[i];

            else if (maxSoFar[i] != maxSoFar[i - 1])
                res[idx++] = maxSoFar[i];
        }

        return res;
    }
}
