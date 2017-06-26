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
package de.cau.cs.kieler.scg.priorities.priorityCalculations

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.DataDependencyType
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGAnnotations
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.scg.priorities.extensions.SCCExtensions
import java.util.HashMap
import java.util.LinkedList
import java.util.Stack

/**
 * A class to determine the Strongly Connected Components of an SCG. Also determines schedulability of the SCG.
 * @author lpe
 * 
 */
class StronglyConnectedComponentCalc {
    
    @Inject
    extension SCCExtensions
    @Inject
    extension AnnotationsExtensions
    @Inject
    extension SCGThreadExtensions
    @Inject 
    Injector injector

    private static val SCHIZO_ANNOTATION = "Schizophrenic"
    private static val DEPTH_JOIN_ANNOTATION = "isDepthJoin"

    private var count = 0
    private var visited = <Node, Boolean>newHashMap
    private var stack = new Stack<Node>
    private var dfs = <Node, Integer>newHashMap
    private var lowlink = <Node, Integer>newHashMap
    private var sccList = <LinkedList<Node>>newLinkedList
    private var isContained = <Node, Boolean>newHashMap
    public var  schizoSccList = <LinkedList<Node>>newLinkedList

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
    public def LinkedList<LinkedList<Node>> findSCCs(Iterable<Node> nodes) {

        // Clear everything to enable a second run
        lowlink.clear
        dfs.clear
        sccList.clear
        stack.clear
        visited.clear
        isContained.clear
        count = 0
        schizoSccList.clear
        
        for (node : nodes) {
            isContained.put(node, true)
        }

        // Ensure that all nodes of the SCG are visited once
        for (node : nodes) {
            if (!visited.containsKey(node) || !visited.get(node)) {
                tarjan(node)
            }
        }
        
        breakDepthJoinSCCs

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
    private def void tarjan(Node currentNode) {

        dfs.put(currentNode, count)
        lowlink.put(currentNode, count)
        count++
        stack.push(currentNode)
        visited.put(currentNode, true)
        // var b = true
        
        for (nextNode : currentNode.neighborsAndDependencies) {
            if (isContained.containsKey(nextNode) && isContained.get(nextNode)) {                
                // Next node has not yet been visited
                if (!visited.containsKey(nextNode) || !visited.get(nextNode)) {
                    tarjan(nextNode)
                    lowlink.replace(currentNode, Math.min(lowlink.get(currentNode), lowlink.get(nextNode)))
                } // Next node has already been visited, hence in the current Strongly Connected Component
                else if (dfs.get(nextNode) < dfs.get(currentNode)) {
                    if (stack.contains(nextNode)) {
                        lowlink.replace(currentNode, Math.min(lowlink.get(currentNode), lowlink.get(nextNode)))
                    }
                }
            }
        }

        // Create the Strongly Connected Component
        if (dfs.get(currentNode) == lowlink.get(currentNode)) {
            var schizophrenic = false
            var scc = <Node>newLinkedList
            var w = stack.peek;
            do {
                w = stack.pop
                scc.add(w)
                
                // Check for Joins within a Strongly Connected Component for the schizophrenia analysis
                if (w instanceof Join) {
                    for (n : w.fork.neighbors) {
                        if (n.hasAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)) {
                            val threadType = n.getStringAnnotationValue(
                                SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE).fromString2
                            if (threadType == ThreadPathType::DELAYED) {
                                w.createStringAnnotation(DEPTH_JOIN_ANNOTATION, "")
                                schizophrenic = true
                            }
                        }
                    }
                }
            } while (w != currentNode)
            if (schizophrenic) {
                scc.head.createStringAnnotation(SCHIZO_ANNOTATION, "");
            }
            sccList.add(scc)
        }
    }

