package KthSmallest;

// TC => O(N^2)
// SC => O(1)
public class Solution2 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {

        int n = A.length;

        for (int i = 0; i < B; i++) {

            int minIdx = i;

            for (int j = i; j < n; j++) {

                if (A[j] < A[minIdx])
                    minIdx = j;
            }

            int temp = A[i];
            A[i] = A[minIdx];
            A[minIdx] = temp;
        }

        return A[B - 1];
    }
}
