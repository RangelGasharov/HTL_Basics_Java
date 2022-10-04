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
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public Car(double fuelConsumption, String brand, String serialNumber, double fuelAmount, double reservoir) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelAmount = fuelAmount;
        this.reservoir = reservoir;
    }

    public void technicalSpecifications() {
        System.out.println("Technical specifications of " + ANSI_YELLOW + this.brand + " " + this.serialNumber + ANSI_RESET + ":");
        System.out.println("Reservoir (in L): " + this.reservoir);
        System.out.println("Fuel consumption (in L per 100km): " + this.fuelConsumption);
        System.out.println("Current fuel amount (in L): " + this.fuelAmount);
        System.out.println("Horse Power: " + this.getHorsePower());
        System.out.println("Color of the car: " + this.getColor());
        System.out.println("-".repeat(45));
    }

    public void drive() {
        if (this.fuelAmount >= this.fuelConsumption) {
            this.fuelAmount -= fuelConsumption;
            System.out.println(ANSI_GREEN + "I am driving" + ANSI_RESET);
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
        if (amountOfRepetitions > 10) {
            amountOfRepetitions = 10;
        }
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println(ANSI_YELLOW + "Tutu!" + ANSI_RESET);
        }
    }

    public void getRemainingRange() {
        double remainingRange = (this.fuelAmount / this.fuelConsumption) * 100;
        System.out.println("Remaining distance in km: " + Math.round(remainingRange));
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
}