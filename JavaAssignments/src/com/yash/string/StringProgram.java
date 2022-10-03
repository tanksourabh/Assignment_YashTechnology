package com.yash.string;

import java.util.Scanner;

/**
 * Create a OWN string class and override their method and use it in our program
 * 
 * @author sourabh.tank
 *
 */

public final class StringProgram {
	static Scanner sc = new Scanner(System.in);

	public StringProgram(String str) {
		System.out.println("Hello this is my string");
	}

	/*
	 * method is used to display a length of string
	 */
	public static int llength() {
		String str = sc.next();
		int i = 0;
		for (char c : str.toCharArray()) {
			i++;
		}
		return i;
	}

	/*
	 * method is used to display where two string are equals or not
	 */
	public static boolean equals(String s1) {
		int i, flag = 1;
		String s2 = sc.next();
		int len1 = s1.length();
		int len2 = s2.length();
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
		if (len1 == len2) {
			for (i = 0; i < len1; i++) {
				if (str1[i] != str2[i]) {
					flag = 0;
					break;
				}
			}
		} else {
			flag = 0;
		}

		if (flag == 1) {
			return true;
		}

		else {
			return false;
		}
	}

	public static void main(String[] args) {
		StringProgram c = new StringProgram("Sourabh");
		int i = c.llength();
		System.out.println(i);
	}

}
