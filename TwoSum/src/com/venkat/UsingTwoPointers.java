package com.venkat;

import java.util.Arrays;

public class UsingTwoPointers {

	public static void main(String[] args) {
		int[] nums = {3,3}; //output : [0,1]
		int target = 6;
		int[] result = twoSum(nums, target);
		System.out.println(Arrays.toString(result));

	}

	private static int[] twoSum(int[] nums, int target) {
		int left = 0, right = nums.length-1;
		
		while(left<right) {
			if(nums[left]+nums[right] == target) {
				return new int[] {left, right};
			}else if(nums[left]+nums[right] > target) {
				right--;
			}else {
				left++;
			}
		}
		
		return new int[] {};
	}

}
