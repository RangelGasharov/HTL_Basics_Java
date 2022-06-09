package at.rangel.projects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Calendar {
    public static void main(String[] args) {
        String[] nameOfTheDays = {"MO", "DI", "MI", "DO", "FR", "SA", "SO"};
        int[] amountOfDays = new int[31];
        int[][] calendar = new int[6][7];

        for (int i = 0; i < nameOfTheDays.length; i++) {
            String seperator = " | ";
            String endingSeperator = "";

            if (i == nameOfTheDays.length - 1) {
                endingSeperator = "|";
            }
            if (i == 0) {
                seperator = "| ";
            }
            System.out.print(seperator + nameOfTheDays[i] + endingSeperator);
        }
        System.out.println();

        for (int i = 0; i < calendar.length; i++) {
            for (int j = 0; j < calendar[i].length; j++) {
                String seperator = "  | ";
                String endingSeperator = "";

                calendar[i][j] = i + j;

                if (j == calendar.length) {
                    calendar[i][j] = i + j;
                    endingSeperator = " |";
                    if (calendar[i][j] >= 10) {
                        endingSeperator = "|";
                    }
                }

                if (calendar[i][j] > 10) {
                    seperator = " | ";
                }
                if (j == 0) {
                    seperator = "| ";
                }

                System.out.print(seperator + calendar[i][j] + endingSeperator);
            }
            System.out.println();
        }
        System.out.println();

        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formattingObject = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formattingObject);
        System.out.println("Formated Date: " + formattedDate);
    }
}
