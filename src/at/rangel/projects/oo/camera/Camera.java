package at.rangel.projects.oo.camera;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Camera {
    private double weight;
    private Color color;
    private Manufacturer manufacturer;
    private CameraLens cameraLens;
    private SDCard sdCard;
    private List<SDCard> sdCardList;

    public enum TYPE {SMALL, MEDIUM, LARGE}

    private Camera.TYPE resolution;

    public Camera(Manufacturer manufacturer, CameraLens cameraLens, Color color, double weight, SDCard sdCard) {
        this.manufacturer = manufacturer;
        this.cameraLens = cameraLens;
        this.resolution = TYPE.MEDIUM;
        this.color = color;
        this.weight = weight;
        this.sdCard = sdCard;
        this.sdCardList = new ArrayList<>();
    }

    public void takePicture() {
        double size = 0;
        switch (this.resolution) {
            case LARGE:
                size = 6;
                break;
            case MEDIUM:
                size = 4;
                break;
            case SMALL:
                size = 2;
                break;
            default:
                break;
        }
        double freeSpace = this.getSdCard().checkFreeSpace();
        if (size > freeSpace) {
            System.out.println("No more available space!");
            return;
        }
        if (freeSpace < this.getSdCard().getCapacity() / 10) {
            System.out.println("Almost no space left!");
        }
        LocalDateTime currentDate = LocalDateTime.now();
        String dateOfPhoto = currentDate.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss", Locale.GERMAN));
        Photo currentPicture = new Photo(size, dateOfPhoto + "_picture");
        this.sdCard.savePhoto(currentPicture);
        System.out.println("Picture has been saved!");
    }

    public void changeResolution(int selection) {
        switch (selection) {
            case 1:
                this.resolution = TYPE.SMALL;
                break;
            case 2:
                this.resolution = TYPE.MEDIUM;
                break;
            case 3:
                this.resolution = TYPE.LARGE;
                break;
            default:
                System.out.println("Please choose a valid number to change the resolution!");
                break;
        }
    }

    public void addSDCard(SDCard sdCard) {
        this.sdCardList.add(sdCard);
    }

    public void setSdCardList(List<SDCard> sdCardList) {
        this.sdCardList = sdCardList;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public CameraLens getCameraLens() {
        return cameraLens;
    }

    public TYPE getResolution() {
        return resolution;
    }

    public void setCameraLens(CameraLens cameraLens) {
        this.cameraLens = cameraLens;
    }

    public void setResolution(TYPE resolution) {
        this.resolution = resolution;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public List<SDCard> getSdCardList() {
        return sdCardList;
    }
}
