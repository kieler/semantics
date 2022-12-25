/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Surface
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.annotations.Data

/**
 * The SCG Extensions are a collection of common methods for SCG queries and manipulation.
 * The class is separated in several categories. If a category growths too big, it may be 
 * desired to relocate its functions in a specialized extensions class. At the moment the class
 * contains functions for the following tasks.
 * <ul>
 *   <li>Valued object handling</li>
 *   <li>Control flow queries</li>
 *   <li>Thread management</li>
 *   <li>Basic block and scheduling block qeuries</li>
 *   <li>Scheduling problem management</li>
 *   <li>Expression helper</li>
 * </ul> 
 * SCG model copy functions and transformation helper are already relocated to their appropriate
 * extensions.
 * 
 * @author ssm
 * @author cmot
 * @kieler.design 2013-08-20 proposed 
 * @kieler.rating 2013-08-20 proposed yellow
 */
class SCGThreadExtensions {

    @Inject
    extension SCGCoreExtensions

    @Inject
    extension SCGControlFlowExtensions

    @Inject
    extension AnnotationsExtensions

    public static val IGNORE_INTER_THREAD_CF_ANNOTATION = "ignore_interthread_cf"

    // -------------------------------------------------------------------------
    // -- Thread management
    // -------------------------------------------------------------------------
    /**
     * Retrieves all of nodes of a thread. In the SCG sense a thread starts at its 
     * entry node and ends at its exit node. Hence, each thread is identified by
     * its entry node and the successors of a fork node (retrievable via
     * {@link #getAllNext(Node)}) are the entry nodes of each thread of that fork node.
     * 
     * @param entry
     * 			the entry node of the thread
     * @return Returns a list of nodes of the given thread. 
     */
    def List<Node> getThreadNodes(Entry entry) {
        // Create a new list of nodes and 
        // a list of control flows that mark paths within the thread.
        val List<Node> returnList = <Node>newLinkedList
        val List<ControlFlow> controlFlows = <ControlFlow>newLinkedList

        // Add the entry node itself and retrieve the exit of the thread
        // with aid of the opposite relation in the entry node. 
        returnList.add(entry)
        val exit = entry.exit
        // Add a list for exit nodes for nested threads.
        val exitList = <Exit>newArrayList(exit)

        // If the exit node follows the entry node directly, exit here.
        if (entry.next.target == exit) {
            returnList.add(exit)
            return returnList
        }

        // Now, follow the control flow until the exit node is reached 
        // and add each node that is not already in the node list.
        controlFlows.addAll(entry.allNext)
        while (!controlFlows.empty) {
            // Next node is the first target in the control flow list.
            var nextNode = controlFlows.head.targetNode

            // Remove this control flow.
            controlFlows.remove(0)

            // Add the node if its not already contained.
            if(!returnList.contains(nextNode)) returnList.add(nextNode);

            if (nextNode instanceof Surface) {
                // Since surface node do not have extra control flows to their 
                // corresponding depth, set the next node manually.
                nextNode = nextNode.depth
                if(!returnList.contains(nextNode)) returnList.add(nextNode);
            }
            if (nextNode instanceof Entry) {
                exitList += nextNode.exit
            }

            // Now, add all succeeding control flow provided 
            // - that the flow is not already included in the flow list
            // - the target of the flow is not already processed
            // - and the target of the flow is not the exit node.  
            if (nextNode !== null)
                nextNode.allNext.filter [
                    (!returnList.contains(it.target)) && (!controlFlows.contains(it)) && (!it.target.equals(exit)) &&
                        (!it.hasAnnotation(SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION))
                ] => [controlFlows.addAll(it)]
        }

        // Reverse search outgoing from the exit node
        for (exitNode : exitList) {
            controlFlows.addAll(exitNode.allPrevious)
            while (!controlFlows.empty) {
                var nextNode = controlFlows.head.eContainer as Node
                controlFlows.remove(0)
                if(!returnList.contains(nextNode)) returnList.add(nextNode)
                if (nextNode instanceof Depth) {
                    nextNode = (nextNode as Depth).surface
                    if(!returnList.contains(nextNode)) returnList.add(nextNode)
                }
                if (nextNode !== null)
                    nextNode.allPrevious.filter [
                        (!returnList.contains(it.eContainer)) && (!controlFlows.contains(it)) && (!it.hasAnnotation(
                            SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION))
                    ] => [controlFlows.addAll(it)]
            }
            // Add the exit node.
            if (!returnList.contains(exitNode)) {
                returnList.add(exitNode)
            }
        }

        returnList
    }

