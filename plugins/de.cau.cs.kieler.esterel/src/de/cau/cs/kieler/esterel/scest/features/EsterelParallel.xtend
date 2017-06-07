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
package de.cau.cs.kieler.esterel.scest.features

import com.google.inject.Inject
import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension

/**
 * @author mrb
 *
 */
class EsterelParallel extends Feature{
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCEstFeature::ESTERELPARALLEL_ID
    }
    
    override getName() {
        return SCEstFeature::ESTERELPARALLEL_NAME
    }
    
    @Inject
    extension SCEstExtension
    
    // This method checks, if this feature is contained in a model
    def isContained(SCEstProgram program) {
        for (module : program.modules) {
            for (statement : module.statements) {
                if (statement instanceof EsterelParallel) {
                    return true
                }
            }
        }
        return false
    }
    
}