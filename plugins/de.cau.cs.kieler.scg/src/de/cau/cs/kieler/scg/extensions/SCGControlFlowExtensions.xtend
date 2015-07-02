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

import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import java.util.List

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
class SCGControlFlowExtensions { 
    
    private int MAX_CONTROLFLOW_ACCUMULATION = 100;

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
    def Iterable<ControlFlow> getAllNext (Node node) {
        node.eContents.filter(typeof(ControlFlow))
    }

	/** 
	 * Retrieves a list of control flows that target a given node.
	 * 
	 * @param node
	 * 			the node in question
	 * @return Returns a list of control flows.
	 */   
    def Iterable<ControlFlow> getAllPrevious (Node node) {
        node.incoming.filter(typeof(ControlFlow))
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
    def Iterable<ControlFlow> getControlFlows(Node source, Node target) {
        source.eContents.filter(typeof(ControlFlow)).filter[ it.target==target ]
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
    def boolean instantaneousFlow(Iterable<ControlFlow> controlFlows) {
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
    def Iterable<List<ControlFlow>> getInstantaneousControlFlows(Node source, Node target) {
    	source.getIndirectControlFlows(target).filter[ instantaneousFlow ]
    }
    
    /**
     * Retrieves all instantaneous control flow paths that loop from a node back to that node,
     * i.e., are instantaneous feedbacks.
     * 
     * @param source
     * 			the node originating the control flow paths
     * @return Returns a list of control flow paths containing all instantaneous control flow paths. 
     */
    def Iterable<List<ControlFlow>> getInstantaneousControlFlows(Node source) {
    	source.getIndirectControlFlowsForLoopDetection(source).filter[ instantaneousFlow ]
    }
    
    /**
     * Decides whether or not there exists an instantaneous path in a list of control flow paths.
     * 
     * @param controlFlowPathList
     * 			the list of control flow paths
     * @Return Returns true if an instantaneous path exists.
     */
    def boolean instantaneous(Iterable<List<ControlFlow>> controlFlowsListPath) {
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

}
