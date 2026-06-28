package com.venkat;

import java.util.Arrays;

public class AngramOrNot {

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		boolean result = checkAnagram(s, t);
		System.out.println(result);

	}

	private static boolean checkAnagram(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		Arrays.sort(sChar);
		Arrays.sort(tChar);

		if (Arrays.equals(sChar, tChar)) {
			return true;
		}

		return false;
	}

}
