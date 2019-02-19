/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.scg.processors.transformators

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Entry
import java.util.Deque
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.ValuedObjectMapping
import java.util.List
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions

/**
 * @author ssm
 * @kieler.design 2018-04-10 proposed 
 * @kieler.rating 2018-04-10 proposed yellow
 * 
 * Processor that transforms SCGraphs into normalized SCCharts.
 *
 */
class SCG2SCCProcessor extends Processor<SCGraphs, SCCharts> implements Traceable {
    
    // Annotations are copied by default.
    public static val IProperty<Boolean> COPY_ANNOTATIONS = 
       new Property<Boolean>("de.cau.cs.kieler.sccharts.scg.processors.SCG2SCC.copyAnnotations", true)
       
    @Inject extension KExtDeclarationExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension PragmaExtensions
    
    protected var nameCounter = 0
    protected val finalStates = <ControlflowRegion, State> newHashMap
    protected val finalIncoming = <Exit, List<Transition>> newHashMap
    protected val visited = <Node> newHashSet
    protected val nodeStateMapping = <Node, State> newHashMap
           
    
    override getId() {
        "de.cau.cs.kieler.sccharts.scg.processors.SCG2SCC"
    }
    
    override getName() {
        "SCCharts"
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        val scgs = getModel
        val sccharts = SCChartsFactory.eINSTANCE.createSCCharts => [
            creationalTransformation(scgs, it) // Tell KITT that this is not an in-place transformation from here on
            it.trace(model)
            
            scgs.copyPragmas(it)
            
            rootStates.addAll(scgs.scgs.map[ transform ])
        ]
        setModel(sccharts)
        
        snapshot
        
        for(rootState : sccharts.rootStates.immutableCopy) {
            rootState.optimizeSuperfluousRegion
        }
    }
        
    protected def State transform(SCGraph scg) {
        val rootState = createState(scg.name)
        val valuedObjectMap = scg.copyScopeDeclarations(rootState)
        
        val nodeList = <Pair<Node, Transition>> newLinkedList => [ add(new Pair(scg.nodes.head, null)) ]
        val scopeStack = <Scope> newLinkedList => [ add(rootState) ]
        visited.clear
        finalStates.clear
        finalIncoming.clear
        nodeStateMapping.clear
        while (!nodeList.empty) {
            val node = nodeList.pop
            
            // Skip nodes that have already been visited, 
            // but connect loose ends.
            if (!visited.contains(node.key)) {
                node.key.transformNode(node.value, scg, nodeList, scopeStack, valuedObjectMap)
            } else if (node.value !== null) {
                if (nodeStateMapping.keySet.contains(node.key)) {
                    node.value.targetState = nodeStateMapping.get(node.key)
                } 
            }
        }
        
        rootState
    }
    
    protected def dispatch void transformNode(Entry entry, Transition incoming, SCGraph scg, Deque<Pair<Node, Transition>> nodeList, Deque<Scope> scopeStack, ValuedObjectMapping map) {
        visited += entry
        val parentState = scopeStack.peek as State
        
        // Entry nodes introduce a thread which corresponds to a region.
        val newRegion = parentState.createControlflowRegionWithoutLabel(entry.adoptName("region"))
        scopeStack.push(newRegion)
        
        // Queue the exit node to make sure that the exit node is the last node in this thread.
        if (entry.next.target != entry.exit) nodeList.push(new Pair<Node, Transition>(entry.exit, null))
        nodeList.push(new Pair<Node, Transition>(entry.next.targetNode, null))
    }
    
    protected def dispatch void transformNode(Exit exit, Transition incoming, SCGraph scg, Deque<Pair<Node, Transition>> nodeList, Deque<Scope> scopeStack, ValuedObjectMapping map) {
        // If there is an incoming path, store it and exit. 
        if (incoming !== null) {
            if (finalIncoming.keySet.contains(exit)) {
                finalIncoming.get(exit).add(incoming)
            } else {
                val newIncoming = <Transition> newLinkedList => [ add(incoming) ]
                finalIncoming.put(exit, newIncoming)
            }
            return;
        }

        // Now, the last node in the actual thread is processed. 
        // Connect all stored paths to the final node and pop the scope from the stack.
        if (finalIncoming.keySet.contains(exit)) { 
            val parentRegion = scopeStack.peek as ControlflowRegion
            val finalState = if (finalStates.get(parentRegion) !== null) 
                finalStates.get(parentRegion) else  
                parentRegion.createFinalState(exit.adoptName("finalState"))
                
            if (environment.getProperty(COPY_ANNOTATIONS)) {
                exit.copyAnnotations(finalState)
            }
                
            finalStates.put(parentRegion, finalState)
            
            for (inc : finalIncoming.get(exit)) {
                inc.targetState = finalState
            }
        }
        
        scopeStack.pop
        visited += exit
    }

    protected def dispatch void transformNode(Fork fork, Transition incoming, SCGraph scg, Deque<Pair<Node, Transition>> nodeList, Deque<Scope> scopeStack, ValuedObjectMapping map) {
        visited += fork
        
        // Create a super state for the fork.
        val parentRegion = scopeStack.peek as ControlflowRegion
        val newState = parentRegion.createState(fork.adoptName("superState"))       

        if (environment.getProperty(COPY_ANNOTATIONS)) {
            fork.copyAnnotations(newState)
        }
        
        if (incoming !== null) {
            incoming.targetState = newState
        } else {
            newState.initial = true
        }        

        nodeStateMapping.put(fork, newState)

        // Push the state scope onto the scope stack and queue the entry nodes of the threads. 
        // Make sure to push the join node beforehand, so that the control flow continues afterwards. 
        scopeStack.push(newState)
        val forkTargets = fork.next.map[ targetNode ].toList
        
        nodeList.push(new Pair<Node, Transition>(fork.join, null))
        for (target : forkTargets) {
            nodeList.push(new Pair<Node, Transition>(target, null))            
        }
    }

