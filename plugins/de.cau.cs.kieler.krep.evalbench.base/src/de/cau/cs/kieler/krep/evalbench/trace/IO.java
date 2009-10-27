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
package de.cau.cs.kieler.krep.evalbench.trace;

/**
 * distinguishes the kinds of signal that are stored in a trace.
 * 
 * @author ctr
 * 
 */
public enum IO {
    /**
     * Input signals.
     */
    INPUT,
    /**
     * Output signals.
     */
    OUTPUT,
    /**
     * Reference value for output signals.
     */
    SAVED_OUTPUT
}
