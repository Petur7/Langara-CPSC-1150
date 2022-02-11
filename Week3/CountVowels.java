import java.util.Scanner;


public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        int vowels = 0;

        for (int loop=0; loop<sentence.length(); loop++) {
            switch(sentence.charAt(loop)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
    }
}
