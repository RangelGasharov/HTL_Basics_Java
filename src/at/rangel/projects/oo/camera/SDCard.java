package at.rangel.projects.oo.camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private double capacity;
    private List<Photo> photos;

    public SDCard(double capacity) {
        this.capacity = capacity;
        this.photos = new ArrayList<>();
    }

    public double checkFreeSpace() {
        double freeSpace = this.capacity;
        for (Photo photo : photos) {
            freeSpace -= photo.getSize();
        }
        return freeSpace;
    }

    public void savePhoto(Photo photo) {
        this.photos.add(photo);
    }

    public void getAllPhotos() {
        for (Photo photo : photos) {
            photo.getInfo();
        }
    }
}