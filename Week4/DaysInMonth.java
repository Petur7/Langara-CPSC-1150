/*
    *Program Name: DaysInMonth.java
    *Author: Ngoc Hoang Cuong Dinh
    *Date: Feb 09, 2022
    *Course: CPSC 1150 – W02
    *Instructor: L, Pan
*/


import java.util.Scanner;


public class DaysInMonth {

    // Check leap year
    static boolean leapYear (int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) return true;
                else return false;
            } else return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int daysInMonth = 0;
        String monthName = "";
        // Switch case
        switch (month) {
            case 1: daysInMonth=31; monthName="January"; break;
            // If month is February, check if it is leap year
            case 2:
                monthName="February";
                if (leapYear(year)) {
                    daysInMonth=29;
                } else {
                    daysInMonth=28;
                }
                break;
            case 3: daysInMonth=31; monthName="March"; break;
            case 4: daysInMonth=30; monthName="April"; break;
            case 5: daysInMonth=31; monthName="May"; break;
            case 6: daysInMonth=30; monthName="June"; break;
            case 7: daysInMonth=31; monthName="July"; break;
            case 8: daysInMonth=31; monthName="August"; break;
            case 9: daysInMonth=30; monthName="September"; break;
            case 10: daysInMonth=31; monthName="October"; break;
            case 11: daysInMonth=30; monthName="November"; break;
            case 12: daysInMonth=31; monthName="December"; break;
        }

        System.out.println("There are " + daysInMonth + " days in " + monthName + ", " + year);
    }
}
