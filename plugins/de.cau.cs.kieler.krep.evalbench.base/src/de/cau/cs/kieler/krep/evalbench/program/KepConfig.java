/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.evalbench.program;

/**
 *  Configuration of the Kiel Esterel Processor.
 * 
 * @kieler.rating 2010-01-28 proposed yellow ctr
 * 
 * @author ctr
 * 
 */
public class KepConfig implements IConfig {

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param t
     *            the type to set
     */
    public void setType(final String t) {
        this.type = t;
    }

    /**
     * @return the nSignals
     */
    public int getnSignals() {
        return nSignals;
    }

    /**
     * @param nSig
     *            the number of signals
     */
    public void setnSignals(final int nSig) {
        this.nSignals = nSig;
    }

    /**
     * @return the nThread
     */
    public int getnThread() {
        return nThread;
    }

    /**
     * @param nThr
     *            the number of threads to set
     */
    public void setnThread(final int nThr) {
        this.nThread = nThr;
    }

    /**
     * @return the widthCounter
     */
    public int getWidthCounter() {
        return widthCounter;
    }

    /**
     * @param wCounter
     *            the counter width to set
     */
    public void setWidthCounter(final int wCounter) {
        this.widthCounter = wCounter;
    }

    /**
     * @return the lTick
     */
    public int getlTick() {
        return lTick;
    }

    /**
     * @param lT
     *            the length of a Tick to set
     */
    public void setlTick(final int lT) {
        this.lTick = lT;
    }

    /**
     * @return the maxROM
     */
    public int getMaxROM() {
        return maxROM;
    }

    /**
     * @param tMaxROM
     *            the tMaxROM to set
     */
    public void setMaxROM(final int tMaxROM) {
        this.maxROM = tMaxROM;
    }

    private String type;
    private int nSignals;
    private int nThread;
    private int widthCounter;
    private int lTick;
    private int maxROM;
    
    /**
     * {@inheritDoc}
     */
    public boolean isKEP() {
        return true;
    }
    
    /**
     * {@inheritDoc}
     */
    public boolean isKLP() {
        return false;
    }
}
