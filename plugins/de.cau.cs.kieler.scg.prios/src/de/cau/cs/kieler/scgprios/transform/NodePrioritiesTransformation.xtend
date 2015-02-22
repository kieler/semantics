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
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scgprios.priorities.CalcNodePrios
import de.cau.cs.kieler.scgprios.priorities.SCC
import de.cau.cs.kieler.scgprios.priorities.Scheduling
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.scgprios.results.ResultingSCCPartitions
import de.cau.cs.kieler.scgprios.results.NodePriorityResult

/**
 * @author cbu
 *
 */
class NodePrioritiesTransformation extends Transformation{
    
    override transform(EObject eObject, KielerCompilerContext context) {
        return transformSCGDEPToSCGNODEPRIO(eObject as SCGraph, context)
    }
    
    /**
     * This transformation calculates the strongly connected components from a graph in order
     * to determine, if a valid schedule exists. If such the SCG is schedulable, the node 
     * priorities are calculated
     * 
     * @param graph: SCG with dependencies
     * @param context: KielerCompilerContext
     * 
     * @result SCG 
     */
    public def SCGraph transformSCGDEPToSCGNODEPRIO(SCGraph graph, KielerCompilerContext context) {
        
        // calculate strongly connected components
        var nodes = graph.nodes
        var sccCalc = new SCC
        var sccs = sccCalc.findSCC(nodes)
        
        // check whether valid schedule exists
        var scheduling = new Scheduling
        if (scheduling.scheduleexists(sccs)) {
            
            // add resulting strongly connected components to KielerCompilerContext
            var resultingSCCPartitions = new ResultingSCCPartitions
            resultingSCCPartitions.SCCPartitions = sccs
            context.compilationResult.ancillaryData += resultingSCCPartitions

            // calculate node priorities
            var calcNodePrios = new CalcNodePrios
            var results = calcNodePrios.calculateNodePriorities(sccs, nodes)
            var nodePriorityResult = new NodePriorityResult()
            nodePriorityResult.priorityMap = results
            context.compilationResult.ancillaryData += nodePriorityResult
            
        } else {
            
            // show only dependencies, which are causing problems
            // this is NOT a design decision, just a helpful feature for me
            // it is going to be removed, when all work has been done
            scheduling.debugDependencies(sccs)
            // show warning
            if (context != null) {
                context.getCompilationResult().addPostponedWarning(
                    new KielerCompilerException(id, "The SCG is NOT ASC-schedulable!"));
            }
            
        }

        graph
    }
    
}