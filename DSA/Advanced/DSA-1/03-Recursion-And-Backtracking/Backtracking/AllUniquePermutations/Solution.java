package AllUniquePermutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TC => O(N*N!)
// SC => O(N!)
public class Solution {

    private void helper(int[] arr, List<Integer> curr, List<List<Integer>> res, boolean[] vis) {

        if (curr.size() == arr.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (vis[i] || (i > 0 && arr[i] == arr[i - 1] && !vis[i - 1]))
                continue;

            curr.add(arr[i]);
            vis[i] = true;
            helper(arr, curr, res, vis);
            vis[i] = false;
            curr.remove(curr.size() - 1);
        }
    }

    public int[][] permute(int[] A) {

        Arrays.sort(A);

        int n = A.length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[] vis = new boolean[n];

        helper(A, new ArrayList<>(), res, vis);

        int[][] ans = new int[res.size()][n];
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
