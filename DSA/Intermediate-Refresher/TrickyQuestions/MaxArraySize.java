public class MaxArraySize {

    public static void binarySearch() {

        int lo = 1, hi = Integer.MAX_VALUE, maxSize = 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            try {
                int[] arr = new int[mid];
                maxSize = mid;
                lo = mid + 1;

                arr = null;

            } catch (OutOfMemoryError e) {
                hi = mid - 1;
                System.gc();
            }
        }

        System.out.println("Max array size is: " + maxSize); // 536346621
    }

    public static void linearSearch() {

        int maxSize = 0;

        for (int i = 1; i <= Integer.MAX_VALUE; i++) {

            try {
                int[] arr = new int[i];
                maxSize = i;
                arr = null;
            } catch (OutOfMemoryError e) {
                break;
            }
        }

        System.out.println("Max array size is: " + maxSize); // 536346621
    }

    public static void main(String[] args) {

        // binarySearch();
        linearSearch();
    }
}