package ExcelColumnTitle;

// TC => O(log (A))
// SC => O(log (A))
public class Solution {

    public String convertToTitle(int A) {

        StringBuilder sb = new StringBuilder("");

        while (A != 0) {

            int ld = (A - 1) % 26;
            sb.append((char) (ld + 'A'));
            A = (A - 1) / 26;
        }

        return sb.reverse().toString();
    }
}
