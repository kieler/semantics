/**
 * 
 */
package de.cau.cs.kieler.scgprios.transform

import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scgprios.priorities.SCC
import de.cau.cs.kieler.scgprios.priorities.CalcNodePrios
import de.cau.cs.kieler.scgprios.optimizations.OptimizeNodePriorities
import de.cau.cs.kieler.scgprios.priorities.CalcPrioIDs
import de.cau.cs.kieler.scgprios.optimizations.OptimizePrioIDs
import de.cau.cs.kieler.scgprios.priorities.CalcTSIDsII
import de.cau.cs.kieler.scgprios.priorities.Scheduling
import de.cau.cs.kieler.scgprios.results.ThreadSegmentIDResult
import de.cau.cs.kieler.scgprios.results.PrioIDResult
import de.cau.cs.kieler.scgprios.results.NodePriorityResult

/**
 * @author cbu
 *
 */
class SCGDEPtoSCGPRIOTransformation extends Transformation{
    override transform(EObject eObject, KielerCompilerContext context) {
        return transformSCGDEPToSCGOPTPRIOIDs(eObject as SCGraph, context)
    }
    
    public def SCGraph transformSCGDEPToSCGOPTPRIOIDs(SCGraph graph, KielerCompilerContext context) {
        var nodes = graph.nodes
        var sccCalc = new SCC
        var sccs = sccCalc.findSCC(nodes)
        var scheduling = new Scheduling
        if (scheduling.scheduleexists(sccs)){
            var calcNodePrios = new CalcNodePrios 
            var nodePrios = calcNodePrios.calculateNodePriorities(sccs, nodes)
            var calcOptNodePrios = new OptimizeNodePriorities
            var optNodePrios = calcOptNodePrios.optimizeNodePriorities(nodePrios, sccs)
            
//            for (n : nodes){
//                n.nodePriority = optNodePrios.get(n)
//            }
            var nodePriorityResult = new NodePriorityResult()
            nodePriorityResult.priorityMap = optNodePrios
            context.compilationResult.ancillaryData += nodePriorityResult
            
            var calcTSIDs = new CalcTSIDsII
            var optTsids = calcTSIDs.calculateTSIDs(nodes, nodePrios, sccs)
            
//            for (n : nodes){
//                n.tsID = optTsids.get(n)
//            }
            var threadSegmentIDResult = new ThreadSegmentIDResult()
            threadSegmentIDResult.priorityMap = optTsids
            context.compilationResult.ancillaryData += threadSegmentIDResult
            
            var calcPrioIDs = new CalcPrioIDs
            var prioIDs = calcPrioIDs.calcPrioIDs(optNodePrios, optTsids)
            
            var optimizePrioIDs = new OptimizePrioIDs
            var optPrioIDs = optimizePrioIDs.optimizePrioIDs(prioIDs, nodes)
            
            var prioIDResult = new PrioIDResult()
            prioIDResult.priorityMap = optPrioIDs
            context.compilationResult.ancillaryData += prioIDResult 
            
//            for (n : nodes){
//                n.prioID = optPrioIDs.get(n).intValue
//            }


        }    
        graph
    }
}