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
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.ControlDependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScheduleDependency
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.kicool.compilation.VariableStore

/** 
 * @author ssm
 * @kieler.design 2016-02-22 proposed 
 * @kieler.rating 2016-02-22 proposed yellow
 * 
 */

class SimpleGuardSequentializer extends Processor<SCGraphs, SCGraphs> implements Traceable {

    @Inject extension SCGCoreExtensions
    @Inject extension SCGDeclarationExtensions
    @Inject extension SCGControlFlowExtensions	
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCGDependencyExtensions
    @Inject extension KEffectsExtensions
    @Inject extension PragmaExtensions

    private static val String ANNOTATION_HOSTCODE = "hostcode"
     
    override getId() {
        "de.cau.cs.kieler.scg.processors.sequentializer"
    }
    
    override getName() {
        "Sequentializer"
    }
    
    override process() {
        val SCGGraphs = ScgFactory.eINSTANCE.createSCGraphs => [
            model.copyPragmas(it)
        ]
        creationalTransformation(model, SCGGraphs)
        for (scg : model.scgs) {
            SCGGraphs.scgs += scg.transform                           
        }        
        setModel(SCGGraphs)
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }

    public def SCGraph transform(SCGraph scg) {
        /**
         * Since we want to build a new SCG, we cannot use the SCG copy extensions because it would 
         * preserve all previous (node) data.
         * Therefore, we only copy the interface and extend the declaration by the guards of the 
         * basic blocks.
         */
        val newSCG = ScgFactory::eINSTANCE.createSCGraph => [
        	annotations += createStringAnnotation(SCGFeatures.SEQUENTIALIZE_ID, SCGFeatures.SEQUENTIALIZE_NAME)
        	label = scg.label
        	name = scg.name
            scg.copyAnnotations(it, <String> newHashSet("main", "voLink"))
        ]
        
        scg.setDefaultTrace
        newSCG.trace(scg)
        
        val hostcodeAnnotations = scg.getAnnotations(ANNOTATION_HOSTCODE)
        hostcodeAnnotations.forEach[
            newSCG.createStringAnnotation(ANNOTATION_HOSTCODE, (it as StringAnnotation).values.head)
        ]
        val valuedObjectMap = scg.copyDeclarations(newSCG)
        
        // Fix VO association in VariableStore
        val voStore = VariableStore.get(environment)
        valuedObjectMap.entrySet.forEach[ entry |
            val info = voStore.variables.get(entry.key.name).findFirst[valuedObject == entry.key]
            if (info !== null) info.valuedObject = entry.value.head
        ]
        
        val entryNodes = <Entry> newArrayList
        val exitNodes = <Exit> newArrayList
        for(node : scg.nodes) {
            if (node instanceof Entry) entryNodes += node
            if (node instanceof Exit) exitNodes += node
        }
        
        for(entry : entryNodes) {
            val entryNode = ScgFactory.eINSTANCE.createEntry => [ newSCG.nodes += it name = entry.name ]
            var exitNode = null as Node 
            val scheduledNodes = entry.getSchedule
            
            val AAMap = <Node, Node> newHashMap => [ put(entry, entryNode)]
            val scheduleDependencies = <ScheduleDependency> newArrayList => [ it += entry.dependencies.filter(ScheduleDependency) ]
            
            for(node : scheduledNodes) {
                if (node instanceof Assignment) {
                	node.copySCGAssignment(valuedObjectMap) => [
                		newSCG.nodes += it
                		AAMap.put(node, it)
                	]
            	} else if (node instanceof Exit) {
            	    ScgFactory.eINSTANCE.createExit => [
            	        newSCG.nodes += it
            	        AAMap.put(node, it)
            	    ]
            	    exitNode = node
            	}
            	scheduleDependencies += node.dependencies.filter(ScheduleDependency)
            }
            
            if (exitNode === null) {
                exitNode = ScgFactory.eINSTANCE.createExit => [ newSCG.nodes += it name = entry.name + "_exit" ]                
            }
            
            // Add a new schedule dependency to cover the last guarded assignments.
            if (scheduleDependencies !== null && !scheduleDependencies.empty) {
                scheduleDependencies += scheduleDependencies.last.targetNode.createScheduleDependency(null)
            } 
            
            // Connect assignments
            for(schedule : scheduleDependencies) {
                val originalAssignment = schedule.eContainer as Node
            	val sourceAssignment = AAMap.get(originalAssignment)
                var targetAssignment = AAMap.get(schedule.target)
                if (targetAssignment === null) targetAssignment = exitNode 
            	
            	// Check for guarded assignments
            	val guardDependencies = originalAssignment.dependencies.filter(GuardDependency)
            	if (!guardDependencies.empty) {
            	    val guardConditional = ScgFactory.eINSTANCE.createConditional
                    newSCG.nodes += guardConditional
                    guardConditional.condition = sourceAssignment.asAssignment.valuedObject.reference  
                    sourceAssignment.createControlFlow.target = guardConditional
                    
                    guardConditional.trace(originalAssignment)
  
                    var Assignment nextAssignment = null
                    for(gd : guardDependencies) {
                        (gd.target as Assignment).copySCGAssignment(valuedObjectMap) => [
                            newSCG.nodes += it
                            AAMap.put(gd.target as Assignment, it)
                            
                            it.trace(gd.targetNode.asAssignment)
                        ]                    
                        if (gd.targetNode.asAssignment.incomingLinks.filter(ControlDependency).empty) {
                            nextAssignment = gd.target as Assignment
                        }
                    }
                    
                    if (nextAssignment === null) {
                        throw new NullPointerException("Next assignment must not be null! Maybe your control dependencies are wrong?");
                    }
                    guardConditional.createControlFlow.target = AAMap.get(nextAssignment)
                    
                    var next = nextAssignment
                    while (next !== null) {
                        next = nextAssignment.dependencies.filter(ControlDependency).head?.targetNode?.asAssignment
                        if (next !== null) {
                            AAMap.get(nextAssignment).createControlFlow.target = AAMap.get(next)
                            nextAssignment = next
                        }
                    }
                    if (targetAssignment !== null) {
                        AAMap.get(nextAssignment).createControlFlow.target = targetAssignment 
                        guardConditional.createControlFlow.target = targetAssignment
                    }         	    
            	} else {
                    if (targetAssignment !== null) {
                    	sourceAssignment.createControlFlow.target = targetAssignment
                   	}
               	} 
            }
            
            
            
        }
        
        newSCG
    }
    
    private def getSchedule(Node node) {
    	<Node> newArrayList => [ list |
    		var nextNode = node
    		while (nextNode !== null) {
 				list += nextNode
 				nextNode = nextNode.dependencies.filter(ScheduleDependency)?.head?.targetNode 			
    		}
    	]
    }
        
}
