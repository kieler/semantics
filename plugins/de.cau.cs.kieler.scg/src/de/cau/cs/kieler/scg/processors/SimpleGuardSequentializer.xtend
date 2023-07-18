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
package de.cau.cs.kieler.scg.processors

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.ControlDependency
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
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
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import java.util.Map

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

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
    @Inject extension SCGMethodExtensions  
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCGDependencyExtensions
    @Inject extension KEffectsExtensions
    @Inject extension PragmaExtensions

    static val String ANNOTATION_HOSTCODE = "hostcode"
    static val ANNOTATION_COPY_BLACKLIST = #[
        SCGAnnotations.ANNOTATION_GUARDCREATOR,
        SCGAnnotations.ANNOTATION_GUARDED        
    ]
    
    val globalVOMap = <ValuedObject, ValuedObject>newHashMap
     
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
        
        val SCGMap = <SCGraph, SCGraph> newHashMap
        for (scg : model.scgs) {
            SCGMap.put(scg, ScgFactory::eINSTANCE.createSCGraph)
        }
        
        for (scg : model.scgs.ignoreMethods) {
            SCGGraphs.scgs += scg.transform(SCGMap.get(scg), SCGMap)                           
        }
        // retain method SCGs
        SCGGraphs.scgs.addAll(0, model.scgs.copyMethodSCGs(globalVOMap, environment))    
            
        setModel(SCGGraphs)
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }

    def SCGraph transform(SCGraph scg, SCGraph newSCG, Map<SCGraph, SCGraph> SCGMap) {
        /**
         * Since we want to build a new SCG, we cannot use the SCG copy extensions because it would 
         * preserve all previous (node) data.
         * Therefore, we only copy the interface and extend the declaration by the guards of the 
         * basic blocks.
         */
         newSCG => [
            scg.copyAnnotations(it, SCGAnnotations.TRANSFORMATION_INDICATORS)
            annotations.removeIf[ANNOTATION_COPY_BLACKLIST.contains(it.name)]
        	addTagAnnotation(SCGAnnotations.ANNOTATION_SEQUENTIALIZED)
        	label = scg.label
        	name = scg.name
        ]
        newSCG.trace(scg)

        val valuedObjectMap = scg.copyDeclarations(newSCG, SCGMap)
        valuedObjectMap.entrySet.forEach[globalVOMap.put(key, value.head)]
                
        // Fix VO association in VariableStore
        val voStore = VariableStore.get(environment)
        valuedObjectMap.entrySet.forEach[ entry |
            val info = voStore.getInfo(entry.key)
            if (info !== null) info.valuedObject = entry.value.head
        ]
        
        val entryNodes = <Entry> newArrayList
        val exitNodes = <Exit> newArrayList
        for(node : scg.nodes) {
            if (node instanceof Entry) entryNodes += node
            if (node instanceof Exit) exitNodes += node
        }
        
        for(entry : entryNodes) {
            val entryNode = ScgFactory.eINSTANCE.createEntry => [ 
                newSCG.nodes += it 
                name = entry.name
                it.createStringAnnotation("label", "tick")
            ]
            var exitNode = null as Node 
            val scheduledNodes = entry.getSchedule
            
            val AAMap = <Node, Node> newHashMap => [ put(entry, entryNode)]
            val scheduleDependencies = <ScheduleDependency> newArrayList => [ it += entry.dependencies.filter(ScheduleDependency) ]
            
            for(node : scheduledNodes) {
                if (node instanceof Assignment) {
                	node.copySCGAssignment(valuedObjectMap) => [
                		newSCG.nodes += it
                		AAMap.put(node, it)
                		it.trace(node)
                	]
            	} else if (node instanceof Exit) {
            	    ScgFactory.eINSTANCE.createExit => [
            	        newSCG.nodes += it
            	        AAMap.put(node, it)
            	        it.trace(node)
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
            
            if (scheduleDependencies !== null && !scheduleDependencies.empty) {
                scheduleDependencies.last.remove
            }             
            
            entryNode.exit = exitNode as Exit
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
