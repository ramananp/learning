package io.ramanan.learning.datastructure.bitwise;

public class BitwiseLogicalOperators {
    public static void main(String[] args) {
        and();
        or();
        xor();
        not();
    }

    public static void and() {
        /**
            1 0 1
            1 1 1
            -----
            1 0 1
            -----
        **/
        System.out.println("5 & 7 = " + (5 & 7));        
    }

    public static void or() {
        /**
         *  1 0 1
         *  1 1 1
         *  -----
         *  1 1 1
         *  -----
         **/
        System.out.println("5 | 7 = " + (5 | 7));
    }

    public static void xor() {
        /**
         *  1 0 1
         *  1 1 1
         *  -----
         *  0 1 0
         *  -----
         **/
        System.out.println("5 ^ 7 = " + (5 ^ 7));
    }

    public static void not() {
        /**
         *  0 0 0 0 0 1 0 1
         *  ---------------
         *  1 1 1 1 1 0 1 0 --> 0 0 0 0 0 1 0 1 + 1 --> 0 0 0 0 0 1 1 0 -> - 0 0 0 0 0 1 1 0
         *  ---------------
         */
        System.out.println("~5 = "+ ~5);
    }
}