package at.rangel.projects;

public class Car {
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;

    public Car(int fuelConsumption, String brand, String serialNumber, int fuelAmount) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelAmount = fuelAmount;
    }

    public void drive() {
        if (this.fuelAmount >= this.fuelConsumption) {
            this.fuelAmount = this.fuelAmount - fuelConsumption;
            System.out.println("I am driving");
        }
    }

    public void toBreak() {
        System.out.println("I brake!");
    }

    /* public void turboBoost() {
        if (this.fuelAmount > fuelAmount / 10 && this.fuelAmount >= 0) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Super-boost");
        }
    }*/

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tutu");
        }
    }

    public int getRemainingRange() {
        System.out.println("Remaining fuel: " + this.fuelAmount);
        return 0;
    }
}
