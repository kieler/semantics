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
package de.cau.cs.kieler.sim.trace;

import java.util.Iterator;
import java.util.Set;

/**
 * Generic interface for a list of traces, as for example defined by an Esi/ Eso file.
 * 
 * @author ctr
 * 
 */
public interface ITraceList extends Iterator<ITrace> {

    ITrace next();

    boolean hasNext();

    /**
     * Return the current tick without activating the next one.
     * 
     * @return the current tick
     */
    ITrace current();

    /**
     * Return the number of remaining traces after the current one.
     * 
     * @return number of remaining traces.
     */
    int getRemaining();

    /**
     * @return all inputs defined by the traces.
     */
    Set<String> getInputs();
    
    /**
     * @return all outputs defined by the traces.
     */
    Set<String> getOutputs();

}
