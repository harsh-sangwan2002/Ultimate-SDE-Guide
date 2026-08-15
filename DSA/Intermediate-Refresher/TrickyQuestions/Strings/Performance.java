public class Performance {

    public static void main(String[] args) {

        int n = 100000;
        // Bad Performance
        String s1 = "";
        StringBuilder s2 = new StringBuilder();

        long start = System.currentTimeMillis();

        // O(N^2)
        for (int i = 0; i < n; i++)
            s2.append(i);

        long end = System.currentTimeMillis();
        long duration = end - start;

        System.out.println(duration);
    }
}
