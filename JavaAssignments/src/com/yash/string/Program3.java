package com.yash.string;

public class Program3 {

	public static void main(String[] args) {
	
		String c = "";
		String vowel = "aeiouAEIOdddU";
		String s = "sourabh";
		for (int i = 0; i < s.length(); i++) {
			if (vowel.indexOf(s.charAt(i)) == -1) {
				c += s.charAt(i);
			}
		}
		System.out.println(c);

	}

}
