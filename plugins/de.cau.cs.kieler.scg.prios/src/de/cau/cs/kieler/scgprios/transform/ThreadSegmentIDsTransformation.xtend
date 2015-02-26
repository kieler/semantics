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

import de.cau.cs.kieler.scg.SCGraph
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scgprios.priorities.CalcPrioIDs
import de.cau.cs.kieler.scgprios.priorities.CalcTSIDs
import de.cau.cs.kieler.scgprios.results.NodePriorityResult
import de.cau.cs.kieler.scgprios.results.ThreadSegmentIDResult
import de.cau.cs.kieler.scgprios.results.PrioIDResult

/**
 * This class is part of the SCGPRIO transformation chain. This chain is used to check the scheduling
 * and to calculate and optimize the priorities stepwise for the priority based compilation approach.
 * The transformation can be called manually or used by KiCo to perform a series of transformations.
 * <pre>
 * SCGPRIO 
 *   |-- OptimizeSCG
 *   |-- NodePriorities                        
 *   |-- OptimizedNodePriorities                   
 *   |-- ThreadSegmentIDs                      <== YOU ARE HERE
 *   |-- OptimizedThreadSegmentIDs
 * </pre>
 * 
 * @author cbu
 *
 */
class ThreadSegmentIDsTransformation extends Transformation{
    
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
        return transformSCGOPTNODEPRIOSToSCGTSIDS(eObject as SCGraph, context)
    }
    
    /**
     * This transformation calculates the thread segment IDs for a given SCG.
     * Therefore the node priorities, determined during the previous steps, are required.
     * This transformation can be used with unoptimized and optimized node priorities.
     * 
     * Because the thread segment IDs change, if a region contains another region, the unoptimized
     * prioIDs are also calculated, so that the user understand, how this transformation works.
     * 
     * @param graph: 
     *          SCG with dependencies
     * @param context: 
     *          KielerCompilerContext
     * 
     * @result 
     *          unmodified SCG with dependencies
     */
    public def SCGraph transformSCGOPTNODEPRIOSToSCGTSIDS(SCGraph graph, KielerCompilerContext context) {
        
        // get previous results
        var nodePriosRes = context.compilationResult.ancillaryData.filter[it instanceof NodePriorityResult]
        
        // if previous results exist, optimize node priorities
        if (!nodePriosRes.empty){
            
            var nodes = graph.nodes
            var nodePrios = (nodePriosRes.head as NodePriorityResult).priorityMap
            
            // calculate ThreadSegmentIDs
            var calcTSIDs = new CalcTSIDs
            var optTsids = calcTSIDs.calculateTSIDs(nodes, nodePrios)
            var threadSegmentIDResult = new ThreadSegmentIDResult()
            threadSegmentIDResult.priorityMap = optTsids
            context.compilationResult.ancillaryData += threadSegmentIDResult
            
            // calculate PrioIDs (without optimization)
            // this should help the user to understand how the threadSegmentIDs 
            // are calculated
            var calcPrioIDs = new CalcPrioIDs
            var prioIDs = calcPrioIDs.calcPrioIDs(nodePrios, optTsids)
            var prioIDResult = new PrioIDResult()
            prioIDResult.priorityMap = prioIDs
            context.compilationResult.ancillaryData += prioIDResult
            
        }
   
        graph
    }
}