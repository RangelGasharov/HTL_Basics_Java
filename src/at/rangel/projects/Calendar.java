package at.rangel.projects;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Calendar {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] ars) {

        String[] nameOfTheDays = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};
        String[] namesOfMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] calendar = new int[42];

        LocalDateTime currentDate = LocalDateTime.now();
        LocalDate firstDateOfMonth = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());

        DayOfWeek firstWeekDayOfMonthString = DayOfWeek.from(firstDateOfMonth);
        DayOfWeek dayOfWeekString = DayOfWeek.from(currentDate);

        int dayOfWeekInt = dayOfWeekString.getValue();
        int firstWeekDayOfMonthInt = firstWeekDayOfMonthString.getValue() - 1;

        DateTimeFormatter formattingObject = DateTimeFormatter.ofPattern("dd.MM.yyyy"); //"dd-MM-yyyy"
        DateTimeFormatter formattingObjectDayOnly = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter formattingObjectMonthOnly = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter formattingObjectYearOnly = DateTimeFormatter.ofPattern("yyyy");

        int dayOfMonth = Integer.parseInt(currentDate.format(formattingObjectDayOnly));
        int monthOfYear = Integer.parseInt(currentDate.format(formattingObjectMonthOnly));
        int currentYear = Integer.parseInt(currentDate.format(formattingObjectYearOnly));
        String formattedDate = currentDate.format(formattingObject);
        String currentYearString = String.valueOf(currentYear);
        String currentMonth = namesOfMonths[monthOfYear - 1];
        Month month = Month.of(monthOfYear);
        boolean isLeapYear = currentYear % 4 == 0;
        int amountOfDaysInMonth = month.length(isLeapYear);
        int titleLengthConsole = 42;
        int additionalSpacing = 1;
        if ((currentMonth.length() + currentYearString.length()) % 2 == 0) {
            additionalSpacing = 0;
        }
        int repeatNTimes = titleLengthConsole / 2 - currentMonth.length() / 2 - currentYearString.length() / 2;
        if (repeatNTimes <= 0) {
            repeatNTimes = 1;
        }

        System.out.println();
        System.out.println(ANSI_BLACK + ANSI_WHITE_BACKGROUND + " ".repeat(repeatNTimes - additionalSpacing) + currentMonth + " " + currentYearString + " ".repeat(repeatNTimes) + ANSI_RESET);

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
            int j = i - firstWeekDayOfMonthInt + 1;
            String separator = "   | ";
            String endingSeparator = "";
            if (j > 10) {
                separator = "  | ";
            }

            calendar[i] = j;

            if (j % 7 == 7 - firstWeekDayOfMonthInt || (j % 7 == 0 && firstWeekDayOfMonthInt == 0)) {
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

            if (j == dayOfMonth) {
                System.out.print(separator + ANSI_WHITE_BACKGROUND + ANSI_BLACK + calendar[i] + ANSI_RESET + endingSeparator);
            } else if (j <= amountOfDaysInMonth && j > 0) {
                System.out.print(separator + calendar[i] + endingSeparator);
            } else if (j <= 0) {
                System.out.print(separator + " " + endingSeparator);
            } else if (j <= 35 - firstWeekDayOfMonthInt && 36 >= amountOfDaysInMonth + firstWeekDayOfMonthInt) {
                System.out.print(separator + "  " + endingSeparator);
            } else if (j <= 42 - firstWeekDayOfMonthInt && 36 <= amountOfDaysInMonth + firstWeekDayOfMonthInt) {
                System.out.print(separator + "  " + endingSeparator);
            } else {
                System.out.print("");
            }
        }

        System.out.println();
        System.out.println("Today: " + formattedDate + ", " + dayOfWeekString);
        System.out.println("Current month: " + currentMonth);
        System.out.println("Day of the month: " + dayOfMonth);
        System.out.println("Amount of days in the month: " + amountOfDaysInMonth);
        System.out.println("Day of week int value: " + dayOfWeekInt);
    }
}