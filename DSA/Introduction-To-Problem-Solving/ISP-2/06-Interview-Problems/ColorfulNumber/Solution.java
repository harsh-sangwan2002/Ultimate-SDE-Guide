package ColorfulNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TC => O(log(N)^2)
// SC => O(log(N))
public class Solution {

    public int colorful(int A) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int temp = A;

        while (temp != 0) {

            int ld = temp % 10;
            list.add(ld);
            temp /= 10;
        }

        for (int i = 0; i < list.size(); i++) {

            int pr = 1;

            for (int j = i; j < list.size(); j++) {

                pr *= list.get(j);

                if (set.contains(pr))
                    return 0;

                set.add(pr);
            }
        }

        return 1;
    }
}
