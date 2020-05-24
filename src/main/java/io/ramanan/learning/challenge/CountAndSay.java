package io.ramanan.learning.challenge;

public class CountAndSay {

    private static String countAndSay(int n) {
        String result = "0";
        for(int i=0; i<n; i++) {
            result = count(result);
        }
        return result;
    }

    private static String count(String value) {
        if("0".equals(value)){
            return "1";
        }
        StringBuilder result = new StringBuilder();
        int last = 0;
        for(int i=1; i<=value.length(); i++) {
            if(i == value.length() || value.charAt(i-1) != value.charAt(i)) {
                String substring = value.substring(last, i);
                //result += String.valueOf(+""+);
                result.append(substring.length());
                result.append(substring.charAt(0));
                last = i;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}