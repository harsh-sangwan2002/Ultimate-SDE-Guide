package Strings;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // String s1 = "hello";
        // String s1 = scn.nextLine();
        // String s2 = scn.next();

        // System.out.println(s1 + "\n" + s2);

        // String s = scn.nextLine();
        // System.out.println(s);
        // System.out.println(s.length()); // length() => It's a function
        // System.out.println(s.charAt(2)); // charAt(idx)

        // for (int i = 0; i < s.length(); i++)
        // System.out.print(s.charAt(i));

        // System.out.println();

        // s.charAt(0) = 'a' // doesn't work

        // String s = "abcd";
        // System.out.println(s.substring(0, 1)); // substring(startIdx,endIdx-1)
        // System.out.println(s.substring(1)); // substring(startIdx) => upto last
        // character

        // for (int i = 0; i < s.length(); i++) {

        // for (int j = i; j < s.length(); j++)
        // System.out.print(s.substring(i, j + 1) + " ");

        // System.out.println();
        // }

        // System.out.println(s.substring(0, 0)); // empty string

        // String s1 = "hello";
        // s1 += "";
        // s1 += "w";
        // s1 += "o";
        // s1 += 10;
        // System.out.println(s1);

        // System.out.println("hello" + 10 + 20); // hello1020
        // System.out.println(10 + 20 + "hello"); // 30hello

        // String s = "abc, def, ghi, jkl, mno";
        // String[] parts = s.split(",");

        // for (String str : parts)
        // System.out.println(str);

        String s = "Hello";
        System.out.println(s.concat("World"));
        System.out.println(s);
        s += 'a';
        System.out.println(s);

        scn.close();
    }
}
