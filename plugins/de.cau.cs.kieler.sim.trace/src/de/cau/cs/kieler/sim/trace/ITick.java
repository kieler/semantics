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

import java.util.List;

/**
 * @author ctr
 * 
 */
public interface ITick {
    /**
     * Get input signals of the tick. A signal is absent if it is either not in the list, or if its
     * status is false.
     * 
     * @return all input signals
     */
    List<Signal> getInputs();
  
    /**
     * Get output signals of the tick. A signal is absent if it is either not in the list, or if its
     * status is false.
     * 
     * @return all output signals
     */
    List<Signal> getOutputs();
}
