package at.rangel.projects.oo.camera;

public class Manufacturer {
    private String nameOfManufacturer;
    private String countryOfManufacturer;

    public Manufacturer(String nameOfManufacturer, String countryOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
        this.countryOfManufacturer = countryOfManufacturer;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public String getCountryOfManufacturer() {
        return countryOfManufacturer;
    }
}
