/**
 * 
 */
package com.ubs.opsit.exception;

import com.ubs.opsit.constants.CommonConstants;

/**
 * @author user
 *
 */
public class ValidationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ValidationException() {
		super(CommonConstants.MSG_INVALID_INPUT);
	}

}
