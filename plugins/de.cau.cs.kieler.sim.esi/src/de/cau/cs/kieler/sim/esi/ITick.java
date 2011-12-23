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
package de.cau.cs.kieler.sim.esi;

import java.util.List;
import java.util.Map;

/**
 * @author ctr
 * @author Sebastian Schäfer - ssc AT informatik.uni-kiel.de
 * @kieler.rating 2011-11-30 red
 * 
 */
public interface ITick {
    /**
     * Get input signals of the tick. A signal is absent if it is either not in the list, or if its
     * status is false.
     * 
     * @return all input signals
     */
    List<ISignal> getInputs();
  
    /**
     * Get output signals of the tick. A signal is absent if it is either not in the list, or if its
     * status is false.
     * 
     * @return all output signals
     */
    List<ISignal> getOutputs();
    
    /**
     * Get extra information encoded as Key/Value pairs in the ESO file in this tick.
     * 
     * @return the state information. If none is available <code>null</code> is returned
     */
//    Map<String, String> getExtraInfos();
}
