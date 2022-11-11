package at.rangel.projects.oo.geometricfigures;

public class Circle {
    private String name;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
