/*
    *Program Name: ValidatingTriangle.java
    *Author: Ngoc Hoang Cuong Dinh
    *Date: Feb 03, 2022
    *Course: CPSC 1150 – W02
    *Instructor: L, Pan
*/


import java.util.Scanner;

// Check if the three sides of a triangle are valid or not.
public class ValidatingTriangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first edge length: ");
        double side1 = input.nextDouble();
        System.out.print("Enter the second edge length: ");
        double side2 = input.nextDouble();
        System.out.print("Enter the third edge length: ");
        double side3 = input.nextDouble();

        // Check if the three sides are valid or not.
        boolean validate = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
        // Print out the result.
        System.out.printf("Can edge %f, %f, and %f form a triangle? %b\n", side1, side2, side3, validate);
    }
}
