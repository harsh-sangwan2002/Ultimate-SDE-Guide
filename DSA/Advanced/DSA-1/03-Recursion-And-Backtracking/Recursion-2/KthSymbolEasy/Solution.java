package KthSymbolEasy;

import java.util.ArrayList;
import java.util.List;

// TC => O(N*L)
// SC => O(N*L)
public class Solution {

    public int solve(int A, int B) {

        List<StringBuilder> res = new ArrayList<>();
        res.add(new StringBuilder("0"));

        for (int i = 1; i < A; i++) {

            StringBuilder str = res.get(i - 1), temp = new StringBuilder("");

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == '0')
                    temp.append("01");

                else
                    temp.append("10");
            }

            res.add(temp);
        }

        return res.get(A - 1).charAt(B) == '0' ? 0 : 1;
    }
}
