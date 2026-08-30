package FindingGoodDays;

// TC => O(logN)
// SC => O(1)
public class Solution {

    public int solve(int A) {

        int goodDays = 0;

        while (A != 0) {

            if ((A & 1) != 0)
                goodDays++;

            A = A >> 1;
        }

        return goodDays;
    }
}
