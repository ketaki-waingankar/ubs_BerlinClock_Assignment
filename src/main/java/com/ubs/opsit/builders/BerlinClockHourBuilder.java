package com.ubs.opsit.builders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ubs.opsit.constants.CommonConstants;
import com.ubs.opsit.types.BerlinClock;
import com.ubs.opsit.types.Lamp;
import com.ubs.opsit.util.CommonUtil;

/**
 * Concrete builder class to display lamps for hours.
 *  
 * @author ketaki-waingankar
 *
 */
public class BerlinClockHourBuilder extends AbstractBerlinClockBuilder {

	private final static Logger logger = LoggerFactory.getLogger(BerlinClockSecondBuilder.class);
	
	/**
	 * BerlinClock object to hold structure of lamps on graphic clock.
	 * 
	 * @param berlinClock
	 */
	public BerlinClockHourBuilder(BerlinClock berlinClock) {
		this.berlinClock = berlinClock;
	}
	
	/* (non-Javadoc)
	 * @see com.ubs.opsit.builders.AbstractBerlinClockBuilder#buildLamps()
	 */
	@Override
	public String buildLamps() {
		logger.info("Enter method BerlinClockHourBuilder.buildLamps");
		Lamp[] hourOneArray = CommonUtil.populateSingleColoredLampArray(CommonConstants.TOTAL_LAMPS_IN_HOUR_ROWS, berlinClock.getHourRowOne(), Lamp.RED);
		Lamp[] hourTwoArray = CommonUtil.populateSingleColoredLampArray(CommonConstants.TOTAL_LAMPS_IN_HOUR_ROWS, berlinClock.getHourRowTwo(), Lamp.RED);
		logger.info("Exit method BerlinClockHourBuilder.buildLamps");
		return CommonUtil.getDisplayLamps(hourOneArray).concat(System.lineSeparator()).concat(CommonUtil.getDisplayLamps(hourTwoArray));
    }
}
