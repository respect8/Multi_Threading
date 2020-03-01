package exercises;

public class StopTest {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    System.out.println("dadadad");
                    i++;
                }
            }
        });
        t.start();
        t.sleep(1000);
        t.stop();
    }
}
