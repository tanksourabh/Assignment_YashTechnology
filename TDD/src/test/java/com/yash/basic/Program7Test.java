package com.yash.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Program7Test {
	Program7 d = new Program7();
	
    @Test
    public void testdecimalToBinary1(){  
    	assertEquals("101",d.decimalToBinary(5));  
    } 
    
    @Test
    public void testdecimalToBinary2(){  
    	assertEquals("111",d.decimalToBinary(5)); 
    }
}
