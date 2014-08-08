/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Schedule
import java.util.List
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.kexpressions.Declaration
import java.util.HashMap
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference

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
class SCGExtensions { 
    
    @Inject
    extension KExpressionsExtension
    
    private int MAX_CONTROLFLOW_ACCUMULATION = 100;
    
    /** Valued object mapping */
    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>    


	def boolean hasBasicBlockData(SCGraph scg) {
		scg.basicBlocks.size > 0
	}
	
	def boolean hasSchedulingData(SCGraph scg) {
		scg.schedules.size > 0
	}

    // -------------------------------------------------------------------------
    // -- Valued object handling
    // -------------------------------------------------------------------------

    /**  
     * Creates a new ValuedObject.
     * 
     * @param valuedObjectName
     * 			the name of the valued object
     * @return Returns a new valued object with the given name.
     */
//    def ValuedObject createValuedObject(String valuedObjectName) {
//         KExpressionsFactory::eINSTANCE.createValuedObject => [
//             name = valuedObjectName
//         ]
//    }
   
    /** 
     * Creates a new ValuedObject in an SCG.
     * 
     * @param scg 
     * 			the SCG in question
     * @param valuedObjectName
     * 			the name of the valued object
     * @return Returns the new valued object. 
     */
    def ValuedObject createValuedObject(SCGraph scg, String valuedObjectName) {
         createValuedObject(valuedObjectName) => [
             scg.valuedObjects.add(it)
         ]
    }
   
	/** 
	 * Finds and retrieves a valued object by its name. May return null.
	 * 
	 * @param scg
	 * 			the SCG containing the object
	 * @param name
	 * 			the name of the valued object
	 * @return Returns the (first) valued object with the given name or null.
	 */
    def ValuedObject findValuedObjectByName(SCGraph scg, String name) {
    	for(tg : scg.declarations) {
    		for(vo : tg.valuedObjects) {
    			if (vo.name == name) return vo
    		}
   		}
   		return null
    }
    
    public def void copyDeclarations(SCGraph source, SCGraph target) {
    	for (declaration : source.declarations) {
    		val newDeclaration = createDeclaration(declaration)
    		declaration.valuedObjects.forEach[ copyValuedObject(newDeclaration) ]
    		target.declarations += newDeclaration
    	}
	}     
    
    public def void copyValuedObject(ValuedObject sourceObject, Declaration targetDeclaration) {
        val newValuedObject = sourceObject.copy
        targetDeclaration.valuedObjects += newValuedObject
        valuedObjectMapping.put(sourceObject, newValuedObject)
    }    
    
    def ValuedObject getValuedObjectCopy(ValuedObject valuedObject) {
        if (valuedObject == null) {
            throw new Exception("Valued Object is already null!")
        }
        val vo = valuedObjectMapping.get(valuedObject)
        if (vo == null) {
            throw new Exception("Valued Object not found! ["+valuedObject.name+"]")
        }
        vo
    }    
    
    def ValuedObject addToValuedObjectMapping(ValuedObject source, ValuedObject target) {
		valuedObjectMapping.put(source, target)
		target    	
    }    
    
    def Expression copySCGExpression(Expression expression) {
    	// Use the ecore utils to copy the expression. 
        val newExpression = expression.copy
        
        if (newExpression instanceof ValuedObjectReference) {
	        // If it is a single object reference, simply replace the reference with the object of the target SCG.
            (newExpression as ValuedObjectReference).valuedObject = 
                (expression as ValuedObjectReference).valuedObject.getValuedObjectCopy                    
        } else {
        	// Otherwise, query all references in the expression and replace the object with the new copy
        	// in the target SCG.
        	if (newExpression != null)
                newExpression.eAllContents.filter(typeof(ValuedObjectReference)).
            	   forEach[ valuedObject = valuedObject.getValuedObjectCopy ]        
        }
        
        // Return the new expression.
        newExpression
    }    


    // -------------------------------------------------------------------------
    // -- Control flow creation
    // -------------------------------------------------------------------------
    
	dispatch def ControlFlow createControlFlow(Entry entry) {
		ScgFactory::eINSTANCE.createControlFlow => [ entry.next = it ]
	}

	dispatch def ControlFlow createControlFlow(Exit exit) {
		ScgFactory::eINSTANCE.createControlFlow => [ exit.next = it ]
	}

