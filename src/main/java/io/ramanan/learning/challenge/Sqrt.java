package io.ramanan.learning.challenge;

public class Sqrt {

    public static int mySqrt(int x) {
        if(x == 0 || x == 1) {
            return x;
        }
        int left = 0;
        int right = x;
        while(left < right) {
            int mid = left + (int)((right - left)/2);
            if(mid*mid == x) {
                return mid;
            }
            if(mid*mid > x) {
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return left-1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
    
}