package at.rangel.projects.oo.cars;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(7, 400);
        Engine e2 = new Engine(5, 300);

        Manufacturer BMW = new Manufacturer("BMW AG", "Germany", 5);
        Manufacturer Toyota = new Manufacturer("Toyota Motor Corporation", "Japan", 7.5);

        Car c1 = new Car(e1, BMW, 100000, 250, "BMW i8", "blue");
        Car c2 = new Car(e2, Toyota, 72000, 235, "Toyota Supra mk5", "white");

        c1.drive(240, 200);
        c1.drive(40, 100);

        System.out.println("-".repeat(40));
        c2.drive(120, 30);
        c2.drive(75, 2);

        System.out.println("-".repeat(40));

        c1.generalCarInformation();
        c2.generalCarInformation();
    }
}
