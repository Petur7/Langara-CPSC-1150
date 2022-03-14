import java.util.Scanner;


public class LargestInArrays {
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5];
        for (int i=0; i<5; i++) {
            System.out.print("Enter a integer number: ");
            intArray[i] = scanner.nextInt();
        }
        System.out.println("The largest number is: " + max(intArray));

        double doubleArray[] = new double[5];
        for (int i=0; i<5; i++) {
            System.out.print("Enter a double number: ");
            doubleArray[i] = scanner.nextDouble();
        }
        System.out.println("The largest number is: " + max(doubleArray));
    }
}