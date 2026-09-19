import java.util.Scanner;

public class CircleArea {

    public static double findArea(double r) {

        return Math.PI * r * r;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        double r = scn.nextDouble();

        System.out.println((int) findArea(r));
        scn.close();
    }
}
