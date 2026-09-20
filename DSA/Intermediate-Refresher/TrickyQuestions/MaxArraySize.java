public class MaxArraySize {

    public static void main(String[] args) {

        int lo = 0, hi = Integer.MAX_VALUE, ans = 0;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            try {

                int[] arr = new int[mid];
                ans = mid;
                lo = mid + 1;
                arr = null;

            } catch (OutOfMemoryError e) {
                System.gc();
                hi = mid - 1;
            }
        }

        System.out.println("Max successful size of the array is: " + ans);
    }
}