    // -----------------------------------------------------------------------------------------------
    // ---------------------------------SCHEDULABILITY------------------------------------------------
    // -----------------------------------------------------------------------------------------------
    /**
     * Determines, if an SCG with a given set of Strongly Connected Components is
     * schedulable regarding IASC schedulability.
     * If a positive weight cycle within an SCC exists, the program is 
     * not ASC schedulable. A positive weight cycle exists, if an SCC contains a node
     * that is connected to another node within the same SCC by a -->_wir edge, meaning 
     * a concurrent and not confluent dependency edge.
     * An SCG is also not schedulable, if a Write-Write conflict exists (concurrently).
     * 
     * @param sccs
     *          The list of Strongly Connected Components of the SCG
     * 
     * @returns
     *          @true, if the SCG is ASC schedulable and @false, if not
     */
    public def boolean schedulable(LinkedList<LinkedList<Node>> sccs) {
        
        for(scc : sccs) {
            for (node : scc) {
                val dependencies = node.dependencies
                for (dependency : dependencies) {
                    if (dependency instanceof DataDependency) {
                        if (dependency.concurrent && !dependency.confluent) {
                            if (dependency.type == DataDependencyType.WRITE_WRITE || scc.exists [n |n.equals(dependency.target)]) {
                                return false
                            }
                        }
                    }
                }
            }            
        }
        true
    }

    /**
     * Handles depth-joins, if they exist within Strongly Connected Components:
     * If a Strongly Connected Component exists only because it crosses a depth-join, 
     * the model should be schedulable. Therefore, the Strongly Connected Component 
     * is broken up (by removing the join-node) and a new SCC-Analysis is executed 
     * upon the remaining nodes of the SCC.
     * 
     */
    private def breakDepthJoinSCCs() {
        var LinkedList<LinkedList<Node>> newSCCs = newLinkedList
        
        for(scc : sccList) {
            
            if (scc.head.hasAnnotation(SCHIZO_ANNOTATION) && scc.length > 1) {
                // Look if the SCC should be rejected. If it should be rejected, we will not break the scc and the 
                // model will be rejected by the scheduling-analysis
                if(findSchizoDependencyCycle(scc)) {
                    newSCCs.add(scc)
                } else {
                    // Remove information about schizophrenia (such that a recursive call does not think it is schizo
                    scc.head.removeAllAnnotations(SCHIZO_ANNOTATION)
                    // Recursively call the scc-analysis with all nodes except the depth-join annotated earlier
                    var subSCCCalc = (injector.getInstance(StronglyConnectedComponentCalc))
                    val newSCC = subSCCCalc.findSCCs(scc.filter[n | !n.hasAnnotation(DEPTH_JOIN_ANNOTATION)])
                    // Create a new Strongly Connected Component containing only the depth-join node
                    var LinkedList<Node> join = newLinkedList
                    join.addAll(scc.filter[n | n.hasAnnotation(DEPTH_JOIN_ANNOTATION)])
                    // Add all recursively created SCCs as well as the SCC of the join-node
                    newSCCs.addAll(newSCC)
                    newSCCs.add(join)         
                    schizoSccList.add(scc)           
                }
            } else {
                newSCCs.add(scc)
            }
        }
        sccList = newSCCs
    }
    
    /**
     * Finds out, whether a dependency cycle exists that crosses into a thread not within the threads of the 
     * depth-join. This method should only be called if we find a schizophrenic thread
     * 
     * @param scc The Strongly Connected Component for which to find the dependency cycle
     * 
     * @returns whether the scc contains a dependency cycle across a thread not within the threads of the depth-join
     */
    private def findSchizoDependencyCycle(LinkedList<Node> scc) {
        var HashMap<Node, Boolean> threadsOfDepthJoins = newHashMap
        var depthJoins = scc.filter[n | n.hasAnnotation(DEPTH_JOIN_ANNOTATION)].map[n | (n as Join).fork]
        for(fork : depthJoins) {
            for(n : fork.neighbors) {
                threadsOfDepthJoins.put(n, true)
            }
            threadsOfDepthJoins.put(fork.threadEntry, true)
        }
        
        for(node : scc) {
            if(!threadsOfDepthJoins.containsKey(node.threadEntry)) {
                return true
            }
        }
        return false
    }


}
