public class Main {

    public static void main(String[] args) {

        System.out.println("Inside main function");

        if (args.length == 0) {
            System.out.println("Calling main again...");
            main(new String[] { "Second call" });
        }

        else {
            System.out.println("Second execution");
        }
    }
}
