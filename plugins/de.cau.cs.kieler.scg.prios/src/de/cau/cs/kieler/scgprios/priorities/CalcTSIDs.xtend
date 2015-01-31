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
import de.cau.cs.kieler.scg.Entry
import java.util.LinkedList
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scgprios.common.Helper

/**
 * @author cbu
 *
 */
class CalcTSIDs {
    
    // use with optimized priorities!!!
    
    var tsIDs = <Node, Integer> newHashMap
    var optimizedTsIDs = <Node, Integer> newHashMap
    var helper = new Helper
    
    def HashMap<Node, Integer> calcTSIDs(HashMap<Node,Integer> nodePrios, LinkedList<LinkedList<Node>> sccs){
        tsIDs.clear
        optimizedTsIDs.clear
        
        var nodes = nodePrios.keySet
        //var parents = getParentsOfNodes(nodes)
        var entrynodes = nodes.filter[it instanceof Entry]
        var rootnode = helper.findRootNode(entrynodes)
        var forknodes = nodes.filter[it instanceof Fork]//getForkNodes(nodes)

        numberTSNodes(rootnode, 1)
        numberThreadSegments(forknodes, nodePrios)
        
//        optimizeTSIDs(rootnode, nodes, parents, nodePrios, sccs)
//        for (k : optimizedTsIDs.keySet){
//            tsIDs.put(k, optimizedTsIDs.get(k))
//        }
        tsIDs
    }
    
    private def numberThreadSegments(Iterable<Node> forknodes, HashMap<Node,Integer> nodePriorities){
        var i = 2
        for (f : forknodes){
            
            var entrylist = helper.getAllChildrenOfNode(f)
            var joiningNode = findJoiningNode(entrylist, nodePriorities)
            
            entrylist.remove(joiningNode)
            entrylist.addFirst(joiningNode)
            
            for (e : entrylist){
                numberTSNodes(e,i)
                i = i+1
            }
        }
    }
    
