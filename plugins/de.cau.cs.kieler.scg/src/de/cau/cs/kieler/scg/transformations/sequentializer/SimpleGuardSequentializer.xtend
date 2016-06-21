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
package de.cau.cs.kieler.scg.transformations.sequentializer

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.transformations.SCGTransformations

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.scg.ScheduleDependency
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions

/** 
 * @author ssm
 * @kieler.design 2016-02-22 proposed 
 * @kieler.rating 2016-02-22 proposed yellow
 * 
 */

class SimpleGuardSequentializer extends AbstractProductionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return SCGTransformations::SEQUENTIALIZE_ID
    }

    override getName() {
        return SCGTransformations::SEQUENTIALIZE_NAME
    }

    override getProducedFeatureId() {
        return SCGFeatures::SEQUENTIALIZE_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::SCHEDULING_ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    @Inject 
    extension SCGDeclarationExtensions
         
    @Inject 
    extension SCGControlFlowExtensions	
    
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
        	annotations += createStringAnnotation(SCGFeatures.SEQUENTIALIZE_ID, SCGFeatures.SEQUENTIALIZE_NAME)
        	label = scg.label
        ]
        
        creationalTransformation(scg, newSCG)
        scg.setDefaultTrace
        newSCG.trace(scg)
        
        val hostcodeAnnotations = scg.getAnnotations(ANNOTATION_HOSTCODE)
        hostcodeAnnotations.forEach[
            newSCG.createStringAnnotation(ANNOTATION_HOSTCODE, (it as StringAnnotation).values.head)
        ]
        val valuedObjectMap = scg.copyDeclarations(newSCG)
        
        val assignmentNodes = scg.nodes.filter[ incoming.filter(ScheduleDependency).empty ].head.
        	getSchedule.filter(Assignment)
        
        val AAMap = <Assignment, Assignment> newHashMap
        val scheduleDependencies = <ScheduleDependency> newArrayList
        
     	// Create new assignments
        for(assignment : assignmentNodes) {
        	assignment.copySCGAssignment(valuedObjectMap) => [
        		newSCG.nodes += it
        		AAMap.put(assignment, it)
        	]
        	scheduleDependencies += assignment.dependencies.filter(ScheduleDependency)
        }
        
        // Connect assignments
        for(schedule : scheduleDependencies) {
        	val sourceAssignment = AAMap.get((schedule.eContainer as Assignment))
        	val targetAssignment = AAMap.get(schedule.target) 
        	sourceAssignment.createControlFlow.target = targetAssignment 
        }
        
        newSCG
    }
    
    private def getSchedule(Node node) {
    	<Node> newArrayList => [ list |
    		var nextNode = node
    		while (nextNode != null) {
 				list += nextNode
 				nextNode = nextNode.dependencies.filter(ScheduleDependency)?.head?.target 			
    		}
    	]
    }
        
}