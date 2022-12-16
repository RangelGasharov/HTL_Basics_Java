package at.rangel.projects.oo.camera;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class Camera {
    private double weight;
    private Color color;
    private Manufacturer manufacturer;
    private CameraLens cameraLens;
    private List<SDCard> sdCardList;

    public enum TYPE {SMALL, MEDIUM, LARGE}

    private Camera.TYPE resolution;

    public Camera(Manufacturer manufacturer, CameraLens cameraLens, Camera.TYPE resolution, Color color, double weight) {
        this.manufacturer = manufacturer;
        this.cameraLens = cameraLens;
        this.resolution = resolution;
        this.color = color;
        this.weight = weight;
    }

    public void takePicture() {
       /* LocalDateTime currentDate = LocalDateTime.now();
        String dateOfPhoto = currentDate.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss", Locale.GERMAN));
        Photo currentPicture = new Photo(size, dateOfPhoto + "_picture");*/
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
}
