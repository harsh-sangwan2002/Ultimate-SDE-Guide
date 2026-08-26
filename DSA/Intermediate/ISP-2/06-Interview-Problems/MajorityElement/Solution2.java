package MajorityElement;

// TC => O(N)
// SC => O(1)
public class Solution2 {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {

        int n = A.length, count = 1, ans = A[0];

        for (int i = 1; i < n; i++) {

            if (count == 0) {
                ans = A[i];
                count = 1;
            }

            else if (ans == A[i])
                count++;

            else
                count--;
        }

        return ans;
    }
}
