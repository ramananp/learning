package io.ramanan.learning.InterviewCake;

public class MaxProduct {

    private static int highestProductOf3(int[] intArray) {

        // calculate the highest product of three numbers
        int max = intArray[0]*intArray[1]*intArray[2];
        for(int i=0; i<intArray.length; i++) {
            for(int j=i+1; j<intArray.length; j++) {
                for(int k=j+1; k<intArray.length; k++) {
                    int product = intArray[i]*intArray[j]*intArray[k];
                    max = Math.max(max, product);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(highestProductOf3(new int[] {-5, 4, 8, 2, 3}));
    }

}