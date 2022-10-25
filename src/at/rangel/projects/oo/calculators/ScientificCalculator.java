package at.rangel.projects.oo.calculators;

public class ScientificCalculator extends BasicCalculator {
    public double sine(double num) {
        double numInRadians = Math.toRadians(num);
        return Math.sin(numInRadians);
    }

    public double cosine(double num) {
        double numInRadians = Math.toRadians(num);
        return Math.cos(numInRadians);
    }
}
