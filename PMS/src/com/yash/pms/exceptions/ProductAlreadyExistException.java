package com.yash.pms.exceptions;

public class ProductAlreadyExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductAlreadyExistException(String msg) {
		System.out.println("Problem occured: " +msg);
	}
	
}
