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
package de.cau.cs.kieler.scg.priorities

import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.features.SCGFeatures
import javax.inject.Inject

/**
 * @author lpe
 *
 */
class SCGPriority extends AbstractProductionTransformation{
    
    @Inject
    extension StronglyConnectedComponentCalc
    
    override getProducedFeatureId() {
        "scg.scgPrio"
    }
    
    override getId() {
        "scg.scgPrio"
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::DEPENDENCY_ID)
    }
    
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        val nodes = scg.nodes
        val scc = findSCCs(nodes)
        
        if(schedulable(scc)) {
            println("SCHEDULABLE!!")
        } else {
            // show warning
            if (context != null) {
                context.getCompilationResult().addPostponedWarning(
                    new KielerCompilerException(getId, getId, "The SCG is NOT ASC-schedulable!"));
            }
            println("NOT SCHEDULABLE")
        }
        
        
        return scg
        
    }
    
    
}