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
package de.cau.cs.kieler.esterel.scest.featuregroups

import com.google.common.collect.Sets
import de.cau.cs.kieler.kico.features.FeatureGroup
import de.cau.cs.kieler.esterel.scest.features.SCEstFeature

/**
 * @author mrb
 *
 */
class SCEstSignalHandlingStatements extends FeatureGroup {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCEstFeatureGroup::SCESTSIGNALHANDLINGSTATEMENTS_ID
    }

    override getName() {
        return SCEstFeatureGroup::SCESTSIGNALHANDLINGSTATEMENTS_NAME
    }

    override getFeatureIds() {
        Sets.newHashSet(
             SCEstFeature::PRESENT_ID,
             SCEstFeature::LOCALSIGNALDECL_ID,
             SCEstFeature::LOCALVARIABLE_ID,
             SCEstFeature::EMIT_ID,
             SCEstFeature::UNEMIT_ID,
             SCEstFeature::ESTERELASSIGNMENT_ID,
             SCEstFeature::IFTEST_ID,
             SCEstFeature::SUSTAIN_ID
        )
    }
}