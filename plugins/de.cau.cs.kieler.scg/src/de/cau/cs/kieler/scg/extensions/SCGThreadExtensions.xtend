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
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Surface
import java.util.List
import java.util.Map
import java.util.Set
import de.cau.cs.kieler.scg.Exit

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
    def List<Node> getThreadNodes (Entry entry) {
    	// Create a new list of nodes and 
    	// a list of control flows that mark paths within the thread.
        val List<Node> returnList = <Node> newLinkedList
        val List<ControlFlow> controlFlows = <ControlFlow> newLinkedList
        
        // Add the entry node itself and retrieve the exit of the thread
        // with aid of the opposite relation in the entry node. 
        returnList.add(entry)
        val exit = entry.exit
        // Add a list for exit nodes for nested threads.
        val exitList = <Exit> newArrayList(exit)
        
        // If the exit node follows the entry node directly, exit here.
        if (entry.next.target == exit) {
	        returnList.add(exit)
    	    return returnList
        }
        
        // Now, follow the control flow until the exit node is reached 
        // and add each node that is not already in the node list.
        controlFlows.addAll(entry.allNext)
        while(!controlFlows.empty) {
        	// Next node is the first target in the control flow list.
            var nextNode = controlFlows.head.target
            
            // Remove this control flow.
            controlFlows.remove(0)
            
            // Add the node if its not already contained.
            if (!returnList.contains(nextNode)) returnList.add(nextNode);
            
            if (nextNode instanceof Surface) {
	            // Since surface node do not have extra control flows to their 
    	        // corresponding depth, set the next node manually.
                nextNode = nextNode.depth
                if (!returnList.contains(nextNode)) returnList.add(nextNode);                                
            }
            if (nextNode instanceof Entry) {
                exitList += nextNode.exit
            }
            
            // Now, add all succeeding control flow provided 
            //   - that the flow is not already included in the flow list
            //   - the target of the flow is not already processed
            //   - and the target of the flow is not the exit node.  
            if (nextNode != null)
            nextNode.allNext.filter[ 
            	(!returnList.contains(it.target)) && 
            	(!controlFlows.contains(it)) && 
                (!it.target.equals(exit)) ] 
                	=> [ controlFlows.addAll(it) ]
        }
        
        // Reverse search outgoing from the exit node
        for(exitNode : exitList) {
            controlFlows.addAll(exitNode.allPrevious)
            while(!controlFlows.empty) {
                var nextNode = controlFlows.head.eContainer as Node
                controlFlows.remove(0)
                if (!returnList.contains(nextNode)) returnList.add(nextNode)
                if (nextNode instanceof Depth) {
                    nextNode = (nextNode as Depth).surface
                    if (!returnList.contains(nextNode)) returnList.add(nextNode)
                }
                if (nextNode != null)
                nextNode.allPrevious.filter[ 
                    (!returnList.contains(it.eContainer)) && 
                    (!controlFlows.contains(it)) ] 
                        => [ controlFlows.addAll(it) ]
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
    	val threadMapping = <Entry, Set<Node>> newHashMap
    	val nodeMapping = <Node, List<Entry>> newHashMap
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
    def void getAllThreadNodesAndThreads(Entry entry, Map<Entry, Set<Node>> threadMapping, Map<Node, List<Entry>> nodeMapping) {
    	// Create a new list of nodes and 
    	// a list of control flows that mark paths within the thread.
    	val returnMap = threadMapping
        val nodeSet = <Node> newHashSet
        val controlFlows = <ControlFlow> newLinkedList
        
        val entryList = <Entry> newArrayList => [
        	add(entry)
        	val previousNode = entry.allPrevious.head?.eContainer as Node
        	if (previousNode != null) {
        		addAll(nodeMapping.get(previousNode))
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
        while(!controlFlows.empty) {
        	// Next node is the first target in the control flow list.
            var nextNode = controlFlows.head.target
            
            // Remove this control flow.
            controlFlows.remove(0)
            
            nodeSet.add(nextNode);
            
            if (nextNode instanceof Entry) {
            	val nNMap = <Entry, Set<Node>> newHashMap;
            	nextNode.getAllThreadNodesAndThreads(nNMap, nodeMapping)
            	for(k : nNMap.keySet) {
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
            //   - that the flow is not already included in the flow list
            //   - the target of the flow is not already processed
            //   - and the target of the flow is not the exit node.  
            if (nextNode != null)
            nextNode.allNext.filter[ 
            	(!nodeSet.contains(it.target)) && 
            	(!controlFlows.contains(it)) && 
                (!it.target.equals(exit)) ] 
                	=> [ controlFlows.addAll(it) ]
        }
        
        // Reverse search outgoing from the exit node
        controlFlows.addAll(exit.allPrevious)
        while(!controlFlows.empty) {
            var nextNode = controlFlows.head.eContainer as Node
            controlFlows.remove(0)
            if (!nodeSet.contains(nextNode)) {
            	nodeSet.add(nextNode)
            	if (!(nextNode instanceof Entry)){ 
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
       	    if (nextNode != null && nextNode != exit.entry) {
	            nextNode.allPrevious.filter[ 
	                (!nodeSet.contains(it.eContainer)) && 
	                (!controlFlows.contains(it)) ] 
	                    => [ controlFlows.addAll(it) ]
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
    def Set<Node> getShallowThreadNodes (Entry entry) {
    	// Create a new list of nodes and 
    	// a list of control flows that mark paths within the thread.
        val nodeSet = <Node> newHashSet
        val controlFlows = <ControlFlow> newLinkedList
        
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
        while(!controlFlows.empty) {
        	// Next node is the first target in the control flow list.
            var nextNode = controlFlows.head.target
            
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
            //   - that the flow is not already included in the flow list
            //   - the target of the flow is not already processed
            //   - and the target of the flow is not the exit node.  
            if (nextNode != null)
            nextNode.allNext.filter[ 
            	(!nodeSet.contains(it.target)) && 
            	(!controlFlows.contains(it)) && 
                (!it.target.equals(exit)) ] 
                	=> [ controlFlows.addAll(it) ]
        }
        
        // Reverse search outgoing from the exit node
        controlFlows.addAll(exit.allPrevious)
        while(!controlFlows.empty) {
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
            if (nextNode != null && nextNode != exit.entry)
            nextNode.allPrevious.filter[ 
                (!nodeSet.contains(it.eContainer)) && 
                (!controlFlows.contains(it)) ] 
                    => [ controlFlows.addAll(it) ]
        }
        
        // Add the exit node and return.
        nodeSet.add(exit)
        nodeSet
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
        val controlFlows = <ControlFlow> newLinkedList
        val marked = <ControlFlow> newLinkedList
       
        // Add all incoming control flows to the list an repeat until the list is empty.
        controlFlows += node.allPrevious
        if (node instanceof Depth) controlFlows += (node as Depth).surface.allPrevious
        if (node instanceof Join) {
            controlFlows.clear
            controlFlows += (node as Join).fork.allPrevious    
        }
        while(!controlFlows.empty) {
            // Check the first control flow and its parent node.
            var prevNode = controlFlows.head.eContainer as Node
            
            // Mark the flow as processed and remove it.
            marked += controlFlows.head
            controlFlows.remove(0)
           
            if (prevNode instanceof Join) { 
                // If it is a join, continue at the corresponding fork node.
                controlFlows += (prevNode as Join).fork.allPrevious
            }
            else if (prevNode instanceof Entry) {
                // If it is a entry node, return it
                return prevNode as Entry
            } 
            else if (prevNode instanceof Depth) {
                // If it is a depth, continue at the corresponding surface node.
                controlFlows += (prevNode as Depth).surface.allPrevious
            } else {
                // Otherwise, proceed on the control flow path.
                controlFlows += prevNode.allPrevious           
            }
           
            // If the a newly added control flow is already marked, remove it.
            marked.forEach[
                if (controlFlows.contains(it)) controlFlows.remove(it)
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
        val controlFlows = <ControlFlow> newLinkedList
        val marked = <ControlFlow> newLinkedList
       
        // Add all incoming control flows to the list an repeat until the list is empty.
        controlFlows += node.allPrevious
        if (node instanceof Depth) controlFlows += (node as Depth).surface.allPrevious
        while(!controlFlows.empty) {
            // Check the first control flow and its parent node.
            var prevNode = controlFlows.head.eContainer as Node
            
            // Mark the flow as processed and remove it.
            marked += controlFlows.head
            controlFlows.remove(0)
           
            if (prevNode instanceof Join) { 
                // If it is a join, continue at the corresponding fork node.
                controlFlows += (prevNode as Join).fork.allPrevious
            }
            else if (prevNode instanceof Fork) {
                // If it is a fork node, return it
                return prevNode as Fork
            } 
            else if (prevNode instanceof Depth) {
                // If it is a depth, continue at the corresponding surface node.
                controlFlows += (prevNode as Depth).surface.allPrevious
            } else {
                // Otherwise, proceed on the control flow path.
                controlFlows += prevNode.allPrevious           
            }
           
            // If the a newly added control flow is already marked, remove it.
            marked.forEach[
                if (controlFlows.contains(it)) controlFlows.remove(it)
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
        val returnList = <Fork> newLinkedList

        // Retrieve immediate ancestor fork. 
        var fork = node.ancestorFork       
        while(!fork.isNull) {
            returnList += fork
            fork = fork.ancestorFork
        }
       
        // Return the list.
        return returnList
    }


    def Node getThreadEntryNode(Node node) {
//        if (node instanceof Exit) return (node as Exit).entry
        
        val fork = node.getAncestorFork
        if (fork == null) return null

        for (ent : fork.allNext.map[target].filter(typeof(Entry))) {
            if (ent.threadNodes.contains(node)) return ent;
        }
        null
    }
    
    
    
    private def void accumulateThreadControlFlowsTypes(ControlFlow next, List<ControlFlow> localFlow, 
    	ThreadPathType type, Map<Entry, ThreadPathType> threadTypes, Entry source
    ) {
    	// Already in the local flow list: loop! Abort.
        if (localFlow.contains(next)) {
            threadTypes.addToThreadPathTypeMap(source, type)
            return;
        }
        
        // Target node is reached. Add the control flow, 
        // then add the local flow to the list of flows and return.
        if (next.target == source.exit) {
        	localFlow.add(next)
        	var newType = type
        	if (type == ThreadPathType::DISCONNECTED) {
        		newType = ThreadPathType::INSTANTANEOUS
        	}
            threadTypes.addToThreadPathTypeMap(source, newType)
            return;
        }
        
        // Otherwise, follow the flow and recursively call this method to proceed on further control flows.
        localFlow.add(next)
        val nextFlows = next.target.allNext
        if (next.target instanceof Fork) {
       		val fork = next.target as Fork
        	var newType = type
        	val entries = fork.allNext.map[ target ]
        	for (entry : entries) {
        		val childMap = (entry as Entry).getThreadControlFlowTypes
        		threadTypes.putAll(childMap)
        		newType = threadTypes.get(entry).combineThreadType(newType)
        	}
        	fork.join.next?.accumulateThreadControlFlowsTypes(
        		localFlow, newType, threadTypes, source
        	)
        } else {
    	    for (nextFlow : nextFlows) {
	    	    nextFlow.accumulateThreadControlFlowsTypes(localFlow, type, threadTypes, source)
           }
        }
        
        if (next.target instanceof Surface) {
        	val newType = type.combineThreadType(ThreadPathType::DELAYED)
            (next.target as Surface).depth.next.accumulateThreadControlFlowsTypes( 
                localFlow, newType, threadTypes, source
            )
        }
    }

    def Map<Entry, ThreadPathType> getThreadControlFlowTypes(Entry source) {
   	    val threadTypes = <Entry, ThreadPathType> newHashMap => [ put(source, ThreadPathType::DISCONNECTED) ] 
   	    source.next.accumulateThreadControlFlowsTypes(newArrayList(), ThreadPathType::DISCONNECTED, threadTypes, source) 
   	    threadTypes 
    }
    
    private def ThreadPathType combineThreadType(ThreadPathType oldType, ThreadPathType type) {
    	var newType = type
    	if (oldType == ThreadPathType::DISCONNECTED) {
    		// Do nothing. Take the new type.
    	}
    	else if (oldType == ThreadPathType::INSTANTANEOUS) {
    		if (type == ThreadPathType::DISCONNECTED) {
    			newType = oldType
    		}
    		else if (type != ThreadPathType::INSTANTANEOUS) {
    			newType = ThreadPathType::POTENTIALLY_INSTANTANEOUS
    		}
    	} 
    	else if (oldType == ThreadPathType::DELAYED) {
    		if (type == ThreadPathType::DISCONNECTED) {
    			newType = oldType
    		}
    		else if (type != ThreadPathType::DELAYED) {
    			newType = ThreadPathType::POTENTIALLY_INSTANTANEOUS
    		}
    	}
    	else if (oldType == ThreadPathType::POTENTIALLY_INSTANTANEOUS) {
    		newType = ThreadPathType::POTENTIALLY_INSTANTANEOUS
    	}
    	
    	newType
    }
    
    private def ThreadPathType addToThreadPathTypeMap(Map<Entry, ThreadPathType> map, Entry node, ThreadPathType type) {
    	val oldType = map.get(node)
    	val newType = oldType.combineThreadType(type)
    	map.put(node, newType)
    	newType
    }
    
    def toString2(ThreadPathType type) {
    	if (type == ThreadPathType::DISCONNECTED) return "Disconnected"
    	if (type == ThreadPathType::DELAYED) return "Delayed"
    	if (type == ThreadPathType::INSTANTANEOUS) return "Instantaneous"
    	if (type == ThreadPathType::POTENTIALLY_INSTANTANEOUS) return "Potentially instantaneous"
    	return "Unknown"
    }
    
    def ThreadPathType fromString2(String string) {
        if (string == "Disconnected") return ThreadPathType::DISCONNECTED
        if (string == "Delayed") return ThreadPathType::DELAYED
        if (string == "Instantaneous") return ThreadPathType::INSTANTANEOUS
        if (string == "Potentially instantaneous") return ThreadPathType::POTENTIALLY_INSTANTANEOUS
        return ThreadPathType::UNKNOWN;
    }
    

}
