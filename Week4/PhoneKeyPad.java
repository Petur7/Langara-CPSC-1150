/*
    *Program Name: PhoneKeyPad.java
    *Author: Ngoc Hoang Cuong Dinh
    *Date: Feb 09, 2022
    *Course: CPSC 1150 – W02
    *Instructor: L, Pan
*/


import java.util.Scanner;


public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter (uppercase or lowercase): ");
        char letter = input.next().charAt(0);
        // Set lowercase
        char lowercaseLetter = Character.toLowerCase(letter);

        int position = 0;
        // Switch statement
        switch (lowercaseLetter) {
            case 'a':
            case 'b':
            case 'c':
                position = 2;
                break;
            case 'd':
            case 'e':
            case 'f':
                position = 3;
                break;
            case 'g':
            case 'h':
            case 'i':
                position = 4;
                break;
            case 'j':
            case 'k':
            case 'l':
                position = 5;
                break;
            case 'm':
            case 'n':
            case 'o':
                position = 6;
                break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                position = 7;
                break;
            case 't':
            case 'u':
            case 'v':
                position = 8;
                break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                position = 9;
                break;
        }

        // If position is not 0 then print the position
        if (position != 0)
            System.out.println("The letter " + letter + " is on the number key " + position);
        // If position is still 0 then invalid input
        else 
            System.out.println(letter + " is an invalid input");
    }
}
