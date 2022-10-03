package com.yash.string;

public class Program2 {

	public static void ascending(String str) {
		char[] c = str.toCharArray();
		char ch;
		for (int i = 1; i < c.length; i++) {
			for (int j = 0; j < c.length - i; j++) {
				if (c[j] > c[j + 1]) {
					ch = c[j];
					c[j] = c[j + 1];
					c[j + 1] = ch;
				}
			}

		}
		System.out.println(c);

	}

	public static void decending(String str) {
		char[] c = str.toCharArray();
		char ch;
		for (int i = 1; i < c.length; i++) {
			for (int j = 0; j < c.length - i; j++) {
				if (c[j] < c[j + 1]) {
					ch = c[j];
					c[j] = c[j + 1];
					c[j + 1] = ch;
				}
			}

		}
		System.out.println(c);
		 
	}

	public static void main(String[] args) {
		ascending("kritika");
		decending("kritika");

	}

}
