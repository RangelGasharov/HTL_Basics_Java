package at.rangel.projects.basics.if_statements;

import java.util.Random;

public class IfStatement_1 {
    public static void main(String[] args) {
        System.out.println("Test");

        Random random = new Random();
        int randomNumber = random.nextInt( 100);

        if((randomNumber>50) && (randomNumber<90)){
            System.out.println(randomNumber);
            System.out.println("The number is bigger than 50 and smaller than 90.");
        } else if (randomNumber<10){
            System.out.println(randomNumber);
            System.out.println("The number is smaller than 10.");
        } else {
            System.out.println(randomNumber);
            System.out.println("The number is between 10 and 50.");
        }
    }
}
