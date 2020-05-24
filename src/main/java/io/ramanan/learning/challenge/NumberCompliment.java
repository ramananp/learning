package io.ramanan.learning.challenge;

public class NumberCompliment {

    public static void main(String[] args) {
        int num = 5;
        int cp = num;
        int sum = 0;
        while(num > 0){
            sum = (sum << 1) + 1;
            num >>= 1;
        }
        System.out.println(sum - cp);
    }
    
}