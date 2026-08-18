package SpecialIndex;

// TC => O(N)
// SC => O(N)
public class Solution {

    public int solve(int[] A) {

        int n = A.length, count = 0;
        int[] even = new int[n], odd = new int[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                even[i] = A[i];

            else if (i % 2 == 0) {
                even[i] = even[i - 1] + A[i];
                odd[i] = odd[i - 1];
            }

            else {
                even[i] = even[i - 1];
                odd[i] = odd[i - 1] + A[i];
            }
        }

        for (int i = 0; i < n; i++) {

            int evenSum = 0, oddSum = 0;

            if (i == 0) {
                evenSum = odd[n - 1] - odd[0];
                oddSum = even[n - 1] - even[0];
            }

            else {
                evenSum = even[i - 1] + (odd[n - 1] - odd[i]);
                oddSum = odd[i - 1] + (even[n - 1] - even[i]);
            }

            if (evenSum == oddSum)
                count++;
        }

        return count;
    }
}
