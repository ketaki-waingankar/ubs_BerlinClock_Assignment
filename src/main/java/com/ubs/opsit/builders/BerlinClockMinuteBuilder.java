package com.ubs.opsit.builders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ubs.opsit.constants.CommonConstants;
import com.ubs.opsit.types.BerlinClock;
import com.ubs.opsit.types.Lamp;
import com.ubs.opsit.util.CommonUtil;

/**
 * Concrete builder class to display lamps for minutes.
 *  
 * @author ketaki-waingankar
 *
 */
public class BerlinClockMinuteBuilder extends AbstractBerlinClockBuilder {

	private final static Logger logger = LoggerFactory.getLogger(BerlinClockMinuteBuilder.class);
	
	/**
	 * BerlinClock object to hold structure of lamps on graphic clock.
	 * 
	 * @param berlinClock
	 */
	public BerlinClockMinuteBuilder(BerlinClock berlinClock) {
		this.berlinClock = berlinClock;
	}
	
	/* (non-Javadoc)
	 * @see com.ubs.opsit.builders.AbstractBerlinClockBuilder#buildLamps()
	 */
	@Override
	public String buildLamps() {
		logger.info("Enter method BerlinClockMinuteBuilder.buildLamps");

		Lamp[] minuteTwoArray = CommonUtil.populateSingleColoredLampArray(CommonConstants.TOTAL_LAMPS_IN_HOUR_ROWS, berlinClock.getMinuteRowTwo(), Lamp.YELLOW);
		Lamp[] minuteOneArray = CommonUtil.populateMultiColoredLampArray(11, berlinClock.getMinuteRowOne(), 3, Lamp.YELLOW, Lamp.RED);
		
		logger.info("Enter method BerlinClockMinuteBuilder.buildLamps");

		return CommonUtil.getDisplayLamps(minuteOneArray).concat(System.lineSeparator()).concat(CommonUtil.getDisplayLamps(minuteTwoArray));
    }
}
