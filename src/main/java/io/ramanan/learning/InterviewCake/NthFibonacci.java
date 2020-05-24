package io.ramanan.learning.InterviewCake;

public class NthFibonacci {

    public static int fib(int n) {

        // compute the nth Fibonacci number
        if(n == 0 || n == 1) {
            return n;
        }
        
        int first = 0;
        int second = 1;
        int fib = 0;
        for(int i=1; i<n; i++) {
            fib = first + second;
            first = second;
            second = fib;
        }

        return fib;
    }
    
    public static void main(String[] args) {
        System.out.println(fib(7));
        //0,1,1,2,3,5,8,13
    }
    
}