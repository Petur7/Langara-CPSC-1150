/*
    *Program Name: CountVowels.java
    *Author: Ngoc Hoang Cuong Dinh
    *Date: Mar 3, 2022
    *Course: CPSC 1150 – W02
    *Instructor: L, Pan
*/


import java.util.Scanner;

public class CountVowels {
    /**
     * Convert sentence to lowercase, delare vowels and count. For each index in sentence, if the letter found in vowels variable then increase count by 1.
     */
    public static int numberOfVowels(String sentence) {
        sentence = sentence.toLowerCase();
        String vowels = "aeiou";
        int count = 0;
        for (int index = 0; index < sentence.length(); index++) {
            if (vowels.indexOf(sentence.charAt(index)) != -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Input sentence and print out number of vowels in sentence using numberOfVowels method.
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        int count = numberOfVowels(sentence);
        System.out.println("Number of vowels: " + count);
    }
}
