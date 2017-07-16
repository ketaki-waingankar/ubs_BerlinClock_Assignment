package com.ubs.opsit.types;

/**
 * Enum to hold Lamp states.
 * 
 * @author ketaki-waingankar
 *
 */
public enum Lamp {
	YELLOW ("Y"), RED ("R"), OFF("O");
	
	/**
	 * String representation of Lamp state.
	 */
	private String lampState;
	
	/**
	 * @param lampState
	 */
	private Lamp(String lampState) {
		this.lampState = lampState;
	}

	/**
	 * @return the lampState
	 */
	public String getLampState() {
		return lampState;
	}
}
