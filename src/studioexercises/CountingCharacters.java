package studioexercises;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CountingCharacters {
    public static void main(String[] args) throws IOException {
        try {
            String test = new String(Files.readAllBytes(Paths.get("C:\\\\Users\\\\Isaac\\\\LC101\\\\java\\\\practice\\\\java_exercises\\\\InputFile")));
            System.out.println(test);
        } catch(Exception e){
            System.err.println(e);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please type the string you'd like me to analyze");
        String paragraph = input.nextLine().toLowerCase();
//        String paragraph = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        ArrayList<String> letters = new ArrayList<String>("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        String newString = paragraph.replaceAll("[^a-zA-Z]","");
        HashMap<String, Double> characterCount = new HashMap<String, Double>();
        String[] brokenParagraph = newString.split("");
        for (String character : brokenParagraph) {
            //Add string and double to characterCount
            if (characterCount.get(character) != null) {
                characterCount.put(character, characterCount.get(character) + 1.0);
            } else {
                characterCount.put(character, 1.0);
            }
        }
        for (String character : characterCount.keySet()) {
            System.out.println(character + ": " + characterCount.get(character));
        }
    }
}
