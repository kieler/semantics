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

import de.cau.cs.kieler.annotations.AnnotationsFactory
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
 * Class to calculate the priorities of nodes of an SCG for the priority based compilation.
 * 
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
    
    
    extension AnnotationsFactory = AnnotationsFactory.eINSTANCE
    
    override getProducedFeatureId() {
        "scg.scgPrio"
    }
    
    override getId() {
        "scg.scgPrio"
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::DEPENDENCY_ID)
    }
    /**
     * transform executes the transformation of an SCG with dependency information to an
     * SCG enriched with node priorities.
     * 
     * @param scg
     *              The source SCG to transform
     * @param context
     *              The context of the SCG. Required to transmit schedulability information to 
     *              the compilation chain as well as priority information to the visualization.
     * @returns
     *              The enriched SCG
     */
    public def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        val nodes = scg.nodes
        var scc = findSCCs(nodes)
        
        val sccMap = createNodeToSCCMap(scc)
        val schizoSccMap = createNodeToSCCMap(schizoSccList)
        val auxData = new PriorityAuxiliaryData()
        auxData.stronglyConnectedComponents = scc
        
        // If we find a viable schedule, calculate the Priorities of the nodes.
        if(schedulable(scc)) {
                        
            // Calculate node priorities with the help of strongly connected components
            val nodePrios = calcNodePrios(scc, sccMap, nodes, schizoSccList, schizoSccMap)
            
            // Calculate Thread Segment IDs
            val threadSegmentIDs = calcThreadSegmentIDs(nodes, nodePrios)
            
            // Calculate Prio IDs of the nodes
            val prioIDs = calcPrioIDs(nodePrios, threadSegmentIDs, getNumberOfThreadSegmentIDs, nodes)
            
            // Optimize the PrioIDs
            val optPrioIDs = calcOptimizedPrioIDs(prioIDs, nodes)
            val max = getMaxPID
            
            // Create Annotations to pass the information to the klighd synthesis 
            for(node : nodes) {
                node.annotations += createIntAnnotation => [
                    name  = PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION
                    value = optPrioIDs.get(node)
                ]
                node.annotations += createIntAnnotation => [
                    name  = PriorityAuxiliaryData.NODE_PRIORITIES_ANNOTATION
                    value = nodePrios.get(node)
                ]
                node.annotations += createIntAnnotation => [
                    name  = PriorityAuxiliaryData.THREAD_SEGMENT_ANNOTATION
                    if(threadSegmentIDs.containsKey(node)) {
                        value = threadSegmentIDs.get(node)                        
                    }
                ]
            }
            
            scg.annotations += createIntAnnotation => [
                name = PriorityAuxiliaryData.MAX_PRIO_ID
                value = max
            ]
            
            context.compilationResult.addAuxiliaryData(auxData)
            
            
        } else {
            if (context != null) {
                context.compilationResult.addAuxiliaryData(auxData)
                context.getCompilationResult().addPostponedWarning(
                    new KielerCompilerException(getId, getId, "The SCG is NOT IASC-schedulable!"));
            }
        }
        
        
        
        
        return scg
        
    }
    
    
}