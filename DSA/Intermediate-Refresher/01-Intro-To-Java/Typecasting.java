public class Typecasting {

    public static void main(String[] args) {

        int i = 20;
        long l = 10_00_00_00_000L; // By default numbers are taken as integer, so need to typecast it
        // System.out.println(i + " " + l);

        float f = 3.12345678F; // Precision upto 7 decimal places
        double d = 3.1234567891234569; // Precision upto 15 decimal places
        System.out.println(f + " " + d);

        // Case:1 Implicit Typecasting
        i = 50;
        l = i;
        System.out.println(l);

        // Case:2 Explicit Typecasting
        l = 50;
        i = (int) l;
        System.out.println(i);

        // Case:3 Explicit Typecasting
        l = 50_00_00_00_000L;
        i = (int) l;
        System.out.println(i);
    }
}