	dispatch def ControlFlow createControlFlow(Depth depth) {
		ScgFactory::eINSTANCE.createControlFlow => [ depth.next = it ]
	}

	dispatch def ControlFlow createControlFlow(Assignment assignment) {
		ScgFactory::eINSTANCE.createControlFlow => [ assignment.next = it ]
	}

	dispatch def ControlFlow createControlFlow(Conditional conditional) {
		ScgFactory::eINSTANCE.createControlFlow => [ 
			if (conditional.then == null) conditional.then = it
			else if (conditional.^else == null) conditional.^else = it
		]
	}

	dispatch def ControlFlow createControlFlow(Fork fork) {
		ScgFactory::eINSTANCE.createControlFlow => [ fork.next += it ]
	}

	dispatch def ControlFlow createControlFlow(Join join) {
		ScgFactory::eINSTANCE.createControlFlow => [ join.next = it ]
	}

	dispatch def ControlFlow createControlFlow(Surface surface) {
		ScgFactory::eINSTANCE.createControlFlow => [ ]
	}

    // -------------------------------------------------------------------------
    // -- Control flow queries
    // -------------------------------------------------------------------------
   
    /**
     * Retrieves a list of control flows originating at the given node.
     * 
     * @param node
     * 			the node in question
     * @return Returns a list of control flows.
     */
    def List<ControlFlow> getAllNext (Node node) {
        node.eContents.filter(typeof(ControlFlow)).toList
    }

	/** 
	 * Retrieves a list of control flows that target a given node.
	 * 
	 * @param node
	 * 			the node in question
	 * @return Returns a list of control flows.
	 */   
    def List<ControlFlow> getAllPrevious (Node node) {
        node.incoming.filter(typeof(ControlFlow)).toList
    }
   
	/** 
	 * Retrieves a list of control flows that have a specific source
	 * and a specific target.
	 * 
	 * @param source
	 * 			the source node
	 * @param target
	 * 			the target node
	 * @return Returns a list of control flows.
	 */
    def List<ControlFlow> getControlFlows(Node source, Node target) {
        source.eContents.filter(typeof(ControlFlow)).filter[ it.target==target ].toList
    }
    
    /**
     * Accumulates control flows to form a path of control flows until a given target node is reached.
     * Therefore, the single control flow objects are added to a local flow which is added to the 
     * list of flows after the query ended. Loops are aborted.
     * 
     * @param next
     * 			the next control flow to follow
     * @param localFlow
     * 			the local flow path on which the method is traveling
     * @param listOfFlows
     * 			the list of all control flows
     * @param target
     * 			the target node
     * @return Returns nothing. 
     */  
    private def void accumulateIndirectControlFlow(ControlFlow next, List<ControlFlow> localFlow, 
        List<List<ControlFlow>> listOfFlows, Node target, boolean includeTickEdges, boolean excludeSingleIncoming 
    ) {
        if (excludeSingleIncoming && next.target.incoming.size<2) return;
        
    	// Already in the local flow list: loop! Abort.
        if (localFlow.contains(next)) return;
        
        // Target node is reached. Add the control flow, 
        // then add the local flow to the list of flows and return.
        if (next.target == target) {
        	localFlow.add(next)
            listOfFlows.add(localFlow)
            return;
        }
        
        if (localFlow.size == MAX_CONTROLFLOW_ACCUMULATION) return;
        
        // Otherwise, follow the flow and recursively call this method to proceed on further control flows.
        localFlow.add(next)
        next.target.allNext.forEach[
            val newFlow = <ControlFlow> newArrayList(localFlow)       	    
            accumulateIndirectControlFlow(newFlow, listOfFlows, target, includeTickEdges, false)
        ]
        
        if (includeTickEdges && next.target instanceof Surface) {
            (next.target as Surface).depth.next.accumulateIndirectControlFlow( 
                localFlow, listOfFlows, target, includeTickEdges, false
            )
        }
    }

