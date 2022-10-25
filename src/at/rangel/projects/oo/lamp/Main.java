package at.rangel.projects.oo.lamp;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GlowElement glow1 = new GlowElement("Glow-element_1", Color.RED, 5);
        GlowElement glow2 = new GlowElement("Glow-element_2", Color.GREEN, 5);
        GlowElement glow3 = new GlowElement("Glow-element_3", Color.BLUE, 5);
        Lamp lamp1 = new Lamp("Lamp_1");
        lamp1.addLightElement(glow1);
        lamp1.addLightElement(glow2);
        lamp1.addLightElement(glow3);
        lamp1.turnAllOn();
        lamp1.turnAllOn();
        lamp1.turnAllOn();
        lamp1.turnAllOff();
        lamp1.turnAllOff();
        lamp1.turnAllOn();
        System.out.println("Total power consumption: " + lamp1.getOverallPowerConsumption());
        lamp1.printNamesOfLightElements();
    }
}
