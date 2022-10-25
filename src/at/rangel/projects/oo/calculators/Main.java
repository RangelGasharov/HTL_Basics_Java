package at.rangel.projects.oo.calculators;

public class Main {
    public static void main(String[] args) {
        BasicCalculator basic1 = new BasicCalculator();
        RootCalculator root1 = new RootCalculator();
        ScientificCalculator scientific1 = new ScientificCalculator();

        System.out.println(basic1.addition(1, 2));
        System.out.println(basic1.subtraction(3, 2));
        System.out.println(basic1.multiplication(4, 10));
        System.out.println(basic1.division(1, 2));
        System.out.println(basic1.potentiate(2, 10));
        System.out.println("-".repeat(40));

        System.out.println(root1.division(3, 0.5));
        System.out.println(root1.potentiate(2, 5));
        System.out.println(root1.rooting(81, 2));
        System.out.println(root1.rooting(64, 3));
        System.out.println(root1.rooting(1024, 10));
        System.out.println(root1.rooting(0, 2));
        System.out.println(root1.rooting(2, -1));
        System.out.println(root1.rooting(2, 0));
        System.out.println("-".repeat(40));

        System.out.println(scientific1.addition(100, 27));
        System.out.println(scientific1.subtraction(329, 42));
        System.out.println(scientific1.sine(0));
        System.out.println(scientific1.sine(45));
        System.out.println(scientific1.sine(90));
        System.out.println(scientific1.sine(180));
        System.out.println(scientific1.sine(270));
        System.out.println("-".repeat(40));

        System.out.println(scientific1.cosine(0));
        System.out.println(scientific1.cosine(45));
        System.out.println(scientific1.cosine(90));
        System.out.println(scientific1.cosine(180));
        System.out.println(scientific1.cosine(270));
    }
}
