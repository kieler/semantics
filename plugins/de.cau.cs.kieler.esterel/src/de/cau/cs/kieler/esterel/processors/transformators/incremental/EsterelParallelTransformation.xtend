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
package de.cau.cs.kieler.esterel.processors.transformators.incremental

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelThread
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class EsterelParallelTransformation extends AbstractSCEstDynamicProcessor<EsterelParallel> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.parallel"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Parallel"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override transform(EsterelParallel parallel) {
        val newParallel = createParallel
        for (t : parallel.statements) {
            newParallel.threads.add(createThread => [ statements.add((t as EsterelThread).statements) ])
        }
        parallel.replace(newParallel)
        lastStatement = newParallel
    }
    
}