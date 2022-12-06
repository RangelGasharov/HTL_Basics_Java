package at.rangel.projects.oo.phone;

public class PhoneFile {
    private String extension;
    private double size;
    private String name;

    public PhoneFile(String extension, double size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void getInfo() {
        System.out.println("File name: " + this.name + "." + this.extension + ", Size: " + this.size + "MB");
    }
}
