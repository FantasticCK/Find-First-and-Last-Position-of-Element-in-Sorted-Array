package com.CK;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0)
            return new int[]{-1,-1};

        int left = index, right = index;
        while(left >= 0 && nums[left] == target) left--;
        while(right < nums.length && nums[right] == target) right++;
        return new int[]{left + 1, right - 1};
    }
}