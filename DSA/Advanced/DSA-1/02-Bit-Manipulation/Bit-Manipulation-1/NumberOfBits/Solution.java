package NumberOfBits;

// TC => O(log(A))
// SC => O(1)
public class Solution {

    public int numSetBits(int A) {

        int count = 0;

        while (A != 0) {

            if ((A & 1) != 0)
                count++;

            A = A >> 1;
        }

        return count;
    }
}
