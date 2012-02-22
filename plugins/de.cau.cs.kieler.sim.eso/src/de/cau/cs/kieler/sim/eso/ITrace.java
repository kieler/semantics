/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.eso;

import java.util.Iterator;
import java.util.Set;

/**
 * Generic interface for traces, ie, a list of ticks.
 * 
 * @author ctr
 * 
 */
public interface ITrace extends Iterator<ITick>{
    /**
     * Activate and return the next tick of the trace, or null if no further tick exists.
     * 
     * @return the next tick in the list
     */
    ITick next();

    /**
     * 
     * @return true if the trace has another tick
     */
    boolean hasNext();

    /**
     * Returns the current tick of the trace, without switching to the next tick.
     * 
     * @return the current tick
     */
    ITick current();
    
    /**
     * Get a specific tick
     * 
     * @param index the index of the requested tick
     * @return the requested tick
     */
    public ITick get(long index) throws IndexOutOfBoundsException;
    
    /**
     * Get the number of ticks this trace includes
     * 
     * @return the number of ticks this trace includes
     */
    public int getSize();

    /**
     * 
     * @return number of remaining ticks
     */
    int getRemaining();

    /**
     * Reset the trace, ie, set initial tick as current.
     */
    void reset();

    /**
     * Take all signals that are defined by the trace, either input or output.
     * 
     * @return all signals that all defined by the trace
     */
    Set<String> getSignals();
    
    Set<String> getOutputs();
}
