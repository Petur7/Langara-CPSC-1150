import java.util.Random;


public class GenerateRandomNumbers {
    public static boolean checkExistence(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] number = new int[6];

        for (int i=0; i<6; i++){
            Random random = new Random();
            int randomNumber;
            do {
                randomNumber = random.nextInt(49) + 1;
            } while (checkExistence(number, randomNumber));
            number[i] = randomNumber;
        }

        for (int i=0; i<6; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }   
}
