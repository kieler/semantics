/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
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

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsFixExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
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

/**
 * @author ssm
 * @kieler.design 2018-04-10 proposed 
 * @kieler.rating 2018-04-10 proposed yellow
 * 
 * Processor that transforms SCGraphs into normalized SCCharts.
 *
 */
class SCG2SCCProcessor extends Processor<SCGraphs, SCCharts> implements Traceable {
    
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
    }
    
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsFixExtensions
    @Inject extension SCGThreadExtensions    
    
    protected var counter = 0
    protected val finalStates = <ControlflowRegion, State> newHashMap
    
    protected def State transform(SCGraph scg) {
        val rootState = createState(scg.name)
        val valuedObjectMap = scg.copyScopeDeclarations(rootState)
        
        val nodeList = <Node> newLinkedList => [ add(scg.nodes.head) ]
        val scopeStack = <Scope> newLinkedList => [ add(rootState) ]
        var Transition transition = null
        finalStates.clear
        while (!nodeList.empty) {
            val node = nodeList.pop
            
            transition = node.transformNode(scg, nodeList, scopeStack, transition)
        }
        
        
        rootState
    }
    
    protected def dispatch Transition transformNode(Entry entry, SCGraph scg, Deque<Node> nodeList, Deque<Scope> scopeStack, Transition incoming) {
        val parentState = scopeStack.peek as State
        val newRegion = parentState.createControlflowRegion("region" + counter++)
        scopeStack.push(newRegion)
        nodeList += entry.next.target
        return null
    }
    
    protected def dispatch Transition transformNode(Exit exit, SCGraph scg, Deque<Node> nodeList, Deque<Scope> scopeStack, Transition incoming) {
        if (incoming !== null) {
            val parentRegion = scopeStack.peek as ControlflowRegion
            val finalState = if (finalStates.get(parentRegion) !== null) 
                finalStates.get(parentRegion) else  
                parentRegion.createFinalState("state" + counter++)
            finalStates.put(parentRegion, finalState)
            incoming.targetState = finalState
        }
        scopeStack.pop
        return null
    }

    protected def dispatch Transition transformNode(Fork fork, SCGraph scg, Deque<Node> nodeList, Deque<Scope> scopeStack, Transition incoming) {
        
    }

    protected def dispatch Transition transformNode(Join join, SCGraph scg, Deque<Node> nodeList, Deque<Scope> scopeStack, Transition incoming) {
            
    }

    protected def dispatch Transition transformNode(Conditional conditional, SCGraph scg, Deque<Node> nodeList, Deque<Scope> scopeStack, Transition incoming) {
            
    }

    protected def dispatch Transition transformNode(Assignment assignment, SCGraph scg, Deque<Node> nodeList, Deque<Scope> scopeStack, Transition incoming) {
        val parentRegion = scopeStack.peek as ControlflowRegion
        val newState = parentRegion.createState("state" + counter++)       
        
        if (incoming !== null) {
            incoming.targetState = newState
        } else {
            newState.initial = true
        }
        
        nodeList += assignment.next.target
        
        createImmediateTransition => [ 
            newState.outgoingTransitions.add(it)
        ]
    }

    protected def dispatch Transition transformNode(Surface surface, SCGraph scg, Deque<Node> nodeList, Deque<Scope> scopeStack, Transition incoming) {
            
    }

    protected def dispatch Transition transformNode(Depth depth, SCGraph scg, Deque<Node> nodeList, Deque<Scope> scopeStack, Transition incoming) {
            
    }

    
}