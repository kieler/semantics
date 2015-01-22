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
import java.util.List
import java.util.LinkedList
import de.cau.cs.kieler.scg.Node
import java.math.BigInteger
import java.util.HashMap
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Assignment

/**
 * @author cbu
 *
 */
class NodePrios {
    
//    @Inject 
//    extension Helper
 
    private var nodePriorityList = <Node,Integer>newHashMap
    private var helper = new Helper
    
    def HashMap<Node,Integer> calculateNodePriorities (LinkedList<LinkedList<Node>> sccs, List<Node> nodelist){
        System.out.println("starting calcNodePrios")
        nodePriorityList.clear
        var remainingNodes = findVerticesWithoutPriority(nodelist)
        while (!remainingNodes.empty){
            System.out.println("calcNodePrios: "+remainingNodes.length)
            longestPath(sccs, remainingNodes.head)
            remainingNodes = findVerticesWithoutPriority(nodelist)
        }
        System.out.println("calcNodePrios finished")
        nodePriorityList
    }
    
//    // warnung: der graph ist nicht zusammenhängend... oder doch???
//    private def LinkedList<Node> longestPath (LinkedList<LinkedList<Node>> sccs, Node firstNode){
//        var children = new LinkedList<Node>
//        var dependencies = new LinkedList<Node>
//        var scc = getSCCOfNode(sccs, firstNode)
//        var isInSCC = scc.empty
//        System.out.println("longestPrioPath: SCC = "+isInSCC)
//        if (isInSCC){
//            children.addAll(helper.getChildrenOfNode(firstNode))
//            dependencies.addAll(helper.getDependencyNodes(firstNode))
//        } else {
//            children.addAll(getChildrenFromSCC(scc))
//            dependencies.addAll(helper.getDependenciesFromSCC(scc))            
//        }
//        
//        var currentDependencyList = new LinkedList<Node>
//        for (child : children){
//            if (!dependencyTable.containsKey(child)){
//                currentDependencyList.addAll(longestPath(sccs,child))
//                //i = helper.max(i,longestPrioPath(sccs, child))
//            } else {
//                currentDependencyList.addAll(dependencyTable.get(child))
//                //i = helper.max(i,nodePrios.get(child))
//                
//            }
//        }
//        
//        var newDependenciesList = new LinkedList<Node>
//        for (dep :  dependencies){
//            System.out.println("longestPrioPath: DDDDDEEEEEPPPPENNNDENNNCYYYYYYYY")
//            if (!dependencyTable.containsKey(dep)){
//                currentDependencyList.addAll(longestPath(sccs,dep))
//                newDependenciesList.add(dep)
//                //i = (helper.max(i,longestPrioPath(sccs, dep)))+1
//            } else {
//                currentDependencyList.addAll(dependencyTable.get(dep))
//                newDependenciesList.add(dep)
//                //i = (helper.max(i,nodePrios.get(dep)))+1
//            }
//        }
//        var cleanNewDependenciesList = newDependenciesList//removeMultipleConditionalAndAssignmentDependencies(newDependenciesList)
//        currentDependencyList.addAll(cleanNewDependenciesList)
//        var dependencyList = helper.removeDoubleElements(currentDependencyList)
//        dependencyTable.put(firstNode,dependencyList)
//        var l = new Integer(0)
//        for(d : dependencyList){
//            l = l+1
//        }
//        nodePriorityList.put(firstNode,l)
//        if (isInSCC){
//            for (s : scc){
//                dependencyTable.put(s,dependencyList)
//                nodePriorityList.put(s,l)
//            }
//        }
//        dependencyList
//    }

