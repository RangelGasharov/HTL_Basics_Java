package at.rangel.projects;

import java.util.Random;

public class SwitchStatement_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt( 5);

        System.out.println("First number: " + randomNumber);
        switch (randomNumber){
            case 0:
                System.out.println("is 0");
                break;
            case 1:
                System.out.println("is 1");
                break;
            case 2:
                System.out.println("is 2");
                break;
            default:
                System.out.println("other value");
                break;
        }
    }
}