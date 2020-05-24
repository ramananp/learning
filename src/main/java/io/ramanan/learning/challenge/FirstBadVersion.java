package io.ramanan.learning.challenge;

public class FirstBadVersion {

    private static int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while(low < high) {
            int mid = (high-low)/2+low;
            if(isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid+1;
            }
            if(low == high || low == mid) {
                return low;
            }
        }
        return n;
    }

    private static boolean isBadVersion(int n) {
        if(n >= 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }

}