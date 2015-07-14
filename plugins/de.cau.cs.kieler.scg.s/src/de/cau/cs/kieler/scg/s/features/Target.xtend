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
package de.cau.cs.kieler.scg.s.features

import de.cau.cs.kieler.kico.features.Feature

/**
 * SCG BasicBlock Feature.
 * 
 * @author als
 * @kieler.design 2015-04-27 proposed 
 * @kieler.rating 2015-04-27 proposed yellow
 *
 */
class Target extends Feature {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return CodeGenerationFeatures::TARGET_ID
    }

    override getName() {
        return CodeGenerationFeatures::TARGET_NAME
    }

    // This method checks, if this feature is contained in a model
    def isContained(String targetCode) {

        //TODO: maybe find a better criteria than just instance check for string to determine if it is target code
        return true
    }
}