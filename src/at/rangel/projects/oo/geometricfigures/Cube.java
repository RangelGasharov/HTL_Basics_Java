package at.rangel.projects.oo.geometricfigures;

public class Cube {
    private String name;
    private double sideA;

    public Cube(String name, double sideA) {
        this.name = name;
        this.sideA = sideA;
    }

    public double getArea() {
        return sideA * sideA * 6;
    }

    public double getVolume() {
        return sideA * sideA * sideA;
    }
}
