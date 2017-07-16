package com.ubs.opsit.util;

import com.ubs.opsit.exception.ValidationException;

/**
 * Util class for validation methods.
 * 
 * @author ketaki-waingankar
 *
 */
public class ValidationUtil {

	/**
	 * Method that validates data in range min to max.
	 * 
	 * @param data
	 * @param max
	 * @param min
	 * @throws ValidationException
	 */
	public static void validateInteger(Integer data, Integer max, Integer min) throws ValidationException {
		if (data == null || data.compareTo(max) > 0 || data.compareTo(min) < 0) {
			throw new ValidationException();
		}
	}
}
