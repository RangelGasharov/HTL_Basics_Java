package at.rangel.projects.basics.if_statements;

import java.util.Random;

public class IfStatement_2 {
    public static void main(String[] args) {
        System.out.println("Test");

        Random random = new Random();
        int randomNumber = random.nextInt( 100);
        System.out.println(randomNumber);

        if(randomNumber<20){
            System.out.println("Mini");
        } else if ((randomNumber>=20) && (randomNumber<=50)){
            System.out.println("Medium");
        } else if(randomNumber>50){
            System.out.println("Large");
        }
    }
}