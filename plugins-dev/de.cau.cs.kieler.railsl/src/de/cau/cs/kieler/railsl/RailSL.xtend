/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.railsl

import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.railsl.railSL.Program

/**
 * @author Philip Eumann (peu) - stu121235@mail.uni-kiel.de
 */
class RailSL extends Feature {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return RailSLFeatures::BASIC_ID
    }

    override getName() {
        return RailSLFeatures::BASIC_NAME
    }

    //-------------------------------------------------------------------------

    // This method checks, if this feature is contained in a model
    def isContained(Program railSL) {
        return true
    }
}