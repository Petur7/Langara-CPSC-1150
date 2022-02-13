/*
    *Program Name: KilogramsAndPounds.java
    *Author: Ngoc Hoang Cuong Dinh
    *Date: Feb 10, 2022
    *Course: CPSC 1150 – W02
    *Instructor: L, Pan
*/


public class KilogramsAndPounds {
    // Convert kilograms to pounds
    public static float convertKgtoLb(int kilograms) {
        return kilograms * 2.2f;
    }

    // Convert pounds to kilograms
    public static float convertLbtoKg(int pounds) {
        return pounds / 2.2f;
    }

    public static void main(String[] args) {
        // Print out header and line
        System.out.println("kilograms   pounds   |   pounds   kilograms");
        System.out.println("---------------------|---------------------");
        // For each row in the table
        int row = 0;
        while (row < 10) {
            System.out.format(
                "%9d   %6.3f   |     %2d      %6.3f\n",
                // The formula is base+row*step
                1+row*2, convertKgtoLb(1+row*2), 20+row*5, convertLbtoKg(20+row*5)
            );
            row++;
        }
    }
}
