import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {

        /*
         * String is not just a character array.
         */
        // String s = "Hello";
        // System.out.println(s);
        Scanner scn = new Scanner(System.in);

        // String s1 = scn.nextLine();
        // String s2 = scn.nextLine();
        // System.out.println(s1);
        // System.out.println(s2);

        String s = scn.nextLine();

        // length => It's a function in String class
        // System.out.println(s.length());

        // charAt
        // System.out.println(s.charAt(0));

        // for (int i = 0; i < s.length(); i++)
        // System.out.println(s.charAt(i));

        // for (int i = 0; i < s.length(); i++) {

        // for (int j = i; j < s.length(); j++)
        // System.out.println(s.substring(i, j + 1));
        // }

        String s1 = "Hello", s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        System.out.println("Hello" + 10 + 20);
        System.out.println(10 + 20 + "Hello");

        String[] parts = s.split(" ");

        for (String str : parts)
            System.out.println(str);

        scn.close();
    }
}
