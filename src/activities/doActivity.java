package activities;

public interface doActivity extends Runnable {
    default void doActivity(int t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
