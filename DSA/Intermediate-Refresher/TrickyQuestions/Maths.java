public class Maths {

    public static int myCeil(double x) {

        int res = (int) x;

        if (x <= 0 || res == x)
            return res;

        return res + 1;
    }

    public static int myFloor(double x) {

        int res = (int) x;

        if (x > 0 || res == x)
            return res;

        return res - 1;
    }

    public static int myRound(double x) {

        if (x >= 0)
            return (int) (x + 0.5);

        return (int) (x - 0.5);
    }

    public static void main(String[] args) {

        // System.out.println(Math.ceil(2.4)); // 3
        // System.out.println(Math.ceil(2.5)); // 3
        // System.out.println(Math.ceil(2.6)); // 3
        // System.out.println(Math.ceil(-0.5)); // -0
        // System.out.println(Math.ceil(0.5)); // 1
        // System.out.println(Math.ceil(-10.5)); // -10
        // System.out.println(Math.ceil(5.0)); // 5

        // System.out.println("========================");

        // System.out.println(myCeil(2.4)); // 3
        // System.out.println(myCeil(2.5)); // 3
        // System.out.println(myCeil(2.6)); // 3
        // System.out.println(myCeil(-0.5)); // -0
        // System.out.println(myCeil(0.5)); // -0
        // System.out.println(myCeil(-10.5)); // 1
        // System.out.println(myCeil(5.0)); // 5

        // System.out.println(Math.floor(2.4)); // 2
        // System.out.println(Math.floor(2.5)); // 2
        // System.out.println(Math.floor(2.6)); // 2
        // System.out.println(Math.floor(-0.5)); // -1
        // System.out.println(Math.floor(0.5)); // 0
        // System.out.println(Math.floor(-10.5)); // -11
        // System.out.println(Math.floor(-5.0)); // -5

        // System.out.println("========================");

        // System.out.println(myFloor(2.4)); // 2
        // System.out.println(myFloor(2.5)); // 2
        // System.out.println(myFloor(2.6)); // 2
        // System.out.println(myFloor(-0.5)); // -1
        // System.out.println(myFloor(0.5)); // 0
        // System.out.println(myFloor(-10.5)); // -11
        // System.out.println(myFloor(-5.0)); // -5

        System.out.println(Math.round(2.4)); // 2
        System.out.println(Math.round(2.5)); // 3
        System.out.println(Math.round(2.6)); // 3
        System.out.println(Math.round(-0.5)); // 0
        System.out.println(Math.round(0.5)); // 1
        System.out.println(Math.round(-10.5)); // -10
        System.out.println(Math.round(-5.7)); // -6

        System.out.println("========================");

        System.out.println(myRound(2.4)); // 2
        System.out.println(myRound(2.5)); // 3
        System.out.println(myRound(2.6)); // 3
        System.out.println(myRound(-0.5)); // 0
        System.out.println(myRound(0.5)); // 1
        System.out.println(myRound(-10.5)); // -10
        System.out.println(myRound(-5.7)); // -6
    }
}
