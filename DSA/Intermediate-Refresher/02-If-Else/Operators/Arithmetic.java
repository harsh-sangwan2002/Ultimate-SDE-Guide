package Operators;

public class Arithmetic {

    public static void main(String[] args) {

        // Compiler always output in the form of larger data-type

        // 1. Division
        // int/int => int
        // int/float => float
        // float/int => float
        // float/float => float
        // long/int => long
        // double/float => double
        // int/long => long
        // float/double => double
        System.out.println(3 / 2.0);

        // 2. Multiplication
        // int*int => int
        // int*long => long
        // float*int => float
        // float*float => float
        // long*long => long
        // double*long => double
        int x = 1000000, y = x;
        long ans = x * y; // problematic
        ans = (long) (x * y); // problematic
        ans = (long) x * y;
        System.out.println(x * y);
        System.out.println(ans);

        // 3. Modulo
        // 8%3 => 2
        // 10%2 => 0
        // 2%10 => 2
        System.out.println(-10 % 7);
    }
}