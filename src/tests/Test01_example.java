package tests;

import java.util.Random;

public class Test01_example {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber1 = random.nextInt(0, 1001);
        int randomNumber2 = random.nextInt(0, 1001);

        System.out.println("First random number: " + randomNumber1);
        System.out.println("Second random number: " + randomNumber2);
        System.out.println(" ");

        if (randomNumber1 > randomNumber2) {
            for (int i = randomNumber1; i >= randomNumber2; i--) {
                System.out.println(i);
            }
        } else if (randomNumber2 > randomNumber1) {
            for (int i = randomNumber2; i >= randomNumber1; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println(randomNumber1);
        }
    }
}