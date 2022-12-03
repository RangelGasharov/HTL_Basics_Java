package at.rangel.projects.oo.phone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Camera {
    private double resolution;

    public Camera(double resolution) {
        this.resolution = resolution;
    }

    public PhoneFile makePicture(double currentResolution) {
        if (currentResolution > this.resolution) {
            currentResolution = this.resolution;
        }
        LocalDateTime currentDate = LocalDateTime.now();
        String dateOfPicture = currentDate.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss", Locale.GERMAN));
        double size = (currentResolution * 16 / 9 * currentResolution) / 1_000_000;
        PhoneFile currentPicture = new PhoneFile("jpg", size, dateOfPicture + "_picture");
        return currentPicture;
    }

    public double getResolution() {
        return resolution;
    }
}
