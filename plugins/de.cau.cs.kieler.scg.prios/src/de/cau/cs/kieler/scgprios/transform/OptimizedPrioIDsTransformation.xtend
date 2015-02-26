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
import de.cau.cs.kieler.kico.KielerCompilerContext
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scgprios.optimizations.OptimizePrioIDs
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
 *   |-- ThreadSegmentIDs
 *   |-- OptimizedThreadSegmentIDs             <== YOU ARE HERE 
 * </pre>
 * 
 * @author cbu
 *
 */
class OptimizedPrioIDsTransformation extends Transformation{
    
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
        return transformSCGTSIDSToSCGOPTPRIOIDS(eObject as SCGraph, context)
    }
    
    /**
     * This transformations optimizes the prioIDs
     * 
     * @param graph: 
     *          SCG with dependencies
     * @param context: 
     *          KielerCompilerContext
     * 
     * @result 
     *          unmodified SCG with dependencies
     */
    public def SCGraph transformSCGTSIDSToSCGOPTPRIOIDS(SCGraph graph, KielerCompilerContext context) {
        
        // get previous results
        var prioIDsRes = context.compilationResult.ancillaryData.filter[it instanceof PrioIDResult]
        
        // if previous results exist, optimize node priorities
        if (!prioIDsRes.empty){
            
            var nodes = graph.nodes
            var prioIDs = (prioIDsRes.head as PrioIDResult).priorityMap
            
            // optimize PrioIDs
            var optimizePrioIDs = new OptimizePrioIDs
            var optPrioIDs = optimizePrioIDs.optimizePrioIDs(prioIDs, nodes) 
            prioIDs = optPrioIDs
            
        }  
        graph
    }
}