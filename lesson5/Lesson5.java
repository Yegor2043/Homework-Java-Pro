package newPro.lesson5;

import java.util.*;

public class Lesson5 {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry Lorem Ipsum has been the industry's standard dummy text ever since the 1500s when an unknown printer took a galley";
        String[] words = text.toLowerCase().split(" ");
        System.out.println(Arrays.toString(words));
        Set<String> uniqueWords = new HashSet<>();
        List<String> allWords = Arrays.asList(words);
        System.out.println(uniqueWords);
        uniqueWords.addAll(allWords);
        System.out.println("Unique words : " + uniqueWords);
        for (String word : uniqueWords) {
            int count = 0;
            for (String w : allWords) {
                if (word.equals(w)) {
                count++;
                }
            }
            System.out.println(word + " : " + count);
        }
    }
}



