package com.yash.string;

public class Program5 {

	public static void main(String[] args) {

		int N = 66666;
		long t;

		{
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			for (int i = N; i > 0; i--) {
				sb.append("sourabh");
			}
			System.out.println(System.currentTimeMillis() - t + " ms");
		}

		{
			StringBuilder sb = new StringBuilder();
			t = System.currentTimeMillis();
			for (int i = N; i > 0; i--) {
				sb.append("tank");
			}
			System.out.println(System.currentTimeMillis() - t + " ms");
		}

	}

}
