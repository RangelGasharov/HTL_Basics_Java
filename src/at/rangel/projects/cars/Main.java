package at.rangel.projects.cars;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(7);
        Manufacturer BMW = new Manufacturer("BMW AG", "Germany", 5);
        Manufacturer Toyota = new Manufacturer("Toyota Motor Corporation", "Japan", 7.5);
        Car c1 = new Car(e1, BMW, 100000, 250, "blue");
        System.out.println(c1.getManufacturer().getNameOfManufacturer());
    }
}
