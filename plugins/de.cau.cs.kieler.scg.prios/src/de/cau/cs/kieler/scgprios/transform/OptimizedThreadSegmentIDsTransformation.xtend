/**
 * 
 */
package de.cau.cs.kieler.scgprios.transform

import de.cau.cs.kieler.scg.SCGraph
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scgprios.priorities.CalcPrioIDs
import de.cau.cs.kieler.scgprios.priorities.CalcTSIDsII
import de.cau.cs.kieler.scgprios.results.ResultingSCCPartitions
import de.cau.cs.kieler.scgprios.results.NodePriorityResult
import de.cau.cs.kieler.scgprios.results.ThreadSegmentIDResult
import de.cau.cs.kieler.scgprios.results.PrioIDResult

/**
 * @author cbu
 *
 */
class OptimizedThreadSegmentIDsTransformation extends Transformation{
    override transform(EObject eObject, KielerCompilerContext context) {
        return transformSCGDEPToSCGOPTTSIDs(eObject as SCGraph, context)
    }
    
    public def SCGraph transformSCGDEPToSCGOPTTSIDs(SCGraph graph, KielerCompilerContext context) {
        
        // get previous results
        var sccsRes = context.compilationResult.ancillaryData.filter[it instanceof ResultingSCCPartitions]
        var nodePriosRes = context.compilationResult.ancillaryData.filter[it instanceof NodePriorityResult]
        
        // if previous results exist, optimize node priorities
        if (!nodePriosRes.empty){
            
            var nodes = graph.nodes
            var sccs = (sccsRes.head as ResultingSCCPartitions).SCCPartitions
            var nodePrios = (nodePriosRes.head as NodePriorityResult).priorityMap
            
            // calculate ThreadSegmentIDs
            var calcTSIDs = new CalcTSIDsII
            var optTsids = calcTSIDs.calculateTSIDs(nodes, nodePrios, sccs)
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