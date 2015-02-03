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

import java.util.List
import java.util.LinkedList
import de.cau.cs.kieler.scg.Node
import java.util.HashMap
import de.cau.cs.kieler.scgprios.common.Helper

/**
 * @author cbu
 *
 */
class CalcNodePrios {
    
//    @Inject 
//    extension Helper
 
    private var nodePriorityList = <Node,Integer>newHashMap
    private var helper = new Helper
    
    public def HashMap<Node,Integer> calculateNodePriorities (LinkedList<LinkedList<Node>> sccs, List<Node> nodelist){
        System.out.println("starting calcNodePrios")
        nodePriorityList.clear
        var remainingNodes = sccs
        while (!remainingNodes.empty){
            System.out.println("calcNodePrios: "+remainingNodes.length)
            longestPath(remainingNodes.head, sccs)
            System.out.println("next node: "+sccs.head.head)
            remainingNodes = findVerticesWithoutPriority(sccs)
        }
        System.out.println("calcNodePrios finished")
        nodePriorityList
    }


    // warnung: der graph ist nicht zusammenhängend... 
    private def void longestPath (LinkedList<Node> sccPartition, LinkedList<LinkedList<Node>> sccs){
        var children = new LinkedList<Node>
        var dependencies = new LinkedList<Node>
        //var scc = getSCCOfNode(sccs, firstNode)
        //var isNotInSCC = scc.empty
        var int nodePriority = 0
        
//        System.out.println("longestPrioPath: SCC = "+isNotInSCC)
//        System.out.println("longestPrioPath: elements in SCC: "+sccs.length)
//        System.out.println("longestPrioPath: number of nodes with known priority: "+nodePriorityList.keySet.length)
//        if (isNotInSCC){
//            children.addAll(helper.getInstantChildrenOfNode(firstNode))
//            dependencies.addAll(helper.getDependencyNodes(firstNode))
//        } else {
            children.addAll(getChildrenFromSCC(sccPartition))
            dependencies.addAll(helper.getDependenciesFromSCC(sccPartition))            
//        }
//        System.out.println("children: "+children.length)
//        System.out.println("dependencies: "+dependencies.length)
        
        for (child : children){
           
            if (!nodePriorityList.containsKey(child)){
                 var childSCC = getSCCOfNode(sccs, child)
                longestPath(childSCC, sccs)
                nodePriority = helper.max(nodePriority,nodePriorityList.get(child))
            } else {
                nodePriority = helper.max(nodePriority,nodePriorityList.get(child))
                
            }
        }
        for (d :  dependencies){
            System.out.println("longestPrioPath: DDDDDEEEEEPPPPENNNDENNNCYYYYYYYY")
            if (!nodePriorityList.containsKey(d)){
                var dependencySCC = getSCCOfNode(sccs, d)
                longestPath(dependencySCC, sccs)
                nodePriority = helper.max(nodePriority,nodePriorityList.get(d)+1)
            } else {
                nodePriority = helper.max(nodePriority,nodePriorityList.get(d)+1)
            }
        }
    //    nodePriorityList.put(firstNode,nodePriority)
   //     if (!isNotInSCC){
            for (s : sccPartition){
                nodePriorityList.put(s,nodePriority)
                System.out.println("node priority determined "+s+nodePriority)
            }
     //   }
    }    
    
    
    
    
    // move to helper - same function required by SCC
    private def LinkedList<LinkedList<Node>> findVerticesWithoutPriority(LinkedList<LinkedList<Node>> sccs){
        System.out.println("starting findVerticesWithoutPrio")
        var returnNode = new LinkedList<LinkedList<Node>>
        for (scc : sccs){
            System.out.println("head: "+scc.head)
            if (!nodePriorityList.containsKey((scc.head))){
                returnNode.addLast(scc)
            }
        }
        System.out.println("without priority: "+returnNode.length)
        returnNode
    }
    
    private def LinkedList<Node> getSCCOfNode(LinkedList<LinkedList<Node>> sccs, Node node){
        System.out.println("starting getSCCOfNode")
        var s = new LinkedList<Node>
        //System.out.println("getSCCOfNode: initialized all")
        for (scc : sccs){
            if(scc.contains(node)){
                //System.out.println("getSCCOfNode: node is in scc")
                s.addAll(scc)
            }
            //System.out.println("getSCCOfNode: restarting loop")
        }
        System.out.println("getSCCOfNode: finished")
        //System.out.println("getSCCOfNode: "+s)
        s
    }
    
    private def getChildrenFromSCC(LinkedList<Node> scc){
        System.out.println("starting getChildrenFromSCC")
        var children = new LinkedList<Node>
        for (node : scc){
            children.addAll(helper.getInstantChildrenOfNode(node))
        }
        var newChildren = helper.removeDoubleElements(children)
        for (s : scc){
            newChildren.remove(s)
        }
        newChildren
    }
    
    
    

}