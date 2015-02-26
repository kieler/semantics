/**
 * 
 */
package de.cau.cs.kieler.scgprios.optimizations

import java.util.HashMap
import de.cau.cs.kieler.scg.Node
import java.util.List

/**
 * This class provides an optimization method for the prioIDs
 * 
 * @author cbu
 *
 */
class OptimizePrioIDs {
    
    
    /**
     * Simple method to compress the prioIDs.
     * As not all prioIDs might be used, it is possible to compress the prioIDs in use, especially 
     * regarding a further translation to SCL_P
     * 
     * @param prioIDs
     *          nodes and their corresponding prioIDs
     * @param nodeSet
     *          nodes of the SCG
     * @return
     *          nodes and their corresponding optimized prioIDs
     */
    public def HashMap<Node,Long> optimizePrioIDs(HashMap<Node,Long> prioIDs, List<Node> nodeList){
        
        var long newPrioIDOfLastElement = 1      
        var long prioIDOfLastElement = 1
        var sortedNodeList = nodeList.sortBy[prioIDs.get(it)]
        
        for (n : sortedNodeList){           
            if (prioIDs.get(n).longValue == prioIDOfLastElement){
                prioIDs.put(n,newPrioIDOfLastElement)
            } else {
                prioIDOfLastElement = prioIDs.get(n).longValue
                newPrioIDOfLastElement = newPrioIDOfLastElement + 1
                prioIDs.put(n,newPrioIDOfLastElement)
            }
        }
        prioIDs
    }
}