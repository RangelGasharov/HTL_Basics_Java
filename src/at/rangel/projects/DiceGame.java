package at.rangel.projects;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        final int CANCEL = 3;
        int pipTotalPerson = 0;
        int pipTotalComputer = 0;
        int selection = 0;
        int winsPlayer = 0;
        int winsComputer = 0;

        System.out.println("Welcome to the Dice game! Please enter 1 to start.");
        System.out.println("Choose 2 to look up for the total wins");

        while (selection != CANCEL) {
            System.out.println();
            try {
                selection = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("");
                scanner.next();
            }
            pipTotalPerson = 0;
            pipTotalComputer = 0;

            switch (selection) {

                case 1:
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
                                System.out.println("Computer has won by " + pointsDifference + pointAmountText + ".");
                                winsComputer += 1;
                                break;
                            default:
                                pointAmountText = " points";
                                System.out.println("Computer has won by " + pointsDifference + pointAmountText + ".");
                                winsComputer += 1;
                                break;
                        }

                    } else if (pipTotalPerson > pipTotalComputer) {

                        int pointsDifference = pipTotalPerson - pipTotalComputer;

                        switch (pointsDifference) {
                            case 1:
                                String pointAmountText = " point";
                                System.out.println("Player has won by " + pointsDifference + pointAmountText + ".");
                                winsPlayer += 1;
                                break;
                            default:
                                pointAmountText = " points";
                                System.out.println("Player has won by " + pointsDifference + pointAmountText + ".");
                                winsPlayer += 1;
                                break;
                        }

                    } else {
                        System.out.println("The Player and the Computer have the exact same pip total. Draw!");
                    }
                    break;
                case 2:
                    System.out.println("Total wins of Player: " + winsPlayer);
                    System.out.println("Total wins of Computer: " + winsComputer);
                    break;
                case 3:
                    System.out.println("The game is ending ... Goodbye!");
                    break;
                default:
                    System.out.println("Please choose a correct number to continue!");
                    System.out.println();
                    break;
            }
        }
    }
}

