package io.ramanan.learning.challenge;

public class SearchInRotatedSortedArray {

    private static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        int start = left;
        left = 0;
        right = nums.length-1;
        
        if(target >= nums[start] && target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }
        
        while (left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        
        return -1;
        
    }

    public static void main(String[] args) {
        int[] array = {1,3,5};
        System.out.println(search(array, 3));
    }

}