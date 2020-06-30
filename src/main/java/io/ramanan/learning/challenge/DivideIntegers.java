package io.ramanan.learning.challenge;

public class DivideIntegers {
    public static int divide(int dividend, int divisor) {
        int n = dividend, m = divisor;
        int sign = n < 0 || divisor < 0 ? -1 : 1;
        n = Math.abs(n);
        m = Math.abs(m);
        int t = 0;
        int q = 0;
        for(int i=31; i >= 0; i--) {
            if(t + (m<<i) < n) {
                t += m<<i;
                q = q | (1<<i);
            }
        }
        return q * sign;
    }

    public static void main(String[] args) {
        System.out.println(divide(8, 4));
    }
}