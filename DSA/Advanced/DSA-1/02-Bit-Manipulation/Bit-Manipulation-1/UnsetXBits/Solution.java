package UnsetXBits;

// TC => O(N)
// SC => O(1)
public class Solution {

    private boolean checkBit(long A, int i) {

        return (A & (1 << i)) == 0 ? false : true;
    }

    public long solve(long A, int B) {

        for (int i = 0; i < B; i++) {

            if (checkBit(A, i))
                A = A ^ (1 << i);
        }

        return A;
    }
}