    private def Node findJoiningNode(LinkedList<Node> entrylist, HashMap<Node,Integer> nodePriorities){
        var joiningnode = entrylist.head
        for (e : entrylist){
            if (nodePriorities.get((e as Entry).exit).intValue < nodePriorities.get((joiningnode as Entry).exit).intValue){
                joiningnode = e
            } else if (nodePriorities.get((e as Entry).exit).intValue == nodePriorities.get((joiningnode as Entry).exit).intValue){
                if (nodePriorities.get(e).intValue < nodePriorities.get(joiningnode).intValue){
                    joiningnode = e
                }
            }
        }
        joiningnode
    }

    
    private def void numberTSNodes(Node node, Integer i) {
        if (!tsIDs.containsKey(node)) {
            tsIDs.put(node, i)
            if (node instanceof Fork) {
                numberTSNodes((node as Fork).join, i)
            } else if (!(node instanceof Exit)) {
                var children = helper.getAllChildrenOfNode(node)
                if (node instanceof Entry){
                    children.add((node as Entry).exit) //unconnected exit nodes
                }
                for (child : children) {
                    numberTSNodes(child, i)
                }
            }
        }

    }
    
  
//    private def Node findRootNode(Iterable<Node> nodes){
//        for (node : nodes){
//            if (node instanceof Entry && node.incoming.empty){
//                return node
//            }
//        }
//    }
    
//    def LinkedList<Node> getChildrenOfNode(Node node) {
//        System.out.println("starting getChildrenOfNode")
//        var childNodes = new LinkedList<Node>
//        if (node instanceof Entry) {
//            var nextLink = (node as Entry).next
//            if (nextLink != null) {
//                var nextNode = nextLink.target
//                childNodes.addLast(nextNode)
//            }
//        } else if (node instanceof Exit) {
//            var nextLink = (node as Exit).next
//            if (nextLink != null) {
//                var nextNode = nextLink.target
//                childNodes.addLast(nextNode)
//            }
//        } else if (node instanceof Assignment) {
//            var nextLink = (node as Assignment).next
//            if (nextLink != null) {
//                var nextNode = nextLink.target
//                childNodes.addLast(nextNode)
//            }
//        } else if (node instanceof Depth) {
//            var nextLink = (node as Depth).next
//            if (nextLink != null) {
//                var nextNode = nextLink.target
//                childNodes.addLast(nextNode)
//            }
//        } else if (node instanceof Surface) {
//            var nextLink = (node as Surface).depth
//            childNodes.addLast(nextLink)
//        } else if (node instanceof Join) {
//            var nextLink = (node as Join).next
//            if (nextLink != null) {
//                var nextNode = nextLink.target
//                childNodes.addLast(nextNode)
//            }
//        } else if (node instanceof Conditional) {
//            var thenLink = (node as Conditional).then
//            if (thenLink != null) {
//                var nextNode = thenLink.target
//                childNodes.addLast(nextNode)
//            }
//            var elseLink = (node as Conditional).^else
//            if (elseLink != null) {
//                var nextNode = elseLink.target
//                childNodes.addLast(nextNode)
//            }
//        } else if (node instanceof Fork) {
//            var nextLinks = (node as Fork).next
//            if (!nextLinks.empty) {
//                for (nextLink : nextLinks) {
//                    var nextNode = nextLink.target
//                    childNodes.addLast(nextNode)
//                }
//            }
//        }
//        childNodes
//
//    }
    
    
//    var NodesFromRootToEntryList = new LinkedList<Node>
//    var EntryNodesFromRoot = new LinkedList<Node>
//    
//    private def optimizeTSIDs(Node rootnode, Set<Node> nodes, HashMap<Node,LinkedList<Node>> parents, HashMap<Node,Integer> nodePrios, LinkedList<LinkedList<Node>> sccs){
//        // step 1: propagate the tsID from the "biggest entry" up to the root node
//        NodesFromRootToEntryList.clear
//        EntryNodesFromRoot.clear
//        NodesFromRootToEntryList.add(rootnode)
//        NodesFromRootToEntry(nodePrios, rootnode)
//        
//        System.out.println("optimizeTSIDs: entrynodelist: "+EntryNodesFromRoot.length)
//        System.out.println("optimizeTSIDs: rootToEntry: "+NodesFromRootToEntryList.length)
//        
//        if (!EntryNodesFromRoot.empty){
//            var entryNodePrio = EntryNodesFromRoot.head
//            for (e : EntryNodesFromRoot){
//                if (tsIDs.get(e) > tsIDs.get(entryNodePrio)){
//                    entryNodePrio = e
//                }
//            }
//            System.out.println("optimizeTSIDs: entrynodeprio: "+tsIDs.get(entryNodePrio).intValue)
//            
//            for (n: NodesFromRootToEntryList){
//                optimizedTsIDs.put(n,new Integer(tsIDs.get(entryNodePrio).intValue))
//            }
//        }
//        // step 2: propagate the tsID from "smallest exit" down
//        // at least, if the join node is not in any scc
//     
//        // find all join nodes
//        var joinList = getJoins(nodes)
//        for (j : joinList){
//  
//            if (!optimizedTsIDs.containsKey(j)){
//            //find all parents of join (exit nodes)
//            var parentlist = parents.get(j)
//            // find "smallest" exit node
//            if (!parentlist.empty){
//                var exitnode = parentlist.head
//                for (p : parentlist){
//                    if (nodePrios.get(exitnode).intValue == nodePrios.get(p).intValue){
//                        if (tsIDs.get(exitnode) > tsIDs.get(p)){
//                            exitnode = p
//                        }
//                    } else if (nodePrios.get(exitnode) > nodePrios.get(p)){
//                        exitnode = p
//                    }
//                }
//                propagateTSIDDown(j, tsIDs.get(exitnode).intValue, nodePrios.get(j).intValue, nodePrios)
//            }
//        }
//        
//        }
//        
//        
//        
//    }
//    private def LinkedList<Node> getJoins(Set<Node> nodes){
//        var joinlist = new LinkedList<Node>
//        for (n : nodes){
//            if (n instanceof Join){
//                joinlist.add(n)
//            }
//        }
//        joinlist
//    }
//    
 
    
   
//    // todo: remove
//    private def void NodesFromRootToEntry(HashMap<Node, Integer> nodePrios, Node node) {
//        System.out.println("starting NodesFromRootToEntry") 
//        var children = getChildrenOfNode(node)
//        {
//            for (child : children) {
//                if (nodePrios.get(child).intValue == nodePrios.get(node).intValue) {
//                    if (child instanceof Entry && (!EntryNodesFromRoot.contains(child))) {
//                        EntryNodesFromRoot.add(child)
//                    } else if (!NodesFromRootToEntryList.contains(child)) {
//                        NodesFromRootToEntryList.add(child)
//                        NodesFromRootToEntry(nodePrios, child)
//                    }
//                }
//
//            }
//        }
//    }
    
//    private def void propagateTSIDDown(Node node, int tsid, int prio, HashMap<Node, Integer> nodePrios){
//       if (!optimizedTsIDs.containsKey(node)){
//        if (nodePrios.get(node).intValue == prio && tsIDs.get(node).intValue != tsid){
//            optimizedTsIDs.put(node,new Integer(tsid))
//            if (node instanceof Fork){
//                var children = getChildrenOfNode(node)
//                var sortedChildren = children.sortBy[tsIDs.get(it).intValue]
//                propagateTSIDDown(sortedChildren.last, tsid, prio, nodePrios)
//            } else {
//                var children = getChildrenOfNode(node)
//                for (child : children){
//                    propagateTSIDDown(child, tsid, prio, nodePrios)
//                }
//            }
//        }
//        
//        }
//    }
    
//    // creates a HashMap, which lists all parents of a node
//    private def HashMap<Node, LinkedList<Node>> getParentsOfNodes(Set<Node> nodes){
//        var parentNodes = <Node, LinkedList<Node>> newHashMap
//        for (key : nodes){
//            var list = new LinkedList<Node>
//            parentNodes.put(key,list)
//        }
//        for (node : nodes){
//            var children = helper.getInstantChildrenOfNode(node)
//            for (child : children){
//                var currentParentList = parentNodes.get(child) 
//                currentParentList.add(node)
//                parentNodes.put(child, currentParentList)
//            }
//        }
//        parentNodes
//    }
    
    
}