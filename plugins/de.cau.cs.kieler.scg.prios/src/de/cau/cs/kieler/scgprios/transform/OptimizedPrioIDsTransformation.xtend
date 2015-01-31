/**
 * 
 */
package de.cau.cs.kieler.scgprios.transform

import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kico.KielerCompilerContext
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scgprios.priorities.CalcNodePrios
import de.cau.cs.kieler.scgprios.optimizations.OptimizeNodePriorities
import de.cau.cs.kieler.scgprios.priorities.CalcTSIDs
import de.cau.cs.kieler.scgprios.optimizations.OptimizeTSIDs
import de.cau.cs.kieler.scgprios.priorities.CalcPrioIDs
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scgprios.priorities.SCC
import de.cau.cs.kieler.scgprios.optimizations.OptimizePrioIDs
import java.util.HashMap
import de.cau.cs.kieler.scgprios.priorities.CalcTSIDsII

/**
 * @author cbu
 *
 */
class OptimizedPrioIDsTransformation extends Transformation{
    override transform(EObject eObject, KielerCompilerContext context) {
        //var scgraph_P = transformSCGToSCG_P(eObject as SCGraph)
        return transformSCGDEPToSCGOPTPRIOIDs(eObject as SCGraph)
    }
    
    public def SCGraph transformSCGDEPToSCGOPTPRIOIDs(SCGraph graph) {
        var nodes = graph.nodes
        var sccCalc = new SCC
        var sccs = sccCalc.findSCC(nodes)
        var calcNodePrios = new CalcNodePrios 
        var nodePrios = calcNodePrios.calculateNodePriorities(sccs, nodes)
        var calcOptNodePrios = new OptimizeNodePriorities
        var optNodePrios = calcOptNodePrios.optimizeNodePriorities(nodePrios, sccs)
        
        for (n : nodes){
            n.nodePriority = optNodePrios.get(n)
        }
        
        var calcTSIDs = new CalcTSIDsII
        var optTsids = calcTSIDs.calculateTSIDs(nodes, nodePrios, sccs)
        
        for (n : nodes){
            n.tsID = optTsids.get(n)
        }
        
        var calcPrioIDs = new CalcPrioIDs
        var prioIDs = calcPrioIDs.calcPrioIDs(optNodePrios, optTsids)
        
        var optimizePrioIDs = new OptimizePrioIDs
        var optPrioIDs = optimizePrioIDs.optimizePrioIDs(prioIDs, nodes
        ) 
        
        for (n : nodes){
            n.prioID = optPrioIDs.get(n).intValue
        }
        
        graph
    }
}