package exercises;

public class ThreadStopper {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!Thread.interrupted())
                    System.out.println("X");
                    i++;
            }
        });
        t.start();
        Thread.sleep(1000);
        t.interrupt();
    }
}
