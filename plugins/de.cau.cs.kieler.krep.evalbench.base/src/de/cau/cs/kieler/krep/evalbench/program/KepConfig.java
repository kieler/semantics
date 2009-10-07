/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program;

/**
 * @author ctr configuration of the Kiel Esterel Processor
 * 
 */
public class KepConfig extends Config {

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the nSignals
	 */
	public int getnSignals() {
		return nSignals;
	}

	/**
	 * @param nSignals
	 *            the nSignals to set
	 */
	public void setnSignals(int nSignals) {
		this.nSignals = nSignals;
	}

	/**
	 * @return the nThread
	 */
	public int getnThread() {
		return nThread;
	}

	/**
	 * @param nThread
	 *            the nThread to set
	 */
	public void setnThread(int nThread) {
		this.nThread = nThread;
	}

	/**
	 * @return the widthCounter
	 */
	public int getWidthCounter() {
		return widthCounter;
	}

	/**
	 * @param widthCounter
	 *            the widthCounter to set
	 */
	public void setWidthCounter(int widthCounter) {
		this.widthCounter = widthCounter;
	}

	/**
	 * @return the lTick
	 */
	public int getlTick() {
		return lTick;
	}

	/**
	 * @param lTick
	 *            the lTick to set
	 */
	public void setlTick(int lTick) {
		this.lTick = lTick;
	}

	/**
	 * @return the maxROM
	 */
	public int getMaxROM() {
		return maxROM;
	}

	/**
	 * @param maxROM
	 *            the maxROM to set
	 */
	public void setMaxROM(int maxROM) {
		this.maxROM = maxROM;
	}

	private String type;
	private int nSignals;
	private int nThread;
	private int widthCounter;
	private int lTick;
	private int maxROM;
}
