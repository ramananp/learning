package io.ramanan.learning.challenge;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int length = strs[0].length();
        int i=0;
        boolean flag = false;
        for(; i<length; i++) {
            char c = strs[0].charAt(i);
            for(String str : strs) {
                if(i >= str.length() || c != str.charAt(i)) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                break;
            }
        }
        return strs[0].substring(0, i);
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }
}