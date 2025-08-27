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

import org.eclipse.core.resources.IFile

/**
 * This listener can be used to be notified before an executable is deleted because of a newer simulation compilation.
 * 
 * The Eclipse Resources API does not fire an PRE_DELETE Resource Change Event for the compiled file,
 * so it is implemented here manually.
 * 
 * @author aas
 *
 */
abstract class SimulationCompilerListener {
    /**
     * Fired before the given executable file is deleted to be replaced by a new one.
     */  
    public def void preDelete(IFile oldExecutable)
    
    /**
     * Fired after the compilation finished
     */
    public def void afterCompilation(SimulationCompiler compiler) 
}