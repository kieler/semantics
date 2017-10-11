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
package de.cau.cs.kieler.prom.build

import org.eclipse.core.resources.IFile

/**
 * @author aas
 *
 */
abstract class SimulationCompilerListener {
    
    // The Eclipse Resources API does not fire an PRE_DELETE Resource Change Event for the compiled file,
    // so it is implemented here manually. 
    public def void preDelete(IFile oldExecutable)
}