/*
Program Name: DisplayDigits.java
Author:       Ngoc Hoang Cuong Dinh
Date:         Jan 24, 2022
Instructor:   Pan L
*/

// Input a number from 0 to 99, display the digits and calculate its sum.

// Import Scanner to get input from keyboard
import java.util.Scanner;


public class DisplayDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Input your number from 0 to 999: ");
        int number = input.nextInt();

        // Split to digits
        int stDigit = number % 10; number /= 10;
        int ndDigit = number % 10; number /= 10;
        int rdDigit = number % 10; number /= 10;

        // Display digits
        System.out.printf("The digits of number: %d %d %d\n", rdDigit, ndDigit, stDigit);

        // Calculate digits sum and display the sum
        int sum = stDigit + ndDigit + rdDigit;
        System.out.printf("The sum of digits: %d\n", sum);
    }
}
