package at.rangel.projects.objectorientation;

public class Car {
    private Engine engine;
    private Reservoir reservoir;
    public String brand;
    public String serialNumber;
    private String color;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public Car(Engine engine, Reservoir reservoir, String brand, String serialNumber) {
        this.engine = engine;
        this.reservoir = reservoir;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.reservoir = reservoir;
    }

    public void technicalSpecifications() {
        System.out.println("Technical specifications of " + ANSI_YELLOW + this.brand + " " + this.serialNumber + ANSI_RESET + ":");
        System.out.println("Reservoir (in L): " + this.reservoir.getReservoir());
        System.out.println("Fuel consumption (in L per 100km): " + this.engine.getFuelConsumption());
        System.out.println("Current fuel amount (in L): " + this.reservoir.getFuelAmount());
        System.out.println("Horse Power: " + this.getEngine().getHorsePower());
        System.out.println("Color of the car: " + this.getColor());
        System.out.println("-".repeat(45));
    }

    public void drive() {
        if (this.reservoir.getFuelAmount() >= this.engine.getFuelConsumption()) {
            this.reservoir.setFuelAmount(this.reservoir.getFuelAmount() - this.engine.getFuelConsumption());
            System.out.println(ANSI_GREEN + "I am driving" + ANSI_RESET);
        }
    }

    public void toBreak() {
        System.out.println(ANSI_RED + "I brake!" + ANSI_RESET);
    }

    public void turboBoost() {
        if (this.reservoir.getFuelAmount() > this.reservoir.getReservoir() / 10) {
            System.out.println(ANSI_BLUE + "SuperBoostMode" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Not enough fuel to go to Super-boost" + ANSI_RESET);
        }
    }

    public void honk(int amountOfRepetitions) {
        if (amountOfRepetitions > 10) {
            amountOfRepetitions = 10;
        }
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println(ANSI_YELLOW + "Tutu!" + ANSI_RESET);
        }
    }

    public void getRemainingRange() {
        double remainingRange = (this.reservoir.getFuelAmount() / this.engine.getFuelConsumption()) * 100;
        System.out.println("Remaining distance in km: " + Math.round(remainingRange));
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Reservoir getReservoir() {
        return reservoir;
    }

    public void setReservoir(Reservoir reservoir) {
        this.reservoir = reservoir;
    }
}