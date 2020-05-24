package io.ramanan.learning.datastructure.stack;

import java.util.HashMap;
import java.util.Map;

public class MatchingParentheses {

    public static Map<Character, Character> openCloseParanthesis = new HashMap<>();

    static {
        openCloseParanthesis.put('(', ')');
        openCloseParanthesis.put('{', '}');
        openCloseParanthesis.put('[', ']');
        openCloseParanthesis.put('<', '>');
    }

    private static boolean check(String string){
        Stack<Character> brackets = new Stack<>();
        try{
            for(int i=0; i<string.length(); i++){
                Character paranthesis = string.charAt(i);
                if(openCloseParanthesis.containsKey(paranthesis)){
                    brackets.push(paranthesis);
                } else {
                    Character value = brackets.pop();
                    if(openCloseParanthesis.get(value) != paranthesis) {
                        return false;
                    }
                }
            }
            return brackets.isEmpty();
        }catch(Exception e){
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(check("[{}]()"));
        System.out.println(check("([{}]())"));
        System.out.println(check("}{(){}"));
        System.out.println(check("({[]})"));
        System.out.println(check("(){}[]"));
    }

}