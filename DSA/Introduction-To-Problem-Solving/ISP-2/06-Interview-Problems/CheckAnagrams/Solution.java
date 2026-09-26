package CheckAnagrams;

// TC => O(Max(N,M))
// SC => O(1)
public class Solution {

    public int solve(String A, String B) {

        if (A.length() != B.length())
            return 0;

        int[] freq = new int[26];

        for (char ch : A.toCharArray())
            freq[ch - 'a']++;

        for (char ch : B.toCharArray()) {

            if (freq[ch - 'a'] <= 0)
                return 0;

            freq[ch - 'a']--;
        }

        return 1;
    }
}
