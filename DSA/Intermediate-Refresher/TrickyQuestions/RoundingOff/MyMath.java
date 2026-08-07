public class MyMath {

    public static int myFloor(double x) {

        int temp = (int) x; // 5

        if (temp >= 0 || temp == x)
            return temp; // return 5

        return temp - 1;
    }

    public static int myCeil(double x) {

        int temp = (int) x;

        if (temp <= 0 || temp == x)
            return temp;

        return temp + 1;
    }

    public static int myRound(double x) {

        int temp = (int) x;
        double diff = x - temp;

        if (x >= 0)
            return diff >= 0.5 ? temp + 1 : temp;

        else
            return diff > 0.5 ? temp - 1 : temp;
    }

    public static void main(String[] args) {

        System.out.println(myFloor(5.8)); // 5
        System.out.println(myFloor(-5.8)); // -6
        System.out.println(myFloor(-5.0)); // -5

        System.out.println("========================");

        System.out.println(myCeil(5.2)); // 6
        System.out.println(myCeil(-5.2)); // -5
        System.out.println(myCeil(7.0)); // 7

        System.out.println("=========================");

        System.out.println(myRound(5.2)); // 5
        System.out.println(myRound(-5.2)); // -5
        System.out.println(myRound(5.5)); // 6
        System.out.println(myRound(-5.5)); // -5
        System.out.println(myRound(-0.5)); // 0
        System.out.println(myRound(0.5)); // 1
    }
}