package io.ramanan.learning.challenge;

public class StringToInteger {

    public static  int myAtoi(String str) {
        String value = str.trim();
        char[] array = value.toCharArray();
        int i = 0;
        String string = "";
        if('-' == array[0]) {
            string = "-";
            i++;
        }
        for(;i<array.length; i++) {
            if(!Character.isDigit(array[i])) break;
            System.out.println(array[i]);
            string += Character.toString(array[i]);
            System.out.println(string);
        }
        System.out.println(string);
        if("".equals(string)) return 0;
        int result = 0;
        try{
            result = Integer.parseInt(string);
        }catch (Exception e) {
            result = Integer.MIN_VALUE;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
    
}