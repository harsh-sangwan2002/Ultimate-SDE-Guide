package FindTwoMissingNumbers;

import java.util.Arrays;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int[] solve(int[] A) {

        int n = A.length, xor = 0;

        for (int val : A)
            xor ^= val;

        for (int i = 1; i <= n + 2; i++)
            xor ^= i;

        int temp = xor, pos = 0;
        while (temp != 0) {

            if ((temp & 1) == 1)
                break;

            temp = temp >> 1;
            pos++;
        }

        int set = 0, unset = 0;

        for (int val : A) {

            if ((val & (1 << pos)) != 0)
                set ^= val;

            else
                unset ^= val;
        }

        for (int i = 1; i <= n + 2; i++) {

            if ((i & (1 << pos)) != 0)
                set ^= i;

            else
                unset ^= i;
        }

        int[] arr = new int[2];
        arr[0] = set;
        arr[1] = unset;
        Arrays.sort(arr);

        return arr;
    }
}
