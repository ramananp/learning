package io.ramanan.learning.datastructure.bitwise;

public class BitwiseShiftOperators {
    public static void main(String[] args) {
        //System.out.println(Integer.toBinaryString(5));
        //System.out.println(Integer.toBinaryString(-12));
        signedLeftShift();
        signedRightShift();
        unsignedRightShift();
    }
    public static void signedLeftShift() {
        /**
         *  0 0 0 0 1 0 1 -> 0 0 0 1 0 1 0 -> 0 0 1 0 1 0 0
         */
        System.out.println("5 << 2 = " + (5 << 2));
        System.out.println("-5 << 2 = " + (-5 << 2));
    }

    public static void signedRightShift() {
        /**
         *  0 0 0 0 1 0 1 -> 0 0 0 0 0 1 0 -> 0 0 0 0 0 0 1
         */
        System.out.println("5 >> 2 = " + (5 >> 2));
        /**
         *  - 0 0 0 0 1 0 1 -> - 0 0 0 0 0 1 0 -> - 0 0 0 0 0 0 1
         *  1 1 1 1 1 0 1 1 -> 1 1 1 1 1 1 0 1 -> 1 1 1 1 1 1 1 0 -> 0 0 0 0 0 0 0 1 + 1 -> - 0 0 0 0 0 0 1 0
         */
        System.out.println("-5 >> 2 = " + (-5 >> 2));

        /**
         *  11111111 11111111 11111111 11110100 -> 11111111 11111111 11111111 11111010 -> 11111111 11111111 11111111 11111101
         *    -> 1 0 + 1 -> -1 1
         */
        System.out.println("-12 >> 2 = " + (-12 >> 2));
    }

    //https://stackoverflow.com/questions/15457893/java-right-shift-on-negative-number
    public static void unsignedRightShift() {
        /**
         *  0 0 0 0 1 0 1 -> 0 0 0 0 0 1 0 -> 0 0 0 0 0 0 1
         */
        System.out.println("5 >>> 2 = " + (5 >>> 2));

        /**
         *  11111111 11111111 11111111 11111011 -> 01111111 11111111 11111111 11111101 -> 00111111 11111111 11111111 11111110
         */
        System.out.println("-5 >>> 2 = " + (-5 >>> 2));
    }
}