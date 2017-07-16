package com.ubs.opsit.util;

import com.ubs.opsit.constants.CommonConstants;
import com.ubs.opsit.exception.ValidationException;
import com.ubs.opsit.factory.BerlinClockFactory;
import com.ubs.opsit.types.BerlinClock;
import com.ubs.opsit.types.Lamp;

/**
 * Util class for common util functions.
 * 
 * @author ketaki-waingankar
 *
 */
public class CommonUtil {

	/**
	 * Method that converts inputTime into BerlinClock object.
	 * 
	 * @param inputTime
	 * @return BerlinClock
	 * @throws ValidationException
	 */
	public static BerlinClock convertTimeToBerlinClock(String inputTime) throws ValidationException {
		if (inputTime == null || inputTime.isEmpty()) {
			throw new ValidationException();
		}
		String[] timeArray = inputTime.split(CommonConstants.INPUT_SEPARATOR);
		if (timeArray.length != 3) {
			throw new ValidationException();
		}
		Integer hour, minute, second;
		try {
			hour = Integer.parseInt(timeArray[0]);
			minute = Integer.parseInt(timeArray[1]);
			second = Integer.parseInt(timeArray[2]);
		} catch (NumberFormatException e) {
			throw new ValidationException();
		}
		
		return BerlinClockFactory.createBerlinClock(hour, minute, second);
	}
	
	/**
	 * Method that converts Lamp array to user-friendly display of lamps.
	 * 
	 * @param lamps
	 * @return String
	 */
	public static String getDisplayLamps (Lamp[] lamps) {
		StringBuilder result = new StringBuilder();
		if (lamps != null) {
			for (int i = 0; i < lamps.length; i++) {
				result.append(lamps[i].getLampState());
			}
		}
		return result.toString();
	}
	
	/**
	 * Method that returns the formation of the lamps for rows that need single colored lamps. (Both rows of Hour and second row of Minutes)
	 * 
	 * @param total
	 * @param on
	 * @param lampColorState
	 * @return Lamp[]
	 */
	public static Lamp[] populateSingleColoredLampArray (Integer total, Integer on, Lamp lampColorState) {
		Lamp[] result = new Lamp[total];
		for (int i = 0; i < total; i++) {
			if (i < on) {
				result[i] = lampColorState;
			} else {
				result[i] = Lamp.OFF;
			}
		}
		return result;
	}
	
	/**
	 * Method that returns the formation of the lamps for rows that need two colored lamps. (First row of Minutes)
	 * 
	 * @param total
	 * @param on
	 * @param offset
	 * @param lampColorState1
	 * @param lampColorState2
	 * @return Lamp[]
	 */
	public static Lamp[] populateMultiColoredLampArray (Integer total, Integer on, Integer offset, Lamp lampColorState1, Lamp lampColorState2) {
		Lamp[] result = new Lamp[total];
		for (int i = 0; i < total; i++) {
			if (i < on) {
				if ((i + 1) % offset == 0) {
					result[i] = lampColorState2;
				} else {
					result[i] = lampColorState1;
				}
			} else {
				result[i] = Lamp.OFF;
			}
		}
		return result;
	}
}
