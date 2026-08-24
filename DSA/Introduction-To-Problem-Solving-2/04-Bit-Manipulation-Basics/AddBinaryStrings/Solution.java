// TC => O(Max(A,B))
// SC => O(Max(A,B))
public class Solution {

    public String addBinary(String A, String B) {

        StringBuilder sb = new StringBuilder("");
        int i = A.length() - 1, j = B.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int val1 = i >= 0 ? Integer.parseInt(A.charAt(i) + "") : 0;
            int val2 = j >= 0 ? Integer.parseInt(B.charAt(j) + "") : 0;
            int sum = val1 + val2 + carry;

            int digit = sum % 2;
            carry = sum / 2;

            sb.append(digit);
            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}
