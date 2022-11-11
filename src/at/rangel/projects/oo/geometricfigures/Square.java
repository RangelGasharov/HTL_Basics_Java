package at.rangel.projects.oo.geometricfigures;

public class Square {
    private String name;
    private double sideA;

    public Square(String name, double sideA) {
        this.name = name;
        this.sideA = sideA;
    }

    public double getArea() {
        return sideA * sideA;
    }
}
