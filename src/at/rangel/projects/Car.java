package at.rangel.projects;

public class Car {
    public double fuelConsumption;
    public double fuelAmount;
    public String brand;
    public String serialNumber;
    public double reservoir;
    private String color;
    private int horsePower;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public Car(int fuelConsumption, String brand, String serialNumber, int fuelAmount, int reservoir) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelAmount = fuelAmount;
        this.reservoir = reservoir;
    }

    public void drive() {
        if (this.fuelAmount >= this.fuelConsumption) {
            this.fuelAmount = this.fuelAmount - fuelConsumption;
            System.out.println("I am driving");
        }
    }

    public void toBreak() {
        System.out.println(ANSI_RED + "I brake!" + ANSI_RESET);
    }

    public void turboBoost() {
        if (this.fuelAmount > this.reservoir / 10) {
            System.out.println(ANSI_BLUE + "SuperBoostMode" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Not enough fuel to go to Super-boost" + ANSI_RESET);
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println(ANSI_YELLOW + "Tutu!" + ANSI_RESET);
        }
    }

    public void getRemainingRange() {
        double remainingRange = (this.fuelAmount / this.fuelConsumption) * 100;
        System.out.println("Remaining distance in km: " + Math.round(remainingRange) + " km");
    }
}
