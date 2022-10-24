package at.rangel.projects.oo.cars;

public class Engine {
    public enum TYPE {GAS, DIESEL}

    private double fuelConsumption;
    private double consumptionFactor = 1;
    private double horsePower;

    public Engine(double fuelConsumption, int horsePower) {
        this.fuelConsumption = fuelConsumption;
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getConsumptionFactor() {
        return consumptionFactor;
    }

    public void setConsumptionFactor(double consumptionFactor) {
        this.consumptionFactor = consumptionFactor;
    }
}
