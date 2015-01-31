/**
 * 
 */
package de.cau.cs.kieler.scgprios.transform

import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scgprios.priorities.SCC
import de.cau.cs.kieler.scgprios.priorities.CalcNodePrios
import de.cau.cs.kieler.scgprios.optimizations.OptimizeNodePriorities
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scgprios.priorities.CalcTSIDsII
import de.cau.cs.kieler.scgprios.priorities.CalcPrioIDs
import de.cau.cs.kieler.scgprios.priorities.CalcTSIDs

/**
 * @author cbu
 *
 */
class ThreadSegmentIDsTransformation extends Transformation{
    
    override transform(EObject eObject, KielerCompilerContext context) {
        //var scgraph_P = transformSCGToSCG_P(eObject as SCGraph)
        return transformSCGDEPToSCGTSIDs(eObject as SCGraph)
    }
    
    public def SCGraph transformSCGDEPToSCGTSIDs(SCGraph graph) {
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
        
        var calcTSIDs = new CalcTSIDs
        var tsids = calcTSIDs.calcTSIDs(nodePrios, sccs)
        
        for (n : nodes){
            n.tsID = tsids.get(n)
        }
        
        var calcPrioIDs = new CalcPrioIDs
        var results2 = calcPrioIDs.calcPrioIDs(optNodePrios, tsids)
        
        for (n : nodes){
            n.prioID = results2.get(n).intValue
        }
        
        graph
    }
}