public class ThreadSafety {

    public static void main(String[] args) throws Exception {

        // This is used for thread-safety
        StringBuffer sb = new StringBuffer("");

        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final length => " + sb.length());
    }
}

class Task extends Thread {

    StringBuffer sb;

    public Task(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++)
            sb.append("a");
    }
}