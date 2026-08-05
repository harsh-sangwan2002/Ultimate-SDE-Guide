import java.util.Scanner;

public class CircleArea {

    public static double findCircleArea(int radius) {
        return Math.round((double) (Math.PI * radius * radius));
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int radius = scn.nextInt();

        System.out.println(findCircleArea(radius));
        scn.close();
    }
}
