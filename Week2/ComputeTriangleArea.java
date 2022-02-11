/*
Program Name: CalculateBmi.java
Author:       Ngoc Hoang Cuong Dinh
Date:         Jan 24, 2022
Instructor:   Pan L
*/

// Input 3 points of a triangle and calculate its area

// Import Scanner to get input from keyboard
import java.util.Scanner;


public class ComputeTriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the points
        System.out.print("Input 3 points of a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Calculate sides of given triangle
        double side1 = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        double side2 = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
        double side3 = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));

        // Calculate the area
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Print out the area
        System.out.printf("The area of triangle: %2.2f\n", area);
    }
}
