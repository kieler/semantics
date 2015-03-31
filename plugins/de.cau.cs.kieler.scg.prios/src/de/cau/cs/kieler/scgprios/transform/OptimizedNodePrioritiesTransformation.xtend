/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scgprios.transform

import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kico.KielerCompilerContext
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scgprios.optimizations.OptimizeNodePriorities
import de.cau.cs.kieler.scgprios.results.ResultingSCCPartitions
import de.cau.cs.kieler.scgprios.results.NodePriorityResult
import com.google.inject.Inject
import de.cau.cs.kieler.scgprios.results.SCCLookUpTableResult

/**
 * This class is part of the SCGPRIO transformation chain. This chain is used to check the scheduling
 * and to calculate and optimize the priorities stepwise for the priority based compilation approach.
 * The transformation can be called manually or used by KiCo to perform a series of transformations.
 * <pre>
 * SCGPRIO 
 *   |-- OptimizeSCG
 *   |-- NodePriorities                        
 *   |-- OptimizedNodePriorities               <== YOU ARE HERE    
 *   |-- ThreadSegmentIDs
 *   |-- OptimizedThreadSegmentIDs
 * </pre>
 * 
 * @author cbu
 *
 */
class OptimizedNodePriortiesTransformation extends Transformation{
    
    @Inject
    extension OptimizeNodePriorities
    
    /** 
     * Generic model transformation interface.
     * 
     * @param eObject
     *          the root element of the input model
     * @param context
     *          the context of the input model
     * @return 
     *          Returns the root element and context of the transformed model.
     */
    override transform(EObject eObject, KielerCompilerContext context) {
        return transformSCGNODEPRIOSToSCGOPTNODEPRIOS(eObject as SCGraph, context)
    }
    
    /**
     * This transformation optimizes the node priorities detected during the previous transformation
     * 
     * @param graph: 
     *          SCG with dependencies
     * @param context: 
     *          KielerCompilerContext
     * 
     * @result 
     *          unmodified SCG with dependencies
     */
    public def SCGraph transformSCGNODEPRIOSToSCGOPTNODEPRIOS(SCGraph graph, KielerCompilerContext context) {
        
        // get previous results
        var sccsRes = context.compilationResult.ancillaryData.filter[it instanceof ResultingSCCPartitions]
        var nodePriosRes = context.compilationResult.ancillaryData.filter[it instanceof NodePriorityResult]
        var sccLookUpTableRes = context.compilationResult.ancillaryData.filter[it instanceof SCCLookUpTableResult]
        
        // if previous results exist, optimize node priorities
        if (!sccsRes.empty || !nodePriosRes.empty){
            
            var sccs = (sccsRes.head as ResultingSCCPartitions).SCCPartitions
            var sccLookUpTable = (sccLookUpTableRes.head as SCCLookUpTableResult).priorityMap
            var nodePrios = (nodePriosRes.head as NodePriorityResult).priorityMap
            
            // cleanup 
            context.compilationResult.ancillaryData.remove(sccsRes)
            context.compilationResult.ancillaryData.remove(sccLookUpTableRes)
            
            // optimize node priorities
            var optNodePrios = optimizeNodePriorities(nodePrios, sccs, sccLookUpTable)
            
            nodePrios = optNodePrios
            
        }
       
        graph
    }
}