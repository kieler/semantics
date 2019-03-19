/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.priority

import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.scg.extensions.SCCExtensions
import javax.inject.Inject
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property

/**
 * Class to calculate the priorities of nodes of an SCG for the priority based compilation.
 * 
 * @author lpe ssm
 *
 */
class PriorityProcessor extends InplaceProcessor<SCGraphs> implements Traceable {
    
    @Inject extension StronglyConnectedComponents
    @Inject extension NodePriorities
    @Inject extension SCCExtensions
    @Inject extension ThreadSegmentIDs
    @Inject extension PrioIDs
    @Inject extension OptimizedPrioIDs
    
    extension AnnotationsFactory = AnnotationsFactory.eINSTANCE
    
    public static val IProperty<PriorityAuxiliaryData> PRIORITY_AUXILIARY_DATA = 
        new Property<PriorityAuxiliaryData>("de.cau.cs.kieler.scg.processors.priority.data", null)    
    
    override getName() {
        "Priorities"
    }
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.priorities"
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
    
    override process() {
        val scg = getModel.scgs.head
        
        val nodes = scg.nodes
        var scc = findSCCs(nodes)
        
        val sccMap = createNodeToSCCMap(scc)
        val schizoSccMap = createNodeToSCCMap(schizoSccList)
        val auxData = new PriorityAuxiliaryData()
        auxData.stronglyConnectedComponents = schizoSccList
        
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
            
            environment.setProperty(PRIORITY_AUXILIARY_DATA, auxData)
        } else {
            environment.setProperty(PRIORITY_AUXILIARY_DATA, auxData)
            environment.errors.add("The SCG is not IASC-schedulable!")
        }
    }
    
}