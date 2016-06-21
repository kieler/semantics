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
package de.cau.cs.kieler.scg.circuit.features

import de.cau.cs.kieler.kico.features.FeatureGroup

/**
 * Circuit Feature Group.
 * 
 * @author als
 * @kieler.design 2015-04-27 proposed 
 * @kieler.rating 2015-04-27 proposed yellow
 *
 */
class CircuitFeatureGroup extends FeatureGroup {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return CircuitFeatures::CIRCUIT_GROUP_ID
    }

    override getName() {
        return CircuitFeatures::CIRCUIT_GROUP_NAME
    }

    override getFeatureIds() {
        // TODO: Move Features/Featuregroups/IDs to kieler.circuit
        newHashSet(CircuitFeatures::CIRCUIT_ID, CircuitFeatures::SCG2SSASCG_ID, "VHDL")
    }
    
}