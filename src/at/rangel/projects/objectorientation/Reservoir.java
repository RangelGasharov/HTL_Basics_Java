package at.rangel.projects.objectorientation;

public class Reservoir {
    public double fuelAmount;
    public double reservoir;

    public Reservoir(double fuelAmount, double reservoir) {
        this.fuelAmount = fuelAmount;
        this.reservoir = reservoir;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getReservoir() {
        return reservoir;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
}
