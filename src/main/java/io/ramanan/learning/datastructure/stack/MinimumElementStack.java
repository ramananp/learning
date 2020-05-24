package io.ramanan.learning.datastructure.stack;

public class MinimumElementStack {
    
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minimumStack = new Stack<>();

    public void push(Integer value){
        this.stack.push(value);
        Integer min = value;
        if(!minimumStack.isEmpty() && min > minimumStack.peek()){
            min = minimumStack.peek();
        }
        minimumStack.push(min);
    }

    public Integer pop() {
        minimumStack.pop();
        return stack.pop();
    }

    public Integer minimum(){
        return minimumStack.peek();
    }

    public static void main(String[] args) {
        MinimumElementStack stack = new MinimumElementStack();
        stack.push(9);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(2);
        System.out.println(stack.minimum());
        System.out.println(stack.pop());
        System.out.println(stack.minimum());
        System.out.println(stack.pop());
        System.out.println(stack.minimum());
        System.out.println(stack.pop());
        System.out.println(stack.minimum());
        System.out.println(stack.pop());
        System.out.println(stack.minimum());
    }
}