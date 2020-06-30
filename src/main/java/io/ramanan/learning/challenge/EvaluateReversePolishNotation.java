package io.ramanan.learning.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

public class EvaluateReversePolishNotation {
    private static Map<String, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();
    static {
        operations.put("+", (a, b) -> a+b);
        operations.put("-", (a, b) -> a-b);
        operations.put("*", (a, b) -> a*b);
        operations.put("/", (a, b) -> a/b);
    }
    
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++) {
            String str = tokens[i];
            if(!operations.containsKey(str)) {
                stack.push(Integer.parseInt(str));
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                stack.push(operations.get(str).apply(val2, val1));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}