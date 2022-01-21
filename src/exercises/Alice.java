package exercises;
import java.util.Locale;
import java.util.Scanner;
public class Alice {
    public static void main(String[] arg) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Search word in first sentence:");
        String term = input.nextLine();
        boolean doesContain = sentence.toLowerCase().contains(term.toLowerCase());
        input.close();
        System.out.println("Search found: " + doesContain);
        String segment0 = "";
        String segment1 = "";
        if (doesContain) {
            //If true find index within string and its length then remove the word from the string and print again
            int termIndex = sentence.toLowerCase().indexOf(term);
            int termLength = term.length();
            if (termIndex != 0) {
                segment0 = sentence.substring(0, termIndex).trim();
            }
            if (termLength + termIndex != sentence.length()) {
                segment1 = sentence.substring(termIndex + termLength, sentence.length()).trim();
            }
            String newSentence = (segment0 + " " + segment1).trim();
            System.out.println("Index: " + termIndex);
            System.out.println("Length: " + termLength);
            System.out.println(newSentence);
        }
    }
}
