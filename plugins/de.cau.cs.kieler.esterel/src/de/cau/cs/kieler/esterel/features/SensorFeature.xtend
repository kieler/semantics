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
package de.cau.cs.kieler.esterel.features

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.SensorDeclaration
import de.cau.cs.kieler.kico.features.Feature

/**
 * @author mrb
 *
 */
class SensorFeature extends Feature {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCEstFeature::SENSOR_ID
    }
    
    override getName() {
        return SCEstFeature::SENSOR_NAME
    }
    
    def isContained(EsterelProgram program) {
        !program.eAllContents.filter(SensorDeclaration).empty
    }
    
}