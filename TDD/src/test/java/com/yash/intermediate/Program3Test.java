package com.yash.intermediate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Program3Test {
	Program3 t = new Program3();
	
    @Test
    public void evaluateActionFromUrl1(){  
    	assertEquals("searchdata",t.evaluateActionFromUrl("www.google.com/searches/searchdata.jsp")); 
    } 
    
    @Test
    public void evaluateActionFromUrl2(){  
    	assertEquals("salary",t.evaluateActionFromUrl("www.yash.com/employees/salary.xhtml")); 
    } 
    
    @Test
    public void evaluateActionFromUrl3(){  
    	assertEquals("index",t.evaluateActionFromUrl("www.yash.com/index.jsp")); 
    } 
}
