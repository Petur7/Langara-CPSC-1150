/*
    *Program Name: DisplayDayOfWeek.java
    *Author: Ngoc Hoang Cuong Dinh
    *Date: Feb 09, 2022
    *Course: CPSC 1150 – W02
    *Instructor: L, Pan
*/


import java.util.Scanner;


public class DisplayDayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int dayNumber = input.nextInt();
        
        // Switch statement
        switch (dayNumber) {
            case 0: 
                System.out.println("Sunday");
                break;
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            // If none of those case above then print this
            default: System.out.println("Invalid day number.");
        }
    }
}
