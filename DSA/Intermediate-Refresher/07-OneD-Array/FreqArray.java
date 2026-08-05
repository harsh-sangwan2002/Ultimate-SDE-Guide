public class FreqArray {

    public static int findFreq(int[] arr, int n) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n)
                count++;
        }

        return count;
    }

    public static void printFreqArray(int[] arr) {

        int[] freqArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int n = arr[i], freq = findFreq(arr, n);
            freqArr[i] = freq;
        }

        for (int i = 0; i < freqArr.length; i++)
            System.out.print(freqArr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 1, 1, 4, 2, 2, 3, 4, 3, 5 };
        printFreqArray(arr);
    }
}
