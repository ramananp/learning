package io.ramanan.learning.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalIntersection {

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        int i = 0, j = 0;
        List<int[]> result = new ArrayList<>();
        while(i < A.length && j < B.length) {
            int[] a = A[i];
            int[] b = B[j];
            int start = Math.max(a[0], b[0]);
            int end = Math.min(a[1], b[1]);
            if(start <= end) {
                result.add(new int[]{start, end});
            }
            if(a[1] < b[1]) {
                i++;
            } else {
                j++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{{0,2},{5,10},{13,23},{24,25}};
        int [][] B = new int[][]{{1,5},{8,12},{15,24},{25,26}};
        int[][] result = intervalIntersection(A, B);
        System.out.println(Arrays.deepToString(result));
    }
    
}