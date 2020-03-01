package activities;

public class MalgosiaActivity implements doActivity {

    @Override
    public void run() {
        System.out.println("Malgosia is running");
        doActivity(6000);
        System.out.println("Malgosia is taking shower");
        doActivity(2000);
        System.out.println("Malgosia is eating breakfast");
        doActivity(1000);
        System.out.println("Malgosia is dressing up");
        doActivity(1000);
        System.out.println("Malgosia is meeting her friend");
        doActivity(1000);
    }
}
