package at.rangel.projects;

import java.time.*;
import java.util.Scanner;

public class Calendar_2 {

    public static void main(String[] ars) {

        String[] nameOfTheDays = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};
        int[] calendar = new int[40];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write down the number of the current month (1 = January, 2 = February, 3 = March, etc.");
        int currentMonth = scanner.nextInt();

        System.out.println("Please write down the first weekday of the current month (1 = Monday, 2 = Tuesday, 3 = Wednesday, etc. ");
        int firstWeekDayOfMonth = scanner.nextInt() - 1;

        System.out.println("Please write down the current year");
        int currentYear = scanner.nextInt();
        boolean isLeapYear = currentYear % 4 == 0;

        Month month = Month.of(currentMonth);
        int daysInMonth = month.length(isLeapYear);

        for (int i = 0; i < nameOfTheDays.length; i++) {
            String separator = " | ";
            String endingSeparator = "";

            if (i == nameOfTheDays.length - 1) {
                endingSeparator = " |\n";
            }
            if (i == 0) {
                separator = "| ";
            }
            System.out.print(separator + nameOfTheDays[i] + endingSeparator);
        }

        for (int i = 0; i < calendar.length; i++) {
            int j = i - firstWeekDayOfMonth + 1;
            String separator = "   | ";
            String endingSeparator = "";
            if (j > 10) {
                separator = "  | ";
            }

            calendar[i] = j;

            if (j % 7 == 7 - firstWeekDayOfMonth || (j % 7 == 0 && firstWeekDayOfMonth == 0)) {
                endingSeparator = "   |\n";
                if (j >= 10) {
                    endingSeparator = "  |\n";
                }
            }

            if (i % 7 == 0) {
                separator = "| ";
            }


            if (i == calendar.length - 1) {
                endingSeparator = "  |\n";
            }

            if (j <= daysInMonth && j > 0) {
                System.out.print(separator + j + endingSeparator);
            } else if (j > daysInMonth) {
                System.out.print(separator + "  " + endingSeparator);
            } else {
                System.out.print(separator + " " + endingSeparator);
            }
        }
    }
}