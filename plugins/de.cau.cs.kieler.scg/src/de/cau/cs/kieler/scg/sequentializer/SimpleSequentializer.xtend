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
package de.cau.cs.kieler.scg.sequentializer

import com.google.inject.Inject
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.extensions.SCGCopyExtensions
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import de.cau.cs.kieler.scgsched.AssignmentAddition
import de.cau.cs.kieler.scgsched.ConditionalAddition
import de.cau.cs.kieler.scgsched.GuardExpression
import de.cau.cs.kieler.scgsched.SCGraphSched
import de.cau.cs.kieler.scgsched.Schedule
import java.util.HashMap

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scgbb.BasicBlock
import de.cau.cs.kieler.scg.optimizer.CopyPropagation
import com.google.inject.Guiceimport de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.kexpressions.ValuedObject

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. Between two steps the results 
 * are cached in specifically designed metamodels for further processing. At the end of the transformation
 * chain a newly generated (and sequentialized) SCG is returned. <br>
 * You can either call the transformations manually or use the SCG transformation extensions to enrich the
 * SCGs with the desired information.<br>
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis				
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)	<== YOU ARE HERE
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-12-05 proposed 
 * @kieler.rating 2013-12-05 proposed yellow
 */

class SimpleSequentializer extends AbstractSequentializer {

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    /** Inject SCG extensions. */  
    @Inject 
    extension SCGExtensions
     
    /** Inject SCG copy extensions. */  
    @Inject 
    extension SCGCopyExtensions	

    /** Inject SCG copy extensions. */  
    @Inject 
    extension KExpressionsExtension	

    
    // -------------------------------------------------------------------------
    // -- Globals
    // -------------------------------------------------------------------------
           
    private val AdditionalConditionals = new HashMap<ConditionalAddition, Conditional>         
    
    private val guardExpressionCache = new HashMap<ValuedObject, GuardExpression>   
           
    // -------------------------------------------------------------------------
    // -- Transformation method
    // -------------------------------------------------------------------------    
      
    /**
     * transformSCGSchedToSeqSCG executes the transformation of an SCG with scheduling information to an
     * standard SCG without any further information. Naturally, the SCG will only consist of an 
     * entry-exit node pair and a series of assignment and conditionals.<br>
     * <strong>This amalgamation of nodes constitutes the tick function of the circuit approach.</strong>
     * 
     * @param scgsched
     * 			the source SCG with scheduling information
     * @return Returns a sequentialized standard SCG.
     */    
     override SCGraph sequentialize(SCGraphSched scgSched) {
        // Create new standard SCG with the Scg factory.
        val scg = ScgFactory::eINSTANCE.createSCGraph()
        
        val timestamp = System.currentTimeMillis
          
        /**
         * Since we want to build a new SCG, we cannot use the SCG copy extensions because it would 
         * preserve all previous (node) data.
         * Therefore, we only copy the interface and extend the declaration by the guards of the 
         * basic blocks.
         */
        scgSched.copyDeclarations(scg)
//TODO: CHECK IF CORRECT        
//        val guardTypeGroup = createTypeGroup.setTypeBool => [ scg.typeGroups += it ]
        scgSched.basicBlocks.forEach[
        	it.guards.forEach[
                val newGuard = scg.createValuedObject(it.name).setTypeBool
//        		val newGuard = createValuedObject(guardTypeGroup, it.name)
        		it.addToValuedObjectMapping(newGuard)
        	]
        ]
        
        guardExpressionCache.clear
        scgSched.guards.forEach[guard |
        	guardExpressionCache.put(guard.valuedObject, guard)
        ]
        
        var time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for sequentialization finished (time used: "+(time / 1000)+"s).")          
        
		// Create the entry node, a control flow for the entry node, add the node.
        val entry = ScgFactory::eINSTANCE.createEntry
    	val entryFlow = ScgFactory::eINSTANCE.createControlFlow
    	entry.next = entryFlow
        scg.nodes.add(entry)
        
        // Now, call the worker method. It returns the last control flows which have to be connected to the exit node.
        val exitFlows = scgSched.schedules.head.transformSchedule(scg, entryFlow)
        
        // Create an exit node and connect the control flow. Add the node.
        val exit = ScgFactory::eINSTANCE.createExit
        exitFlows.forEach[it.target = exit]
        scg.nodes.add(exit)
        
        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Sequentialization finished (time used overall: "+(time / 1000)+"s).")  
                
        // Return the SCG.
        scg     	
    }
    
