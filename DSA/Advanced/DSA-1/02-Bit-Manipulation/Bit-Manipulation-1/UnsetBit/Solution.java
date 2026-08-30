package UnsetBit;

// TC => O(1)
// SC => O(1)
public class Solution {

    public int solve(int A, int B) {

        if ((A & (1 << B)) == 0)
            return A;

        else
            return (A ^ (1 << B));
    }
}
