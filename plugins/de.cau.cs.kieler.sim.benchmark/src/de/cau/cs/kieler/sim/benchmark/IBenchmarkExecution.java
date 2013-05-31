/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.benchmark;

/**
 * This Benchmark interface provides basic access methods for benchmark access methods.
 * 
 * @author cmot
 * @kieler.design 2012-11-28 proposed
 * @kieler.rating 2012-11-28 proposed
 * 
 */
public interface IBenchmarkExecution {

    /**
     * Gets the current accumulated differential cycles or time. These are/is measured before and
     * after each tick() computation iff measuring is set to true.
     * 
     * @return the cycles
     */
    public int getCyclesOrTime();
    
    // -------------------------------------------------------------------------
    

    /**
     * Reset the cycle or time counter for cycle counting or time measurement.
     * 
     */
    public void resetCyclesOrTime();

    // -------------------------------------------------------------------------

    /**
     * Gets the source file size.
     * 
     * @return the source file size
     */
    public long getSourceFileSize();

    // -------------------------------------------------------------------------
    
    /**
     * Gets the executable file size.
     * 
     * @return the executable file size
     */
    public long getExecutableFileSize();

    // -------------------------------------------------------------------------

    /**
     * Checks if is cycle count or time.
     * 
     * @return the cycleCountOrTime
     */
    public boolean isCycleCountOrTime();

    // -------------------------------------------------------------------------

    /**
     * Sets the cycle count or time.
     * 
     * @param cycleCountOrTime
     *            the cycleCountOrTime to set
     */
    public void setCycleCountOrTime(final boolean cycleCountOrTime);

    // -------------------------------------------------------------------------
    
}
