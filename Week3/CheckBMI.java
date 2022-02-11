/*
    *Program Name: CheckBMI.java
    *Author: Ngoc Hoang Cuong Dinh
    *Date: Feb 03, 2022
    *Course: CPSC 1150 – W02
    *Instructor: L, Pan
*/


import java.util.Scanner;


// Input weight and height, calculate BMI, and check if the person is normal or not.

public class CheckBMI{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilogram: ");
        double weight = input.nextDouble();
        // If weight is less than 0, the program will not run.
        if (weight < 0) {
            System.out.print("Weight must be a positive number.");
            return;
        }

        System.out.print("Enter your height in meter: ");
        double height = input.nextDouble();
        // If height is less than 0, the program will not run.
        if (height < 0) {
            System.out.print("Height must be a positive number.");
            return;
        }

        // Calculate BMI and print it out.
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is %.2f\n", bmi);

        // Check if the person is normal or not.
        if (bmi < 20) {
            System.out.println("You are underweight.");
        }
        if (bmi >= 20 && bmi <= 25) {
            System.out.println("Your BMI is normal.");
        }
        if (bmi > 25) {
            System.out.println("You are overweight.");
        }
    }
}