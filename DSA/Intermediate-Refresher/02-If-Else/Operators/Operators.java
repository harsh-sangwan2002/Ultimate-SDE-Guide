package Operators;

public class Operators {

    public static void main(String[] args) {

        // Division
        /*
         * int/int => int
         * float/int => float
         * float/float => float
         * long/int => long
         * double/float => double
         */

        // Multiplication
        /*
         * int*int => int
         * float*int => float
         * float*float => float
         * long*int => long
         * long*float => float
         * double*float => double
         */

        int x = 1000000, y = 1000000;
        long ans = x * y; // wrong
        ans = (long) (x * y); // wrong

        ans = (long) x * y;
        System.out.println(ans);

        // Modulo
        System.out.println(10 % 7);
        System.out.println(-10 % 7);
    }
}
