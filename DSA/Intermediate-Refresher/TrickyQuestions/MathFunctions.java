public class MathFunctions {

    public static double floor(double num) {

        int res = (int) num;

        if (res == num || res >= 0)
            return (double) res;

        return (double) (res - 1);
    }

    public static double ceil(double num) {

        int res = (int) num;

        if (res == num || res < 0)
            return (double) res;

        return (double) (res + 1);
    }

    public static double round(double num) {

        return floor(num + 0.5);
    }

    public static void main(String[] args) {

        double[] testCases = {
                2.3, 2.5, 2.7,
                3.0, 3.5, 3.8,
                0.1, 0.9,
                -2.3, -2.5, -2.7,
                -3.5, -3.8,
                0.0, -0.0
        };

        for (double num : testCases) {
            System.out.println("Number: " + num);

            System.out.println("Custom ceil:  " + ceil(num)
                    + " | Math.ceil:  " + Math.ceil(num));

            System.out.println("Custom floor: " + floor(num)
                    + " | Math.floor: " + Math.floor(num));

            System.out.println("Custom round: " + round(num)
                    + " | Math.round: " + Math.round(num));

            System.out.println("--------------------------------");
        }
    }

}