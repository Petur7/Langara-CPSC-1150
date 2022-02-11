import java.util.Scanner;


public class CountingNumber {
    public static void main(String[] args) {
        int positiveNumber = 0;
        int negativeNumber = 0;
        int total = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            total += number;
            if (number == 0) break;
            if (number > 0) positiveNumber++;
            else negativeNumber++;
        }

        System.out.println("Positive number: " + positiveNumber);
        System.out.println("Negative number: " + negativeNumber);
        System.out.printf("Average: %2.2f\n", (float) total / (positiveNumber + negativeNumber));
    }
}
