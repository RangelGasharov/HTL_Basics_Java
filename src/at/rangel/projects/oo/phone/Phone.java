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

    public SimCard getSimCard() {
        return simCard;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public Camera getCamera() {
        return camera;
    }
}
