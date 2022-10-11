package at.rangel.projects.objectorientation;

public class ObjectOrientation_0 {
    public static void main(String[] args) {

        Engine e1 = new Engine(300, 7, Engine.TYPE.DIESEL);
        Reservoir r1 = new Reservoir(70, 270);
        Car c1 = new Car(e1, r1, "Audi", "A8237");
        c1.setColor("red");

        Engine e2 = new Engine(450, 6, Engine.TYPE.GAS);
        Reservoir r2 = new Reservoir(80, 150);
        Car c2 = new Car(e2, r2, "Mercedes", "M2712");
        c2.setColor("blue");

        Engine e3 = new Engine(120, 5, Engine.TYPE.GAS);
        Reservoir r3 = new Reservoir(120, 120);
        Car c3 = new Car(e3, r3, "BMW", "B7310");
        c3.setColor("green");

        Engine e4 = new Engine(500, 5.5, Engine.TYPE.DIESEL);
        Reservoir r4 = new Reservoir(50, 165);
        Car c4 = new Car(e4, r4, "Renault", "R1829");
        c4.setColor("black");

        Engine e5 = new Engine(300, 4, Engine.TYPE.GAS);
        Reservoir r5 = new Reservoir(85, 180);
        Car c5 = new Car(e5, r5, "Kia", "K9182");
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