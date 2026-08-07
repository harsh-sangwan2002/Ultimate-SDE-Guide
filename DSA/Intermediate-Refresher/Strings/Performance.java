public class Performance {

    public static void main(String[] args) {

        // String series = "";

        // for (int i = 0; i < 26; i++) {
        // char ch = (char) ('a' + i);
        // series += ch;
        // System.out.println(ch);
        // }

        // System.out.println(series);
        long startTime = 0L, endTime = 0L, timeTaken = 0L;

        startTime = System.currentTimeMillis();
        String s1 = new String();

        for (int i = 0; i < 1000000; i++)
            s1 += "Hello";

        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        System.out.println("String time: => " + timeTaken + "ms");

        startTime = System.currentTimeMillis();
        StringBuffer s2 = new StringBuffer();

        for (int i = 0; i < 1000000; i++)
            s2 = s2.append("Hello");

        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        System.out.println("String time: => " + timeTaken + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder s3 = new StringBuilder();

        for (int i = 0; i < 1000000; i++)
            s3 = s3.append("Hello");

        endTime = System.currentTimeMillis();
        timeTaken = endTime - startTime;
        System.out.println("String time: => " + timeTaken + "ms");
    }
}