	/** 
	 * Retrieves a list of all control flow paths (lists of indirect control flows) from a source node
	 * to a target node. Therefore, for each outgoing control flow the 
	 * {@link #accumulateIndirectControlFlow(ControlFlow, List, List, Node)} method is called to 
	 * accumulate the flows.
	 * 
	 * @param source
	 * 			the source node
	 * @param target 
	 * 			the target node
	 * @return Returns a list of list of control flows. Each list of control flows represent a path from
	 * 			the source node to the target node. 
	 */   
    def List<List<ControlFlow>> getIndirectControlFlows(Node source, Node target) {
   	    val pathList = <List<ControlFlow>> newLinkedList
   	    source.allNext.forEach[ accumulateIndirectControlFlow(newArrayList(), pathList, target, false, false) ]
   	    pathList 
    }

    def List<List<ControlFlow>> getIndirectControlFlowsForLoopDetection(Node source, Node target) {
        val pathList = <List<ControlFlow>> newLinkedList
        source.allNext.forEach[ accumulateIndirectControlFlow(newArrayList(), pathList, target, false, true) ]
        pathList 
    }
    
    /** 
     * Checks whether or not a path of control flows is instantaneous or not.
     * The path is not instantaneous if it includes a depth.
     * 
     * @param controlFlows
     * 			list of control flows
     * @return Returns true if the path is instantaneous.
     */
    def boolean instantaneousFlow(List<ControlFlow> controlFlows) {
        controlFlows.map[ target ].filter(typeof(Depth)).empty
    }    

	/**
	 * Retrieves all instantaneous control flow paths between a source and a target node.
	 * 
	 * @param source
	 * 			the source node
	 * @param target
	 * 			the target node
	 * @return Returns a list of control flow paths (list of list of control flow) containing
	 * 			all instantaneous control flow paths.
	 */
    def List<List<ControlFlow>> getInstantaneousControlFlows(Node source, Node target) {
    	source.getIndirectControlFlows(target).filter[ instantaneousFlow ].toList
    }
    
    /**
     * Retrieves all instantaneous control flow paths that loop from a node back to that node,
     * i.e., are instantaneous feedbacks.
     * 
     * @param source
     * 			the node originating the control flow paths
     * @return Returns a list of control flow paths containing all instantaneous control flow paths. 
     */
    def List<List<ControlFlow>> getInstantaneousControlFlows(Node source) {
    	source.getIndirectControlFlowsForLoopDetection(source).filter[ instantaneousFlow ].toList
    }
    
    /**
     * Decides whether or not there exists an instantaneous path in a list of control flow paths.
     * 
     * @param controlFlowPathList
     * 			the list of control flow paths
     * @Return Returns true if an instantaneous path exists.
     */
    def boolean instantaneous(List<List<ControlFlow>> controlFlowsListPath) {
    	!controlFlowsListPath.filter[ instantaneousFlow ].empty
    }
     
    /** 
     * Retrieves a list of all control flows (including the flows beyond tick boundaries) from a 
     * source node to a target node. Therefore, for each outgoing edge the 
     * {@link #accumulateIndirectControlFlow(ControlFlow, List, List, Node)} method is called to 
     * accumulate the flows.
     * 
     * @param source
     *          the source node
     * @param target 
     *          the target node
     * @return Returns a list of list of control flows. Each list of control flows represent a path from
     *          the source node to the target node. 
     */   
    def List<List<ControlFlow>> getIndirectControlFlowsBeyondTickBoundaries(Node source, Node target) {
        val pathList = <List<ControlFlow>> newLinkedList
        source.allNext.forEach[ accumulateIndirectControlFlow(newArrayList(), pathList, target, true, false) ]
        pathList 
    }      

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
                nextNode = (nextNode as Surface).depth
                if (!returnList.contains(nextNode)) returnList.add(nextNode);                                
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
        controlFlows.addAll(exit.allPrevious)
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
        
        // Add the exit node and return.
        returnList.add(exit)
        returnList
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

    // -------------------------------------------------------------------------
    // -- Block queries
    // -------------------------------------------------------------------------
   
	/**
	 * Retrieves the graph that includes a given node.
	 * 
	 * @param node
	 * 			an arbitrary node
	 * @return Returns the SCG containing the given node. May return null.
	 */
    def SCGraph graph(Node node) {
        var EObject nodeObj = node
        while(nodeObj != null) {
            if (nodeObj.eContainer instanceof SCGraph) return nodeObj.eContainer as SCGraph;
            nodeObj = nodeObj.eContainer
        }
        null
    }   
    
