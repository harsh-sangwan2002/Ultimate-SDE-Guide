package NumberOf1Bits;

// TC => O(logN)
// SC => O(1)
public class Solution {

    public int numSetBits(int A) {

        int countBits = 0;

        while (A != 0) {

            if ((A & 1) == 1)
                countBits++;

            A = A >> 1;
        }

        return countBits;
    }
}
