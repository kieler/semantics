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
package de.cau.cs.kieler.c.sccharts.transformation

import de.cau.cs.kieler.kico.features.Feature

/**
 * @author SL
 *
 */
class TransitionFeature extends Feature {
    
    override getId() {
        val String id = "c.immediateTrans"
        return id
    }
    
    override getName() {
        val String name = "ImmTrans"
        return name
    }
    
}