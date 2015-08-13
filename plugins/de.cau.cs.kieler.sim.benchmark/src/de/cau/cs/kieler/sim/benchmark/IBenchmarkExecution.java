/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
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
     * Checks if is cycle count or time measurement is turned on.
     * 
     * @return the cycleCountOrTime
     */
    public boolean isBenchmark();

    // -------------------------------------------------------------------------
    
}
