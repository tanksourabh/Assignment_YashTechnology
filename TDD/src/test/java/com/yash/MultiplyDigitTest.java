package com.yash;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplyDigitTest {
	
	MultiplyDigit series=new MultiplyDigit();
	
	@Test  
    public void testSeries1(){  
        assertEquals(6,series.multiplydigit(123));  
    } 	

	@Test  
    public void testSeries2(){  
        assertEquals(1,series.multiplydigit(123));  
    }
}