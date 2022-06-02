package tests;

import java.util.Random;

public class Test01_example2 {
    public static void main(String[] args){
        Random random = new Random();
        boolean isFinished = false;
        int total = 0;

        while(!isFinished){
            int randomNumber = random.nextInt(0,11 );
            if(randomNumber == 5){
                System.out.println(randomNumber);
                System.out.println("Summe: " + total);
                isFinished = true;
                break;
            } else {
                System.out.println("+ " + randomNumber);
                total+= randomNumber;
            }
        }
    }
}
