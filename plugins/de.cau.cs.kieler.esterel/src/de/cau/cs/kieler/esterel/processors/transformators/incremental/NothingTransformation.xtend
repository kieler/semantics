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
import de.cau.cs.kieler.esterel.Nothing
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class NothingTransformation extends AbstractSCEstDynamicProcessor<Nothing>  {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    public static val ID = "de.cau.cs.kieler.esterel.processors.nothing"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Nothing"
    }

    @Inject
    extension EsterelTransformationExtensions
    
    override transform(Nothing nothing) {
        val l = createLabel
        nothing.replace(l)
        lastStatement = l
    }
    
}