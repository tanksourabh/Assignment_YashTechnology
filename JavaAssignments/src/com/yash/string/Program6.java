package com.yash.string;

public class Program6 {


	public static void stringPool() {
		String str="sourabh";
		String str1="sourabh";
		if(str==str1) {
			System.out.println("this is in string pool");
		}
		else {
			System.out.println("no");
		}
	}
	
	public static void heapMemory() {
		String str=new String("sourabh");
		String str1=new String("sourabh");
		if(str==str1) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		stringPool();
		heapMemory();
	}

}
