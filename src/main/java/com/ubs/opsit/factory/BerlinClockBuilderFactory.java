package com.ubs.opsit.factory;

import com.ubs.opsit.builders.BerlinClockHourBuilder;
import com.ubs.opsit.builders.BerlinClockMinuteBuilder;
import com.ubs.opsit.builders.BerlinClockSecondBuilder;
import com.ubs.opsit.types.BerlinClock;

/**
 * @author user
 *
 */
public class BerlinClockBuilderFactory {
	
	/**
	 * @param berlinClock
	 * @return String
	 */
	public static String createGraphicBerlinClock (BerlinClock berlinClock) {
		return new BerlinClockSecondBuilder(berlinClock).buildLamps().concat(System.lineSeparator()).concat(new BerlinClockHourBuilder(berlinClock).buildLamps()).concat(System.lineSeparator()).concat(new BerlinClockMinuteBuilder(berlinClock).buildLamps());
    }
	
}
