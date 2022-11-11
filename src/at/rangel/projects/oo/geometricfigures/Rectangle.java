package at.rangel.projects.oo.geometricfigures;

public class Rectangle {
    private String name;
    private double sideA;
    private double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        return sideA * sideB;
    }
}
