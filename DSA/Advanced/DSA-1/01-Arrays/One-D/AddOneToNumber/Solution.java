package AddOneToNumber;

// TC => O(N)
// SC => O(N)
public class Solution {

    public int[] plusOne(int[] A) {

        int n = A.length, zeroes = 0;

        for (int i = 0; i < n; i++) {

            int val = A[i];

            if (val == 0)
                zeroes++;

            else
                break;
        }

        int[] res = new int[n - zeroes];

        for (int i = zeroes; i < n; i++)
            res[i - zeroes] = A[i];

        n = res.length;

        for (int i = n - 1; i >= 0; i--) {

            if (res[i] != 9) {
                res[i]++;
                return res;
            }

            res[i] = 0;
        }

        res = new int[res.length + 1];
        res[0] = 1;
        return res;
    }
}
