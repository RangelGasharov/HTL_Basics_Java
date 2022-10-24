package at.rangel.projects.oo.remote;

public class Battery {

    private double chargingStatus;

    public Battery(double chargingStatus) {
        this.chargingStatus = chargingStatus;
        if (this.chargingStatus > 100) {
            this.chargingStatus = 100;
        } else if (this.chargingStatus < 0) {
            this.chargingStatus = 0;
        }
    }

    public double getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(double chargingStatus) {
        this.chargingStatus = chargingStatus;
    }
}
