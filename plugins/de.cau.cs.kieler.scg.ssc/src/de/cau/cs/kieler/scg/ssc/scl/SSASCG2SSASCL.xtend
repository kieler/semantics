/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.scl

import com.google.inject.Inject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ssc.features.SSASCLFeature
import de.cau.cs.kieler.scg.ssc.features.SSASeqConcFeature

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSASCG2SSASCL extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg2scl"
    }

    override getName() {
        return "SSA-SCL"
    }

    override getProducedFeatureId() {
        return SSASCLFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SSASeqConcFeature.ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------

    @Inject
    extension SSAbasedSCG2SCL trans

    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    
    
    def transform(SCGraph scg, KielerCompilerContext context) {
        trans.context = context
        val scl = scg.transformSCGToSCL
        return scl
    }
  
}
