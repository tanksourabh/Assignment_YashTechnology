/**
 * 
 */
package com.yash.pms.exceptions;

/**
 * @author sourabh.tank
 *
 */
public class ProductDoesNotExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductDoesNotExistException(String msg) {
		System.out.println("Problem occured: " +msg);
	}

}
