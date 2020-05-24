package io.ramanan.learning.challenge;

public class MultiplicationTable {

    public static void main(String[] args) {
        for(int i=1; i<=12; i++) {
            for(int j=1; j<=12; j++) {
                System.out.printf("%2d x %2d = %3d  ", i, j, i*j);
            }
            System.out.println();
        }
    }
    
}