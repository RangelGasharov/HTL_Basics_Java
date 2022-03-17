package at.rangel.projects;

import java.util.Random;

public class WhileLoop_2 {
    public static void main(String[] args) {

        Random random = new Random();
        boolean isFinished = false;
        int value = 0;

        while(!isFinished){

            int randomValue = random.nextInt(10,31);

                if (randomValue == 15 || randomValue == 25) {
                    System.out.println("+" + randomValue);
                    isFinished = true;
                } else {
                    value += randomValue;
                    System.out.println("+" + randomValue);
                    System.out.println("Wert: " + value);

            }

        }
        System.out.println("Finished");
    }
}