    def List<SchedulingBlock> schedulingBlocks(SCGraph scg) {
        <SchedulingBlock> newArrayList => [ sb |
            scg.basicBlocks.forEach[ sb += it.schedulingBlocks ]
        ]
    }

	/** 
	 * Retrieves the scheduling block containing a given node.
	 * 
	 * @param node
	 * 			an arbitrary node
	 * @return Returns the scheduling block containing the node. May return null.
	 */
    def SchedulingBlock schedulingBlock(Node node) {
        val scg = node.graph
        var SchedulingBlock myBlock = null
        for (block : scg.schedulingBlocks ) {
            if (block.nodes.contains(node)) { myBlock = block }
        }
        myBlock
    }
   
    /**
     * Retrieves the basic block of a scheduling block.
     * 
     * @param schedulingBlock
     * 			the scheduling block in question
     * @return Returns the basic block of the given scheduling block. May return null.
     */
    def BasicBlock basicBlock(SchedulingBlock schedulingBlock) {
   		if (schedulingBlock.eContainer == null) return null
        schedulingBlock.eContainer as BasicBlock
    }
   
    /**
     * Retrieves the basic block of a node.
     * 
     * @param node
     * 			the node in question
     * @return Returns the basic block of a node. May return null.
     */
    def BasicBlock basicBlock(Node node) {
        node.schedulingBlock?.basicBlock
    }


	/**
	 * Retrieves all nodes of a schedule.
	 * 
	 * @param schedule
	 * 			the schedule in question
	 * @return Returns a list of nodes.
	 */            
    def List<Node> getScheduleNodes(Schedule schedule) {
        val nodeList = <Node> newLinkedList
        schedule.schedulingBlocks.forEach[ nodes.forEach[nodeList.add(it)] ]
        nodeList
    }
    
    def List<SchedulingBlock> getAllSchedulingBlocks(SCGraph scg) {
        <SchedulingBlock> newArrayList => [ list | 
            scg.basicBlocks.forEach[ list += schedulingBlocks ]
        ]
    }
    

    // -------------------------------------------------------------------------
    // -- Scheduling problem management
    // -------------------------------------------------------------------------
    
    /**
     * Creates an instance of an analysis.
     * 
     * @param eObjects
     * 			a list of objects associated with a particular analysis
     * @return Returns an analysis structure.
     */
//    def Analysis createAnalysis(String idString, List<EObject> eObjects) {
//    	ScgschedFactory::eINSTANCE.createAnalysis => [
//    		id = idString
//    		objectReferences += eObjects
//    	]
//    }


    // -------------------------------------------------------------------------
    // -- Expression helper
    // -------------------------------------------------------------------------

	/**
	 * Since the kexpressions serialization cannot handle operator expressions with more than two
	 * operators at the moment, {@code splitOperatorExpression} splits operator expressions in 
	 * chunks of operator expressions each containing at most two operators.
	 * 
	 * @param expression
	 * 			an arbitrary expression
	 * @return Returns an expression, possibly a diverted operator expression.
	 */
    def Expression splitOperatorExpression(Expression expression) {
    	// If the expression is not an operator expression, return immediately.
    	if (!(expression instanceof OperatorExpression)) return expression
    	
    	// Otherwise, split the expression as long as it contains more that two
    	// subExpressions. 
        if ((expression as OperatorExpression).subExpressions.size > 2) {
            val exp = expression.copy as OperatorExpression
            KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = exp.operator
                subExpressions += exp.subExpressions.head
                subExpressions += exp.splitOperatorExpression
            ]
        } else {
            expression
        }        
    }
    
    /**
     * Negates a given expression. Double negation remains present. No optimization takes place.
     * 
     * @param expression
     * 			an arbitrary expression
     * @return Returns a new negated operator expression containing the original expression. 
     */
    def Expression negate(Expression expression) {
    	KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::NOT
            subExpressions += expression
    	]    	
    }    
    
    
    def isNull(EObject eObject) {
        eObject == null
    }
    
    
}


/**
 * UnsupportedSCGException is a general SCG exception used for error handling.<br>
 * It supports a status string in the constructor to prompt some useful information 
 * about the exception.  
 */

class UnsupportedSCGException extends Exception {
	
	new(String s) {
		super(s)
	}
	
}
