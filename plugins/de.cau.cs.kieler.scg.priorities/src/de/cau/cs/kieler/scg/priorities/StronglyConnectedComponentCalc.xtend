/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.priorities

import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Write_Write
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Stack

/**
 * A class to determine the Strongly Connected Components of an SCG
 * @author lpe
 *
 */
class StronglyConnectedComponentCalc {
    
    private var count           = 0
    private var unvisitedNodes  = <Node> newLinkedList
    private var stack           = new Stack<Node>
    private var dfs             = <Node, Integer> newHashMap
    private var lowlink         = <Node, Integer> newHashMap
    private var sccList         = <LinkedList<Node>> newLinkedList
    
    
    /**
     * Finds the Strongly Connected Components of an 
     * SCG using Tarjan's Algorithm. 
     * 
     * @param nodes 
     *          The nodes of the provided SCG
     * 
     * @return
     *          List of all Strongly Connected Components in the SCG
     */
    def LinkedList<LinkedList<Node>> findSCCs(List<Node> nodes) {
        
        //Clear everything to enable a second run
        lowlink.clear
        dfs.clear
        sccList.clear
        stack.clear
        unvisitedNodes.clear
                
        count = 0
        unvisitedNodes.addAll(nodes)
        
        //Ensure that all nodes of the SCG are visited once
        while(!unvisitedNodes.isEmpty) {
            tarjan(unvisitedNodes.head)
        }
        
        //Debug information
        /*var i = 0
        for(scc : sccList) {
            println("scc no: " + i)
            for(node : scc) {
                print(node)
            }
            i++
            println();
        }*/
        //Debug information over
        sccList
    }
    
    /** Creates a Strongly Connected Component containing the node currentNode. 
     *  Strongly Connected Components include nodes that are connected with the 
     *  exception of Surface --> Depth nodes but including dependency edges.
     * 
     * @param currentNode 
     *              The Node that is contained in the Strongly Connected Component to be built
     * 
     */
     def void tarjan(Node currentNode) {
         
         dfs.put(currentNode, count)
         lowlink.put(currentNode, count)
         count++
         stack.push(currentNode)
         unvisitedNodes.remove(currentNode)
         
         for(nextNode : currentNode.neighborsAndDependencies) {
             //Next node has not yet been visited
             if(unvisitedNodes.contains(nextNode)) {
                 tarjan(nextNode)
                 lowlink.replace(currentNode, Math.min(lowlink.get(currentNode).intValue, 
                     lowlink.get(nextNode).intValue))
             }
             //Next node has already been visited, hence in the current Strongly Connected Component
             else if(dfs.get(nextNode).intValue < dfs.get(currentNode).intValue) {
                 if(stack.contains(nextNode)) {
                     lowlink.replace(currentNode, Math.min(lowlink.get(currentNode).intValue, 
                                                            lowlink.get(nextNode).intValue))
                 }
             }
         }
         //Create the Strongly Connected Component
         if(dfs.get(currentNode) == lowlink.get(currentNode)) {
             var scc = <Node> newLinkedList
             var w = stack.peek;
             do {
                 w = stack.pop
                 scc.add(w)
             } 
             while(w != currentNode)
             sccList.add(scc)
         }
     }
     
     def HashMap<Node,Integer> createNodeToSCCMap (LinkedList<LinkedList<Node>> sccs){
        var i = 0;
        var map = <Node,Integer> newHashMap
        for (scc : sccs){
            for (s : scc){
                map.put(s,i)
            }
            i++;
        }
        return map
    }
    
    //-----------------------------------------------------------------------------------------------
    //----------------------------NEIGHBORS & DEPENDENCIES-------------------------------------------
    //-----------------------------------------------------------------------------------------------
    
    /**
     * Finds the following neighbor(s) of the node with the 
     * exception of Surface --> Depth connections
     * 
     * @param n
     *          The node for which the neighbors are to be found
     * 
     * @return 
     *          The following neighbor(s) of the node
     */
    def LinkedList<Node> getNeighbors(Node n) {
        var neighbors = <Node> newLinkedList
        
        if(n instanceof Entry) {
            val entry = n as Entry
            if(entry.next != null) {
                neighbors.add(entry.next.target)                
            }
        }
        
        if(n instanceof Exit) {
            val exit = n as Exit
            if(exit.next != null) {
                neighbors.add(exit.next.target)
            }
        }
        
        if(n instanceof Assignment) {
            val ass = n as Assignment
            neighbors.add(ass.next.target)
        }
        
        if(n instanceof Conditional) {
            val cond = n as Conditional
            neighbors.addAll(cond.then.target, cond.^else.target)
        }
        
        if(n instanceof Fork) {
            val fork = n as Fork
            for(next : fork.next) {
                neighbors.add(next.target)
            }
        }
        
        if(n instanceof Join) {
            val join = n as Join
            neighbors.add(join.next.target)
        }
        
        if(n instanceof Depth) {
            val depth = n as Depth
            neighbors.add(depth.next.target)
        }
        
        if(n instanceof Surface) {
            //Do nothing
        }
        
        neighbors
    }
    
