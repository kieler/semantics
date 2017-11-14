/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.trace.printer

import de.cau.cs.kieler.simulation.core.DataPool
import java.util.List

/**
 * @author aas
 *
 */
abstract class TracePrinter {
    /**
     * The content of the file to be created for the given list of data pools.
     * 
     * @param history The history of data pools in this simulation run
     * @return the content of the file to be created
     */
    public def String getFileContent(List<DataPool> history)
    
    /**
     * Returns the file extension of the file to be created.
     * 
     * @return the file extension of the file to be created
     */
    public def String getFileExtension()
}