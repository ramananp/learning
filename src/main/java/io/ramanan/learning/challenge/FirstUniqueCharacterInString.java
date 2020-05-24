package io.ramanan.learning.challenge;

public class FirstUniqueCharacterInString {

    public static int firstUniqChar(String s) {
        int res = Integer.MAX_VALUE;
        
        for(char c = 'a'; c <= 'z'; c++){
            int index = s.indexOf(c);
            
            if(index != -1 && index == s.lastIndexOf(c))
                res = Math.min(res, index);
        }
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static void main(String[] args) {
       System.out.println(firstUniqChar("loveleetcode"));
    }
    
}