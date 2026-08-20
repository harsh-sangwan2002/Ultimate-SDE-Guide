public class MinMaxSubArray {

    public static int[] findMaxMin(int[] arr, int n) {

        int max = arr[0], min = arr[0];

        for (int val : arr) {
            max = Math.max(max, val);
            min = Math.min(min, val);
        }

        return new int[] { max, min };
    }

    public static int smallestLengthSubArray(int[] arr, int n) {

        int[] maxMin = findMaxMin(arr, n);
        int max = maxMin[0], min = maxMin[1];
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                boolean containsMax = false, containsMin = false;

                for (int k = i; k <= j; k++) {

                    if (arr[k] == max)
                        containsMax = true;

                    else if (arr[k] == min)
                        containsMin = true;
                }

                if (containsMax && containsMin)
                    minLength = Math.min(minLength, j - i + 1);
            }
        }

        return minLength;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 };
        int n = arr.length;

        int res = smallestLengthSubArray(arr, n);
        System.out.println(res);
    }
}
