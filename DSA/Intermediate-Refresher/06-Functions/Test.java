public class Test {

    public static void main(String[] args) {

        double area = 3.1416 * 8 * 8;
        System.out.println(area);
        // yields wrong res as round returns long value and then it finally typecasted
        // into double
        // area = (double) (Math.round(area * 100) / 100);

        area = (double) (Math.round(area * 100)) / 100;

        System.out.println(area);
    }
}