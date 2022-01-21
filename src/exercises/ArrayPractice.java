package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        //PART 1
        //Steps 1-2
        int[] nums = {1, 1, 2, 3, 5, 8};
        for (int i : nums) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
        //PART 1
        //Steps 3-5
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] brokenSentence = sentence.split("\\.");
        String str = String.join(" ", brokenSentence);
        System.out.println(Arrays.toString(brokenSentence));
        //PART 2
        //Steps 1-?
        ArrayList<Integer> nums1 = new ArrayList<Integer>(Arrays.asList(1,1,2,4,5,3,6,7,9,8,2));
        evenSum(nums1);

        //PART 2
        //Steps 2-3

        get5LetterWord(sentence, 5);
    }

    private static void evenSum(ArrayList<Integer> numList) {
        int total = 0;
        for (int num : numList) {
            if (num % 2 == 0) {
                total += num;
            }
        }
        System.out.println(total);
    }
    //ArrayList<String> str
    private static void get5LetterWord(String str, int length) {
        String[] sentence = str.split("\\.");
        for (String word : sentence) {
            if(word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
