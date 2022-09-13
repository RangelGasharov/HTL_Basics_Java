package at.rangel.projects;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingWords {
    public static void main(String[] args) {
        boolean wordWasGuessed = false;
        int totalTries = 0;

        String[] wordsToGuess = {"apple", "bench", "chief", "domino"};
        Random random = new Random();
        int randomNumber = random.nextInt(wordsToGuess.length);

        String guessingWord = wordsToGuess[randomNumber];
        System.out.println(guessingWord);

        char[] guessingWordAsArray = guessingWord.toCharArray();
        for (int i = 0; i <= guessingWordAsArray.length - 1; i++) {
            System.out.print(guessingWordAsArray[i] + " ");
        }
        System.out.println(" ");

        char[] censoredGuessedWordAsArray = new char[guessingWordAsArray.length];
        Arrays.fill(censoredGuessedWordAsArray, '*');
        for (int i = 0; i <= censoredGuessedWordAsArray.length - 1; i++) {
            System.out.print(censoredGuessedWordAsArray[i] + " ");
        }

        Scanner scanner = new Scanner(System.in);

        while (!wordWasGuessed) {
            System.out.println("Write down your guessing word.");

            try {
                String wordFromPlayer = scanner.next();
                if (wordFromPlayer == guessingWord) {
                    System.out.println("You guessed the word correctly!");
                }
            } catch (InputMismatchException e) {
                System.out.println("");
                scanner.next();
            }
        }
    }
}
