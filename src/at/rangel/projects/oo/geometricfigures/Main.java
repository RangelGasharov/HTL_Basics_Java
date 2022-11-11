package at.rangel.projects.oo.geometricfigures;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square("Square1", 3);
        System.out.println("Square1 area: " + square1.getArea());

        Square square2 = new Square("Square2", 6.5);
        System.out.println("Square2 area: " + square2.getArea());

        Rectangle rectangle1 = new Rectangle("Rectangle1", 12, 5);
        System.out.println("Rectangle1 area: " + rectangle1.getArea());

        Rectangle rectangle2 = new Rectangle("Rectangle2", 9, 6);
        System.out.println("Rectangle2 area: " + rectangle2.getArea());

        Circle circle1 = new Circle("Circle1", 3);
        System.out.println("Circle1 area: " + circle1.getArea());

        Circle circle2 = new Circle("Circle2", 10);
        System.out.println("Circle2 area: " + circle2.getArea());

        Cube cube1 = new Cube("Cube1", 5);
        System.out.println("Cube1 area: " + cube1.getArea());
        System.out.println("Cube1 volume: " + cube1.getVolume());

        Cube cube2 = new Cube("Cube2", 10);
        System.out.println("Cube2 area: " + cube2.getArea());
        System.out.println("Cube2 volume: " + cube2.getVolume());
    }
}
