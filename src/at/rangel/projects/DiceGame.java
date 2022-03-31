package at.rangel.projects;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {

        Random random = new Random();
        int pipTotalPerson = 0;
        int pipTotalComputer = 0;

        for (int i = 0; i < 7; i++) {
            int randomValue = random.nextInt(0, 7);
            pipTotalPerson += randomValue;
        }
        System.out.println("Pip Total of Player: " + pipTotalPerson);

        for (int i = 0; i < 7; i++) {
            int randomValue = random.nextInt(0, 7);
            pipTotalComputer += randomValue;
        }
        System.out.println("Pip Total of Computer: " + pipTotalComputer);


        if (pipTotalComputer > pipTotalPerson) {

            int pointsDifference = pipTotalComputer - pipTotalPerson;

            switch (pointsDifference) {
                case 1:
                    String pointAmountText = " point";
                    System.out.println("Player has won by " + pointsDifference + pointAmountText);
                    break;
                default:
                    pointAmountText = " points";
                    System.out.println("Player has won by " + pointsDifference + pointAmountText);
                    break;

            }

        } else if (pipTotalPerson > pipTotalComputer) {

            int pointsDifference = pipTotalPerson - pipTotalComputer;

            switch (pointsDifference) {
                case 1:
                    String pointAmountText = " point";
                    System.out.println("Player has won by " + pointsDifference + pointAmountText);
                    break;
                default:
                    pointAmountText = " points";
                    System.out.println("Player has won by " + pointsDifference + pointAmountText);
                    break;
            }

        } else {
            System.out.println("The Player and the Computer have the exact same pip total. Draw!");
        }
    }
}

