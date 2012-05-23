/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals.ui.views;

import java.util.HashMap;

import org.eclipse.swt.graphics.RGB;

/**
 * The Colors can be used to customize the colors for the SignalsPlotter.<BR>
 * <BR>
 * RGB myColor = new RGB(0, 255, 0);<BR>
 * // color tick 4 of signal B<BR>
 * colors.setSignalColor("B", myColor , 4);<BR>
 * <BR>
 * // color tick 2 and 3 of signal A<BR>
 * colors.setSignalColor("A", myColor , 2);<BR>
 * colors.setSignalColor("A", myColor , 3);<BR>
 * <BR>
 * // color ALL ticks of signal S2<BR>
 * colors.setSignalColor("S2", myColor );<BR>
 * <BR>
 * 
 * @author cmot
 */
public class Colors {

	/** The color constants. */
	private RGB backgroundColor = new RGB(0, 0, 0); // black
	private RGB signalColor1 = new RGB(100, 100, 255); // light blue
	private RGB signalColor2 = new RGB(200, 200, 255); // lighter blue
	private RGB signalColor0 = new RGB(0, 0, 50); // dark blue
	private RGB signalColorMarker = new RGB(255, 0, 0); // red
	private RGB signalColorError = new RGB(255, 0, 255); // magenta

	/** The variable signal color hashmap for default/all ticks */
	private HashMap<String, RGB> signalColor = new HashMap<String, RGB>();

	/** The variable signal color hashmap for special ticks. */
	private HashMap<Integer, RGB> signalTickColor = new HashMap<Integer, RGB>();

	// -------------------------------------------------------------------------

	/**
	 * Gets the background color.
	 * 
	 * @return the background color
	 */
	public RGB getBackgroundColor() {
		return backgroundColor;
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets the background color.
	 * 
	 * @param backgroundColor
	 *            the new background color
	 */
	public void setBackgroundColor(RGB backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the signal color1. Signals are displayed alternately in two colors
	 * color1 and color2.
	 * 
	 * @return the signal color1
	 */
	public RGB getSignalColor1() {
		return signalColor1;
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets the signal color1. Signals are displayed alternately in two colors
	 * color1 and color2.
	 * 
	 * @param signalColor1
	 *            the new signal color1
	 */
	public void setSignalColor1(RGB signalColor1) {
		this.signalColor1 = signalColor1;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the signal color2.
	 * 
	 * @return the signalColor2. Signals are displayed alternately in two colors
	 *         color1 and color2.
	 */
	public RGB getSignalColor2() {
		return signalColor2;
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets the signal color2. Signals are displayed alternately in two colors
	 * color1 and color2.
	 * 
	 * @param signalColor2
	 *            the new signal color2
	 */
	public void setSignalColor2(RGB signalColor2) {
		this.signalColor2 = signalColor2;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the signal spare color that is used for absent signals.
	 * 
	 * @return the signal spare color
	 */
	public RGB getSignalSpareColor() {
		return signalColor0;
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets the signal spare color that is used for absent signals.
	 * 
	 * @param signalSpareColor
	 *            the new signal spare color
	 */
	public void setSignalSpareColor(RGB signalSpareColor) {
		this.signalColor0 = signalSpareColor;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the signal color marker that is used to mark the currently active
	 * signal.
	 * 
	 * @return the signalColorMarker
	 */
	public RGB getSignalColorMarker() {
		return signalColorMarker;
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets the signal color marker that is used to mark the currently active
	 * signal.
	 * 
	 * @param signalColorMarker
	 *            the signalColorMarker to set
	 */
	public void setSignalColorMarker(RGB signalColorMarker) {
		this.signalColorMarker = signalColorMarker;
	}

	// -------------------------------------------------------------------------
	
	/**
	 * Gets the signal color error that is used to mark the currently erroneous
	 * signal.
	 * 
	 * @return the signalColorError
	 */
	public RGB getSignalColorError() {
		return signalColorError;
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets the signal color error that is used to mark the currently erroneous
	 * signal.
	 * 
	 * @param signalColorMarker
	 *            the signalColorMarker to set
	 */
	public void setSignalColorError(RGB signalColorError) {
		this.signalColorError = signalColorError;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the signal color HashMap with individual signal colors.
	 * 
	 * @return the signalColor
	 */
	public HashMap<String, RGB> getSignalColor() {
		return signalColor;
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets the signal color HashMap with individual signal colors.
	 * 
	 * @param signalColor
	 *            the signalColor to set
	 */
	public void setSignalColor(HashMap<String, RGB> signalColor) {
		this.signalColor = signalColor;
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets a specific individual color for a signal identified by its name.
	 * 
	 * @param signalColor
	 *            the signalColor to set
	 */
	public void setSignalColor(String signalName, RGB signalColor) {
		this.signalColor.put(signalName, signalColor);
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets a specific individual color for a specific tick for a signal
	 * identified by its name.
	 * 
	 * @param signalColor
	 *            the signalColor to set
	 */
	public void setSignalColor(String signalName, RGB signalColor, long tick) {
		this.signalTickColor.put((signalName + tick).hashCode(), signalColor);
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets a specific individual color for a specific tick for a signal
	 * identified by its name.
	 * 
	 * @param signalColor
	 *            the signalColor to set
	 */
	public RGB getSignalColor(String signalName, long tick, RGB defaultColor) {
		int key = (signalName + tick).hashCode();
		if (!(this.signalTickColor.containsKey(key))) {
			if (!(this.signalColor.containsKey(signalName))) {
				return defaultColor;
			}
			return this.signalTickColor.get(signalName);
		}
		return this.signalTickColor.get(key);
	}

	// -------------------------------------------------------------------------

	/**
	 * Reset all signal and tick specific signal colors.
	 * 
	 * @param signalName
	 *            the signal name
	 * @param tick
	 *            the tick
	 */
	public void resetSignalColor(String signalName, long tick) {
		int key = (signalName + tick).hashCode();
		if ((this.signalTickColor.containsKey(key))) {
			this.signalTickColor.remove(key);
		}
	}

	// -------------------------------------------------------------------------

	/**
	 * Reset all signal specific signal colors.
	 * 
	 * @param signalName
	 *            the signal name
	 */
	public void resetSignalColor(String signalName) {
		this.signalColor.remove(signalName);
	}

	// -------------------------------------------------------------------------

	/**
	 * Reset all signal colors, both, the signal and tick specific ones and the
	 * signal specific ones..
	 */
	public void resetSignalColor() {
		this.signalTickColor.clear();
		this.signalColor.clear();
	}

	// -------------------------------------------------------------------------

}
