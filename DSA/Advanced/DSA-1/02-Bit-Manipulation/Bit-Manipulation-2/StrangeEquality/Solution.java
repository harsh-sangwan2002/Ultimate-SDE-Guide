package StrangeEquality;

// TC => O(logN)
// SC => O(1)
public class Solution {

    public int solve(int A) {

        int n = A, bits = 0;

        while (n != 0) {
            bits++;
            n = n >> 1;
        }

        int Y = (1 << bits), X = 0, pos = 0;

        while (A != 0) {

            if ((A & 1) == 0)
                X += (1 << pos);

            pos++;
            A = A >> 1;
        }

        return X ^ Y;
    }
}
