public class Intro {

    public static void main(String[] args) {

        int[] arr1 = new int[2];
        Integer[] arr2 = new Integer[2];
        String[] arr3 = new String[2];

        for (int val : arr1)
            System.out.print(val + " "); // 0

        System.out.println();

        for (Integer val : arr2)
            System.out.print(val + " "); // null

        System.out.println();

        for (String str : arr3)
            System.out.print(str + " "); // null

        System.out.println();
    }
}