public class Counter {

    static int count = 1;

    public static void main(String[] args) {

        System.out.println("Execution: " + count);

        if (count < 5) {
            count++;
            main(new String[] {});
        }

        System.out.println("Returning from call " + count);
        count--;
    }
}
