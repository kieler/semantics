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
package de.cau.cs.kieler.scg.features

import de.cau.cs.kieler.kico.features.Feature

/**
 * @author ssm
 *
 */
class C extends Feature {
    
    override getId() {
        return SCGFeatures.C_ID
    }
    
    override getName() {
        return SCGFeatures.C_NAME
    }    
    
    def isContained(String targetCode) {
        //TODO: maybe find a better criteria than just instance check for string to determine if it is target code
        return true
    }    
    
}