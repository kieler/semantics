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
package de.cau.cs.kieler.scg.transformations.sequentializer

import de.cau.cs.kieler.scg.transformations.sequentializer.SimpleGuardSequentializer
import de.cau.cs.kieler.scg.transformations.SCGTransformations
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.ScgFactory
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions

/**
 * @author ssm
 * @kieler.design 2016-06-21 proposed 
 * @kieler.rating 2016-06-21 proposed yellow
 *
 */
class DCGuardSequentializer extends SimpleGuardSequentializer {

    @Inject extension AnnotationsExtensions

    override getId() {
        return SCGTransformations::DC_SEQUENTIALIZE_ID
    }

    override getName() {
        return SCGTransformations::DC_SEQUENTIALIZE_ID
    }

    override getProducedFeatureId() {
        return SCGFeatures::DC_SEQUENTIALIZE_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::SCHEDULING_ID)
    }
    
     override def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        val newSCG = ScgFactory::eINSTANCE.createSCGraph => [
            annotations += createStringAnnotation(SCGFeatures.SEQUENTIALIZE_ID, SCGFeatures.SEQUENTIALIZE_NAME)
            label = scg.label
        ]  
        
        newSCG       
     }    
}