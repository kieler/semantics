/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.features

import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.esterel.esterel.Program

/**
 * Esterel Feature.
 * 
 * @author ssm
 * @kieler.design 2015-05-30 proposed 
 * @kieler.rating 2015-05-30 proposed yellow
 *
 */
class Esterel extends Feature {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return EsterelFeature::BASIC_ID
    }

    override getName() {
        return EsterelFeature::BASIC_NAME
    }

    //-------------------------------------------------------------------------

    // This method checks, if this feature is contained in a model
    def isContained(Program program) {
        return true
    }
}