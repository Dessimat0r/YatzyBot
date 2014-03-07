// YatzyBot, licensed using GPLv3.
// =================================================
// Contributions to this file from:
// * Chris Dennett (dessimat0r@gmail.com)

package org.overlord.yahtzee;

public abstract class YatzyException extends Exception {
	public YatzyException() {
	}

	public YatzyException(String arg0) {
		super(arg0);
	}

	public YatzyException(Throwable arg0) {
		super(arg0);
	}

	public YatzyException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
