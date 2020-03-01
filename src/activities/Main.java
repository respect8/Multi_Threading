package activities;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread jasThread = new Thread(new JasActivity());
        Thread malgosiaThread = new Thread(new MalgosiaActivity());

        jasThread.start();
        malgosiaThread.start();

        jasThread.join();
        malgosiaThread.join();

        System.out.println("DAY ENDS");

    }
}
