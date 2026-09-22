// TC => O(N^3)
// SC => O(1)
public class Max_Min {

    public static boolean containsElement(int tar, int si, int li, int[] arr) {

        for (int i = si; i <= li; i++) {

            int val = arr[i];

            if (val == tar)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4 };
        int n = arr.length, max = arr[0], min = arr[0], ans = n;

        for (int val : arr) {
            max = Math.max(max, val);
            min = Math.min(min, val);
        }

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                if (containsElement(max, i, j, arr) && containsElement(min, i, j, arr))
                    ans = Math.min(j - i + 1, ans);
            }
        }

        System.out.println(ans);
    }
}
