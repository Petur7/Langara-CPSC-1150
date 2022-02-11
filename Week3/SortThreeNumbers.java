/*
    *Program Name: SortThreeNumbers.java
    *Author: Ngoc Hoang Cuong Dinh
    *Date: Feb 03, 2022
    *Course: CPSC 1150 – W02
    *Instructor: L, Pan
*/


import java.util.Scanner;

// Input three numbers, sort them, and print them out.
public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // If number2 is less than number1, swap them. Now number1 is smaller than number2.
        if (number2 < number1) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // If number3 is less than number1, swap them. Now number1 is smallest.
        if (number3 < number1) {
            int temp = number1;
            number1 = number3;
            number3 = temp;
        }

        // If number3 is less than number2, swap them. Now number3 is largest.
        if (number3 < number2) {
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }

        System.out.println("Sorted numbers: " + number1 + ", " + number2 + ", " + number3);
    }
}
