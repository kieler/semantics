/**
 * 
 */
package de.cau.cs.kieler.scgprios.priorities

import java.util.List
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scgprios.common.Helper
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import java.util.LinkedList
import java.util.HashMap
import de.cau.cs.kieler.scg.Exit

/**
 * @author cbu
 *
 */
class CalcTSIDsII {
    
    private Helper helper
    private int currentTSID
    private int nextTSID
    private var tsIDs = <Node, Integer> newHashMap
    
    def HashMap<Node, Integer> calculateTSIDs(List<Node> nodes, HashMap<Node, Integer> nodePriorities, LinkedList<LinkedList<Node>> sccs){
        
        helper = new Helper
        tsIDs.clear
        var entrynodes = nodes.filter[it instanceof Entry]
        currentTSID = entrynodes.length
        nextTSID = currentTSID - 1
        var rootnode = helper.findRootNode(entrynodes)
        var nodesOfPath = <Node> newLinkedList
        numberThreadSegments(rootnode, entrynodes.length, nodePriorities, nodesOfPath)
        tsIDs
    }
    
    def LinkedList<Node> numberThreadSegments(Node node, int i, HashMap<Node,Integer> nodePriorities, LinkedList<Node> nodesOfPath){
        
        System.out.println("calculation tsids -------------------------------------");
        if (!nodesOfPath.contains(node)){
            nodesOfPath.add(node)
            if (!(node instanceof Join)){
                System.out.println("unknown node and not join")
                var newNodesOfPath = <Node> newLinkedList
                if (node instanceof Exit){
                    System.out.println("node type of exit")
                    tsIDs.put(node,i)
                }
                if (node instanceof Entry){
                    System.out.println("Node of type entry")
                    tsIDs.put(node,i)
                    numberThreadSegments(((node as Entry).next.target), i, nodePriorities, nodesOfPath)
                    numberThreadSegments(((node as Entry).exit), i, nodePriorities, nodesOfPath)
                    
//                    var decendants = helper.getAllChildrenOfNode(node)
//                    decendants.add((node as Entry).exit)
//                    for (d : decendants){
//                        var path = numberThreadSegments(d, i, nodePriorities, nodesOfPath)
//                        //newNodesOfPath.addAll(path)
//                    }
                } else if (node instanceof Fork){
                    System.out.println("Node of type fork")
                    tsIDs.put(node,i)
                    var children = helper.getAllChildrenOfNode(node)
                    var entrynodes = sortEntryNodes(children, nodePriorities)
                    var firstentry = entrynodes.head
                    entrynodes.remove(firstentry)
                    var emptyPath = <Node> newLinkedList
                    var path = numberThreadSegments(firstentry, i, nodePriorities, emptyPath)
                    newNodesOfPath.addAll(path)
                    for (e : entrynodes){
                        nextTSID = nextTSID - 1;
                        path = numberThreadSegments(e, (nextTSID+1), nodePriorities, emptyPath)             
                        //newNodesOfPath.addAll(path)
                    }
                    tsIDs.put((node as Fork).join,tsIDs.get(((entrynodes.last) as Entry).exit))
                    numberThreadSegments((node as Fork).join.next.target, tsIDs.get(((entrynodes.last) as Entry).exit), nodePriorities, nodesOfPath)
                    entrynodes.addFirst(firstentry)
                } else{
                    System.out.println("Node of type other")
                    tsIDs.put(node,i)
                    for (c : helper.getAllChildrenOfNode(node)){
                        var path = numberThreadSegments(c, i, nodePriorities, nodesOfPath)
                        newNodesOfPath.addAll(path)
                    }
                    
               } for (n : newNodesOfPath){
                    if (!nodesOfPath.contains(n)){
                    nodesOfPath.add(n)
                    }
                }
                
            }
            else {
                System.out.println("Node of type join")
            }
        }
        nodesOfPath
    }
    
    private def LinkedList<Node> sortEntryNodes(LinkedList<Node> entrynodes, HashMap<Node, Integer> nodePriorities){
        var lowestExit = findLowestExit(entrynodes, nodePriorities)
        entrynodes.remove(lowestExit)
        var firstEntry = findFirstEntry(entrynodes, nodePriorities)
        entrynodes.remove(firstEntry)
        entrynodes.addFirst(firstEntry)
        entrynodes.addLast(lowestExit)
        entrynodes
         
    }
    
    private def Node findLowestExit(LinkedList<Node> entrynodes, HashMap<Node, Integer> nodePriorities){
        var lowestExit = entrynodes.head
        for (e : entrynodes){
            if (nodePriorities.get((e as Entry).exit) < nodePriorities.get((lowestExit as Entry).exit)){
                lowestExit = e
            } else if (nodePriorities.get((e as Entry).exit) == nodePriorities.get((lowestExit as Entry).exit)){
                if (nodePriorities.get(e) < nodePriorities.get(lowestExit)){
                    lowestExit = e
                }
            }
        }
        lowestExit
    }
    
    private def Node findFirstEntry(LinkedList<Node> entrynodes, HashMap<Node, Integer> nodePriorities){
        var firstEntry = entrynodes.head
        for (e : entrynodes){
            if (nodePriorities.get(firstEntry) < nodePriorities.get(e)){
                firstEntry = e
            } else if (nodePriorities.get(e) == nodePriorities.get(firstEntry)){
                if (nodePriorities.get((e as Entry).exit) > nodePriorities.get((firstEntry as Entry).exit)){
                    firstEntry = e
                }
            }
        }
        firstEntry
    }
    
//    private def LinkedList<Node> getSCCOfNode(LinkedList<LinkedList<Node>> sccs, Node node){
//        System.out.println("starting getSCCOfNode")
//        var s = new LinkedList<Node>
//        //System.out.println("getSCCOfNode: initialized all")
//        for (scc : sccs){
//            if(scc.contains(node)){
//                //System.out.println("getSCCOfNode: node is in scc")
//                s.addAll(scc)
//            }
//            //System.out.println("getSCCOfNode: restarting loop")
//        }
//        System.out.println("getSCCOfNode: finished")
//        //System.out.println("getSCCOfNode: "+s)
//        s
//    }
    
    
}