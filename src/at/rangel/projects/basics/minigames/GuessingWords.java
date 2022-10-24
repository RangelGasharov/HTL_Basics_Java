package at.rangel.projects.basics.minigames;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingWords {
    public static void main(String[] args) {
        boolean wordWasGuessed = false;
        int availableTries = 5;

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
            System.out.println("Write down your guessing word.");

            try {
                String wordFromPlayer = scanner.next();
                char[] wordFromPlayerAsArray = wordFromPlayer.toCharArray();

                if (guessingWordAsArray.length != wordFromPlayerAsArray.length) {
                    System.out.println("Your guess has to have the same length as the searched word!");
                    scanner.next();
                }

                for (int i = 0; i <= wordFromPlayerAsArray.length - 1; i++) {
                    if (wordFromPlayerAsArray[i] == guessingWordAsArray[i]) {
                        censoredGuessedWordAsArray[i] = guessingWordAsArray[i];
                    }
                }

                availableTries -= 1;
                System.out.println("Available Tries: " + availableTries);

                boolean wordIsCorrect = Arrays.equals(guessingWordAsArray, wordFromPlayerAsArray);
                if (wordIsCorrect) {
                    System.out.println("You guessed the word correctly!");
                    wordWasGuessed = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please write down a word with the same length as the censored text!");
            }
        }
    }
}