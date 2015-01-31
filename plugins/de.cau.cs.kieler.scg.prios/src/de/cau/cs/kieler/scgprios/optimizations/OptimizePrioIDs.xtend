/**
 * 
 */
package de.cau.cs.kieler.scgprios.optimizations

import java.util.HashMap
import java.util.LinkedList
import de.cau.cs.kieler.scg.Node
import java.util.Set
import java.util.List

/**
 * @author cbu
 *
 */
class OptimizePrioIDs {
    // priority 0 will never occur, because the tsid from the concurrent tsids will not be 0
    // if there is no concurrent element, it is possible to have priority 0 but there will
    // be no threads forked at all
    public def HashMap<Node,Long> optimizePrioIDs(HashMap<Node,Long> prioIDs, List<Node> nodeSet){
        var nodeList = new LinkedList<Node>
        nodeList.addAll(nodeSet)
        var sortedNodeList = nodeList.sortBy[prioIDs.get(it)]
        var long newPrioIDOfLastElement = 0
        var long prioIDOfLastElement = 0
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