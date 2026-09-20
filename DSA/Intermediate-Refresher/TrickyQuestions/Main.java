public class Main {

    static int n = 5;

    public static void main(String[] args) {

        if (n <= 0)
            return;

        System.out.println(n);
        n--;
        main(new String[] { "Hello" });
    }
}
