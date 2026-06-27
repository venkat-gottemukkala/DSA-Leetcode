package com.venkat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UsingHashMap {

	public static void main(String[] args) {
		int[] nums = {3,2,4}; //output: [1,2]
		int target = 6;
		
		int[] result = twoSum(nums, target);
		System.out.println(Arrays.toString(result));

	}

	private static int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		for(int i=0;i<nums.length;i++) {
		int complement  = target-nums[i];
		
		if(map.containsKey(complement)) {
			return new int[] {map.get(complement), i};
		}
		map.put(nums[i], i);
		}
		
		return new int[] {};
	}

}
