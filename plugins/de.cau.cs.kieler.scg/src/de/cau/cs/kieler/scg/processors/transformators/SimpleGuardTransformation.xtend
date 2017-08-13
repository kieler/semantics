/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.scg.ControlDependency
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.scg.ScgFactory

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.SCGAnnotations
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import java.util.HashMap
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.scg.Assignment

/** 
 * @author ssm
 * @kieler.design 2017-08-10 proposed 
 * @kieler.rating 2017-08-10 proposed yellow
 */
class SimpleGuardTransformation extends Processor<SCGraphs, SCGraphs> {
        
    @Inject extension SCGCoreExtensions
    @Inject extension SCGDeclarationExtensions
    @Inject extension SCGCacheExtensions    
    @Inject extension SCGDependencyExtensions
    @Inject extension KExpressionsDeclarationExtensions       
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsComplexCreateExtensions 
    @Inject extension AnnotationsExtensions    
    
    /** Name of the term signal. */
    public static val String TERM_GUARD_NAME = "_TERM"
    
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.transformators.guards"
    }
    
    override getName() {
        "Guards V2"
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    
    override process() {
        val model = getModel
        
        val SCGGraphs = ScgFactory.eINSTANCE.createSCGraphs => [
            for (pragma : model.pragmas) {
                it.pragmas += pragma.copy
            }              
        ] 
        for (scg : model.scgs) {
           SCGGraphs.scgs += scg.createGuards
        }        
        setModel(SCGGraphs)
    }    

	/**
	 * {@inherited}
	 */
    public def SCGraph createGuards(SCGraph scg) {
        /**
         * Since we want to build a new SCG, we cannot use the SCG copy extensions because it would 
         * preserve all previous (node) data.
         * Therefore, we only copy the interface and extend the declaration by the guards of the 
         * basic blocks.
         */
        val newSCG = ScgFactory::eINSTANCE.createSCGraph => [
            annotations += createStringAnnotation(SCGFeatures.GUARDS_ID, SCGFeatures.GUARDS_NAME)
            label = scg.label
            scg.copyAnnotations(it, <String> newHashSet("main", "voLink"))
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
        val guardSchedulingBlockMap = <Guard, SchedulingBlock> newHashMap
        val mainThreadEntries = <Assignment, String> newHashMap
        val mainThreadExits = <Assignment> newHashSet
        
        val termVO = newSCG.createTERMSignal
        val termAssignment = ScgFactory::eINSTANCE.createAssignment => [ valuedObject = termVO ]    
        val termSet = <Assignment> newHashSet    

        for (bb : scg.basicBlocks) {
            for (sb : bb.schedulingBlocks) {
                if (bb.deadBlock) {
                    deadGuards += sb.guards
                }
                for (g : sb.guards) {
                    guardSchedulingBlockMap.put(g, sb)
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

                val sb = guardSchedulingBlockMap.get(guard)
                if (sb != null) {
                    it.trace(sb)
                }
            ]
        }
        
        // Create sbHeadNodes
        // and also create control dependencies within basic blocks
        for(bb : scg.basicBlocks) {
            var SchedulingBlock lastSB = null
            var i = 0
            for(sb : bb.schedulingBlocks) {
                val assignment = GAMap.get(sb.guards.head)
                if (assignment != null) {
                    // Can be null if removed because the bb is dead
                    if (sb.nodes.head instanceof Join) assignment.createStringAnnotation(SCGAnnotations.ANNOTATION_HEADNODE, "Join")
                    if (sb.nodes.last instanceof Fork) assignment.createStringAnnotation(SCGAnnotations.ANNOTATION_HEADNODE, "Fork")
                    for(node : sb.nodes) {
                        if (node instanceof Entry)
                        if (node.incoming.filter(ControlFlow).empty) 
                            mainThreadEntries.put(assignment, node.name)
                        if (node instanceof Exit)
                        if (node.next == null) 
                            mainThreadExits += assignment
                    }
                }
                
                // The first one is superfluous, because it is already handled by the expression dependency.
                if (lastSB != null && i > 1) {
                    val lastAssignment = GAMap.get(lastSB.guards.head)
                    if (lastAssignment != null) {
                        lastAssignment.createControlDependency(assignment)
                    }
                }
                
                lastSB = sb
                i++
            }
            
            // Add term block to term expression
            if (bb.termBlock && !bb.deadBlock) {
                val assignment = GAMap.get(bb.schedulingBlocks.head.guards.head)
                termAssignment.expression = termAssignment.expression.or(assignment.valuedObject.reference)
                termSet.add(assignment)
            }
        }
        
        // Only add the term assignment if a term block is present.
        if (termAssignment.expression != null) {
            newSCG.nodes += termAssignment
        }
        
        // Copy node dependencies
        for(node : scg.nodes.filter[ dependencies.size > 0]) {
            val sourceAssignment = VAMap.get(valuedObjectMap.get(schedulingBlockCache.get(node).guards.head.valuedObject))
            if (sourceAssignment !== null) {
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
                        
                        if (dependency instanceof ControlDependency) {
                            targetAssignment.trace(sourceAssignment)
                        }
                    }
                }
            } 
        }
       
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
                    val expressionDependency = sourceAssignment.createExpressionDependency(assignment) 
                    expressionDependency.trace(reference)
                }
            }
            
            // Link to term node
            if (termSet.contains(assignment)) {
                val expressionDependency = assignment.createExpressionDependency(termAssignment)
                expressionDependency.trace(assignment)
            }
        }
        
        // Create guard dependencies
        val AAMap = <Assignment, Assignment> newHashMap
        for(schedulingBlock : scg.schedulingBlocks) {
            for(assignment : schedulingBlock.nodes.filter(Assignment)) {
                val guardAssignment = VAMap.get(valuedObjectMap.get(schedulingBlock.guards.head.valuedObject))

                if (guardAssignment != null) {
                    val newAssignment = assignment.copySCGAssignment(valuedObjectMap)
                    newSCG.nodes += newAssignment
                    AAMap.put(assignment, newAssignment)
                    newAssignment.trace(assignment)
                    
                    val guardDependency = guardAssignment.createGuardDependency(newAssignment)
                    guardDependency.trace(guardAssignment)                              
                }
            }       
        }
        
        // Restore sequential order in guarded assignments
        for (assignment : AAMap.keySet) {
            if (assignment.next != null && (assignment.next.target instanceof Assignment) &&
            (schedulingBlockCache.get(assignment) == schedulingBlockCache.get(assignment.next.target))) {
                val controlDependency = AAMap.get(assignment).createControlDependency(AAMap.get(assignment.next.target as Assignment))
                
                controlDependency.trace(assignment)
            } 
        }
        
        // Add main thread entry and exit points
        for(entry : mainThreadEntries.keySet) {
           val entryNode = ScgFactory.eINSTANCE.createEntry => [ newSCG.nodes += it name = mainThreadEntries.get(entry) ]
           entryNode.createControlDependency(entry)
        }
        for(exit : mainThreadExits) {
           val exitNode = ScgFactory.eINSTANCE.createExit => [ newSCG.nodes += it ]
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
    

    protected def ValuedObject createTERMSignal(SCGraph scg) {
        createValuedObject(TERM_GUARD_NAME) => [
            scg.declarations += createBoolDeclaration.attach(it)
        ]        
    }
    
	
}
