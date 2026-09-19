import java.util.Scanner;

public class RectangleArea {

    public static double findArea(double l, double b) {

        return l * b;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        double l = scn.nextDouble(), b = scn.nextDouble();

        System.out.println(findArea(l, b));
        scn.close();
    }
}
