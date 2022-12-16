package at.rangel.projects.oo.camera;

public class Photo {
    private String extension;
    private double size;
    private String name;

    public Photo(double size, String name) {
        this.extension = "jpg";
        this.size = size;
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void getInfo() {
        System.out.println("Photo name: " + this.name + "." + this.extension + ", Size: " + this.size + "GB");
    }

}
