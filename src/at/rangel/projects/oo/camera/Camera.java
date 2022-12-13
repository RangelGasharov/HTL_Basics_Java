package at.rangel.projects.oo.camera;

import at.rangel.projects.oo.objectorientation.Engine;

import java.awt.*;

public class Camera {
    private double weight;
    private Color color;
    private Manufacturer manufacturer;
    private CameraLens cameraLens;

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
        double sizeOfPhoto = 0;
        if (this.resolution.equals(TYPE.SMALL)) {
            sizeOfPhoto = 2;
        } else if (this.resolution.equals(TYPE.MEDIUM)) {
            sizeOfPhoto = 4;
        } else {
            sizeOfPhoto = 6;
        }
    }
}
