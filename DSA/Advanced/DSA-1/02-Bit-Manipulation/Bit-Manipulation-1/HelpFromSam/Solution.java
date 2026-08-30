package HelpFromSam;

// TC => O(logN)
// SC => O(1)
public class Solution {

    public int solve(int A) {

        int helpTaken = 0;

        while (A != 0) {

            if ((A & 1) == 1)
                helpTaken++;

            A = A >> 1;
        }

        return helpTaken;
    }
}
