package hust.soict.globalict.lab01.JavaBasics;

import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int yearInput;

        do {
            System.out.print("Enter the month (full name, abbreviation, or number): ");
            monthInput = scanner.nextLine().toLowerCase();
        } while (!isValidMonthInput(monthInput));

        do {
            System.out.print("Enter the year: ");
            yearInput = scanner.nextInt();
        } while (yearInput <= 0);
        
        scanner.close();
        
        int monthNumber = getMonthNumber(monthInput);
        int daysInMonth = getDaysInMonth(monthNumber, yearInput);
        
        if (daysInMonth != -1) {
            System.out.println("Number of days in " + monthInput + "/" + yearInput + " is: " + daysInMonth);
        } else {
            System.out.println("Invalid month or year. Please try again.");
        }
    }
    
    public static boolean isValidMonthInput(String monthInput) {
        return monthInput.matches("jan(uary)?|feb(ruary)?|mar(ch)?|apr(il)?|may|jun(e)?|jul(y)?|aug(ust)?|sep(tember)?|oct(ober)?|nov(ember)?|dec(ember)?|[1-9]|1[0-2]");
    }

    public static int getMonthNumber(String monthInput) {
        switch (monthInput) {
            case "january":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sep":
            case "9":
                return 9;
            case "october":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec":
            case "12":
                return 12;
            default:
                return -1;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
