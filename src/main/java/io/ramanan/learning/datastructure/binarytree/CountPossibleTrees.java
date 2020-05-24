package io.ramanan.learning.datastructure.binarytree;

public class CountPossibleTrees {

    public static int count(int num) {
        if(num <= 1) {
            return 1;
        }
        int sum = 0;
        for(int i=1; i<=num; i++) {
            int countLeftTree = count(i-1);
            int countRightTree = count(num-i);
            sum = sum + (countLeftTree*countRightTree);
        }
        return sum;
    }

    public static void main(String[] args) {
        int count = count(10);
        System.out.println(count);
    }

}