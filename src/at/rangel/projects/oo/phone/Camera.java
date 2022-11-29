package at.rangel.projects.oo.phone;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Camera {
    private double resolution;

    public Camera(double resolution) {
        this.resolution = resolution;
    }

    public void makePicture(double currentResolution) {
        if (currentResolution > this.resolution) {
            currentResolution = this.resolution;
        }
        String dateOfPicture = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        double size = (currentResolution * 16 / 9 * currentResolution) / 1_000_000;
        PhoneFile currentPicture = new PhoneFile("jpg", size, dateOfPicture + "_picture");
    }

    public double getResolution() {
        return resolution;
    }
}
