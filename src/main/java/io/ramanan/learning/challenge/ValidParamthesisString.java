package io.ramanan.learning.challenge;

public class ValidParamthesisString {

    private static boolean checkValidString(String s) {
        int low = 0, high = 0;
        for (char c: s.toCharArray()) {
            if(c == '(') {
                low += 1;
            } else {
                low += -1;
            }
            if(c != ')') {
                high += 1;
            } else {
                high += -1;
            }
            
            if (high < 0) break;
            low = Math.max(low, 0);
        }
        return low == 0;
    }

    public static void main(String[] args) {
        boolean response = checkValidString("(*()");
        System.out.println(response);
    }

}