    /**
     * Finds the following neighbor(s) of the node, even 
     * Surface --> Depth connections
     * 
     * @param n
     *          The node for which the neighbors are to be found
     * 
     * @return 
     *          The following neighbor(s) of the node
     */
    def LinkedList<Node> getAllNeighbors(Node n) {
        
        var neighbors = <Node> newLinkedList
        if(n instanceof Surface) {
            val sur = n as Surface
            neighbors.add(sur.depth)
            neighbors
        } else {
            return n.neighbors
        }
    }
    
    /**
     * Finds the outgoing concurrent dependencies of a Node 
     * 
     * @param n
     *          The node for which the dependencies are to be found
     * 
     * @return 
     *          The outgoing dependencies of the node
     */
    def LinkedList<Node> getConcurrentDependencies(Node n) {
        var deps = <Node> newLinkedList
        //Get only concurrent dependencies!!
        for(dep : n.dependencies) {
            if(dep instanceof DataDependency) {
                val dataDep = dep as DataDependency
                if(dataDep.concurrent && !dataDep.confluent) {
                    deps.add(dep.target)
                }
                
            }
            
        }
        deps
    }
    
    /**
     * Finds the following neighbor(s) of the node with the 
     * exception of Surface --> Depth connections as well as 
     * their dependencies 
     * 
     * @param n
     *          The node for which the neighbors are to be found
     * 
     * @return 
     *          The following neighbor(s) of the node
     */
    def LinkedList<Node> getNeighborsAndDependencies(Node n) {
        var neighbors = <Node> newLinkedList
        neighbors.addAll(n.neighbors)
        neighbors.addAll(n.concurrentDependencies)
        neighbors
    }
    
    
    
    def LinkedList<Node> findAllNeighborsOfSCC(LinkedList<Node> scc) {
        var neighbors = <Node> newLinkedList
        for(node : scc) {
            for(neighbor : node.allNeighbors) {
                if(!scc.contains(neighbor)) {
                    neighbors.add(neighbor)
                }
            }
        }
        neighbors
    }
    
    def LinkedList<Node> findAllDependenciesOfScc(LinkedList<Node> scc) {
        var dependencies = <Node> newLinkedList
        for(node : scc) {
            for(dep : node.concurrentDependencies) {
                if(!scc.contains(dep)) {
                    dependencies.add(dep)
                }
            }
        }
        dependencies
        
    }
    
    //-----------------------------------------------------------------------------------------------
    //---------------------------------SCHEDULABILITY------------------------------------------------
    //-----------------------------------------------------------------------------------------------
    
    /**
     * Determines, if an SCG with a given set of Strongly Connected Components is
     * schedulable regarding ASC schedulability.
     * If a positive weight cycle within an SCC exists, the program is 
     * not ASC schedulable. A positive weight cycle exists, if an SCC contains a node
     * that is connected to another node within the same SCC by a -->_wir edge, meaning 
     * a concurrent and not confluent dependency edge.
     * An SCG is also not schedulable, if a Write-Write conflict exists (concurrenctly).
     * 
     * @param sccs
     *          The list of Strongly Connected Components of the SCG
     * 
     * @returns
     *          @true, if the SCG is ASC schedulable and @false, if not
     */
    def boolean schedulable(LinkedList<LinkedList<Node>> sccs) {
        
        for(scc : sccs) {
            for(node : scc) {
                val dependencies = node.dependencies
                for(dependency : dependencies) {
                    if(dependency instanceof DataDependency) {
                        val dep = dependency as DataDependency
                        if(dep.concurrent && !dep.confluent) {
                            if(dep instanceof Write_Write || scc.contains(dep.target)) {
                                //println(node + " has a dependency issue with " + dep.target)
                                return false
                            }
                        }
                    }
                }
            }
        }
        true
    }
    
    
    //-----------------------------------------------------------------------------------------------
    //-----------------------------ACYCLIC GRAPH & LONGEST PATH--------------------------------------
    //-----------------------------------------------------------------------------------------------
    
    def LinkedList<LinkedList<Node>> createAcyclicGraph(LinkedList<LinkedList<Node>> sccs) {
        val sccMap = createNodeToSCCMap(sccs);
        
        for(scc : sccs) {
            
        }
        
        return null
    }
    
    
}