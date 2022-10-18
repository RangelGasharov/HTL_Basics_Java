package at.rangel.projects.cars;

public class Manufacturer {
    private String nameOfManufacturer;
    private String countryOfManufacturer;
    private double discountOfManufacturer;

    public Manufacturer(String nameOfManufacturer, String countryOfManufacturer, double discountOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
        this.countryOfManufacturer = countryOfManufacturer;
        this.discountOfManufacturer = discountOfManufacturer;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public String getCountryOfManufacturer() {
        return countryOfManufacturer;
    }

    public double getDiscountOfManufacturer() {
        return discountOfManufacturer;
    }
}
