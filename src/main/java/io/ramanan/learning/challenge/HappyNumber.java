package io.ramanan.learning.challenge;

public class HappyNumber {

    public static boolean isHappy(int n) {
        int squareAndSum = n;
        while(squareAndSum != 1 && squareAndSum != 4) {
            squareAndSum = splitAndSquareAndSum(squareAndSum);
            if(squareAndSum == 1) {
                return true;
            }
        }
        return squareAndSum == 1;
    }

    private static int splitAndSquareAndSum(int n) {
        int sum = 0;
        while(n != 0) {
            int d = (n%10);
            sum += d*d;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}