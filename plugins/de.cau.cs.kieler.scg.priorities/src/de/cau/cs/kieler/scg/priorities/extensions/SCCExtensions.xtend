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
package de.cau.cs.kieler.scg.priorities.extensions

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
import java.util.HashMap
import java.util.LinkedList

/**
 * @author lpe
 *
 */
class SCCExtensions {
    
    /**
     * Creates a HashMap to find the SCC a node belongs to
     * 
     * @param sccs
     *              The provided list of SCCs
     * 
     * @return
     *              A HashMap containing all nodes and the index of the SCC in sccs they belong to
     */
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
    
    
    /**
     * Finds all (non-delayed) neighboring SCCs of the given SCC
     * 
     * @param scc
     *          The SCC for whom to find the neighbors
     * 
     * @return
     *          The neighboring SCCs of scc
     */
    def LinkedList<Node> findNeighborsOfSCC(LinkedList<Node> scc) {
        var neighbors = <Node> newLinkedList
        for(node : scc) {
            for(neighbor : node.neighbors) {
                if(!scc.contains(neighbor) && !neighbors.contains(neighbor)) {
                    neighbors.add(neighbor)
                }
            }
        }
        neighbors
    }
    
    /**
     * Finds all SCCs that are dependent from the given SCC
     * 
     * @param scc
     *          The SCC for whom to find the dependent SCCs
     * 
     * @return
     *          The dependent SCCs
     */
    def LinkedList<Node> findAllDependenciesOfScc(LinkedList<Node> scc) {
        var dependencies = <Node> newLinkedList
        for(node : scc) {
            for(dep : node.concurrentDependencies) {
                if(!scc.contains(dep) && !dependencies.contains(dep)) {
                    dependencies.add(dep)
                }
            }
        }
        dependencies
        
    }
}