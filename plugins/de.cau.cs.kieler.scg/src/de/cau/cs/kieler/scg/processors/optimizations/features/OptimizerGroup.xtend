/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

/**
 * Optimizier Feature Group.
 * 
 * @author jbus
 * @kieler.design 
 * @kieler.rating 
 */
 
package de.cau.cs.kieler.scg.processors.optimizations.features;

import de.cau.cs.kieler.kico.features.FeatureGroup

class OptimizerGroup extends FeatureGroup {
    
    override getId() {
        return OptimizerGroupFeatures::GROUP_ID
    }
    
    override getName() {
        return OptimizerGroupFeatures::GROUP_NAME
    }
    
    override getFeatureIds() {
        newHashSet(OptimizerFeatures::CP_ID, OptimizerFeatures::RV_ID)
    }
    
}