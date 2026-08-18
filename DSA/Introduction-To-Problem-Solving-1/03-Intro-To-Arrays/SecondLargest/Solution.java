package SecondLargest;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(int[] A) {

        int max = Integer.MIN_VALUE, smax = max;

        for (int val : A) {

            if (val > max) {
                smax = max;
                max = val;
            }

            else if (val > smax && val != max)
                smax = val;
        }

        return smax == Integer.MIN_VALUE ? -1 : smax;
    }
}
