package io.ramanan.learning.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    private static Map<Character, String> map = new HashMap<>();
    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if(digits == null || digits.length() ==0) {
            return result;
        }
        
        findCombinations(result, digits, "", 0);
        
        return result;
    }
    
    private static void findCombinations(List<String> result, String digits, String current, int index) {
        if(digits.length() == index){
            result.add(current);
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(int i=0; i<letters.length(); i++) {
            findCombinations(result, digits, current+letters.charAt(i), index+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("743"));
    }
}