/******************************************************************************
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
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.comm;

import java.util.LinkedList;

/**
 * Listener for signal events which occur when a program tick is performed.
 * 
 * @author msp
 */
public interface ISignalListener {

    /**
     * Executed when a program tick is performed.
     * 
     * @param inputs
     *            global input signal status
     * @param outputs
     *            global output signal status
     */
    public void tickPerformed(LinkedList<Signal> inputs,
            LinkedList<Signal> outputs);

}
