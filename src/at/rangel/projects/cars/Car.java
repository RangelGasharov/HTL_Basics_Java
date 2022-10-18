package at.rangel.projects.cars;

public class Car {
    private String color;
    private double maximumSpeed;
    private double basePrice;
    private Engine engine;
    private Manufacturer manufacturer;

    public Car(Engine engine, Manufacturer manufacturer, double basePrice, double maximumSpeed, String color) {
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.basePrice = basePrice;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Engine getEngine() {
        return engine;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}
