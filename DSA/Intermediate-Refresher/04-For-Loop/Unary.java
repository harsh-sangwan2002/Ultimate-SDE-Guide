public class Unary {

    public static void main(String[] args) {

        // Unary Operators
        // 1. Pre-increment => First change then use
        // int i = 1;
        // ++i;
        // System.out.println(i);

        // 2. Post-increment => First use then change
        // int i = 1;
        // i++;
        // System.out.println(i);

        int i = 1;
        System.out.println(i++); // 1
        System.out.println(++i); // 3

        int x = i++; // 3
        System.out.println(x + " " + i); // 3 4

        // Compound Syntax Operators or shorthand assignment operators
        x = 1;
        System.out.println(x += 1);
        System.out.println(x -= 1);
        System.out.println(x *= 1);
        System.out.println(x /= 1);
        System.out.println(x %= 1);
    }
}
