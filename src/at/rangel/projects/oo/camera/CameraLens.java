package at.rangel.projects.oo.camera;

public class CameraLens {
    private double focalLength;
    private Manufacturer manufacturer;

    public CameraLens(double focalLength, Manufacturer manufacturer) {
        this.focalLength = focalLength;
        this.manufacturer = manufacturer;
    }
}
