package io.ramanan.learning.challenge;

public class HIndexII {
    public static int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) {
            return 0;
        }
        int n = citations.length;
        int l = 0, r = n-1;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(citations[mid] < n-mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        } 
        return n-l;
    }

    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{0,1,3,5,6}));
        //System.out.println(hIndex(new int[]{0,1}));
    }
}