package at.rangel.projects.oo.lamp;

import java.awt.*;

public class GlowElement {
    private String nameOfGlowElement;
    private Color colorOfGlowElement;
    private double powerConsumption;
    private double totalPowerConsumption;
    private boolean isOn = false;

    public GlowElement(String nameOfGlowElement, Color colorOfGlowElement, double powerConsumption) {
        this.nameOfGlowElement = nameOfGlowElement;
        this.colorOfGlowElement = colorOfGlowElement;
        this.powerConsumption = powerConsumption;
        this.totalPowerConsumption = totalPowerConsumption;
        this.isOn = false;
    }

    public String getNameOfGlowElement() {
        return nameOfGlowElement;
    }

    public Color getColorOfGlowElement() {
        return colorOfGlowElement;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getTotalPowerConsumption() {
        return totalPowerConsumption;
    }

    public void setTotalPowerConsumption(double totalPowerConsumption) {
        this.totalPowerConsumption = totalPowerConsumption;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}
