/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.core

/**
 * Default implementation of a data handler, where the write method does nothing.
 * 
 * @author aas
 *
 */
abstract class DataReader extends DefaultDataHandler {
    
    override write(DataPool pool) {
        // A data reader will not want to implement this.
    }
}