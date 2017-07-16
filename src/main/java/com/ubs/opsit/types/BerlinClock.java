package com.ubs.opsit.types;

/**
 * BerlinClock class for structure of Graphic Berlin Clock.
 * 
 * @author ketaki-waingankar
 *
 */
public class BerlinClock {
	
	private boolean secondLamp;
	private Integer hourRowOne;
	private Integer hourRowTwo;
	private Integer minuteRowOne;
	private Integer minuteRowTwo;
	
	/**
	 * Default constructor
	 */
	public BerlinClock () {
		
	}
	
	/**
	 * Parameterized Constructor.
	 * 
	 * @param secondLamp
	 * @param hourRowOne
	 * @param hourRowTwo
	 * @param minuteRowOne
	 * @param minuteRowTwo
	 */
	public BerlinClock (boolean secondLamp, Integer hourRowOne, Integer hourRowTwo, Integer minuteRowOne, Integer minuteRowTwo) {
		this.secondLamp = secondLamp;
		this.hourRowOne = hourRowOne;
		this.hourRowTwo = hourRowTwo;
		this.minuteRowOne = minuteRowOne;
		this.minuteRowTwo = minuteRowTwo;
	}

	/**
	 * @return the secondLamp
	 */
	public boolean isSecondLamp() {
		return secondLamp;
	}

	/**
	 * @param secondLamp the secondLamp to set
	 */
	public void setSecondLamp(boolean secondLamp) {
		this.secondLamp = secondLamp;
	}

	/**
	 * @return the hourRowOne
	 */
	public Integer getHourRowOne() {
		return hourRowOne;
	}

	/**
	 * @param hourRowOne the hourRowOne to set
	 */
	public void setHourRowOne(Integer hourRowOne) {
		this.hourRowOne = hourRowOne;
	}

	/**
	 * @return the hourRowTwo
	 */
	public Integer getHourRowTwo() {
		return hourRowTwo;
	}

	/**
	 * @param hourRowTwo the hourRowTwo to set
	 */
	public void setHourRowTwo(Integer hourRowTwo) {
		this.hourRowTwo = hourRowTwo;
	}

	/**
	 * @return the minuteRowOne
	 */
	public Integer getMinuteRowOne() {
		return minuteRowOne;
	}

	/**
	 * @param minuteRowOne the minuteRowOne to set
	 */
	public void setMinuteRowOne(Integer minuteRowOne) {
		this.minuteRowOne = minuteRowOne;
	}

	/**
	 * @return the minuteRowTwo
	 */
	public Integer getMinuteRowTwo() {
		return minuteRowTwo;
	}

	/**
	 * @param minuteRowTwo the minuteRowTwo to set
	 */
	public void setMinuteRowTwo(Integer minuteRowTwo) {
		this.minuteRowTwo = minuteRowTwo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hourRowOne == null) ? 0 : hourRowOne.hashCode());
		result = prime * result + ((hourRowTwo == null) ? 0 : hourRowTwo.hashCode());
		result = prime * result + ((minuteRowOne == null) ? 0 : minuteRowOne.hashCode());
		result = prime * result + ((minuteRowTwo == null) ? 0 : minuteRowTwo.hashCode());
		result = prime * result + (secondLamp ? 1231 : 1237);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BerlinClock other = (BerlinClock) obj;
		if (hourRowOne == null) {
			if (other.hourRowOne != null)
				return false;
		} else if (!hourRowOne.equals(other.hourRowOne))
			return false;
		if (hourRowTwo == null) {
			if (other.hourRowTwo != null)
				return false;
		} else if (!hourRowTwo.equals(other.hourRowTwo))
			return false;
		if (minuteRowOne == null) {
			if (other.minuteRowOne != null)
				return false;
		} else if (!minuteRowOne.equals(other.minuteRowOne))
			return false;
		if (minuteRowTwo == null) {
			if (other.minuteRowTwo != null)
				return false;
		} else if (!minuteRowTwo.equals(other.minuteRowTwo))
			return false;
		if (secondLamp != other.secondLamp)
			return false;
		return true;
	}
}
