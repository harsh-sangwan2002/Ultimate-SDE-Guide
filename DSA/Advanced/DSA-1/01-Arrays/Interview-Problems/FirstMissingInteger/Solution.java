package FirstMissingInteger;

// TC => O(N^2)
// SC => O(1)
public class Solution {

    public int firstMissingPositive(int[] A) {

        int n = A.length;

        for (int i = 1; i <= n + 2; i++) {

            boolean isPresent = false;

            for (int val : A) {

                if (val == i) {
                    isPresent = true;
                    break;
                }
            }

            if (!isPresent)
                return i;
        }

        return -1;
    }
}
