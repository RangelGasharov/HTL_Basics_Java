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
        int calendarLength = 40;

        LocalDateTime currentDate = LocalDateTime.now();
        LocalDate firstDateOfMonth = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());

        DayOfWeek firstWeekDayOfMonthString = DayOfWeek.from(firstDateOfMonth);
        DayOfWeek dayOfWeekString = DayOfWeek.from(currentDate);

        int dayOfWeekInt = dayOfWeekString.getValue();
        int firstWeekDayOfMonthInt = firstWeekDayOfMonthString.getValue();

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
        int repeatNTimes = titleLengthConsole / 2 - currentMonth.length() / 2 - currentYearString.length() / 2;
        if (repeatNTimes <= 0) {
            repeatNTimes = 1;
        }

        System.out.println();
        System.out.println(ANSI_BLACK + ANSI_WHITE_BACKGROUND + " ".repeat(repeatNTimes - 1) + currentMonth + " " + currentYearString + " ".repeat(repeatNTimes) + ANSI_RESET);

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

        for (int i = 1 - firstWeekDayOfMonthInt + 1; i < calendarLength; i++) {
            String separator = "   | ";
            String endingSeparator = "";

            if (i % 7 == firstWeekDayOfMonthInt && i != 0) {
                endingSeparator = "   |\n";
                if (i >= 10) {
                    endingSeparator = "  |\n";
                }
            }

            if (i > 10) {
                separator = "  | ";
            }
            if (i % 7 == 1 + firstWeekDayOfMonthInt || i == 1 - firstWeekDayOfMonthInt + 1) {
                separator = "| ";
            }
            if (i == calendarLength - 1) {
                endingSeparator = "  |\n";
            }

            if (i == dayOfMonth) {
                System.out.print(separator + ANSI_WHITE_BACKGROUND + ANSI_BLACK + i + ANSI_RESET + endingSeparator);
            } else if (i <= amountOfDaysInMonth && i > 0) {
                System.out.print(separator + i + endingSeparator);
            } else if (i > amountOfDaysInMonth) {
                System.out.print(separator + "--" + endingSeparator);
            } else {
                System.out.print(separator + "-" + endingSeparator);
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