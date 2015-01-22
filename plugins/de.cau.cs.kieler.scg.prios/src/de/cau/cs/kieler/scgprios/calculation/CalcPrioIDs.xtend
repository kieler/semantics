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
package de.cau.cs.kieler.scgprios.calculation

import java.util.HashMap
import de.cau.cs.kieler.scg.Node
import java.util.Set
import java.util.LinkedList

/**
 * @author cbu
 *
 */
class CalcPrioIDs {
    
    
    def  HashMap<Node,Long> calcPrioIDs(HashMap<Node,Integer> nodePriorities, HashMap<Node,Integer> tsIDs){
        var nodeList = nodePriorities.keySet
        var prioIDs = <Node,Long> newHashMap
        var biggestTSID = 0
        for (node : nodeList){
            System.out.println("tsid :"+tsIDs.get(node).intValue)
            if (tsIDs.get(node).intValue > biggestTSID){
                biggestTSID = tsIDs.get(node).intValue
            }
        }
        biggestTSID = biggestTSID + 1
        for (n : nodeList){
            var long newPrioID = (nodePriorities.get(n).intValue as long) * (biggestTSID as long) + (tsIDs.get(n).intValue as long) 
            //var newPrioID = (tsIDs.get(n).intValue as long)
            prioIDs.put(n,new Long(newPrioID))
        }
        var optimizedPrioIDs = optimizePrioIDs(prioIDs, nodeList)
        optimizedPrioIDs
        
    }
    
    // priority 0 will never occur, because the tsid from the concurrent tsids will not be 0
    // if there is no concurrent element, it is possible to have priority 0 but there will
    // be no threads forked at all
    private def HashMap<Node,Long> optimizePrioIDs(HashMap<Node,Long> prioIDs, Set<Node> nodeSet){
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