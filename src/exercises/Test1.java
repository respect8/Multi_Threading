package exercises;

public class Test1 extends Thread {
    @Override
    public void run() {
        System.out.println("hello im a thread");
    }

    public static void main(String[] args) {
        Thread t = new Test1();
        t.start();
        System.out.println("hello world");

    }
}
