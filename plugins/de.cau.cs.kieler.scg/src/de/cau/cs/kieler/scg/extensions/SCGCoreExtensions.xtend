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
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Schedule
import de.cau.cs.kieler.scg.SchedulingBlock
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

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
class SCGCoreExtensions { 
    
    // -------------------------------------------------------------------------
    // -- Block queries
    // -------------------------------------------------------------------------
   
    def boolean hasSchedulingData(SCGraph scg) {
    	!scg.schedules.empty
    }
   
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
