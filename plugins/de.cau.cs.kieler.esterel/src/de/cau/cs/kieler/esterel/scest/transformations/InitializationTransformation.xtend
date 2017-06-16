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
import com.google.inject.Inject
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension

/**
 * @author mrb
 *
 */
class InitializationTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::INITIALIZATION_ID
    }

    override getName() {
        return SCEstTransformation::INITIALIZATION_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::INITIALIZATION_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::)
//    }
//
//    override getNotHandlesFeatureIds() {
//        return Sets.newHashSet()
//    }

    @Inject
    extension SCEstExtension

    def SCEstProgram transform(SCEstProgram prog) {
        resetLabelSuffix
        resetConstantSuffix
        resetVariableSuffix
        return prog
    }
}