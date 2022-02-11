/*
    *Program Name: DisplayPyramid.java
    *Author: Ngoc Hoang Cuong Dinh
    *Date: Feb 10, 2022
    *Course: CPSC 1150 – W02
    *Instructor: L, Pan
*/


import java.util.Scanner;


public class DisplayPyramid {
    public static String addNumber(String line, int number, int level) {
        // If the number greater than the level, add spaces
        if (number > level) line += "  ";
        // if the number is greater or equal to 10, add the number
        // else add a space before the number, then add the number
        else line += number>=10 ? number : " "+number;
        // Add space between numbers
        line += " ";
        return line;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height of the pyramid (1-15): ");
        int height = input.nextInt();

        // For each level, process and print out the level
        for (int level = 1; level <= height; level++) {
            String line = "";
            // For each number from height to 1 (left-hand side of the pyramid)
            for (int number = height; number >= 1; number--) {
                line = addNumber(line, number, level);
            }
            // For each number from 2 to height (right-hand side of the pyramid)
            for (int number = 2; number <= height; number++) {
                line = addNumber(line, number, level);
            }
            System.out.println(line);
        }

        input.close();  
    }
}
