public class MaxArraySize {

    public static void main(String[] args) {

        int low = 0;
        int high = Integer.MAX_VALUE;
        int maxSuccessfulSize = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            try {
                int[] arr = new int[mid];

                maxSuccessfulSize = mid;
                low = mid + 1;

                // Make the array eligible for GC
                arr = null;

            } catch (OutOfMemoryError e) {
                high = mid - 1;

                System.gc();
            }
        }

        System.out.println("Maximum successfully allocated int[] length = " + maxSuccessfulSize);

    }
}