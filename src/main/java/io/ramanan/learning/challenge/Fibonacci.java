package io.ramanan.learning.challenge;

import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
        System.out.println(0);
        System.out.println(1);
        for(int i = 2; i<100; i++) {
            BigInteger fib = first.add(second);
            first = second;
            second = fib;
            System.out.println(first.add(second));
        }
        //System.out.println(first.add(second));
    }

}