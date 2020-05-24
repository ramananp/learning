package io.ramanan.learning.InterviewCake;

import java.util.HashMap;
import java.util.Map;

public class WordCloud {

    private static Map<String, Integer> populateWordsToCounts(String inputString) {

        // count the frequency of each word
        String[] words = inputString.split(" ");
        Map<String, Integer> wordsToCounts = new HashMap<>();
        for(String word :  words) {
            String cleanWord = cleanTheWord(word);
            wordsToCounts.computeIfPresent(cleanWord, (k, v) -> v+1);
            wordsToCounts.computeIfAbsent(cleanWord, k -> 1);
        }

        return wordsToCounts;

    }
    
    private static String cleanTheWord(String word) {
        String cleanWord = word;
        cleanWord = cleanWord.replaceAll("\"", "");
        cleanWord = cleanWord.replaceAll("\\,", "");
        cleanWord = cleanWord.replaceAll("\\.", "");
        cleanWord = cleanWord.replaceAll("\\?", "");
        return cleanWord.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(populateWordsToCounts("hello how are you? Hi, Hello."));
    }
    
}