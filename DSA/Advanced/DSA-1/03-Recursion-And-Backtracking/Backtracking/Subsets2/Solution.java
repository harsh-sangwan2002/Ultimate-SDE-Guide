package Subsets2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TC => O(2^n)
// SC => O(N)
public class Solution {

    private void helper(int[] A, int idx, List<Integer> curr, List<List<Integer>> res) {

        res.add(new ArrayList<>(curr));

        for (int i = idx; i < A.length; i++) {

            if (i > idx && A[i] == A[i - 1])
                continue;

            curr.add(A[i]);
            helper(A, i + 1, curr, res);
            curr.remove(curr.size() - 1);
        }
    }

    public int[][] subsetsWithDup(int[] A) {

        Arrays.sort(A);

        List<List<Integer>> res = new ArrayList<>();
        helper(A, 0, new ArrayList<>(), res);

        int[][] ans = new int[res.size()][];
        int idx1 = 0;

        for (List<Integer> list : res) {

            int[] temp = new int[list.size()];
            int idx2 = 0;

            for (int val : list)
                temp[idx2++] = val;

            ans[idx1++] = temp;
        }

        return ans;
    }
}