    /**
     * Retrieves all nodes of a thread. In the SCG sense a thread starts at its 
     * entry node and ends at its exit node. Hence, each thread is identified by
     * its entry node and the successors of a fork node (retrievable via
     * {@link #getAllNext(Node)}) are the entry nodes of each thread of that fork node.
     * 
     * @param entry
     * 			the entry node of the thread
     * @return Returns a list of nodes of the given thread. 
     */
    def Map<Entry, Set<Node>> getAllThreadNodes(Entry entry) {
        val threadMapping = <Entry, Set<Node>>newHashMap
        val nodeMapping = <Node, List<Entry>>newHashMap
        entry.getAllThreadNodesAndThreads(threadMapping, nodeMapping)
        threadMapping
    }

    /**
     * Retrieves all nodes of a thread. In the SCG sense a thread starts at its 
     * entry node and ends at its exit node. Hence, each thread is identified by
     * its entry node and the successors of a fork node (retrievable via
     * {@link #getAllNext(Node)}) are the entry nodes of each thread of that fork node.
     * 
     * @param entry
     * 			the entry node of the thread
     * @return Returns a list of nodes of the given thread. 
     */
    def void getAllThreadNodesAndThreads(Entry entry, Map<Entry, Set<Node>> threadMapping,
        Map<Node, List<Entry>> nodeMapping) {
        // Create a new list of nodes and 
        // a list of control flows that mark paths within the thread.
        val returnMap = threadMapping
        val nodeSet = <Node>newHashSet
        val controlFlows = <ControlFlow>newLinkedList

        val entryList = <Entry>newArrayList => [
            add(entry)
            val previousNode = entry.allPrevious.head?.eContainer
            if (previousNode !== null) {
                val nodes = nodeMapping.get(previousNode)
                if (nodes !== null) {
                    addAll(nodeMapping.get(previousNode))
                }
            }
        ]

        // Add the entry node itself and retrieve the exit of the thread
        // with aid of the opposite relation in the entry node. 
        returnMap.put(entry, nodeSet)
        nodeMapping.put(entry, entryList)
        val exit = entry.exit

        // If the exit node follows the entry node directly, exit here.
        if (entry.next.target == exit) {
            nodeSet.add(exit)
            nodeMapping.put(exit, entryList)
            return
        }

        // Now, follow the control flow until the exit node is reached 
        // and add each node that is not already in the node list.
        controlFlows.addAll(entry.allNext)
        while (!controlFlows.empty) {
            // Next node is the first target in the control flow list.
            var nextNode = controlFlows.head.targetNode

            // Remove this control flow.
            controlFlows.remove(0)

            nodeSet.add(nextNode);

            if (nextNode instanceof Entry) {
                val nNMap = <Entry, Set<Node>>newHashMap;
                nextNode.getAllThreadNodesAndThreads(nNMap, nodeMapping)
                for (k : nNMap.keySet) {
                    val nNNodeList = nNMap.get(k)
                    returnMap.put(k, nNNodeList)
                    nodeSet.addAll(nNNodeList)
                }
                nextNode = nextNode.exit
                nodeSet.add(nextNode);
            } else {
                nodeMapping.put(nextNode, entryList)

                if (nextNode instanceof Surface) {
                    // Since surface node do not have extra control flows to their 
                    // corresponding depth, set the next node manually.
                    nextNode = nextNode.depth
                    nodeSet.add(nextNode);
                    nodeMapping.put(nextNode, entryList)
                }
            }

            // Now, add all succeeding control flow provided 
            // - that the flow is not already included in the flow list
            // - the target of the flow is not already processed
            // - and the target of the flow is not the exit node.  
            if (nextNode !== null)
                nextNode.allNext.filter [
                    (!nodeSet.contains(it.target)) && (!controlFlows.contains(it)) && (!it.target.equals(exit)) &&
                        (!it.hasAnnotation(
                            SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION))
                ] => [controlFlows.addAll(it)]
        }

        // Reverse search outgoing from the exit node
        controlFlows.addAll(exit.allPrevious.filter [
            !hasAnnotation(SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION)
        ])
        while (!controlFlows.empty) {
            var nextNode = controlFlows.head.eContainer as Node
            controlFlows.remove(0)
            if (!nodeSet.contains(nextNode)) {
                nodeSet.add(nextNode)
                if (!(nextNode instanceof Entry)) {
                    nodeMapping.put(nextNode, entryList)
                }
                if (nextNode instanceof Exit) {
                    // It is not necessary to reverse search the included threads again
                    // because their reverse search was executed in the previous call also.
                    // Therefore, proceed directly with the entry node.
                    nextNode = (nextNode as Exit).entry
                    nodeSet.add(nextNode);
                } else if (nextNode instanceof Depth) {
                    nextNode = (nextNode as Depth).surface
                    nodeSet.add(nextNode)
                    nodeMapping.put(nextNode, entryList)
                }
            }
            if (nextNode !== null && nextNode != exit.entry) {
                nextNode.allPrevious.filter [
                    (!nodeSet.contains(it.eContainer)) && (!controlFlows.contains(it)) && (!hasAnnotation(
                        SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION))
                ] => [controlFlows.addAll(it)]
            }
        }

        // Add the exit node and return.
        nodeSet.add(exit)
    }

