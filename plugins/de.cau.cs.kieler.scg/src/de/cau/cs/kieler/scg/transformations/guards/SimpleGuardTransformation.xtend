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
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.SCGAnnotations
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.transformations.SCGTransformations
import java.util.HashMap

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Exit

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
    extension SCGCacheExtensions	
    
    @Inject 
    extension SCGDependencyExtensions	    

    @Inject 
    extension KExpressionsValuedObjectExtensions 
    
    @Inject
    extension AnnotationsExtensions
    
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
        
        val hostcodeAnnotations = scg.getAnnotations(SCGAnnotations.ANNOTATION_HOSTCODE)
        hostcodeAnnotations.forEach[
            newSCG.createStringAnnotation(SCGAnnotations.ANNOTATION_HOSTCODE, (it as StringAnnotation).values.head)
        ]
        val valuedObjectMap = scg.copyDeclarations(newSCG)
        val schedulingBlockCache = scg.createSchedulingBlockCache
        val GAMap = <Guard, Assignment> newHashMap
        val VAMap = <ValuedObject, Assignment> newHashMap
        val deadGuards = <Guard> newHashSet
        val mainThreadEntries = <Assignment, String> newHashMap
        val mainThreadExits = <Assignment> newHashSet

        for(bb : scg.basicBlocks) {
            if (bb.deadBlock) {
                for(sb : bb.schedulingBlocks) {
                    deadGuards += sb.guards
                }
            }
        }
        
        // Create assignments
        for(guard : scg.guards) {
            if (!deadGuards.contains(guard))
        	guard.createAssignment(valuedObjectMap) => [
        		newSCG.nodes += it
        		GAMap.put(guard, it)
        		VAMap.put(it.valuedObject, it)
        	]
        }
        
        // Create sbHeadNodes
        for(bb : scg.basicBlocks) {
        	for(sb : bb.schedulingBlocks) {
        		val assignment = GAMap.get(sb.guards.head)
        		if (assignment != null) {
        		    // Can be null if removed because the bb is dead
            		if (sb.nodes.head instanceof Join) assignment.createStringAnnotation(SCGAnnotations.ANNOTATION_HEADNODE, "Join")
            		if (sb.nodes.last instanceof Fork) assignment.createStringAnnotation(SCGAnnotations.ANNOTATION_HEADNODE, "Fork")
                    for(node : sb.nodes) {
                        if (node instanceof Entry)
                        if (node.incoming.filter(ControlFlow).empty) 
                            mainThreadEntries.put(assignment, node.id)
                        if (node instanceof Exit)
                        if (node.next == null) 
                            mainThreadExits += assignment
                    }
        		}
        	}
        }
        
        // Copy node dependencies
		for(node : scg.nodes.filter[ dependencies.size > 0]) {
			val sourceAssignment = VAMap.get(valuedObjectMap.get(schedulingBlockCache.get(node).guards.head.valuedObject))
			for(dependency : node.dependencies) {
				var Assignment ta = null
				if (node instanceof Assignment) {
					ta = VAMap.get(valuedObjectMap.get(schedulingBlockCache.get(dependency.target).guards.head.valuedObject))
				} else if (node instanceof Conditional) {
					ta = VAMap.get(valuedObjectMap.get((dependency.target as Guard).valuedObject))
				}
				if (ta != null) {
					val targetAssignment = ta
					dependency.copy => [
						sourceAssignment.dependencies += it
						it.target = targetAssignment
					]
				}
			}
		}
       
        // Create expression dependencies
        System.out.println("Creating expression dependencies...")
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
			(schedulingBlockCache.get(assignment) == schedulingBlockCache.get(assignment.next.target))) {
				AAMap.get(assignment).createControlDependency(AAMap.get(assignment.next.target as Assignment))
			} 
		}
		
		// Add main thread entry and exit points
		for(entry : mainThreadEntries.keySet) {
		   val entryNode = ScgFactory.eINSTANCE.createEntry => [ newSCG.nodes += it id = mainThreadEntries.get(entry) ]
// 		   entryNode.next = ScgFactory.eINSTANCE.createControlFlow => [ target = entry ]
           entryNode.createControlDependency(entry)
		}
        for(exit : mainThreadExits) {
           val exitNode = ScgFactory.eINSTANCE.createExit => [ newSCG.nodes += it ]
//           exit.next = ScgFactory.eINSTANCE.createControlFlow => [ target = exitNode ]
            exit.createControlDependency(exitNode)
        }

        newSCG     	
    }
    
    private def Assignment createAssignment(Guard guard, HashMap<ValuedObject, ValuedObject> map) {
    	ScgFactory::eINSTANCE.createAssignment => [
    		valuedObject = guard.valuedObject.getValuedObjectCopy(map)
    		expression = guard.expression.copySCGExpression(map)
    	]
    }
    
}
