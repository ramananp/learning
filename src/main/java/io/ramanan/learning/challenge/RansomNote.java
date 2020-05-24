package io.ramanan.learning.challenge;

public class RansomNote {

    private static boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];
        for(char c : ransomNote.toCharArray()) letters[c - 'a']--;
        for(char c : magazine.toCharArray()) letters[c - 'a']++;
        for(char c : ransomNote.toCharArray()) if(letters[c - 'a']<0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
    }
    
}