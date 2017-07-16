package com.ubs.opsit.builders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ubs.opsit.types.BerlinClock;
import com.ubs.opsit.types.Lamp;

/**
 * Concrete builder class to display lamps for seconds.
 *  
 * @author ketaki-waingankar
 *
 */
public class BerlinClockSecondBuilder extends AbstractBerlinClockBuilder {
	
	private final static Logger logger = LoggerFactory.getLogger(BerlinClockSecondBuilder.class);

	/**
	 * BerlinClock object to hold structure of lamps on graphic clock.
	 * 
	 * @param berlinClock
	 */
	public BerlinClockSecondBuilder(BerlinClock berlinClock) {
		this.berlinClock = berlinClock;
	}
	
	/* (non-Javadoc)
	 * @see com.ubs.opsit.builders.AbstractBerlinClockBuilder#buildLamps()
	 */
	@Override
	public String buildLamps() {
		logger.info("Enter method BerlinClockSecondBuilder.buildLamps");
		Lamp second = berlinClock.isSecondLamp() ? Lamp.YELLOW : Lamp.OFF;
		logger.info("Enter method BerlinClockSecondBuilder.buildLamps");
		
		return second.getLampState();
    }
}
