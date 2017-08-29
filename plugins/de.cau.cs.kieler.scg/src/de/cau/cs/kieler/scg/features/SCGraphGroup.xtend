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
package de.cau.cs.kieler.scg.features

import de.cau.cs.kieler.kico.features.FeatureGroup

/**
 * @author als ssm
 *
 */
class SCGraphGroup extends FeatureGroup {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCGFeatureGroups::SCG_ID
    }

    override getName() {
        return SCGFeatureGroups::SCG_NAME
    }

    override getFeatureIds() {
        newHashSet(
        	SCGFeatures::BASIC_ID, 
        	SCGFeatures::DEPENDENCY_ID, 
        	SCGFeatures::STRUCTURALDEPTHJOIN_ID,
        	SCGFeatures::BASICBLOCK_ID, 
        	SCGFeatures::GUARD_EXPRESSIONS_ID, 
        	SCGFeatures::GUARDS_ID,
        	SCGFeatures::SCHEDULING_ID, 
        	SCGFeatures::SEQUENTIALIZE_ID
        )
    }
    
}