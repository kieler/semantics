/**
 * 
 */
package de.cau.cs.kieler.scgprios.transform

import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scgprios.priorities.SCC
import de.cau.cs.kieler.scgprios.priorities.CalcNodePrios
import de.cau.cs.kieler.kico.KielerCompilerContext
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scgprios.optimizations.OptimizeNodePriorities
import de.cau.cs.kieler.scgprios.priorities.Scheduling
import de.cau.cs.kieler.scgprios.results.ResultingSCCPartitions
import de.cau.cs.kieler.scgprios.results.NodePriorityResult

/**
 * @author cbu
 *
 */
class OptimizedNodePriortiesTransformation extends Transformation{
    
    override transform(EObject eObject, KielerCompilerContext context) {
        return transformSCGDEPToSCGOPTNODEPRIO(eObject as SCGraph, context)
    }
    
    public def SCGraph transformSCGDEPToSCGOPTNODEPRIO(SCGraph graph, KielerCompilerContext context) {
        
        // get previous results
        var sccsRes = context.compilationResult.ancillaryData.filter[it instanceof ResultingSCCPartitions]
        var nodePriosRes = context.compilationResult.ancillaryData.filter[it instanceof NodePriorityResult]
        
        // if previous results exist, optimize node priorities
        if (!sccsRes.empty || !nodePriosRes.empty){
            
            var sccs = (sccsRes.head as ResultingSCCPartitions).SCCPartitions
            var nodePrios = (nodePriosRes.head as NodePriorityResult).priorityMap
            
            // optimize node priorities
            var calcOptNodePrios = new OptimizeNodePriorities
            var optNodePrios = calcOptNodePrios.optimizeNodePriorities(nodePrios, sccs)
            
            nodePrios = optNodePrios
            
        }
       
        graph
    }
}