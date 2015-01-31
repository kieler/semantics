/**
 * 
 */
package de.cau.cs.kieler.scgprios.optimizations

import java.util.LinkedList
import de.cau.cs.kieler.scg.Node
import java.util.Set
import java.util.HashMap
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scgprios.common.Helper
import de.cau.cs.kieler.scg.Join
import java.util.List

/**
 * @author cbu
 *
 */
class OptimizeTSIDs {
    var NodesFromRootToEntryList = new LinkedList<Node>
    var tsIDs = <Node, Integer> newHashMap
    var EntryNodesFromRoot = new LinkedList<Node>
    var optimizedTsIDs = <Node, Integer> newHashMap
    var Helper helper
    
    public def HashMap <Node, Integer> optimizeTSIDs(List<Node> nodes, HashMap <Node,Integer> tsIDs, HashMap<Node,Integer> nodePrios){
        // step 1: propagate the tsID from the "biggest entry" up to the root node
        helper = new Helper
        NodesFromRootToEntryList.clear
        EntryNodesFromRoot.clear
        var entrynodes = nodes.filter[it instanceof Entry]
        System.out.println("number of entrynodes: "+entrynodes.length)
        var rootnode = helper.findRootNode(entrynodes)
        NodesFromRootToEntryList.add(rootnode)
        NodesFromRootToEntry(nodePrios, rootnode)
        this.tsIDs = tsIDs
        
        var parents = getParentsOfNodes(nodes)
        
        System.out.println("optimizeTSIDs: entrynodelist: "+EntryNodesFromRoot.length)
        System.out.println("optimizeTSIDs: rootToEntry: "+NodesFromRootToEntryList.length)
        
        if (!EntryNodesFromRoot.empty){
            var entryNodePrio = EntryNodesFromRoot.head
            for (e : EntryNodesFromRoot){
                if (tsIDs.get(e) > tsIDs.get(entryNodePrio)){
                    entryNodePrio = e
                }
            }
            System.out.println("optimizeTSIDs: entrynodeprio: "+tsIDs.get(entryNodePrio).intValue)
            
            for (n: NodesFromRootToEntryList){
                optimizedTsIDs.put(n,new Integer(tsIDs.get(entryNodePrio).intValue))
            }
        }
        // step 2: propagate the tsID from "smallest exit" down
        // at least, if the join node is not in any scc
     
        // find all join nodes
        var joinList = getJoins(nodes).sortBy[nodePrios.get(it)].reverse
        for (j : joinList){
  
            if (!optimizedTsIDs.containsKey(j)){
            //find all parents of join (exit nodes)
            var parentlist = parents.get(j)
            // find "smallest" exit node
            if (!parentlist.empty){
                var exitnode = parentlist.head
                for (p : parentlist){
                    if (nodePrios.get(exitnode).intValue == nodePrios.get(p).intValue){
                        if (tsIDs.get(exitnode) > tsIDs.get(p)){
                            exitnode = p
                        }
                    } else if (nodePrios.get(exitnode) > nodePrios.get(p)){
                        exitnode = p
                    }
                }
                propagateTSIDDown(j, tsIDs.get(exitnode).intValue, nodePrios.get(j).intValue, nodePrios)
            }
        }
        
        }
        // update hashmap
        for (n : nodes){
            if (optimizedTsIDs.containsKey(n)){
                tsIDs.put(n,optimizedTsIDs.get(n))
            }
        }
        tsIDs
        
    } 
    
    // Helperfunctions
    
    private def void NodesFromRootToEntry(HashMap<Node, Integer> nodePrios, Node node) {
        System.out.println("starting NodesFromRootToEntry") 
        var children = helper.getAllChildrenOfNode(node)
        {
            for (child : children) {
                if (nodePrios.get(child).intValue == nodePrios.get(node).intValue) {
                    if (child instanceof Entry && (!EntryNodesFromRoot.contains(child))) {
                        EntryNodesFromRoot.add(child)
                    } else if (!NodesFromRootToEntryList.contains(child)) {
                        NodesFromRootToEntryList.add(child)
                        NodesFromRootToEntry(nodePrios, child)
                    }
                }

            }
        }
    }
    
    private def void propagateTSIDDown(Node node, int tsid, int prio, HashMap<Node, Integer> nodePrios){
       if (!optimizedTsIDs.containsKey(node)){
        if (nodePrios.get(node).intValue == prio && tsIDs.get(node).intValue != tsid){
            optimizedTsIDs.put(node,new Integer(tsid))
            if (node instanceof Fork){
                var children = helper.getAllChildrenOfNode(node)
                var sortedChildren = children.sortBy[tsIDs.get(it).intValue]
                for (c : children){
                    if (tsIDs.get(c).intValue == tsid){
                        return
                    }
                }
                propagateTSIDDown(sortedChildren.last, tsid, prio, nodePrios)
            } else {
                var children = helper.getAllChildrenOfNode(node)
                for (child : children){
                    propagateTSIDDown(child, tsid, prio, nodePrios)
                }
            }
        }
        
        }
    }
    
    private def LinkedList<Node> getJoins(List<Node> nodes){
        var joinlist = new LinkedList<Node>
        for (n : nodes){
            if (n instanceof Join){
                joinlist.add(n)
            }
        }
        joinlist
    }
    
    // creates a HashMap, which lists all parents of a node
    private def HashMap<Node, LinkedList<Node>> getParentsOfNodes(List<Node> nodes){
        var parentNodes = <Node, LinkedList<Node>> newHashMap
        for (key : nodes){
            var list = new LinkedList<Node>
            parentNodes.put(key,list)
        }
        for (node : nodes){
            var children = helper.getInstantChildrenOfNode(node)
            for (child : children){
                var currentParentList = parentNodes.get(child) 
                currentParentList.add(node)
                parentNodes.put(child, currentParentList)
            }
        }
        parentNodes
    }
    
}