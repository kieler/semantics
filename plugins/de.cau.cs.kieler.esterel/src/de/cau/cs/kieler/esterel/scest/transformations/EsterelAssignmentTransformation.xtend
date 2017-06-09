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
package de.cau.cs.kieler.esterel.scest.transformations

import de.cau.cs.kieler.esterel.scest.features.SCEstFeature
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram

/**
 * @author mrb
 *
 */
class EsterelAssignmentTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::ESTERELASSIGNMENT_ID
    }

    override getName() {
        return SCEstTransformation::ESTERELASSIGNMENT_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::ESTERELASSIGNMENT_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::ENTRY_ID,
//            SCEstTransformation::CONNECTOR_ID)
//    }
//
//    override getNotHandlesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::COUNTDELAY_ID, SCEstTransformation::COMPLEXFINALSTATE_ID, SCEstTransformation::HISTORY_ID,
//            SCEstTransformation::EXPANSION_ID)
//    }

    def SCEstProgram transform(SCEstProgram prog) {
        return prog
    }
    
}