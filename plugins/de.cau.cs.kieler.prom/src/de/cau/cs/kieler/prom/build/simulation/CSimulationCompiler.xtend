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
package de.cau.cs.kieler.prom.build.simulation

import org.eclipse.core.runtime.IProgressMonitor

/**
 * Compiles C code for the simulation.
 * 
 * @author aas
 *
 */
class CSimulationCompiler extends SimulationCompiler {
    
    /**
     * The default command to compile C code using the gcc.
     */
    private static val DEFAULT_COMMAND = "gcc -std=c99 -Werror=int-conversion -o \"./${outputFolder}/${executable_name}\" \"${file_path}\" "
    
    /**
     * Constructor
     */
    new() {
        command.value = DEFAULT_COMMAND
    }
    
    /**
     * Constructor
     * 
     * @param monitor The monitor
     */
    new(IProgressMonitor monitor) {
        super(monitor)
    }
    
    /**
     * {@inheritDoc}
     */
    override getSupportedFileExtensions() {
        return #["c"]
    }
    
    /**
     * {@inheritDoc}
     */
    override getLibFolderOrigin() {
        return "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/cJSON"
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return "C Simulation compiler"
    }
}