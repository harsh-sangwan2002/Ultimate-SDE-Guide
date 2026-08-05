import java.util.Scanner;

public class RectangleArea {

    public static int findRectArea(int l, int b) {
        return l * b;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt(), b = scn.nextInt();

        System.out.println(findRectArea(l, b));
        scn.close();
    }
}
