package com.venkat;

import java.util.Arrays;

public class TwoSumBruteforce {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15}; // Output: [0,1]
		int target = 9;
		int[] result = twoSum(nums, target);
		System.out.println(Arrays.toString(result));

	}

	private static int[] twoSum(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		
		return new int[] {};
	}

}
