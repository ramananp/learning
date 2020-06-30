package io.ramanan.learning.challenge;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if(nums == null) {
            return -1;
        } else if (nums.length == 0) {
            return 0;
        }
        if(target > nums[nums.length-1]) {
            return nums.length;
        } else if(target < nums[0]) {
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        while(left < right) {
            int mid = left + (right-left)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] > target) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{2,4,6,8,9}, 10));
    }
}