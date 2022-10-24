package at.rangel.projects.oo.cars;

public class Car {
    private String carModel;
    private String color;
    private double maximumSpeed;
    private double basePrice;
    private Engine engine;
    private Manufacturer manufacturer;
    private double coveredTotalDistance;
    private double theoreticalTotalFuelConsumption;

    public Car(Engine engine, Manufacturer manufacturer, double basePrice, double maximumSpeed, String carModel, String color) {
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.basePrice = basePrice;
        this.maximumSpeed = maximumSpeed;
        this.carModel = carModel;
        this.color = color;
    }

    public void generalCarInformation() {
        System.out.println("General information about " + this.carModel + ":");
        System.out.println("Fuel consumption (in L per 100km): " + this.engine.getFuelConsumption());
        System.out.println("Horse Power: " + this.engine.getHorsePower());
        System.out.println("Maximum speed: " + maximumSpeed);
        System.out.println("Company of manufacturer: " + this.manufacturer.getNameOfManufacturer());
        System.out.println("Country of manufacturer: " + this.manufacturer.getCountryOfManufacturer());
        System.out.println("Color of the car: " + this.getColor());
        System.out.println("Discounted price of the car: " + getDiscountedPrice());
        System.out.println("-".repeat(45));
    }

    public void drive(double speedInKph, double timeInHours) {
        double theoreticalFuelConsumptionOfRide = 0;
        int changingLimitFuelConsumption = 50_000;
        if (speedInKph > this.getMaximumSpeed()) {
            speedInKph = this.getMaximumSpeed();
        }
        double coveredDistanceThisDrive = speedInKph * timeInHours;
        if ((this.coveredTotalDistance - changingLimitFuelConsumption <= 0) && (this.coveredTotalDistance + coveredDistanceThisDrive >= changingLimitFuelConsumption)) {
            double normalFuelConsumptionOfRide = ((changingLimitFuelConsumption - this.coveredTotalDistance) * this.engine.getFuelConsumption() / 100) * this.engine.getConsumptionFactor();
            this.theoreticalTotalFuelConsumption += normalFuelConsumptionOfRide;
            this.engine.setConsumptionFactor(1.098);
            double newFuelConsumptionOfRide = ((coveredDistanceThisDrive - (changingLimitFuelConsumption - this.coveredTotalDistance)) * this.engine.getFuelConsumption() / 100) * this.engine.getConsumptionFactor();
            theoreticalFuelConsumptionOfRide = normalFuelConsumptionOfRide + newFuelConsumptionOfRide;
            this.theoreticalTotalFuelConsumption += theoreticalFuelConsumptionOfRide;
        } else if ((this.coveredTotalDistance >= changingLimitFuelConsumption) && (this.coveredTotalDistance - coveredDistanceThisDrive >= changingLimitFuelConsumption)) {
            this.engine.setConsumptionFactor(1.098);
            theoreticalFuelConsumptionOfRide = ((coveredDistanceThisDrive * this.engine.getFuelConsumption()) / 100) * this.engine.getConsumptionFactor();
            this.theoreticalTotalFuelConsumption += theoreticalFuelConsumptionOfRide;
        } else {
            theoreticalFuelConsumptionOfRide = ((coveredDistanceThisDrive * this.engine.getFuelConsumption()) / 100) * this.engine.getConsumptionFactor();
            this.theoreticalTotalFuelConsumption += theoreticalFuelConsumptionOfRide;
        }

        this.coveredTotalDistance += coveredDistanceThisDrive;
        System.out.println("Driving");
        System.out.println("Covered total distance: " + this.coveredTotalDistance);
        System.out.println("Covered distance this ride: " + coveredDistanceThisDrive);
        System.out.println("Theoretical fuel consumption of this ride: " + theoreticalFuelConsumptionOfRide);
        System.out.println("Theoretical total fuel consumption: " + this.theoreticalTotalFuelConsumption);
        System.out.println("Consumption factor: " + this.engine.getConsumptionFactor());
    }

    public double getDiscountedPrice() {
        double discountedPrice = this.basePrice * (100 - this.manufacturer.getDiscountOfManufacturer()) / 100;
        return discountedPrice;
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