    protected def dispatch void transformNode(Join join, Transition incoming, SCGraph scg, Deque<Pair<Node, Transition>> nodeList, Deque<Scope> scopeStack, ValuedObjectMapping map) {
        visited += join
                    
        // Remove the state scope from the stack.
        scopeStack.pop
        
        val newTransition = createImmediateTransition => [
            setTypeTermination
            nodeStateMapping.get(join.fork).outgoingTransitions.add(it)
        ]
        
        nodeList.push(new Pair<Node, Transition>(join.next.targetNode, newTransition))        
    }

    protected def dispatch void transformNode(Conditional conditional, Transition incoming, SCGraph scg, Deque<Pair<Node, Transition>> nodeList, Deque<Scope> scopeStack, ValuedObjectMapping map) {
        visited += conditional
        val parentRegion = scopeStack.peek as ControlflowRegion
        val newState = parentRegion.createState(conditional.adoptName("state"))       
        
        if (incoming !== null) {
            incoming.targetState = newState
        } else {
            newState.initial = true
        }
        
        nodeStateMapping.put(conditional, newState)

        // Create a transition for both branches and queue both continuations.
        val newTransitionThen = createImmediateTransition => [ 
            newState.outgoingTransitions.add(it)
            trigger = conditional.condition.copyExpression(map)
        ]
        val newTransitionElse = createImmediateTransition => [ 
            newState.outgoingTransitions.add(it)
        ]
        
        if (environment.getProperty(COPY_ANNOTATIONS)) {
            conditional.copyAnnotations(newState)
        }
        
        nodeList.push(new Pair<Node, Transition>(conditional.getElse.targetNode, newTransitionElse))
        nodeList.push(new Pair<Node, Transition>(conditional.then.targetNode, newTransitionThen))        
    }

    protected def dispatch void transformNode(Assignment assignment, Transition incoming, SCGraph scg, Deque<Pair<Node, Transition>> nodeList, Deque<Scope> scopeStack, ValuedObjectMapping map) {
        visited += assignment
        val parentRegion = scopeStack.peek as ControlflowRegion
        val newState = parentRegion.createState(assignment.adoptName("state"))       
        
        if (environment.getProperty(COPY_ANNOTATIONS)) {
            assignment.copyAnnotations(newState)
        }
        
        if (incoming !== null) {
            incoming.targetState = newState
        } else {
            newState.initial = true
        }
        
        nodeStateMapping.put(assignment, newState)

        val newTransition = createImmediateTransition => [ 
            newState.outgoingTransitions.add(it)
            effects += assignment.copyAssignment(map)
        ]
        
        nodeList.push(new Pair<Node, Transition>(assignment.next.targetNode, newTransition))
    }

    protected def dispatch void transformNode(Surface surface, Transition incoming, SCGraph scg, Deque<Pair<Node, Transition>> nodeList, Deque<Scope> scopeStack, ValuedObjectMapping map) {
        visited += surface
        val parentRegion = scopeStack.peek as ControlflowRegion
        val newState = parentRegion.createState(surface.adoptName("state"))

        if (environment.getProperty(COPY_ANNOTATIONS)) {
            surface.depth.copyAnnotations(newState)
        }
        
        if (incoming !== null) {
            incoming.targetState = newState
        } else {
            newState.initial = true
        }
        
        nodeStateMapping.put(surface, newState)
        
        // Insert a delay and queue the depth node's successor as continuation.
        val newTransition = createTransition => [
            newState.outgoingTransitions.add(it)
        ]
        
        nodeList.push(new Pair<Node, Transition>(surface.depth.next.targetNode, newTransition))
    }

    protected def dispatch void transformNode(Depth depth, Transition incoming, SCGraph scg, Deque<Pair<Node, Transition>> nodeList, Deque<Scope> scopeStack, ValuedObjectMapping map) {
        visited += depth
    }

    
    private def String adoptName(NamedObject namedObject, String defaultPrefix) {
        if (namedObject.name.nullOrEmpty) 
            return defaultPrefix + nameCounter++
        else 
            return namedObject.name
    }
    
    
    
    protected def void optimizeSuperfluousRegion(State state) {
        if (state.regions.size > 1) return;
        
        val cfr = state.regions.filter(ControlflowRegion).head
        
        val superstate = cfr.states.filter[ isHierarchical ].head
        
        if (superstate === null) return
        
        val finalState = cfr.states.filter[ isFinal ].head
        
        if (finalState !== null && finalState !== superstate && cfr.states.size == 2 && 
            superstate.outgoingTransitions.exists[ isTermination && targetState == finalState ]
        ) {
            for (t : superstate.outgoingTransitions.filter[ isTermination && targetState == finalState ].toList) {
                t.targetState = null
                t.remove
            }
            
            finalState.remove
        } 
        
        if (cfr.states.size == 1) {
            for (r : superstate.regions.immutableCopy) {
                cfr.parentState.regions += r
            }
                        
            cfr.remove
        }
    }
    
}