import java.util.Scanner;


public class CalculateDates {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: return 31;
            case 2: 
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }
    }

    public static int calculateTotalDaysPassed(int dates, int month, int year) {
        int totalDays = 0;
        for (int preMonth=1; preMonth<month; preMonth++) {
            dates += getDaysInMonth(preMonth, year);
        }
        totalDays += dates - 1;
        return totalDays;
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "";
        }
    }

    public static void printNextDay(int dates, int month, int year) {
        dates = dates + 1;
        if (dates > getDaysInMonth(month, year)) {
            if (month+1 >= 12) {
                month = 1; year++;
            } else month++;
            dates = 1;
        }
        System.out.printf("The next day is %s %d, %d\n", getMonthName(month), dates, year);
    }

    public static boolean isInputValid(int dates, int month, int year) {
        if (dates <= 0 || dates > getDaysInMonth(month, year)) {
            return false;
        }
        if (month <= 0 || month > 12) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of date: ");
        int day = input.nextInt();
        System.out.print("Enter the number of month: ");
        int month = input.nextInt();
        System.out.print("Enter the number of year: ");
        int year = input.nextInt();

        if (!isInputValid(day, month, year)) {
            System.out.println("Invalid input");
            return;
        }
        
        int totalDays = calculateTotalDaysPassed(day, month, year);
        System.out.println(totalDays + " days have passes since the beginning of the year.");

        printNextDay(day, month, year);
    }
}
