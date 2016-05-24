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
package de.cau.cs.kieler.scg.priorities

import de.cau.cs.kieler.kico.features.FeatureGroup
import de.cau.cs.kieler.scg.features.SCGFeatures

/**
 * @author lpe
 *
 */
class SCGPrioFeatureGroup extends FeatureGroup {
    
    override getId() {
        "scg.priorities"
    }
    
    override getName() {
        "SCG and Priorities"   
    }
    
    override getFeatureIds() {
        return newHashSet(SCGFeatures::BASIC_ID, SCGFeatures::DEPENDENCY_ID, "scg.scgPrio", "sclp.sclpTrans")
    }
    
}