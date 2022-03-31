package at.rangel.projects;

import java.util.Scanner;

public class Casaer_Encryption {

    int selectionOfTranslationType = 0;
    Scanner scanner = new Scanner(System.in);
    String textToEncrypt = scanner.nextLine();
    int shiftOfCharacters = 2;
    char [] textArray = textToEncrypt.toCharArray();
    char [] newTextArray = encrypt(shiftOfCharacters,textToEncrypt);

    public static char[] encrypt(int offset, String charArray) {

    }
}


