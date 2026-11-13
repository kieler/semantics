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
package de.cau.cs.kieler.scg.processors

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.ControlDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.Linkable
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.ValuedObjectMapping
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.ExpressionDependency
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.scg.extensions.SCGSequentialForkExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import java.util.Map

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*

/** 
 * @author ssm
 * @kieler.design 2017-08-10 proposed 
 * @kieler.rating 2017-08-10 proposed yellow
 */
class SimpleGuardTransformation extends Processor<SCGraphs, SCGraphs> implements Traceable {
        
    @Inject extension SCGCoreExtensions
    @Inject extension SCGDeclarationExtensions
    @Inject extension SCGCacheExtensions
    @Inject extension SCGDependencyExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGThreadExtensions
    @Inject extension SCGSequentialForkExtensions
    @Inject extension KExpressionsDeclarationExtensions       
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsComplexCreateExtensions 
    @Inject extension KEffectsExtensions
    @Inject extension AnnotationsExtensions    
    @Inject extension SCGMethodExtensions
    
    
    public static val IProperty<Boolean> SGT_EXCLUDE_GUARD_ASSIGNMENT_CONTROL_DEPENDENCIES = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.guards.excludeGuardAssignmentControlDependencies", true)     

    public static val IProperty<Boolean> REMOVE_FORK_NODES = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.guards.removeForkNodes", false)     

