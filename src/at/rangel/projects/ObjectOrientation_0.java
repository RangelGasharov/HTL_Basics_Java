package at.rangel.projects;

public class ObjectOrientation_0 {
    public static void main(String[] args) {

        Car c1 = new Car(7, "Audi", "A8237", 70, 270);
        c1.setHorsePower(300);
        c1.setColor("red");
        Car c2 = new Car(6, "Mercedes", "M2712", 80, 150);
        c2.setHorsePower(500);
        c2.setColor("blue");
        Car c3 = new Car(5, "BMW", "B7310", 120, 120);
        c3.setHorsePower(620);
        c3.setColor("green");
        Car c4 = new Car(5.5, "Renault", "R1829", 50, 165);
        c4.setHorsePower(300);
        c4.setColor("black");
        Car c5 = new Car(4.2, "Kia", "K9182", 85, 180);
        c5.setHorsePower(250);
        c5.setColor("white");

        c1.technicalSpecifications();
        c2.technicalSpecifications();
        c3.technicalSpecifications();
        c4.technicalSpecifications();
        c5.technicalSpecifications();

        for (int i = 0; i < 20; i++) {
            c1.drive();
            c1.getRemainingRange();
            c1.turboBoost();
        }

        System.out.println("-".repeat(45));

        for (int i = 0; i < 20; i++) {
            c2.drive();
            c2.getRemainingRange();
            c2.turboBoost();
        }

        c2.honk(15);
        c2.toBreak();
    }
}