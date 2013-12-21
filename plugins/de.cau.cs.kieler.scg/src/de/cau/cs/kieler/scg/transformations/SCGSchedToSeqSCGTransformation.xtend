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
package de.cau.cs.kieler.scg.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.extensions.SCGCopyExtensions
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scgbb.BasicBlock
import de.cau.cs.kieler.scgsched.SCGraphSched
import de.cau.cs.kieler.scgsched.Schedule

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/** 
 * SCGSched to Seq SCG Transformation 
 * 
 * @author ssm
 * @kieler.design 2013-12-05 proposed 
 * @kieler.rating 2013-12-05 proposed yellow
 */

// This class contains all mandatory methods to create a new sequentialized SCG.
class SCGSchedToSeqSCGTransformation {

    // Inject SCG Extensions.    
    @Inject
    extension SCGExtensions
    
    @Inject 
    extension SCGCopyExtensions	
    
    def SCGraph transformSCGSchedToSeqSCG(SCGraphSched scgSched) {
        // Create new SCG...
        val scg = ScgFactory::eINSTANCE.createSCGraph()
        
        scgSched.copyDeclarations(scg)
        scgSched.basicBlocks.forEach[
        	it.guard => [
        		val newGuard = it.copy
        		it.addToValuedObjectMapping(newGuard)
        		scg.valuedObjects.add(newGuard)
        	]
//        	it.subGuards.forEach[
//        		val newGuard = it.copy
//        		it.addToValuedObjectMapping(newGuard)
//        		scg.valuedObjects.add(newGuard)
//        	]
//        	it.emptyGuards.forEach[
//        		val newGuard = it.copy
//        		it.addToValuedObjectMapping(newGuard)
//        		scg.valuedObjects.add(newGuard)
//        	]
        ]
        
        val entry = ScgFactory::eINSTANCE.createEntry
    	val entryFlow = ScgFactory::eINSTANCE.createControlFlow
    	entry.next = entryFlow
        scg.nodes.add(entry)
        val exitFlows = scgSched.schedules.head.transformSchedule(scg, entryFlow)
        val exit = ScgFactory::eINSTANCE.createExit
        exitFlows.forEach[it.target = exit]
        scg.nodes.add(exit)
        
        scg       	
    }
    
    def transformSchedule(Schedule schedule, SCGraph scg, ControlFlow controlFlow) {
    	val nextFlows = <ControlFlow> newArrayList
    	nextFlows.add(controlFlow)
    	for (sb : schedule.schedulingBlocks) {
    		val basicBlock = sb.eContainer as BasicBlock
    		val newAssignment = ScgFactory::eINSTANCE.createAssignment
    		newAssignment.valuedObject = sb.guard.copyValuedObject
    		var Expression expression
    		
//    		if (basicBlock.activationExpressions.size>1) {
//    			expression = KExpressionsFactory::eINSTANCE.createOperatorExpression()
//    			(expression as OperatorExpression).setOperator(OperatorType::OR)
//    			val myExp = expression
//    			basicBlock.activationExpressions.forEach[
//    				(myExp as OperatorExpression).subExpressions.add(it.guardExpression)
//    			]
//    		} else {
//    			expression = basicBlock.activationExpressions.head.guardExpression
//    		}
    		
    		// FIXME: expression should never be null
    		// This fixes unimplemented features in the synchronizer 
    		if (expression == null) expression = sb.guard.reference
    		
    		newAssignment.assignment = expression.copyExpression
    		nextFlows.forEach[it.target = newAssignment]
    		nextFlows.clear
    		
    		val nextFlow = ScgFactory::eINSTANCE.createControlFlow
    		newAssignment.next = nextFlow
    		nextFlows.add(nextFlow)
    		
    		scg.nodes.add(newAssignment)
    		
    		if (sb.nodes.filter(typeof(Assignment)).size>0) {
    			val conditional = ScgFactory::eINSTANCE.createConditional
    			conditional.condition = sb.guard.reference.copyExpression
    			conditional.then = ScgFactory::eINSTANCE.createControlFlow
    			conditional.^else = ScgFactory::eINSTANCE.createControlFlow
    			nextFlows.head.target = conditional
    			nextFlows.clear
    			
    			scg.nodes.add(conditional)
    			var nextCFlow = conditional.then
    			for (assignment : sb.nodes.filter(typeof(Assignment))) {
    				val Assignment cAssignment = assignment.copySCGNode as Assignment
    				nextCFlow.target = cAssignment
    				scg.nodes.add(cAssignment)
    				nextCFlow = ScgFactory::eINSTANCE.createControlFlow
    				cAssignment.next = nextCFlow
    			}
    			nextFlows.add(nextCFlow)
    			nextFlows.add(conditional.^else)
    		}
    	}
    	nextFlows
    }
    
}