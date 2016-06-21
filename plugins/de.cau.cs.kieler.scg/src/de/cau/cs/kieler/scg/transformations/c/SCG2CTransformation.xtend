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
package de.cau.cs.kieler.scg.transformations.c

import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.transformations.SCGTransformations
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kico.KielerCompilerContext

/**
 * @author ssm
 * @kieler.design 2016-06-21 proposed 
 * @kieler.rating 2016-06-21 proposed yellow 
 * 
 */
class SCG2CTransformation extends AbstractProductionTransformation {
    
    override getId() {
        return SCGTransformations.SCG2C_ID
    }

    override getName() {
        return SCGTransformations.SCG2C_NAME
    }

    override getProducedFeatureId() {
        return SCGFeatures.C_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures.SEQUENTIALIZE_ID)
    }
    
     public def String transform(SCGraph scg, KielerCompilerContext context) {
         "cout \"Hello World!\";"
     }    
    
}