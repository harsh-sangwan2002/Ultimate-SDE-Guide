package HelpFromSam;

// TC => O(log(A))
// SC => O(1)
public class Solution2 {

    public int solve(int A) {

        int help = 0;

        while (A != 0) {

            if (A % 2 == 1)
                help++;

            A /= 2;
        }

        return help;
    }
}