    // warnung: der graph ist nicht zusammenhängend... oder doch???
    private def void longestPath (LinkedList<LinkedList<Node>> sccs, Node firstNode){
        var children = new LinkedList<Node>
        var dependencies = new LinkedList<Node>
        var scc = getSCCOfNode(sccs, firstNode)
        var isNotInSCC = scc.empty
        var int nodePriority = 0
        
        System.out.println("longestPrioPath: SCC = "+isNotInSCC)
        System.out.println("longestPrioPath: elements in SCC: "+sccs.length)
        System.out.println("longestPrioPath: number of nodes with known priority: "+nodePriorityList.keySet.length)
        if (isNotInSCC){
            children.addAll(helper.getChildrenOfNode(firstNode))
            dependencies.addAll(helper.getDependencyNodes(firstNode))
        } else {
            children.addAll(getChildrenFromSCC(scc))
            dependencies.addAll(helper.getDependenciesFromSCC(scc))            
        }
        System.out.println("children: "+children.length)
        System.out.println("dependencies: "+dependencies.length)
        
        for (child : children){
            if (!nodePriorityList.containsKey(child)){
                longestPath(sccs, child)
                nodePriority = helper.max(nodePriority,nodePriorityList.get(child))
            } else {
                nodePriority = helper.max(nodePriority,nodePriorityList.get(child))
                
            }
        }
        for (d :  dependencies){
            System.out.println("longestPrioPath: DDDDDEEEEEPPPPENNNDENNNCYYYYYYYY")
            if (!nodePriorityList.containsKey(d)){
                longestPath(sccs, d)
                nodePriority = helper.max(nodePriority,nodePriorityList.get(d)+1)
            } else {
                nodePriority = helper.max(nodePriority,nodePriorityList.get(d)+1)
            }
        }
        nodePriorityList.put(firstNode,nodePriority)
        if (!isNotInSCC){
            for (s : scc){
                nodePriorityList.put(s,nodePriority)
            }
        }
    }    
    
    
    
    
    // move to helper - same function required by SCC
    private def List<Node> findVerticesWithoutPriority(List<Node> nodelist){
        System.out.println("starting findVerticesWithoutPrio")
        var returnNode = new LinkedList<Node>
        for (node: nodelist){
            if (!nodePriorityList.containsKey(node)){
                returnNode.addLast(node)
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
            children.addAll(helper.getChildrenOfNode(node))
        }
        var newChildren = helper.removeDoubleElements(children)
        for (s : scc){
            newChildren.remove(s)
        }
        newChildren
    }
    
    
    
//    private def removeMultipleConditionalAndAssignmentDependencies (LinkedList<Node> list) {
//        var assignmentList = new LinkedList<Node>
//        var conditionalList = new LinkedList<Node>
//        var returnList = new LinkedList<Node>
//      
//        for (l : list){
//            if (l instanceof Assignment){
//                assignmentList.add(l)
//            } else if (l instanceof Conditional){
//                conditionalList.add(l)
//            } else {
//                returnList.add(l)
//            }
//        }
//        var newAssignmentList = new LinkedList<Node>
//        var cleanAssignmentList = helper.removeDoubleElements(assignmentList)
//        System.out.println("AssignmentList "+assignmentList.length)
//        for (a : cleanAssignmentList){
//            var maxAssignment = a
//            cleanAssignmentList.remove(a)
//            for (b : cleanAssignmentList){
//                if ((b as Assignment).valuedObject == (a as Assignment).valuedObject){
//                    cleanAssignmentList.remove(b)
//                    if (nodePriorityList.get(b)>nodePriorityList.get(a)){
//                        maxAssignment = b
//                    }
//                }
//            }
//            newAssignmentList.add(maxAssignment)
//        } 
//        // TODO: improve, when condition grammar is fixed!!!
//        var newConditionalList = new LinkedList<Node>
//        System.out.println("ConditionalList "+conditionalList.length)
//        for (c : conditionalList){
//            var maxConditional = c
//            conditionalList.remove(c)
//            for (d : conditionalList){
//                if ((d as Conditional).condition == (c as Conditional).condition){
//                    conditionalList.remove(d)
//                    if (nodePriorityList.get(d)>nodePriorityList.get(c)){
//                        maxConditional = d
//                    }
//                }
//            }
//            newAssignmentList.add(maxConditional)
//        }
//        returnList.addAll(newConditionalList)
//        returnList.addAll(newAssignmentList)
//        returnList
//    }
  
}