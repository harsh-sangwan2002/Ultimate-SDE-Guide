public class PassByValue {

    public static void fun(int[] A) {

        A = new int[5];
        System.out.println(A);
    }

    public static void main(String[] args) {

        int[] A = new int[3];

        System.out.println(A);
        fun(A);
        System.out.println(A);
    }
}
