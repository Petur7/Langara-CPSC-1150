public class PrimeNumber {
    public static boolean checkPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        int numberOfPrime = 50;

        while (true) {
            if (checkPrime(number)) {
                count++;
                System.out.printf("%d ", number);
            }
            if (count == numberOfPrime) {
                break;
            }
            number++;
        }
    }
}