package io.ramanan.learning.challenge;

import java.util.Arrays;

public class SentenceReverse {

    static char[] reverseWords(char[] arr) {
        if(arr == null || arr.length == 0) {
          return arr;
        }
        reverse(arr, 0, arr.length-1);
        int start = 0;
        for(int i=0; i<arr.length; i++) {
          if(' ' == arr[i]) {
            reverse(arr, start, i-1);
            start = i+1;
            System.out.println(Arrays.toString(arr));
          } else if(i == arr.length-1) {
            reverse(arr, start, i);
          }
        }
        return arr;
      }
      
      private static void reverse(char[] word, int start, int end) {
        while(start < end) {
          char c = word[end];
          word[end] = word[start];
          word[start] = c;
          start++;
          end--;
        }
      }
    
      public static void main(String[] args) {
        char[] chars = reverseWords("may the force be with you".toCharArray());
        System.out.println(Arrays.toString(chars));
      }
    
    
    
}