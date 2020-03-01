package exercises;

public class MyRunnable implements Runnable {
    @Override
    public void run() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello im a thread");

    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyRunnable());
        t.start();
        Thread.sleep(5000);
        System.out.println("Hello world");

    }


}
