/*
    *Program Name: FindMiddleName.java
    *Author: Ngoc Hoang Cuong Dinh
    *Date: Feb 10, 2022
    *Course: CPSC 1150 – W02
    *Instructor: L, Pan
*/


import java.util.Scanner;


public class FindMiddleName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String fullName = input.nextLine();

        // Take the start position of the middle name
        // Don't want to take the space so add 1
        int startIndexMiddleName = fullName.indexOf(" ") + 1;
        // Take the end position of the middle name
        // Because substring is exclusive of the end index, so dont have to subtract 1
        int endIndexMiddleName = fullName.lastIndexOf(" ");
        // Substring the middle name
        String middleName = fullName.substring(startIndexMiddleName, endIndexMiddleName);
        System.out.println("Your middle name is " + middleName);
        
        input.close();
    }
}
