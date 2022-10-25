package at.rangel.projects.oo.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private String nameOfLamp;
    private List<GlowElement> glowElements;
    private double totalPowerConsumption = 0;

    public Lamp(String nameOfLamp) {
        this.nameOfLamp = nameOfLamp;
        this.glowElements = new ArrayList<>();
        this.totalPowerConsumption = totalPowerConsumption;
    }

    public String getNameOfLamp() {
        return nameOfLamp;
    }

    public List<GlowElement> getGlowElements() {
        return glowElements;
    }

    public void addLightElement(GlowElement glowElement) {
        this.glowElements.add(glowElement);
    }

    public void turnAllOn() {
        for (int i = 0; i < glowElements.size(); i++) {
            if (this.glowElements.get(i).isOn()) {
                System.out.println("My name is " + this.glowElements.get(i).getNameOfGlowElement() + ". I am already on.");
                continue;
            }
            this.glowElements.get(i).turnOn();
            this.glowElements.get(i).setTotalPowerConsumption(this.glowElements.get(i).getTotalPowerConsumption() + this.glowElements.get(i).getPowerConsumption());
        }
    }

    public void turnAllOff() {
        for (int i = 0; i < glowElements.size(); i++) {
            if (!this.glowElements.get(i).isOn()) {
                System.out.println("My name is " + this.glowElements.get(i).getNameOfGlowElement() + ". I am already off.");
                continue;
            }
            this.glowElements.get(i).turnOff();
        }
    }

    public double getOverallPowerConsumption() {
        double overallPowerConsumption = 0;
        for (int i = 0; i < glowElements.size(); i++) {
            overallPowerConsumption += this.glowElements.get(i).getTotalPowerConsumption();
        }
        return overallPowerConsumption;
    }

    public void printNamesOfLightElements() {
        for (int i = 0; i < glowElements.size(); i++) {
            System.out.println(this.glowElements.get(i).getNameOfGlowElement());
        }
    }
}
