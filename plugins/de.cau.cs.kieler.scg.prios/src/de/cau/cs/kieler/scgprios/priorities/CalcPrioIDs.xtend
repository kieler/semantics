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
package de.cau.cs.kieler.scgprios.priorities

import java.util.HashMap
import de.cau.cs.kieler.scg.Node

/**
 * This class calculates the prioIDs for all nodes of an SCG
 * 
 * @author cbu
 *
 */
class CalcPrioIDs {
    
    /**
     * Calculates prioIDs from node priorities and thread segment ids
     * 
     * @param nodePriorities
     *          nodes and their corresponding node priorities
     * @param tsIDs
     *          nodes and their corresponding thread segment ids
     * @return
     *          HashMap containing nodes and their corresponding prioIDs
     */
    def public HashMap<Node,Long> calcPrioIDs(HashMap<Node,Integer> nodePriorities, HashMap<Node,Integer> tsIDs){
        
        var nodeList = nodePriorities.keySet
        var prioIDs = <Node,Long> newHashMap
        var biggestTSID = 0
        for (node : nodeList){
            if (!tsIDs.containsKey(node)){
                System.out.println("Missing TSID for node "+node)
            } else{
            if (tsIDs.get(node).intValue > biggestTSID){
                biggestTSID = tsIDs.get(node).intValue
            }}
        }
        biggestTSID = biggestTSID + 1
        for (n : nodeList){
            var long newPrioID = (nodePriorities.get(n).intValue as long) * (biggestTSID as long) + (tsIDs.get(n).intValue as long) 
            prioIDs.put(n,new Long(newPrioID))
        }
        prioIDs
        
    }  
    
}