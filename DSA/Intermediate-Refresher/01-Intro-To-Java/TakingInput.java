import java.util.Scanner;

public class TakingInput {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // byte b = scn.nextByte();
        // System.out.println(b);

        // short s = scn.nextShort();
        // System.out.println(s);

        // int n = scn.nextInt();
        // System.out.println(n);

        // long l = scn.nextLong();
        // System.out.println(l);

        // float f = scn.nextFloat();
        // System.out.println(f);

        // double d = scn.nextDouble();
        // System.out.println(d);

        // String str = scn.next();
        // System.out.println(str);

        // String str = scn.nextLine();
        // System.out.println(str);

        char ch = scn.next().charAt(0);
        System.out.println(ch);
        scn.close();
    }
}
