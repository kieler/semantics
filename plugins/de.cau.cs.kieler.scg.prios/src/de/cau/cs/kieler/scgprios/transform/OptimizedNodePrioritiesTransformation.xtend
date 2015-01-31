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

/**
 * @author cbu
 *
 */
class OptimizedNodePriortiesTransformation extends Transformation{
    
    override transform(EObject eObject, KielerCompilerContext context) {
        //var scgraph_P = transformSCGToSCG_P(eObject as SCGraph)
        return transformSCGDEPToSCGOPTNODEPRIO(eObject as SCGraph)
    }
    
    public def SCGraph transformSCGDEPToSCGOPTNODEPRIO(SCGraph graph) {
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
        graph
    }
}