    public static val IProperty<Boolean> REMOVE_JOIN_NODES = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.guards.removeJoinNodes", false)     

  
    val globalVOMap = <ValuedObject, ValuedObject>newHashMap
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.guards"
    }
    
    override getName() {
        "Guards"
    }
    
    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        val model = getModel
        
        val SCGGraphs = ScgFactory.eINSTANCE.createSCGraphs => [
            for (pragma : model.pragmas) {
                it.pragmas += pragma.copy
            }              
        ] 
        creationalTransformation(model, SCGGraphs)    
        
        val SCGMap = <SCGraph, SCGraph> newHashMap
        for (scg : model.scgs) {
            SCGMap.put(scg, ScgFactory::eINSTANCE.createSCGraph)
        }
            
        for (scg : model.scgs.ignoreMethods) {
            SCGGraphs.scgs += scg.createGuards(SCGMap.get(scg), SCGMap) => [
                label = scg.label
                name = scg.name
                SCGGraphs.scgs += it    
            ]
        }
        // retain method SCGs
        SCGGraphs.scgs.addAll(0, model.scgs.copyMethodSCGs(globalVOMap, environment))
        
        setModel(SCGGraphs)
    }

	/**
	 * {@inherited}
	 */
    def SCGraph createGuards(SCGraph scg, SCGraph newSCG, Map<SCGraph, SCGraph> SCGMap) {
        /**
         * Since we want to build a new SCG, we cannot use the SCG copy extensions because it would 
         * preserve all previous (node) data.
         * Therefore, we only copy the interface and extend the declaration by the guards of the 
         * basic blocks.
         */
        newSCG => [
            scg.copyAnnotations(it, SCGAnnotations.TRANSFORMATION_INDICATORS)
            addTagAnnotation(SCGAnnotations.ANNOTATION_GUARDED)
            label = scg.label
            name = scg.name
        ]
        
        val use_sc_plus_semantics = environment.getProperty(BasicBlockTransformation.USE_SC_PLUS_SEMANTICS)
        
        newSCG.trace(scg)

        val valuedObjectMap = scg.copyDeclarations(newSCG, SCGMap)
        valuedObjectMap.entrySet.forEach[globalVOMap.put(key, value.head)]
        val schedulingBlockCache = scg.createSchedulingBlockCache
        val GAMap = <Guard, Assignment> newHashMap
        val VAMap = <ValuedObject, Assignment> newHashMap
        val deadGuards = <Guard> newHashSet
        val guardSchedulingBlockMap = <Guard, SchedulingBlock> newHashMap
        val mainThreadEntries = <Assignment, String> newHashMap
        val mainThreadExits = <Assignment> newHashSet
        
        // Fix VO association in VariableStore
        val voStore = VariableStore.get(environment)
        valuedObjectMap.entrySet.forEach[ entry |
            val info = voStore.getInfo(entry.key)
            if (info !== null) info.valuedObject = entry.value.head
        ]
        
        val termVO = newSCG.createTERMSignal
        voStore.update(termVO, "term")
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
                if (sb !== null) {
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
                if (assignment !== null) {
                    // Can be null if removed because the bb is dead
                    if (sb.nodes.head instanceof Join) assignment.createStringAnnotation(SCGAnnotations.ANNOTATION_HEADNODE, "Join")
                    if (sb.nodes.last instanceof Fork) assignment.createStringAnnotation(SCGAnnotations.ANNOTATION_HEADNODE, "Fork")
                    for(node : sb.nodes) {
                        if (node instanceof Entry)
                        if (node.incomingLinks.filter(ControlFlow).empty) 
                            mainThreadEntries.put(assignment, node.name)
                        if (node instanceof Exit)
                        if (node.next === null) 
                            mainThreadExits += assignment
                    }
                }
                
                // The first one is superfluous, because it is already handled by the expression dependency.
                if (lastSB !== null && i > 1) {
                    val lastAssignment = GAMap.get(lastSB.guards.head)
                    if (lastAssignment !== null) {
                        if (!use_sc_plus_semantics) {
                            lastAssignment.createControlDependency(assignment)
                        }
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
        if (termAssignment.expression !== null) {
            newSCG.nodes += termAssignment
        }
        
        // Copy node dependencies
        for(node : scg.nodes.filter[ dependencies.size > 0]) {
            val sourceAssignment = VAMap.get(valuedObjectMap.get(schedulingBlockCache.get(node).guards.head.valuedObject).peek)
            if (sourceAssignment !== null) {
                for(dependency : node.dependencies) {
                    var Assignment ta = null
                    if (node instanceof Assignment) {
                        ta = VAMap.get(valuedObjectMap.get(schedulingBlockCache.get(dependency.target).guards.head.valuedObject).peek)
                    } else if (node instanceof Conditional) {
                        if (dependency.target instanceof Guard) {
                            ta = VAMap.get(valuedObjectMap.get((dependency.target as Guard).valuedObject).peek)
                        } else { // method call with writer is in condition
                            ta = VAMap.get(valuedObjectMap.get(schedulingBlockCache.get(dependency.target).guards.head.valuedObject).peek)
                        }
                    }
                    if (ta !== null) {
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
                if (sourceAssignment !== null) {
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
                val guardAssignment = VAMap.get(valuedObjectMap.get(schedulingBlock.guards.head.valuedObject).peek)

                if (guardAssignment !== null) {
                    val newAssignment = assignment.copySCGAssignment(valuedObjectMap)
                    newSCG.nodes += newAssignment
                    AAMap.put(assignment, newAssignment)
                    newAssignment.trace(assignment)
                    
                    val guardDependency = guardAssignment.createGuardDependency(newAssignment)
                    guardDependency.trace(guardAssignment)                              
                
                    // Check if the assignment changes a reference that is needed from the guardAssignment.
                    // If so, add a control dependency to ensure that the dependency is scheduled beforehand.
                    // This is particular important when dealing with exclusive branches.
                    if (!environment.getProperty(SGT_EXCLUDE_GUARD_ASSIGNMENT_CONTROL_DEPENDENCIES)) {
                        for (guardPredecessor : guardAssignment.incomingLinks.filter(ExpressionDependency).map[ eContainer ].filter(Assignment)) {
                            if (guardPredecessor.expression.allReferences.exists[ 
                                it.valuedObject == newAssignment.reference.valuedObject
                            ]) {
                                val controlDependency = guardPredecessor.createControlDependency(newAssignment)
                                controlDependency.trace(guardPredecessor)
                            }
                        }
                    }
                }
            }       
        }
        
        // Restore sequential order in guarded assignments
        for (assignment : AAMap.keySet) {
            if (assignment.next !== null && (assignment.next.target instanceof Assignment) &&
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
        
        // Add control dependencies of sequential forks
        val forks = scg.nodes.filter(Fork).toList
        if (forks.exists[it.isNonParallel]) {
            val nodeGuardNodeMap = newHashMap
            for (entry : guardSchedulingBlockMap.entrySet) {
                val guardNode = GAMap.get(entry.key)
                if (guardNode !== null) {
                    for (n : entry.value.nodes) {
                        nodeGuardNodeMap.put(n, guardNode)
                    }
                }
            }
            for (fork : scg.nodes.filter(Fork).filter[it.isNonParallel]) {
                val entries = fork.allNextNodes.filter(Entry).toList
                val sdInfos = entries.map[it.calculateSurfaceDepth].toList
                for (var i = 0; i < entries.size - 1; i++) { // this one to next thread
                    val thisEntry = entries.get(i)
                    val thisSDNodes = sdInfos.get(i)
                    val nextEntry = entries.get(i + 1)
                    val nextEntryGuardNode = nodeGuardNodeMap.get(nextEntry)
                    
                    // Surface and depth are now handled separately to enables delayed loops
                    // Only duty nodes get CF dependencies because else the order does not matter anyway
                    
                    // Surface
                    val lastSurfaceNodes = <Node>newHashSet
                    if (thisSDNodes.surface.contains(thisEntry.exit)) {
                        lastSurfaceNodes += thisEntry.exit
                    }
                    lastSurfaceNodes += thisSDNodes.surface.filter(Surface)
                    val lastSurfaceDutyNodes = lastSurfaceNodes.map[
                        it.preceedingDutyNodes(thisEntry)
                    ].flatten.toSet.filter[
                        thisSDNodes.surface.contains(it)
                    ]
                    
                    for (lastNode : lastSurfaceDutyNodes) {
                        val gNode = nodeGuardNodeMap.get(lastNode)
                        if (thisSDNodes.depth.contains(lastNode)) {
                            if (fork.join.nodeExistsPath(fork, false)) { // immediate feedback
                                environment.warnings.add("Imposing a sequential order an a node that is both in the thread's surface and depth will lead to an scheduling issue due to the presence of an immediate feedback loop (thread reincarnation).", gNode, true)
                            }
                        }
                        // Any last surface node must be placed before the entry node of the next thread
                        gNode.createControlDependency(nextEntryGuardNode).trace(fork)
                    }
                    
                    // Depth
                    val lastDepthNodes = <Node>newHashSet
                    if (thisSDNodes.depth.contains(thisEntry.exit)) {
                        lastDepthNodes += thisEntry.exit
                    }
                    lastDepthNodes += thisSDNodes.depth.filter(Surface)
                    val lastDepthDutyNodes = lastDepthNodes.map[
                        it.preceedingDutyNodes(thisEntry)
                    ].flatten.toSet.filter[
                        thisSDNodes.depth.contains(it)
                    ]
                    
                    for (lastNode : lastDepthDutyNodes) {
                        val gNode = nodeGuardNodeMap.get(lastNode)
                        val nextThreadDepthNodes = nextEntry.allThreadNodes.values.flatten.filter(Depth)
                        val nextThreadFirstDutyNodes = nextThreadDepthNodes.map[it.succeedingDutyNodes(nextEntry.exit)].flatten.toSet
                        
                        // Any last node must be placed before all first nodes of the next thread                            
                        for (firstNode : nextThreadFirstDutyNodes) {
                            val firstNodeGuardNode = nodeGuardNodeMap.get(firstNode)
                            gNode.createControlDependency(firstNodeGuardNode).trace(fork)
                        }
                    }
                }
            }
        }
        
        // Remove Fork Nodes if toggled - WIP
        if (getProperty(REMOVE_FORK_NODES)) {
            for (assignment : newSCG.nodes.filter(Assignment).toList) {
                if (assignment.hasAnnotation(SCGAnnotations.ANNOTATION_HEADNODE) 
                    && assignment.getAnnotation(SCGAnnotations.ANNOTATION_HEADNODE).asStringAnnotation.values.head == "Fork"
                ) {
                    val allIncoming = assignment.incomingLinks.filter[!(it instanceof DataDependency)].toList
                    val nextNodes = assignment.outgoingLinks.filter[!(it instanceof DataDependency || it instanceof GuardDependency)].map[target].toList
                    for (nextNode : nextNodes) {
                        for (incoming : allIncoming) {
                            val newIncoming = incoming.copy;
                            (incoming.eContainer as Linkable).outgoingLinks += newIncoming 
                            newIncoming.target = nextNode
                        }
                    }
                    for (guardDependency : assignment.outgoingLinks.filter(GuardDependency).toList) {
                        (allIncoming.head.eContainer as Linkable).outgoingLinks += guardDependency
                    } 
                }                
            }
        }        

        newSCG      
    }
    
    private def Assignment createAssignment(Guard guard, ValuedObjectMapping map) {
        ScgFactory::eINSTANCE.createAssignment => [
            valuedObject = guard.valuedObject.getValuedObjectCopy(map)
            expression = guard.expression.copySCGExpression(map)
        ]
    }
    

    protected def ValuedObject createTERMSignal(SCGraph scg) {
        createValuedObject(SimpleGuardExpressions.TERM_GUARD_NAME) => [
            scg.declarations += createBoolDeclaration.attach(it)
        ]        
    }
    
	
}
