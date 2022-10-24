package at.rangel.projects.oo.remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private List<Battery> batteries;

    public Remote(Battery b1, Battery b2) {
        this.batteries = new ArrayList<>();
    }

    public void addBattery(Battery battery) {
        this.batteries.add(battery);
    }

    public void turnOn() {

        for (Battery battery : batteries) {
            if (battery.getChargingStatus() <= 0) {
                System.out.println(ANSI_RED + "No more energy! Please insert new batteries." + ANSI_RESET);
                return;
            }
            battery.setChargingStatus(battery.getChargingStatus() - 5);
        }
        System.out.println(ANSI_GREEN + "Electrical consumer connected!" + ANSI_RESET);
    }

    public void turnOff() {
        System.out.println("No electrical consumer connected.");
    }

    public double getStatus() {
        int lengthOfBatteryList = batteries.size();
        double totalChargingStatus = 0;
        for (Battery battery : batteries) {
            double chargingStatus = battery.getChargingStatus();
            totalChargingStatus += chargingStatus;
        }
        double averageChargingStatus = totalChargingStatus / lengthOfBatteryList;
        return averageChargingStatus;
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

    public void setBatteries(List<Battery> batteries) {
        this.batteries = batteries;
    }
}
