package io.ramanan.learning.challenge;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        if(s == null || s.length() == 0) {
            return true;
        }
        if(t == null || t.length() == 0) {
            return false;
        }
        int sIndex = 0;
        int tIndex = 0;
        while(tIndex < t.length()) {
            if(s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                if(sIndex == s.length()) {
                    return true;
                }
            }
            tIndex++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "c"));
    }
}