    /**
     * Retrieves all nodes of a thread. In the SCG sense a thread starts at its 
     * entry node and ends at its exit node. Hence, each thread is identified by
     * its entry node and the successors of a fork node (retrievable via
     * {@link #getAllNext(Node)}) are the entry nodes of each thread of that fork node.
     * 
     * @param entry
     * 			the entry node of the thread
     * @return Returns a list of nodes of the given thread. 
     */
    def Set<Node> getShallowThreadNodes(Entry entry) {
        // Create a new list of nodes and 
        // a list of control flows that mark paths within the thread.
        val nodeSet = <Node>newHashSet
        val controlFlows = <ControlFlow>newLinkedList

        // Add the entry node itself and retrieve the exit of the thread
        // with aid of the opposite relation in the entry node. 
        val exit = entry.exit

        // If the exit node follows the entry node directly, exit here.
        if (entry.next.target == exit) {
            nodeSet.add(exit)
            return nodeSet
        }

        // Now, follow the control flow until the exit node is reached 
        // and add each node that is not already in the node list.
        controlFlows.addAll(entry.allNext)
        while (!controlFlows.empty) {
            // Next node is the first target in the control flow list.
            var nextNode = controlFlows.head.targetNode

            // Remove this control flow.
            controlFlows.remove(0)

            nodeSet.add(nextNode);

            if (nextNode instanceof Fork) {
                nextNode = (nextNode as Fork).join
                nodeSet.add(nextNode);
            }

            if (nextNode instanceof Surface) {
                // Since surface node do not have extra control flows to their 
                // corresponding depth, set the next node manually.
                nextNode = (nextNode as Surface).depth
                nodeSet.add(nextNode);
            }

            // Now, add all succeeding control flow provided 
            // - that the flow is not already included in the flow list
            // - the target of the flow is not already processed
            // - and the target of the flow is not the exit node.  
            if (nextNode !== null)
                nextNode.allNext.filter [
                    (!nodeSet.contains(it.target)) && (!controlFlows.contains(it)) && (!it.target.equals(exit)) &&
                        (!hasAnnotation(
                            SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION))
                ] => [controlFlows.addAll(it)]
        }

        // Reverse search outgoing from the exit node
        controlFlows.addAll(exit.allPrevious)
        while (!controlFlows.empty) {
            var nextNode = controlFlows.head.eContainer as Node
            controlFlows.remove(0)
            nodeSet.add(nextNode)
            if (nextNode instanceof Join) {
                // It is not necessary to reverse search the included threads again
                // because their reverse search was executed in the previous call also.
                // Therefore, proceed directly with the entry node.
                nextNode = (nextNode as Join).fork
                nodeSet.add(nextNode);
            }
            if (nextNode instanceof Depth) {
                nextNode = (nextNode as Depth).surface
                nodeSet.add(nextNode)
            }
            if (nextNode !== null && nextNode != exit.entry)
                nextNode.allPrevious.filter [
                    (!nodeSet.contains(it.eContainer)) && (!controlFlows.contains(it)) && (!hasAnnotation(
                        SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION))
                ] => [controlFlows.addAll(it)]
        }

        // Add the exit node and return.
        nodeSet.add(exit)
        nodeSet
    }
    