    /**
     * This worker function takes the scheduling information of an enriched SCG and creates the nodes of
     * a sequentialized SCG. 
     * 
     * @param schedule
     * 			the scheduling information
     * @param scg
     * 			the target SCG
     * @param controlFlow
     * 			the source control flow which points to the next node
     * @return Returns a list of outgoing control flows. The caller should connect them to their surrounding environment. 
     * @throws UnsupportedSCGException
     * 			if no guard expression can be found for a specific guard.
     */
    protected def transformSchedule(Schedule schedule, SCGraph scg, ControlFlow controlFlow) {
    	// The source SCG is easily determined as it includes the schedule. Its container is the source SCG.
    	val scgSched = schedule.eContainer as SCGraphSched
    	
    	// Since the last node maybe a conditional node, it is possible to conclude the schedule with more than one
    	// outgoing control flow. Create a list to hold the control flows and add the incoming one.
    	val nextFlows = <ControlFlow> newArrayList
    	nextFlows.add(controlFlow)
    	
    	val processedBlockGuards = <BasicBlock> newArrayList
    	
    	// For each scheduling block in the schedule iterate.
    	for (sb : schedule.schedulingBlocks) {
    	    
    	    val basicBlock = sb.basicBlock
    	    
    	    scgSched.alterations.filter(typeof(ConditionalAddition)).forEach[
    	        if (sb.nodes.contains(it.beforeNode)) {
    	            val condadd = ScgFactory::eINSTANCE.createConditional
    	            condadd.condition = it.condition.copyExpression
    	            nextFlows.forEach[ target = condadd ]
    	            nextFlows.clear
                    condadd.then = ScgFactory::eINSTANCE.createControlFlow => [
                        nextFlows.add(it)
                    ]
                    ScgFactory::eINSTANCE.createControlFlow => [ condadd.^else = it ]
    	            
    	            AdditionalConditionals.put(it, condadd)
    	            scg.nodes.add(condadd)
    	        }
    	    ]
    	    
    	    
    		/**
    		 * Each scheduling block references a guard. Each guard results in an assignment. 
    		 * Create it and copy the corresponding object.
    		 */
//    		if (sb == basicBlock.schedulingBlocks.head) {
            if (!processedBlockGuards.contains(basicBlock)) {
    		val newAssignment = ScgFactory::eINSTANCE.createAssignment
//    		newAssignment.valuedObject = sb.guard.getValuedObjectCopy
            newAssignment.valuedObject = basicBlock.guards.head.getValuedObjectCopy
            processedBlockGuards.add(basicBlock)

			/**
			 * For each guard a guard expression exists.
			 * Retrieve the expression and test it for null. 
			 * If the guard expression is null, the scheduler could not create an expression for this guard. This is bad. Perhaps the SCG is erroneous. Throw an exception.
			 * Otherwise, it is possible that the guard expression houses empty expressions for a synchronizer. Add them as well.
			 */    		
			// Retrieve the guard expression from the scheduling information.
//    		var guardExpression = scgSched.eAllContents.filter(typeof(GuardExpression)).filter[valuedObject == sb.guard].head
//            var guardExpression = scgSched.eAllContents.filter(typeof(GuardExpression)).filter[valuedObject == basicBlock.guards.head].head
    		var guardExpression = guardExpressionCache.get(basicBlock.guards.head)
    		
    		if (guardExpression != null && guardExpression.expression != null) {
    			
    			// Create an assigment for each empty expression and connect the control flow appropriately.
    			guardExpression.emptyExpressions.forEach[
    				val eeAssignment = ScgFactory::eINSTANCE.createAssignment
    				eeAssignment.valuedObject = it.valuedObject.getValuedObjectCopy
    				eeAssignment.assignment = it.expression.copyExpression
    				scg.nodes.add(eeAssignment)
		    		nextFlows.forEach[it.target = eeAssignment]
		    		nextFlows.clear		    		
		    		val nextFlow = ScgFactory::eINSTANCE.createControlFlow
    				eeAssignment.next = nextFlow
    				nextFlows.add(nextFlow)
    			]
    			// Then, copy the expression of the guard to the newly created assignment.
    			newAssignment.assignment = guardExpression.expression.copyExpression
    		} else {
    			// A guard is missing! Throw an exception.
    			throw new UnsupportedSCGException("The guard expression is missing! [guard: "+sb.guard.toString+"]")
    		}
    		// Connect all control flows to the new assignment and clear the list.
    		nextFlows.forEach[ target = newAssignment ]
    		nextFlows.clear
    		
    		// Create a new control flow and take the assignment node as source.
    		val nextFlow = ScgFactory::eINSTANCE.createControlFlow
    		newAssignment.next = nextFlow
    		nextFlows.add(nextFlow)
    		
    		// Add the assignment to the SCG.
    		scg.nodes.add(newAssignment)
    		}
    		
    		/**
    		 * If the scheduling block includes assignment nodes, they must be executed if the corresponing guard 
    		 * evaluates to true. Therefore, create a conditional for the guard and add the assignment to the
    		 * true branch. They will execute their expression if the guard is active in this tick instance. 
    		 */
    		val alterations = scgSched.alterations.filter(typeof(AssignmentAddition)).filter[ sb.nodes.contains(it.position) ]
    		 
    		if (sb.nodes.filter(typeof(Assignment)).size>0 || alterations.size>0) {
    			// Create a conditional and set a reference of the guard as condition.
    			val conditional = ScgFactory::eINSTANCE.createConditional
//                conditional.condition = sb.guard.reference.copyExpression
                conditional.condition = basicBlock.guards.head.reference.copyExpression
    			
    			// Create control flows for the two branches and set the actual control flow to the conditional.
    			conditional.then = ScgFactory::eINSTANCE.createControlFlow
    			conditional.^else = ScgFactory::eINSTANCE.createControlFlow
//    			nextFlows.head.target = conditional
    			nextFlows.forEach[ target = conditional ]
    			nextFlows.clear
    			
    			// Add the conditional.
    			scg.nodes.add(conditional)
    			
    			// Now, use the SCG copy extensions to copy the assignment and connect them appropriately
    			// in the true branch of the conditional.
    			var nextCFlow = conditional.then
    			for (assignment : sb.nodes.filter(typeof(Assignment))) {
    				val Assignment cAssignment = assignment.copySCGNode(scg) as Assignment
    				nextCFlow.target = cAssignment
    				scg.nodes.add(cAssignment)
    				nextCFlow = ScgFactory::eINSTANCE.createControlFlow
    				cAssignment.next = nextCFlow
    			}
    			nextFlows.add(nextCFlow)
    			
	    		// Check if alterations where added to this scheduling block
    			alterations.forEach[ assadd |
    				// Create new assignment
    				ScgFactory::eINSTANCE.createAssignment => [ assignment |
	    				assignment.valuedObject = assadd.valuedObject.getValuedObjectCopy
    					assignment.assignment = assadd.expression.copyExpression
    					scg.nodes.add(assignment)
	    				nextFlows.forEach[ target = assignment ]
	    				nextFlows.clear
	    				assignment.next = ScgFactory::eINSTANCE.createControlFlow => [
	    					nextFlows.add(it)
	    				]
    				]
	    		]
    			
    			
    			// Subsequently, add the last control flow of the true branch and the control flow of the
    			// else branch to the control flow list. These are the new entry flows for the next assignment
    			// or the return value (in which case they will be connected to the exit node by the caller). 
    			nextFlows.add(conditional.^else)

    		}
    		
            scgSched.alterations.filter(typeof(ConditionalAddition)).forEach[
                if (sb.nodes.contains(it.untilNode)) {
                    nextFlows.add( AdditionalConditionals.get(it).^else )
                }
            ]
    		
     	}
    	
    	// Return any remaining control flows for the caller.
    	nextFlows
    }
    
}