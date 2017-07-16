package com.ubs.opsit.builders;

import com.ubs.opsit.types.BerlinClock;

/**
 * Abstract builder class to display lamps.
 *  
 * @author ketaki-waingankar
 *
 */
public abstract class AbstractBerlinClockBuilder {
    /**
     * BerlinClock object to hold structure of lamps on graphic clock.
     */
    protected BerlinClock berlinClock;
    
    /**
     * Abstract method that constructs graphic display of lamps for this builder.
     * 
     * @return String
     */
    public abstract String buildLamps();
}