    /**
     * Lists all surface and depth nodes in the given thread.
     */
    def SurfaceDepth calculateSurfaceDepth(Entry entry) {
        val sd = new SurfaceDepth()
        val end = entry.exit
        val starts = <Node>newLinkedHashSet
        val processed = <Node>newHashSet
        
        starts += entry

        while (!starts.empty) {
            val start = starts.head
            val surface = start instanceof Entry
            if (surface) {
                sd.surface += start
            } else {
                sd.depth += start
            }

            val visited = <Node>newHashSet
            val nextNodes = <Node>newLinkedHashSet
            
            visited += start
            nextNodes += start.allNextNodes
            
            while (!nextNodes.empty) {
                var node = nextNodes.head
                nextNodes -= node
                visited += node
                
                if (surface) {
                    sd.surface += node
                } else {
                    sd.depth += node
                }

                if (node instanceof Surface) {
                    if (!processed.contains(node)) {
                        starts += node.depth
                    }
                } else {
                    val nextCF = node.allNext
                    // visit successors
                    for (cf : nextCF) {
                        val nextNode = cf.target.asNode
                        if (nextNode == end) {
                            if (surface) {
                                sd.surface += nextNode
                            } else {
                                sd.depth += nextNode
                            }
                        } else if (
                            !visited.contains(nextNode) 
                            && !(
                                surface && sd.surface.contains(nextNode)
                                || !surface && sd.depth.contains(nextNode)
                            )
                            && !cf.hasAnnotation(SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION)
                        ) {
                            nextNodes += nextNode
                        }
                    }
                }
            }

            starts -= start
            processed += start
        }

        return sd
    }
    

    /** 
     * Finds the immediate entry node of a node.
     * 
     * @param node
     *           the node in question
     * @return Returns the closest entry node.
     */
    def Entry getThreadEntry(Node node) {
        // Create a list for the control flows that will be checked
        // and a list for all control flows already checked. 
        val controlFlows = <ControlFlow>newLinkedList
        val marked = <ControlFlow>newLinkedList

        // Add all incoming control flows to the list an repeat until the list is empty.
        controlFlows += node.allPrevious
        if(node instanceof Depth) controlFlows += (node as Depth).surface.allPrevious
        // INSERTED FROM lpe/priorities
        if (node instanceof Join) {
            controlFlows.clear
            controlFlows += (node as Join).fork.allPrevious
        }
        while (!controlFlows.empty) {
            // Check the first control flow and its parent node.
            var prevNode = controlFlows.head.eContainer as Node

            // Mark the flow as processed and remove it.
            marked += controlFlows.head
            controlFlows.remove(0)

            if (prevNode instanceof Join) {
                // If it is a join, continue at the corresponding fork node.
                controlFlows += (prevNode as Join).fork.allPrevious
            } else if (prevNode instanceof Entry) {
                // If it is a entry node, return it
                return prevNode as Entry
            } else if (prevNode instanceof Depth) {
                // If it is a depth, continue at the corresponding surface node.
                controlFlows += (prevNode as Depth).surface.allPrevious
            } else {
                // Otherwise, proceed on the control flow path.
                controlFlows += prevNode.allPrevious
            }

            // If the a newly added control flow is already marked, remove it.
            marked.forEach [
                if(controlFlows.contains(it)) controlFlows.remove(it)
            ]
        }

        // Return null if finished without entry
        return null
    }

