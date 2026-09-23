package LeadersInArray;

// TC => O(N)
// SC => O(N)
public class Solution {

    public int[] solve(int[] A) {

        int n = A.length, size = 1, idx = 1;
        int[] maxSoFar = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            if (i == n - 1)
                maxSoFar[i] = A[i];

            else {

                if (A[i] > maxSoFar[i + 1]) {
                    size++;
                    maxSoFar[i] = A[i];
                }

                else
                    maxSoFar[i] = maxSoFar[i + 1];
            }
        }

        int[] res = new int[size];
        res[0] = maxSoFar[0];

        for (int i = 1; i < n; i++) {

            if (maxSoFar[i] != maxSoFar[i - 1])
                res[idx++] = maxSoFar[i];
        }

        return res;
    }
}
