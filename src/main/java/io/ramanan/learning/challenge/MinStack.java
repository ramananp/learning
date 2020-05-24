package io.ramanan.learning.challenge;

import java.util.Stack;

public class MinStack {

    Stack<Integer> st = new Stack<>();
    int min = Integer.MAX_VALUE;
    
    /** initialize your data structure here. */
    public MinStack() {
    }
    
    public void push(int x) {
        if(x <= min)
        {
            st.push(min);
            min = x;
        }
        st.push(x);
        
    }
    
    public void pop() {
        if(min == st.pop())
        {
            min = st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.pop();
    }

}