    /** 
     * Finds the ancestor fork of a node. May return null, if no fork node is found.
     * 
     * @param node
     * 			the node in question
     * @return Returns the ancestor fork of an node or null.
     */
    def Fork getAncestorFork(Node node) {
        // Create a list for the control flows that will be checked
        // and a list for all control flows already checked. 
        val controlFlows = <ControlFlow>newLinkedList
        val marked = <ControlFlow>newLinkedList

        // Add all incoming control flows to the list an repeat until the list is empty.
        controlFlows += node.allPrevious
        if(node instanceof Depth) controlFlows += (node as Depth).surface.allPrevious
        while (!controlFlows.empty) {
            // Check the first control flow and its parent node.
            var prevNode = controlFlows.head.eContainer as Node

            // Mark the flow as processed and remove it.
            marked += controlFlows.head
            controlFlows.remove(0)

            if (prevNode instanceof Join) {
                // If it is a join, continue at the corresponding fork node.
                controlFlows += (prevNode as Join).fork.allPrevious
            } else if (prevNode instanceof Fork) {
                // If it is a fork node, return it
                return prevNode as Fork
            } else if (prevNode instanceof Depth) {
                // If it is a depth, continue at the corresponding surface node.
                controlFlows += (prevNode as Depth).surface.allPrevious
            } else {
                // Otherwise, proceed on the control flow path.
                controlFlows += prevNode.allPrevious
            }

            // If the a newly added control flow is already marked, remove it.
            marked.forEach [
                if(controlFlows.contains(it)) controlFlows.remove(it)
            ]
        }

        // Return null if finished without fork
        return null
    }

    /** 
     * Finds all ancestor forks of a node. An ancestor fork list contains all forks that contain a given node
     * with respect to hierarchy.
     * 
     * @param node
     *           the node in question
     * @return Returns a list of all ancestor forks.
     */
    def List<Fork> getAncestorForks(Node node) {
        // Create a list for the ancestor forks. 
        val returnList = <Fork>newLinkedList

        // Retrieve immediate ancestor fork. 
        var fork = node.ancestorFork
        while (!fork.isNull) {
            returnList += fork
            fork = fork.ancestorFork
        }

        // Return the list.
        return returnList
    }

    def Map<Entry, ThreadPathType> getThreadControlFlowTypes(Entry source) {
        val tempThreadTypes = <Node, ThreadPathType>newHashMap => []
        val next = <Node>newLinkedList
        next.add(source)
        while (next.size > 0) {
            val n = next.first
            if (n instanceof Exit) {
                tempThreadTypes.put(n, ThreadPathType::INSTANTANEOUS)
                next.remove(0);
            } else if (n instanceof Fork) {
                var fork = n as Fork
                var joinType = ThreadPathType::DISCONNECTED
                var allDefined = true
                if (fork.join !== null) {
                    if (tempThreadTypes.containsKey(fork.join))
                        joinType = tempThreadTypes.get(fork.join)
                    else {
                        allDefined = false
                        next.add(0, fork.join)
                    }
                }
                var sourcesType = ThreadPathType::DISCONNECTED
                var sources = fork.allNext.map[target]
                for (s : sources) {
                    if (s !== null) {
                        if (tempThreadTypes.containsKey(s))
                            sourcesType = sourcesType.combineThreadTypeFork(tempThreadTypes.get(s))
                        else {
                            if (next.contains(s))
                                sourcesType = sourcesType.combineThreadTypeFork(ThreadPathType::INSTANTANEOUS) // in this case we have an instantaneous loop
                            else {
                                allDefined = false;
                                next.add(0, s as Node)
                            }
                        }
                    }
                }
                if (allDefined) {
                    tempThreadTypes.put(n, joinType.combineThreadTypeFork(sourcesType))
                    next.remove(0)
                }
            } else if (n instanceof Surface) {
                tempThreadTypes.put(n, ThreadPathType::DELAYED)
                next.remove(0)
                if (!tempThreadTypes.containsKey((n as Surface).depth) && !next.contains((n as Surface).depth))
                    next.add((n as Surface).depth) // add at the end because it is not necessary to compute this for the current path
            } else {
                val targets = n.allNext.map[target]
                var type = ThreadPathType::DISCONNECTED
                var allDefined = true
                for (t : targets) {
                    if (t !== null) {
                        if (tempThreadTypes.containsKey(t))
                            type = type.combineThreadTypeDirect(tempThreadTypes.get(t))
                        else {
                            if (next.contains(t))
                                type = type.combineThreadTypeDirect(ThreadPathType::INSTANTANEOUS) // in this case we have an instantaneous loop
                            else {
                                allDefined = false;
                                next.add(0, t as Node)
                            }
                        }
                    }
                }
                if (allDefined) {
                    tempThreadTypes.put(n, type)
                    next.remove(0)
                }
            }
        }
        val threadTypes = <Entry, ThreadPathType>newHashMap
        for (n : tempThreadTypes.keySet) {
            if (n instanceof Entry) {
                // Final regions are always potentially instantaneos.
                val type = if (n.exit.final) ThreadPathType::POTENTIALLY_INSTANTANEOUS else tempThreadTypes.get(n) 
                threadTypes.put(n, type)
            }
        }
        threadTypes
    }

