public class CheckSequence {

    public static boolean isIncreasing(int[] arr) {

        if (arr == null)
            return true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] >= arr[i + 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        boolean flag = isIncreasing(arr);

        System.out.println(flag);
    }
}
