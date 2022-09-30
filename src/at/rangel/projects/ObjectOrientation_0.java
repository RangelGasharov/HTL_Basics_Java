package at.rangel.projects;

public class ObjectOrientation_0 {
    public static void main(String[] args) {

        Car c1 = new Car(7, "Audi", "A8237", 70, 270);

        Car c2 = new Car(6, "Mercedes", "M2712", 80, 150);

        Car c3 = new Car(5, "BMW", "B7310", 120, 120);

        for (int i = 0; i < 20; i++) {
            c2.drive();
            c2.getRemainingRange();
            c2.turboBoost();
            System.out.println();
        }

        c2.honk(3);
        c2.toBreak();

        System.out.println("\nSerial numbers:");
        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);
        System.out.println(c3.serialNumber);
    }
}
