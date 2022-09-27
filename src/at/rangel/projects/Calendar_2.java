package at.rangel.projects;

import java.time.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calendar_2 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] ars) {

        String[] nameOfTheDays = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};
        int[] calendar = new int[42];

        System.out.println("Please write down the " + ANSI_YELLOW + "number of the current month" + ANSI_RESET + "  (1 = January, 2 = February, 3 = March, etc.");
        int currentMonth = input();

        System.out.println("Please write down the " + ANSI_YELLOW + "first weekday of the current month" + ANSI_RESET + " (1 = Monday, 2 = Tuesday, 3 = Wednesday, etc. ");
        int firstWeekDayOfMonth = input();

        System.out.println("Please write down the " + ANSI_YELLOW + "current year" + ANSI_RESET);
        int currentYear = input();
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
                System.out.print(separator + calendar[i] + endingSeparator);
            } else if (j > daysInMonth) {
                System.out.print(separator + "  " + endingSeparator);
            } else {
                System.out.print(separator + " " + endingSeparator);
            }
        }
    }

    public static int input() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                return (scanner.nextInt());
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Please write down an integer and " + ANSI_RED + "NOT" + ANSI_RESET + " a letter , decimal number or others!");
            } finally {
                scanner.nextLine();
            }
        }
    }
}