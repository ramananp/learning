package io.ramanan.learning.InterviewCake;

public class CheckParanthesis {

    public static boolean isValid(String code) {

        // determine if the input code is valid
        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();
        java.util.Map<Character, Character> map = new java.util.HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        
        for(char c: code.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (stack.pop() != map.get(c)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("[[]]())"));
    }
    
}