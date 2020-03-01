package activities;

public class JasActivity implements doActivity {

    @Override
    public void run() {
        System.out.println("Jas is preparing and eating breakfast");
        doActivity(5000);
        System.out.println("Jas is taking a shower");
        doActivity(3000);
        System.out.println("Jas is dressing up");
        doActivity(1000);
        System.out.println("Jas went for a shopping");
        doActivity(6000);
        System.out.println("Jas is playing xbox");
        doActivity(10000);

    }


}
