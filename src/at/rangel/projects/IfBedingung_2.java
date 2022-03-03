package at.rangel.projects;

import java.util.Random;

public class IfBedingung_2 {
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