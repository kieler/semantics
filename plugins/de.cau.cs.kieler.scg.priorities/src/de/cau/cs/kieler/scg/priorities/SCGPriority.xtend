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
import de.cau.cs.kieler.scg.priorities.extensions.SCCExtensions
import de.cau.cs.kieler.scg.priorities.priorityCalculations.NodePriorities
import de.cau.cs.kieler.scg.priorities.priorityCalculations.OptimizedPrioIDs
import de.cau.cs.kieler.scg.priorities.priorityCalculations.PrioIDs
import de.cau.cs.kieler.scg.priorities.priorityCalculations.StronglyConnectedComponentCalc
import de.cau.cs.kieler.scg.priorities.priorityCalculations.ThreadSegmentIDs
import javax.inject.Inject

/**
 * @author lpe
 *
 */
class SCGPriority extends AbstractProductionTransformation{
    
    @Inject
    extension StronglyConnectedComponentCalc
    
    @Inject
    extension NodePriorities
    
    @Inject
    extension SCCExtensions
    
    @Inject
    extension ThreadSegmentIDs
    
    @Inject
    extension PrioIDs
    
    @Inject
    extension OptimizedPrioIDs
    
    override getProducedFeatureId() {
        "scg.scgPrio"
    }
    
    override getId() {
        "scg.scgPrio"
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::DEPENDENCY_ID)
    }
    
    public def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        val nodes = scg.nodes
        val scc = findSCCs(nodes)
        
        if(schedulable(scc)) {
            println("SCHEDULABLE!!")
            val sccMap = createNodeToSCCMap(scc)
            val nodePrios = calcNodePrios(scc, sccMap)
//            val auxData = new PriorityAuxiliaryData(nodePrios)
//            context.compilationResult.addAuxiliaryData(auxData)
            //DEBUG INFORMATION
           /* for(n : scg.nodes) {
                if(nodePrios.containsKey(n)) {
                    println(n + " -- Priority: " + nodePrios.get(n))
                    
                }
            }
            */
            
            
            val threadSegmentIDs = calcThreadSegmentIDs(nodes, nodePrios)
            //val auxData = new PriorityAuxiliaryData(threadSegmentIDs)
            //context.compilationResult.addAuxiliaryData(auxData)
            
            val prioIDs = calcPrioIDs(nodePrios, threadSegmentIDs, getNumberOfThreadSegmentIDs, nodes)
            //val auxData = new PriorityAuxiliaryData(prioIDs)
            //context.compilationResult.addAuxiliaryData(auxData)
            
            val optPrioIDs = calcOptimizedPrioIDs(prioIDs, nodes)
            val auxData = new PriorityAuxiliaryData(optPrioIDs)
            context.compilationResult.addAuxiliaryData(auxData)
            
            
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