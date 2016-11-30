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

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.scg.SCGraph

/**
 * SCG Blank Feature.
 * 
 * @author als
 * @kieler.design 2015-04-27 proposed 
 * @kieler.rating 2015-04-27 proposed yellow
 *
 */
class Basic extends Feature {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCGFeatures::BASIC_ID
    }

    override getName() {
        return SCGFeatures::BASIC_NAME
    }

    //-------------------------------------------------------------------------
    @Inject
    extension AnnotationsExtensions

    // This method checks, if this feature is contained in a model
    def isContained(SCGraph scg) {

        //A SCG is blank if none of the other transformation features is present
        return !(
                scg.hasAnnotation(SCGFeatures::DEPENDENCY_ID) ||
                scg.hasAnnotation(SCGFeatures::BASICBLOCK_ID) || 
                scg.hasAnnotation(SCGFeatures::GUARD_EXPRESSIONS_ID) ||
                scg.hasAnnotation(SCGFeatures::SCHEDULING_ID) ||
                scg.hasAnnotation(SCGFeatures::SEQUENTIALIZE_ID)
                )
    }
}
