package at.rangel.projects.oo.phone;

public class Phone {
    private SimCard simCard;
    private SDCard sdCard;
    private Camera camera;
    private String color;

    public Phone(SimCard simCard, SDCard sdCard, Camera camera) {
        this.simCard = simCard;
        this.sdCard = sdCard;
        this.camera = camera;
    }

    public void takePicture(double currentResolution) {
        this.getCamera().makePicture(currentResolution);
    }

    public void makeCall(String phoneNumber) {
        this.getSimCard().doCall(phoneNumber);
    }

    public double getFreeSpace() {
        return this.getSdCard().getFreeSpace();
    }

    public void getAllFiles() {

    }

    public SimCard getSimCard() {
        return simCard;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public Camera getCamera() {
        return camera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
