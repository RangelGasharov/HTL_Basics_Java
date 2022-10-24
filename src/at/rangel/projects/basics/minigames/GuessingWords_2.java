package at.rangel.projects.basics.minigames;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingWords_2 {
    public static void main(String[] args) {
        boolean wordWasGuessed = false;
        int availableTries = 15;

        String[] wordsToGuess = {"apple", "bench", "chief", "domino"};
        Random random = new Random();
        int randomNumber = random.nextInt(wordsToGuess.length);

        String guessingWord = wordsToGuess[randomNumber];
        char[] guessingWordAsArray = guessingWord.toCharArray();

        char[] censoredGuessedWordAsArray = new char[guessingWordAsArray.length];
        Arrays.fill(censoredGuessedWordAsArray, '*');

        Scanner scanner = new Scanner(System.in);

        while (!wordWasGuessed && availableTries > 0) {
            for (int i = 0; i <= censoredGuessedWordAsArray.length - 1; i++) {
                System.out.print(censoredGuessedWordAsArray[i]);
            }
            System.out.println();
            System.out.println("Write down your guessing letter.");

            try {
                char letterFromPlayer = scanner.next().charAt(0);

                for (int i = 0; i <= guessingWordAsArray.length - 1; i++) {
                    if (letterFromPlayer == guessingWordAsArray[i]) {
                        censoredGuessedWordAsArray[i] = guessingWordAsArray[i];
                    }
                }

                availableTries -= 1;
                System.out.println("Available Tries: " + availableTries);

                boolean wordIsCorrect = Arrays.equals(guessingWordAsArray, censoredGuessedWordAsArray);
                if (wordIsCorrect) {
                    System.out.println("You found the correct word. Congrats!");
                    wordWasGuessed = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please write down a letter and NOT a number, word or others!");
            }
        }
    }
}
