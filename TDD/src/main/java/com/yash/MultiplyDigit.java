package com.yash;

public class MultiplyDigit {

	
	   public int multiplydigit(int num) {

		
		   int r,mul=1;
		
		
//		num=123;
		
		while(num>0) {
			r=num%10;
			
			mul=mul*r;
			num=num/10;
			
//			
			
		}
		return mul;
	    	
		
		
	}
 
 }