package io.ramanan.learning.challenge;

public class Strstr {

    private static int strstr(String haystack, String needle) {
        if("".equals(needle)) return 0;
        int h = haystack.length();
        int n = needle.length();
        if(n > h) return -1;
        for(int i = 0; i <= h-n; i++) {
            int j;
            for(j=0; j<n; j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
            }
            if(j == n) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strstr("a", "a"));
    }
    
}