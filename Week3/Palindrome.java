import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String word = scanner.nextLine().toLowerCase();

        for (int position=0; position<word.length()/2; position++) {
            if (word.charAt(position) != word.charAt(word.length()-1-position)) {
                System.out.println("Not a palindrome");
                return;
            }
        }

        System.out.println("Palindrome");
    }
}
