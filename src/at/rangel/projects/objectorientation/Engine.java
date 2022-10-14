package at.rangel.projects.objectorientation;

public class Engine {

    public enum TYPE {GAS, DIESEL}

    private int horsePower;
    private double fuelConsumption;
    private TYPE type;

    public Engine(int horsePower, double fuelConsumption, TYPE type) {
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
