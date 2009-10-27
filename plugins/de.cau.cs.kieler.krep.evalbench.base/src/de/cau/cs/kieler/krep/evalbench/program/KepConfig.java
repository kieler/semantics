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
 * @author ctr configuration of the Kiel Esterel Processor
 * 
 */
public class KepConfig implements Config {

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
     * @param nSignals
     *            the number of signals
     */
    public void setnSignals(final int nSignals) {
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
    public void setnThread(final int nThread) {
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
    public void setWidthCounter(final int widthCounter) {
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
    public void setlTick(final int lTick) {
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
    public void setMaxROM(final int maxROM) {
        this.maxROM = maxROM;
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
