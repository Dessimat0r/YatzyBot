// YatzyBot, licensed using GPLv3.
// =================================================
// Contributions to this file from:
// * Chris Dennett (dessimat0r@gmail.com)

package org.overlord.yahtzee;

//********************************************************************
//  Die.java       Author: Lewis/Loftus
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and 6.
//********************************************************************

public class Die implements Comparable<Die> {
	public static final int MAX = 6; // maximum face value

	private int faceValue; // current value showing on the die

	// -----------------------------------------------------------------
	// Constructor: Sets the initial face value.
	// -----------------------------------------------------------------
	public Die() {
		faceValue = 1;
	}

	// -----------------------------------------------------------------
	// Rolls the die and returns the result.
	// -----------------------------------------------------------------
	public int roll() {
		faceValue = (int) (Math.random() * MAX) + 1;

		return faceValue;
	}

	// -----------------------------------------------------------------
	// Face value mutator.
	// -----------------------------------------------------------------
	public void setFaceValue(int value) {
		faceValue = value;
	}

	// -----------------------------------------------------------------
	// Face value accessor.
	// -----------------------------------------------------------------
	public int getFaceValue() {
		return faceValue;
	}
	
	public int reset() {
		return faceValue = 1;
	}

	// -----------------------------------------------------------------
	// Returns a string representation of this die.
	// -----------------------------------------------------------------
	public String toString() {
		String result = Integer.toString(faceValue);
		return result;
	}

	@Override
	public int compareTo(Die o) {
		if (o == null) throw new IllegalArgumentException("compareTo arg is null");
		return Integer.compare(getFaceValue(), o.getFaceValue());
	}
}