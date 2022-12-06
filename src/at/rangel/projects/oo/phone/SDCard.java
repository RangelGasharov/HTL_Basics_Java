package at.rangel.projects.oo.phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private double capacity;
    private double freeSpace;
    private List<PhoneFile> phoneFiles;

    public SDCard(double capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }

    public void saveFile(PhoneFile phoneFile) {
        this.phoneFiles.add(phoneFile);
    }

    public void getAllFiles() {

        for (int i = 0; i < phoneFiles.size(); i++) {
            phoneFiles.get(i).getInfo();
        }
    }

    public double getFreeSpace() {
        freeSpace = capacity;
        for (int i = 0; i < phoneFiles.size(); i++) {
            freeSpace -= phoneFiles.get(i).getSize();
        }
        return freeSpace;
    }

    public List<PhoneFile> getPhoneFiles() {
        return phoneFiles;
    }

    public void setPhoneFiles(List<PhoneFile> phoneFiles) {
        this.phoneFiles = phoneFiles;
    }

    public double getCapacity() {
        return capacity;
    }
}
