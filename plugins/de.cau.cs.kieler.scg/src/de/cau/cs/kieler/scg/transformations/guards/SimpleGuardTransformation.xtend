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
package de.cau.cs.kieler.scg.transformations.guards

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.transformations.SCGTransformations

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import java.util.HashMap
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.ExpressionDependency
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.ControlDependency
import de.cau.cs.kieler.scg.Conditional

/** 
 * @author ssm
 * @kieler.design 2016-02-22 proposed 
 * @kieler.rating 2016-02-22 proposed yellow
 * 
 */

class SimpleGuardTransformation extends AbstractGuardTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return SCGTransformations::GUARDS_ID
    }

    override getName() {
        return SCGTransformations::GUARDS_NAME
    }

    override getProducedFeatureId() {
        return SCGFeatures::GUARDS_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::GUARD_EXPRESSIONS_ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    @Inject
    extension SCGCoreExtensions
    
    @Inject 
    extension SCGDeclarationExtensions
         
    @Inject 
    extension KExpressionsDeclarationExtensions	

    @Inject 
    extension KExpressionsValuedObjectExtensions 
    
    @Inject
    extension AnnotationsExtensions

    // -------------------------------------------------------------------------
    // -- Globals
    // -------------------------------------------------------------------------

    private static val String ANNOTATION_HOSTCODE = "hostcode" 
    
    // -------------------------------------------------------------------------
    // -- Guard Transformation
    // -------------------------------------------------------------------------    
      
     public def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        
        /**
         * Since we want to build a new SCG, we cannot use the SCG copy extensions because it would 
         * preserve all previous (node) data.
         * Therefore, we only copy the interface and extend the declaration by the guards of the 
         * basic blocks.
         */
        val newSCG = ScgFactory::eINSTANCE.createSCGraph => [
        	annotations += createStringAnnotation(SCGFeatures.GUARDS_ID, SCGFeatures.GUARDS_NAME)
        	label = scg.label
        ]
        
        creationalTransformation(scg,newSCG)
        scg.setDefaultTrace
        newSCG.trace(scg)
        
        val hostcodeAnnotations = scg.getAnnotations(ANNOTATION_HOSTCODE)
        hostcodeAnnotations.forEach[
            newSCG.createStringAnnotation(ANNOTATION_HOSTCODE, (it as StringAnnotation).values.head)
        ]
        val valuedObjectMap = scg.copyDeclarations(newSCG)
        
		for(valuedObject : scg.valuedObjects) {
			if (valuedObject.name.startsWith("_c"))
				System.out.println(valuedObject)
		}
        
        
        val GAMap = <Guard, Assignment> newHashMap
        val VAMap = <ValuedObject, Assignment> newHashMap
        
        // Create assignments
        for(guard : scg.guards) {
        	guard.createAssignment(valuedObjectMap) => [
        		newSCG.nodes += it
        		GAMap.put(guard, it)
        		VAMap.put(it.valuedObject, it)
        	]
        }
        
        // Copy node dependencies
		for(node : scg.nodes.filter[ dependencies.size > 0]) {
			val sourceAssignment = VAMap.get(valuedObjectMap.get(node.schedulingBlock.guards.head.valuedObject))
			for(dependency : node.dependencies) {
				var Assignment ta = null
				if (node instanceof Assignment) {
					ta = VAMap.get(valuedObjectMap.get(dependency.target.schedulingBlock.guards.head.valuedObject))
				} else if (node instanceof Conditional) {
					ta = VAMap.get(valuedObjectMap.get((dependency.target as Guard).valuedObject))
				}
				val targetAssignment = ta
				dependency.copy => [
					sourceAssignment.dependencies += it
					it.target = targetAssignment
				]
			}
		}
		
//		for(key : valuedObjectMap.keySet) {
//			if (key.name.startsWith("_c"))
//				System.out.println(key + " : "+valuedObjectMap.get(key))
//		}

		// Copy control dependencies		
//		for(schedulingBlock : scg.schedulingBlocks.filter[ dependencies.filter(ControlDependency).size > 0]) {
//			val sourceAssignment = VAMap.get(valuedObjectMap.get(schedulingBlock.guards.head.valuedObject))
//			for(dependency : schedulingBlock.dependencies.filter(ControlDependency)) {
//				System.out.println("Dep: " + (dependency.target as Guard).valuedObject)
//				val originalVO = (dependency.target as Guard).valuedObject
//				val newVO = valuedObjectMap.get(originalVO)
//				val targetAssignment = VAMap.get(newVO)
//				dependency.copy => [
//					sourceAssignment.dependencies += it
//					it.target = targetAssignment
//				]
//			}
//		}
        
        // Create expression dependencies
        for(guard : GAMap.keySet) {
			val assignment = GAMap.get(guard)
			val VORs = assignment.expression.getAllReferences.filter[ 
				!(it.eContainer instanceof OperatorExpression) ||
				(it.eContainer as OperatorExpression).operator != OperatorType::PRE
			]
			for(reference : VORs) {
				val sourceAssignment = VAMap.get(reference.valuedObject)
				if (sourceAssignment != null) {
					sourceAssignment.createExpressionDependency(assignment)
				}
			}
        }
        
        // Create guard dependencies
        val AAMap = <Assignment, Assignment> newHashMap
		for(schedulingBlock : scg.schedulingBlocks) {
			for(assignment : schedulingBlock.nodes.filter(Assignment)) {
				val newAssignment = assignment.copySCGAssignment(valuedObjectMap)
				val guardAssignment = VAMap.get(valuedObjectMap.get(schedulingBlock.guards.head.valuedObject))
				newSCG.nodes += newAssignment
				guardAssignment.createGuardDependency(newAssignment)
				AAMap.put(assignment, newAssignment)
			}						
		}
		
		// Restore sequential order in guarded assignments
		for (assignment : AAMap.keySet) {
			if ((assignment.next.target instanceof Assignment) &&
			(assignment.schedulingBlock == assignment.next.target.schedulingBlock)) {
				ScgFactory::eINSTANCE.createControlFlow => [
					AAMap.get(assignment).next = it
					it.target = AAMap.get(assignment.next.target as Assignment)
				]
			} 
		}

        newSCG     	
    }
    
    private def Assignment createAssignment(Guard guard, HashMap<ValuedObject, ValuedObject> map) {
    	ScgFactory::eINSTANCE.createAssignment => [
    		valuedObject = guard.valuedObject.getValuedObjectCopy(map)
    		expression = guard.expression.copySCGExpression(map)
    	]
    }
    
    private def ExpressionDependency createExpressionDependency(Assignment source, Assignment target) {
    	ScgFactory::eINSTANCE.createExpressionDependency => [ 
    		source.dependencies += it
    		it.target = target
    	]
    }

    private def GuardDependency createGuardDependency(Assignment source, Assignment target) {
    	ScgFactory::eINSTANCE.createGuardDependency => [ 
    		source.dependencies += it
    		it.target = target
    	]
    }
				
}
