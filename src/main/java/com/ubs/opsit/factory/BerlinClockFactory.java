package com.ubs.opsit.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ubs.opsit.constants.CommonConstants;
import com.ubs.opsit.exception.ValidationException;
import com.ubs.opsit.types.BerlinClock;
import com.ubs.opsit.util.ValidationUtil;

/**
 * @author ketaki-waingankar
 *
 */
public class BerlinClockFactory {
	
	private final static Logger logger = LoggerFactory.getLogger(BerlinClockFactory.class);
	
	/**
	 * Factory method to return BerlinClock from inputs hours, minutes and seconds.
	 * 
	 * @param hour
	 * @param minute
	 * @param second
	 * @return BerlinClock
	 * @throws ValidationException
	 */
	public static BerlinClock createBerlinClock (Integer hour, Integer minute, Integer second) throws ValidationException {
		logger.info("Enter method BerlinClockFactory.createBerlinClock");
		ValidationUtil.validateInteger(hour, CommonConstants.MAX_VALID_HOUR, CommonConstants.MIN_VALID_INPUT);
		ValidationUtil.validateInteger(minute, CommonConstants.MAX_VALID_MINUTE_SECOND, CommonConstants.MIN_VALID_INPUT);
		ValidationUtil.validateInteger(second, CommonConstants.MAX_VALID_MINUTE_SECOND, CommonConstants.MIN_VALID_INPUT);
		
		BerlinClock berlinClock = new BerlinClock();
		berlinClock.setSecondLamp(second % 2 == 0);
		berlinClock.setHourRowOne(hour / 5);
		berlinClock.setHourRowTwo(hour % 5);
		berlinClock.setMinuteRowOne(minute / 5);
		berlinClock.setMinuteRowTwo(minute % 5);
		
		logger.info("Exit method BerlinClockFactory.createBerlinClock");
		return berlinClock;
	}
}
