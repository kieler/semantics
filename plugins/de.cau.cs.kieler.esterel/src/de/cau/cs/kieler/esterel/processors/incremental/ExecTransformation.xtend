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
package de.cau.cs.kieler.esterel.scest.transformations

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.processors.EsterelProcessor

/**
 * @author mrb
 *
 */
class ExecTransformation extends EsterelProcessor {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::EXEC_ID
    }

    override getName() {
        return SCEstTransformation::EXEC_NAME
    }

//    override getExpandsFeatureId() {
//        return SCEstFeature::EXEC_ID
//    }
//        
//    override getNotHandlesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::RUN_ID)
//    }

    override EsterelProgram transform(EsterelProgram prog) {
        return prog
    }
    
}