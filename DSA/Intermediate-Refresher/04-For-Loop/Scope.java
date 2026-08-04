public class Scope {

    public static void main(String[] args) {

        // Case:1
        // int x = 10, y = 20;
        // {
        // System.out.println(x + " " + y); // 10 20
        // }

        // Case:2
        // int x = 10;
        // {
        // int y = 20;
        // System.out.println(x + " " + y);
        // }
        // {
        // System.out.println(x + " " + y);
        // }

        // Case:3
        int x = 10, y = 15;
        {
            y = 20;
            System.out.println(x + " " + y); // 10 20
        }
        {
            System.out.println(x + " " + y); // 10 20
        }
    }
}
