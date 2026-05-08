import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a sentence: ");
            String sentence = input.nextLine();

            if (sentence == null || sentence.trim().isEmpty()) {
                throw new IllegalArgumentException("Sentence cannot be empty.");
            }

            String[] words = sentence.trim().split("\\s+");
            if (words.length < 2) {
                throw new IllegalArgumentException(
                        "Sentence must contain at least two words.");
            }
            String upperCaseSentence = sentence.toUpperCase();
            String reversedSentence = "";
            for (int i = words.length - 1; i >= 0; i--) {
                reversedSentence += words[i] + " ";
            }
            System.out.println("\nModified Sentence Operations:");
            System.out.println("Uppercase Sentence: " + upperCaseSentence);
            System.out.println("Reversed Word Order: " + reversedSentence.trim());

        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

        finally {
            input.close();
        }
    }
}