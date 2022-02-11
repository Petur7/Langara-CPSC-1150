// Using Eculidean algorithm to find GCD of two numbers


import java.util.Scanner;


public class FindGCD {
    public static int findGCD (int firstNum, int secondNum) {
        if (firstNum == 0) return secondNum;
        if (secondNum == 0) return firstNum;
        if (firstNum == secondNum) return firstNum;
        if (firstNum > secondNum) return findGCD(firstNum % secondNum, secondNum);
        else return findGCD(firstNum, secondNum % firstNum);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second integer: ");
        int secondNum = input.nextInt();

        System.out.println("GCD of " + firstNum + " and " + secondNum + " is " + findGCD(firstNum, secondNum));
    }
}