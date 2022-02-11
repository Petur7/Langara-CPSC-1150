/*
Program Name: CalculateBmi.java
Author:       Ngoc Hoang Cuong Dinh
Date:         Jan 24, 2022
Instructor:   Pan L
*/

// Calculate BMI base on input weight and height.

// Import Scanner to get input from keyboard
import java.util.Scanner;

public class CalculateBmi {
    public static void main(String[] args) {
        // Initiate scanner variable
        Scanner input = new Scanner(System.in);

        // Input required variables
        System.out.print("Input your weight in kilogram: ");
        double weight = input.nextDouble();
        System.out.print("Input your height in meter: ");
        double height = input.nextDouble();

        // Calculate and print out the result
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
    }
}
