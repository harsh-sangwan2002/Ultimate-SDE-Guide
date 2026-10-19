public class WeirdForLoop {

    public static void main(String[] args) {

        int x;

        for (int i = 0; (x = i) < 5; i++)
            System.out.println(x); // 0 1 2 3 4
    }
}
