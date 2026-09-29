public class ThreadSafety {

    public static void main(String[] args) throws InterruptedException {

        // StringBuilder sb = new StringBuilder();
        StringBuffer sb = new StringBuffer();

        /*
         * Here each Task has its own reference variable:
         * 
         * T1 → s → ""
         * T2 → s → ""
         * 
         * When T1 does:
         * 
         * s += "a";
         * 
         * it effectively does:
         * 
         * s = new String(...)
         * 
         * But it only changes T1's s reference.
         * 
         * It doesn't change the original String in main.
         * 
         * So main can still have:
         * 
         * s → ""
         * 
         * and:
         * 
         * s.length()
         * 
         * is:
         * 
         * 0
         */
        // String sb = new String("");

        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final length: " + sb.length());
    }
}

class Task extends Thread {

    private StringBuffer sb;

    public Task(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++)
            sb.append("a");
    }
}