    /**
     * Combines two thread types when considering direct paths from entry to exit nodes.
     * E.g., if there exists two paths, one delayed and one potentially instantaneous, the whole thread becomes
     * potentially instantaneous. 
     */
    private def ThreadPathType combineThreadTypeDirect(ThreadPathType oldType, ThreadPathType type) {
        var newType = type

        switch (oldType) {
            case DISCONNECTED: {
            } // Do nothing
            case INSTANTANEOUS:
                switch (type) {
                    case DISCONNECTED:
                        newType = oldType
                    case INSTANTANEOUS: {
                    }
                    default:
                        newType = ThreadPathType::POTENTIALLY_INSTANTANEOUS
                }
            case DELAYED:
                switch (type) {
                    case DISCONNECTED:
                        newType = oldType
                    case DELAYED: {
                    }
                    default:
                        newType = ThreadPathType::POTENTIALLY_INSTANTANEOUS
                }
            case POTENTIALLY_INSTANTANEOUS: {
                newType = oldType
            }
            default: {
            }
        }

        return newType
    }

    /**
     * Combines two thread types when returning types from nested threads after a fork.
     * E.g. if two child threads are delayed and potentially instantaneous, the parent path becomes delayed, because 
     * both paths are executed and the thread has to wait for the delayed thread.
     */
    private def ThreadPathType combineThreadTypeFork(ThreadPathType oldType, ThreadPathType type) {
        var newType = type
        switch (oldType) {
            case DISCONNECTED: {
            } // Do nothing
            case INSTANTANEOUS:
                switch (type) {
                    case DISCONNECTED:
                        newType = oldType
                    case DELAYED: {
                    }
                    case INSTANTANEOUS: {
                    }
                    default:
                        newType = ThreadPathType::POTENTIALLY_INSTANTANEOUS
                }
            case DELAYED: {
                newType = oldType
            }
            case POTENTIALLY_INSTANTANEOUS:
                switch (type) {
                    case DISCONNECTED:
                        newType = oldType
                    case DELAYED: {
                    }
                    default:
                        newType = ThreadPathType::POTENTIALLY_INSTANTANEOUS
                }
            default: {
            }
        }

        newType
    }

    def toString2(ThreadPathType type) {
        if(type == ThreadPathType::DISCONNECTED) return "Disconnected"
        if(type == ThreadPathType::DELAYED) return "Delayed"
        if(type == ThreadPathType::INSTANTANEOUS) return "Instantaneous"
        if(type == ThreadPathType::POTENTIALLY_INSTANTANEOUS) return "Potentially instantaneous"
        return "Unknown"
    }

    def toString3(ThreadPathType type) {
        if(type == ThreadPathType::POTENTIALLY_INSTANTANEOUS) return "Pot. instantaneous" else type.toString2
    }

    def ThreadPathType fromString2(String string) {
        if(string == "Disconnected") return ThreadPathType::DISCONNECTED
        if(string == "Delayed") return ThreadPathType::DELAYED
        if(string == "Instantaneous") return ThreadPathType::INSTANTANEOUS
        if(string == "Potentially instantaneous") return ThreadPathType::POTENTIALLY_INSTANTANEOUS
        return ThreadPathType::UNKNOWN;
    }

}

@Data
class SurfaceDepth {
    val Set<Node> surface = newHashSet
    val Set<Node> depth = newHashSet
}
