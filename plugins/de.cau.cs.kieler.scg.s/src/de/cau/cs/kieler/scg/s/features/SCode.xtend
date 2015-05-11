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
package de.cau.cs.kieler.scg.s.features

import de.cau.cs.kieler.kico.Feature
import de.cau.cs.kieler.s.s.Program

/**
 * S Code Feature.
 * 
 * @author als
 * @kieler.design 2015-04-27 proposed 
 * @kieler.rating 2015-04-27 proposed yellow
 *
 */
class SCode extends Feature {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return CodeGenerationFeatures::S_CODE_ID
    }

    override getName() {
        return CodeGenerationFeatures::S_CODE_NAME
    }

    // This method checks, if this feature is contained in a model
    def isContained(Program s) {
        // All S Programs are S code ^^
        return true
    }
}
