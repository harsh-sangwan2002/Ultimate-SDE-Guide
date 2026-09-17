public class Typecasting {

    public static void main(String[] args) {

        int i = 20;
        long l = 10000000000L;

        // 6-7 decimal places
        float f = 3.123456789F;

        // 15-16 decimal places
        double d = 3.1234567891234567D;
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        // Case-1 :Small -> Large
        i = 20;
        l = i;
        System.out.println(l);

        // Case-2: Large -> Small (Explicit type casting)
        l = 20000L;
        i = (int) l;
        System.out.println(i);

        // Case-3: Large -> Small
        l = 2000000000000000L;
        i = (int) i;
        System.out.println(i);

        i = Integer.MAX_VALUE + 1;
        System.out.println(i);
        i = Integer.MIN_VALUE;
        System.out.println(i);
    }
}
