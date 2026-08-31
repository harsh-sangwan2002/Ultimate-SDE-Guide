package SingleNumber3;

import java.util.Arrays;

// TC => O(N)
// SC => O(1)
public class Solution {

    public int[] solve(int[] A) {

        int n = A.length, xor = 0;

        for (int val : A)
            xor ^= val;

        int temp = xor, pos = 0;

        while (temp != 0) {

            if ((temp & 1) == 1)
                break;

            temp = temp >> 1;
            pos++;
        }

        int set = 0, unset = 0;
        for (int i = 0; i < n; i++) {

            int val = A[i];

            if ((val & (1 << pos)) != 0)
                set ^= val;

            else
                unset ^= val;
        }

        int[] arr = new int[2];
        arr[0] = set;
        arr[1] = unset;

        Arrays.sort(arr);
        return arr;
    }
}
