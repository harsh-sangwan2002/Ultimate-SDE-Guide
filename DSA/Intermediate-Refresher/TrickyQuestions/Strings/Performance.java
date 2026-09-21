public class Performance {

    public static void main(String[] args) {

        String str = "Java";

        long st = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++)
            str.concat("Programming");

        long et = System.currentTimeMillis();
        System.out.println("String time: " + (et - st) + "ms");

        StringBuilder sb = new StringBuilder("Java");

        st = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++)
            sb.append("Programming");

        et = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (et - st) + "ms");

        StringBuffer sbf = new StringBuffer("Java");

        st = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++)
            sbf.append("Programming");

        et = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (et - st) + "ms");
    }
}
