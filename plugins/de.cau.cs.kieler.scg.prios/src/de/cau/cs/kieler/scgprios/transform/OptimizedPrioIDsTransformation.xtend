/**
 * 
 */
package de.cau.cs.kieler.scgprios.transform

import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kico.KielerCompilerContext
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scgprios.optimizations.OptimizePrioIDs
import de.cau.cs.kieler.scgprios.results.PrioIDResult

/**
 * @author cbu
 *
 */
class OptimizedPrioIDsTransformation extends Transformation{
    override transform(EObject eObject, KielerCompilerContext context) {
        return transformSCGDEPToSCGOPTPRIOIDs(eObject as SCGraph, context)
    }
    
    public def SCGraph transformSCGDEPToSCGOPTPRIOIDs(SCGraph graph, KielerCompilerContext context) {
        
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