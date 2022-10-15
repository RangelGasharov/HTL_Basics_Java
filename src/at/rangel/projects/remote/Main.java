package at.rangel.projects.remote;

public class Main {
    public static void main(String[] args) {
        Battery b1 = new Battery(100);
        Battery b2 = new Battery(100);
        Remote r1 = new Remote(b1, b2);
        r1.addBattery(b1);
        r1.addBattery(b2);

        System.out.println("Current average charging status of the batteries: " + r1.getStatus());
        for (int i = 0; i <= 22; i++) {
            r1.turnOn();
            System.out.println("Current average chargingStatus of the batteries: " + r1.getStatus());
            r1.turnOff();
        }

    }
}
