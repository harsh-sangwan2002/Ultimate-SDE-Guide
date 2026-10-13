package UnsetXBits;

// TC => O(B)
// SC => O(1)
public class Solution {

    private boolean checkBit(long A, int pos) {

        if ((A & (1 << pos)) != 0)
            return true;

        return false;
    }

    public long solve(long A, int B) {

        for (int i = 0; i < B; i++) {

            if (checkBit(A, i))
                A ^= (1 << i);
        }

        return A;
    }
}
