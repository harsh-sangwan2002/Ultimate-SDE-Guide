package LinearSearch;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int solve(int[] A, int B) {

        int count = 0;

        for (int val : A) {

            if (val == B)
                count++;
        }

        return count;
    }
}
