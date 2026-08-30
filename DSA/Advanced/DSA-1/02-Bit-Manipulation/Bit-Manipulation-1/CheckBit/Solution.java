package CheckBit;

// TC => O(1)
// SC => O(1)
public class Solution {

    public int solve(int A, int B) {

        return (A & (1 << B)) == 0 ? 0 : 1;
    }
}
