package at.rangel.projects.objectorientation;

public class Tire {
    public enum TYPE {SUMMER_TIRES, WINTER_TIRES}

    private int diameter;
    private int position;
    private TYPE type;

    public Tire(int diameter, int position, TYPE type) {
        this.diameter = diameter;
        this.position = position;
        this.type = type;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getPosition() {
        return position;
    }

    public TYPE getType() {
        return type;
    }
}
