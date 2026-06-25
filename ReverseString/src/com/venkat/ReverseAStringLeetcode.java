package com.venkat;

public class ReverseAStringLeetcode {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		
		//leetcode
		reverseString(s);
		System.out.println();
		
		//print reverse
		String revs = reverse(s);
		System.out.println(revs);

	}

	

	private static String reverse(char[] s) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<=s.length-1;i++) {
			sb.append(s[i]);
		}
		
		return sb.toString();
	}



	private static void reverseString(char[] s) {
		int left = 0, right=s.length-1;
		while(left<right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}

	}

}
