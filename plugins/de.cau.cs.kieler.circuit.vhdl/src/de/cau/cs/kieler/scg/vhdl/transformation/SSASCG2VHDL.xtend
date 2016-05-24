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
package de.cau.cs.kieler.scg.vhdl.transformation

import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.circuit.features.CircuitFeatures
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Node

/**
 * Transformation of Circuit into VHDL code.
 * 
 * @author cmot 
 * @kieler.design 2016-02-08 proposed cmot
 * @kieler.rating 2016-02-08 yellow 
 */
class SSASCG2VHDL extends AbstractProductionTransformation { 

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return VHDLTransformation::VHDL_ID
    } 

    override getName() {
        return VHDLTransformation::VHDL_NAME
    }

    override getProducedFeatureId() {
        return VHDLTransformation::VHDL_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(CircuitFeatures::SCG2SSASCG_ID)
    }

    // -------------------------------------------------------------------------   
    // General method to create the VHDL code
    def transform(SCGraph scg) {

        '''ENTITY scgcircuit IS
        ''' + 

        '''PORT(
        -- control
        tick: IN std_logic
        reset: IN boolean;
        -- inputs
        ''' + 
        //TODO: ADD ALL INPUTS HERE
'''        -- outputs
        ''' + 
        //TODO: ADD ALL OUTPUTS HERE
''');
END scgcircuit;
        
        
        
ARCHITECTURE behavior of scgcircuit IS 
        ''' + '''
        begin
                -- main logic
        ''' + '''
            «FOR innerActor : scg.eAllContents.filter(Node).toList»
                «innerActor.transformChilds»
            «ENDFOR»
        ''' + '''
        end behavior'''
    }

    // -------------------------------------------------------------------------   
    // Method for all child actors of circuit components
    def transformChilds(Node node) {
        // Filter only guards
        //if (node == null || node. .name == null || (!actor.name.startsWith("g"))) {
        //    return ''''''
        //}
        // TODO: For all guard-actors derive correct VHDL expressions here (GO_local is just a place holder)
        //return '''        «actor.name» <= GO_local'''
        
        return '''node'''+ node.hashCode
    }

// -------------------------------------------------------------------------   
}
