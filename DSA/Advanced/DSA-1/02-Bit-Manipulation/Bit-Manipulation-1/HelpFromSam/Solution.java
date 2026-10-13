package HelpFromSam;

// TC => O(log(A))
// SC => O(1)
public class Solution {

    public int solve(int A) {

        int helpTaken = 0;

        while (A != 0) {

            if ((A & 1) != 0)
                helpTaken++;

            A = A >> 1;
        }

        return helpTaken;
    }
}
