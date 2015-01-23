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

import com.google.inject.Inject
import de.cau.cs.kieler.scg.SCGraph 
import de.cau.cs.kieler.scg.Node
import java.util.LinkedList
import de.cau.cs.kieler.scgprios.calculation.Helper
import de.cau.cs.kieler.scgprios.calculation.SCC
import de.cau.cs.kieler.scgprios.calculation.OptimizeNodePriorities
import de.cau.cs.kieler.scgprios.calculation.CalcTSIDs
import de.cau.cs.kieler.scgprios.calculation.CalcPrioIDs

/**
 * @author cbu
 *
 */
class SCGtoSCGwithNodePrios {
    
    
//    @Inject
//    extension Helper
    
    public def calcPrios(SCGraph depSCG){
        System.out.println("Starting calcPrios")
        
        var scc = new SCC
        System.out.println("calcPrios: init 1")
        
        var nodePrioCalculator = new NodePrios
        System.out.println("calcPrios: init 2")
        
        var nodePriorityOptimizer = new OptimizeNodePriorities
        
        var calcTSIDs = new CalcTSIDs
        var calcPrioIDs = new CalcPrioIDs
        
        var helper = new Helper
        System.out.println("calcPrios: All initialized")
        
        var nodes = helper.NodesToList(depSCG)
        System.out.println("calcPrios: Nodes are in List")
        
        var sccs = scc.findSCC(nodes)      
        System.out.println("calcPrios: SCC calculated")
        System.out.println("calcPrios: SCCs: "+sccs.length+" : "+sccs)
        System.out.println("calcPrios: nodes: "+nodes.length+" : "+nodes)
        
        if (dependencyInSCC(sccs)){
            println("Not Schedulable")    //write-write dependency noch abfangen...
        } else {
            System.out.println("calcPrios: Calculating Node Prios")
            var nodePrios = nodePrioCalculator.calculateNodePriorities(sccs, nodes)
            System.out.println("calcPrios: optimize Prios of Nodes")
            var optimizedNodePrios = nodePriorityOptimizer.optimizePriorities(nodePrios, sccs)
            System.out.println("calcPrios: length of optimizedNodePrios: "+optimizedNodePrios.keySet.length)
            var nodesWithTSIDS = calcTSIDs.calcTSIDs(optimizedNodePrios, sccs)
            System.out.println("calcPrios: length of TSIDs: "+nodesWithTSIDS.keySet.length)
            var nodesWithPrioIDs = calcPrioIDs.calcPrioIDs(optimizedNodePrios, nodesWithTSIDS)
            System.out.println("calcPrios: put Node Prios onto Nodes")
            for (node : nodes){
                var Integer inti = optimizedNodePrios.get(node)
                var Integer threadi = nodesWithTSIDS.get(node)
                var Long prioi = nodesWithPrioIDs.get(node)
                node.setNodePriority(inti)
                node.setTsID(threadi)
                node.setPrioID(prioi.intValue)
                System.out.println("calcPrios: Prios:"+node+" "+optimizedNodePrios.get(node).intValue)
            }
        }
    }
   
    private def boolean dependencyInSCC(LinkedList<LinkedList<Node>> sccs){
        for (scc : sccs){
            for (node : scc){
                var dependencies = node.dependencies
                if (dependencies != null) {
                    for (d : dependencies) {
                        var dependencyNode = d.target
                        if (scc.contains(dependencyNode)){
                            return true
                        }
                    }
                }
            }
        }
        return false
    }
    
    
    
}