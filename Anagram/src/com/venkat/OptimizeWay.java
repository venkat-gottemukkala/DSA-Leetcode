package com.venkat;

public class OptimizeWay {

	public static void main(String[] args) {
		String s = "rat", t = "car";
		boolean result = checkAnagram(s, t);
		System.out.println(result);

	}

	private static boolean checkAnagram(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		
		int[] count = new int[26];
		
		for( char c : s.toCharArray()) count[c - 'a']++;
		for(char c : t.toCharArray()) count[c - 'a']--;
		
		for(int val : count) {
			if(val != 0) return false;
		}
		
		
		
		return true;
	}

}
