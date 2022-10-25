package at.rangel.projects.oo.calculators;

public class RootCalculator extends BasicCalculator {
    public double rooting(double num, double numberOfRoot) {
        return Math.pow(num, 1 / numberOfRoot);
    }
}
