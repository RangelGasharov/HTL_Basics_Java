package at.rangel.projects.oo.objectorientation;

public class ObjectOrientation_0 {
    public static void main(String[] args) {

        Engine e1 = new Engine(300, 7, Engine.TYPE.DIESEL);
        Reservoir res1 = new Reservoir(70, 270);
        RearMirror r1_1 = new RearMirror(100, 0);
        RearMirror r1_2 = new RearMirror(90, -40);
        Tire t1_1 = new Tire(300, 1, Tire.TYPE.SUMMER_TIRES);
        Tire t1_2 = new Tire(300, 2, Tire.TYPE.SUMMER_TIRES);
        Tire t1_3 = new Tire(300, 3, Tire.TYPE.SUMMER_TIRES);
        Tire t1_4 = new Tire(300, 4, Tire.TYPE.SUMMER_TIRES);

        Car c1 = new Car(e1, res1, "Audi", "A8237");
        c1.setColor("red");
        c1.addMirror(r1_1);
        c1.addMirror(r1_2);
        c1.addTires(t1_1);
        c1.addTires(t1_2);
        c1.addTires(t1_3);
        c1.addTires(t1_4);

        System.out.println("Position of first mirror: " + c1.getMirrors().get(0).getPosition());
        System.out.println("Diameter of first tire (in mm): " + c1.getTires().get(0).getDiameter());
        System.out.println("_".repeat(45));

        Engine e2 = new Engine(450, 6, Engine.TYPE.GAS);
        Reservoir res2 = new Reservoir(80, 150);

        Car c2 = new Car(e2, res2, "Mercedes", "M2712");
        c2.setColor("blue");

        Engine e3 = new Engine(120, 5, Engine.TYPE.GAS);
        Reservoir res3 = new Reservoir(120, 120);
        Car c3 = new Car(e3, res3, "BMW", "B7310");
        c3.setColor("green");

        Engine e4 = new Engine(500, 5.5, Engine.TYPE.DIESEL);
        Reservoir res4 = new Reservoir(50, 165);
        Car c4 = new Car(e4, res4, "Renault", "R1829");
        c4.setColor("black");

        Engine e5 = new Engine(300, 4, Engine.TYPE.GAS);
        Reservoir res5 = new Reservoir(85, 180);
        Car c5 = new Car(e5, res5, "Kia", "K9182");
        c5.setColor("white");

        c1.technicalSpecifications();
        c2.technicalSpecifications();
        c3.technicalSpecifications();
        c4.technicalSpecifications();
        c5.technicalSpecifications();

        for (int i = 0; i < 20; i++) {
            c1.drive(25);
            c1.getRemainingRange();
            c1.getFuelAmount();
            c1.turboBoost();
            System.out.println("_".repeat(40));
        }

        System.out.println("-".repeat(45));

        for (int i = 0; i < 20; i++) {
            c2.drive(100);
            c2.getRemainingRange();
            c2.getFuelAmount();
            c2.turboBoost();
            System.out.println("_".repeat(40));
        }

        c2.honk(15);
        c2.toBreak();
    }
}