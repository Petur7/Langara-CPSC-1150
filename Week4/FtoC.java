import java.util.Scanner;


public class FtoC {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");

            System.out.print("Do you want to continue? (y/n): ");
            String answer = input.next();
            if (answer.equals("n")) {
                break;
            }
        }
    }
}
