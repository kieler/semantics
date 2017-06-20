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
package de.cau.cs.kieler.railsl

import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.generator.RailSLGenerator
import org.eclipse.emf.ecore.EObject
import java.util.Set
import com.google.common.collect.Sets
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import com.google.inject.Inject
import de.cau.cs.kieler.railSL.Program

/**
 * @author Philip Eumann (peu) - stu121235@mail.uni-kiel.de
 *
 */
class RailSLTransformation extends AbstractProductionTransformation implements Traceable {
    
    @Inject extension RailSLGenerator
    
    override getProducedFeatureId() {
        return "REFERENCE"
    }
    
    override getId() {
        return "RailSLTransformation"
    }
    
    override Set<String> getRequiredFeatureIds() {
        return Sets.newHashSet(RailSLFeatures.BASIC_ID)
    }    
    
    override transform(EObject eObject) {
        return (eObject as Program).railSLtoSCChart
    }
    
}
