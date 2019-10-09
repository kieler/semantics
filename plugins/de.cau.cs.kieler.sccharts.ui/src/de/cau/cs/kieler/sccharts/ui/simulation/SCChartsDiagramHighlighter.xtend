/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.simulation

import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.iterators.StateIterator
import de.cau.cs.kieler.sccharts.processors.TakenTransitionSignaling
import java.util.List
import java.util.Set
import de.cau.cs.kieler.simulation.ui.visualization.DiagramHighlighter
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.ui.visualization.Highlighting
import de.cau.cs.kieler.kicool.ui.klighd.models.ModelChain
import com.google.gson.JsonArray
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import java.util.stream.Collectors
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.environments.Environment

/**
 * Highlighter for SCCharts diagrams.
 * The traversed states and transitions are shown using the output of the TakenTransitionSignaling transformation.
 * Furthermore this information is used, to calculate and highlight states in which the control flow will continue in the next tick.
 * 
 * These states are called "current states" in the context of this highlighter.
 * Note however, that their content might not have been executed, for instance because the state was suspended in this tick.
 * 
 * FIXME This class is instantiated via bundle start!
 * 
 * @author aas
 *
 */
class SCChartsDiagramHighlighter extends DiagramHighlighter {
    
    extension static SCChartsStateExtensions scchartsStateExtensions = new SCChartsStateExtensions
    
    /**
     * Single instance.
     */
    static var SCChartsDiagramHighlighter instance
    
    /**
     * The traversed transitions.
     * This is a transition that has been used in this tick.
     */
    protected var List<Transition> traversedTransitions = <Transition> newArrayList
    /**
     * The traversed states.
     * These are the states that have been left and / or entered by traversed transitions.
     * It is possible that a traversed state is reentered in the same tick (e.g. using a self loop),
     * thus traversed states can be current states as well.
     */
    protected var List<State> traversedStates = <State> newArrayList
    
    /**
     * The current states.
     * These are the states in which the control flow will continue in the next tick.
     */
    protected var List<State> currentStates = <State> newArrayList
    
    /**
     * The active dataflow equations.
     */
    protected var Set<DataflowRegion> currentActiveDataflowRegions = <DataflowRegion> newHashSet
    
    /**
     * The highlighting style for traversed states and transitions
     */
    static val KForeground TRAVERSED_ELEMENT_STYLE = createTraversedElementStyle
    
    /**
     * The highlighting style for current states
     */
    static val KForeground CURRENT_ELEMENT_STYLE = createCurrentStateStyle

    /**
     * The size of the taken transitions signaling array.
     */
    var takenTransitionArraySize = 0


    private new() {}
    static def create() {
        if(instance === null) {
            instance = new SCChartsDiagramHighlighter
        }
        instance
    }
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        return "SCCharts Highlighter"
    }
    
    def isSupported(SimulationContext ctx) {
        val compileCtx = ctx.startEnvironment.getProperty(SimulationContext.SOURCE_COMPILATION_CONTEXT)
        return compileCtx !== null && compileCtx.originalModel instanceof SCCharts
    }
    
    /**
     * {@inheritDoc}
     */
    override initialize(SimulationContext ctx) {
        super.initialize(ctx)
        currentStates = null
        update(ctx)
    }
    
    /**
     * {@inheritDoc}
     */
    override update(SimulationContext ctx) {
        super.update(ctx)
        val pool = ctx.dataPool
        
        // Remove highlighting
        unhighlightDiagram      
        
        // If is supported
        if (pool !== null && ctx.isSupported) {
            // Calculate the simulation controlflow to determine what must be highlighted
            calculateSimulationControlFlow(ctx)
            // Find the graph elements in the diagram for the EObjects that should be highlighted
            val traversedGraphHighlighting = if( !traversedTransitions.isNullOrEmpty && !!traversedStates.isNullOrEmpty )
                                                 getHighlighting(traversedTransitions + traversedStates, TRAVERSED_ELEMENT_STYLE)
                                             else
                                                 newArrayList
            val currentGraphHighlighting = if(!currentStates.isNullOrEmpty)
                                               getHighlighting(#[] + currentStates, CURRENT_ELEMENT_STYLE)
                                           else
                                               newArrayList
                                               
            val currentDataflowHighlighting = if (currentActiveDataflowRegions.nullOrEmpty) newArrayList
                                                else getHighlighting(#[] + currentActiveDataflowRegions, CURRENT_ELEMENT_STYLE)
            val currentWireHighlighting = <Highlighting> newArrayList
            
            var ProcessorReference key = null
            for (k : ctx.processorMap.keySet) {
                if (k.id == "de.cau.cs.kieler.simulation.internal.step")
                    key = k
            }
            val proc = ctx.processorMap.get(key)
            if (proc !== null) {
                val sourcePool = proc.sourceEnvironment.getProperty(Environment.MODEL) as DataPool
                if (!currentDataflowHighlighting.empty) {
                    for (highlight : currentDataflowHighlighting) {
                        if (highlight.element instanceof KNode) {
                            val region = highlight.element as KNode
                            var next = region.children.filter[it.incomingEdges.size == 0].toList
                            next += region.children.filter [
                                getDiagramViewContext().getSourceElement(it) instanceof OperatorExpression &&
                                    (getDiagramViewContext().getSourceElement(it) as OperatorExpression).operator ==
                                        OperatorType.PRE
                            ].toList
                            val visited = newArrayList
                            next = next.stream().distinct().collect(Collectors.toList());
                            while (next.size != 0) {
                                val first = next.get(0)
                                next.remove(0)
                                val original = getDiagramViewContext().getSourceElement(first)
                                if (original instanceof BoolValue) {
                                    for (e : first.outgoingEdges) {
                                        if (!visited.contains(e)) {
                                            visited.add(e)
                                            if ((original as BoolValue).value)
                                                currentWireHighlighting.add(new Highlighting(e, CURRENT_ELEMENT_STYLE))
                                            if (!next.contains(e.target))
                                                next.add(e.target)
                                        }
                                    }
                                }
                                if (original instanceof ValuedObjectReference) {
                                    val object = (original as ValuedObjectReference).valuedObject
                                    val entry = sourcePool.findValue(object.name)
                                    for (e : first.outgoingEdges) {
                                        if (!visited.contains(e)) {
                                            visited.add(e)
                                            if (entry.variableInformation.get(0).type == ValueType.BOOL &&
                                                entry.rawValue.asBoolean)
                                                currentWireHighlighting.add(new Highlighting(e, CURRENT_ELEMENT_STYLE))
                                            if (!next.contains(e.target))
                                                next.add(e.target)
                                        }
                                    }
                                }
                                if (original instanceof OperatorExpression) {
                                    var t = false
                                    var continue = false
                                    if ((original as OperatorExpression).operator != OperatorType.PRE) {
                                        for (e : first.incomingEdges) {
                                            if (!visited.contains(e)) {
                                                if (!next.contains(e.source))
                                                    next.add(e.source)
                                                next.add(first)
                                                continue = true
                                            }
                                        }
                                    }
                                    if (!continue) {
                                        switch ( (original as OperatorExpression).operator ) {
                                            case LOGICAL_AND: {
                                                t = true
                                                for (e : first.incomingEdges) {
                                                    t = t && currentWireHighlighting.filter[it.element == e].size > 0
                                                }
                                            }
                                            case LOGICAL_OR: {
                                                for (e : first.incomingEdges) {
                                                    t = t || currentWireHighlighting.filter[it.element == e].size > 0
                                                }
                                            }
                                            case NOT: {
                                                for (e : first.incomingEdges) {
                                                    t = currentWireHighlighting.filter[it.element == e].size == 0
                                                }
                                            }
                                            case PRE: {
                                                val expr = (original as OperatorExpression).subExpressions.get(0)
                                                if (expr instanceof ValuedObjectReference) {
                                                    val entry = ctx.findPreValue(
                                                        (expr as ValuedObjectReference).valuedObject.name)
                                                    t = entry != null &&
                                                        entry.variableInformation.get(0).type == ValueType.BOOL &&
                                                        entry.rawValue.asBoolean
                                                }
                                            }
                                            case CONDITIONAL: {
                                                var condition = false
                                                var trueCase = false
                                                var falseCase = false
                                                for (e : first.incomingEdges) {
                                                    if (e.targetPort.data.filter(KIdentifier).map[id].get(0) == "in0")
                                                        condition = currentWireHighlighting.filter[it.element == e].
                                                            size > 0
                                                    if (e.targetPort.data.filter(KIdentifier).map[id].get(0) == "in1")
                                                        trueCase = currentWireHighlighting.filter[it.element == e].
                                                            size > 0
                                                    if (e.targetPort.data.filter(KIdentifier).map[id].get(0) == "in2")
                                                        falseCase = currentWireHighlighting.filter[it.element == e].
                                                            size > 0
                                                }
                                                t = condition ? trueCase : falseCase
                                            }
                                        }
                                        for (e : first.outgoingEdges) {
                                            if (!visited.contains(e)) {
                                                visited.add(e)
                                                if (t)
                                                    currentWireHighlighting.add(
                                                        new Highlighting(e, CURRENT_ELEMENT_STYLE))
                                                if (!next.contains(e.target))
                                                    next.add(e.target)
                                            }
                                        }
                                    }
                                }
                            }
                            next += region.children.filter [
                                getDiagramViewContext().getSourceElement(it) instanceof OperatorExpression &&
                                    (getDiagramViewContext().getSourceElement(it) as OperatorExpression).operator ==
                                        OperatorType.PRE
                            ]
                            for (pre : next) {
                                val original = getDiagramViewContext().getSourceElement(pre)
                                val expr = (original as OperatorExpression).subExpressions.get(0)
                                var t = false
                                if (expr instanceof ValuedObjectReference) {
                                    val entry = pool.findValue((expr as ValuedObjectReference).valuedObject.name)
                                    t = entry != null && entry.variableInformation.get(0).type == ValueType.BOOL &&
                                        entry.rawValue.asBoolean
                                }
                                if (t) {
                                    for (e : pre.incomingEdges) {
                                        if (currentWireHighlighting.filter[it.element == e].size == 0)
                                            currentWireHighlighting.add(new Highlighting(e, CURRENT_ELEMENT_STYLE))
                                    }
                                }
                            }
                        }
                    }
                }
            }
                                                
                                               
            // Create highlighting with the corresponding styles
            val highlighting = traversedGraphHighlighting + currentGraphHighlighting + 
                currentDataflowHighlighting + currentWireHighlighting
            highlightDiagram(highlighting)
        }
    }
    
    def private findPreValue( SimulationContext ctx, String name ){
        if( ctx.history.size <= 1 )
            return null
        var pool = ctx.history.get( 1 )
        var String key = null
        for( k : pool.entries.keySet )
        {
            if( k.endsWith( name ) && (k.length == name.length || k.endsWith("_" + name)) && !k.startsWith("_pre_") && !k.startsWith("_reg_") )
            {
                if( key === null )
                    key = k
                else
                    System.out.println( "WARNING: unable to determine the key of the pre Variable '" + name + "'. Is it '" + key + "' or is it '" + k + "'???" );
            }
        }
        return pool.entries.get( key )
    }
    
    def private findValue( DataPool pool, String name ){
        var String key = null
        for( k : pool.entries.keySet )
        {
            if( k.endsWith( name ) && (k.length == name.length || k.endsWith("_" + name)) && !k.startsWith("_pre_") && !k.startsWith("_reg_") )
            {
                if( key === null )
                    key = k
                else
                    System.out.println( "WARNING: unable to determine the key of the Variable '" + name + "'. Is it '" + key + "' or is it '" + k + "'???" );
            }
        }
        return pool.entries.get( key )
    }

//    override loadFormerState(StepState state) {
//        super.loadFormerState(state)
//        
//        // Fetch old current states from highlighting history
//        val oldHighlighting = highlightingHistory.get(state.actionIndex)
//        if(oldHighlighting != null) {
//            currentStates = oldHighlighting.filter[it.foreground == CURRENT_ELEMENT_STYLE && it.eObject instanceof State].map[it.eObject as State].toList
//        }
//    }
    
    /**
     * Creates the highlighting style for traversed elements.
     */
    private static def KForeground createTraversedElementStyle() {
        val style = KRenderingFactory.eINSTANCE.createKForeground()
        style.setColor(Colors.DODGER_BLUE)
        style.setPropagateToChildren(true)
        return style
    }
    
    /**
     * Creates the highlighting style for current states.
     */
    private static def KForeground createCurrentStateStyle() {
        val style = KRenderingFactory.eINSTANCE.createKForeground()
        style.setColor(Colors.RED)
        style.setPropagateToChildren(true)
        return style
    }
    
    /**
     * Calculates the control flow in the SCChart from the taken transition signaling.
     * 
     * @param pool The pool
     */
    private def void calculateSimulationControlFlow(SimulationContext ctx) {
        val pool = ctx.dataPool
        // Reset traversed elements
        traversedTransitions.clear
        traversedStates.clear
        // Get the traversed transitions array from the data pool
        if(pool === null) {
            return
        }
        val transitionArrayVariable = pool.entries.get(TakenTransitionSignaling.transitionArrayName)
        var JsonArray transitionArray = null
        if (transitionArrayVariable === null || !transitionArrayVariable.rawValue.isJsonArray) {
            transitionArray = new JsonArray
        } else
            transitionArray = transitionArrayVariable.rawValue.asJsonArray
        
        // Get the transitions in the SCChart in the same manner as the taken transition signaling
        var State rootState
        val currentDiagramModel = diagramViewContext.inputModel
        if(currentDiagramModel instanceof SCCharts) {
            if(!currentDiagramModel.rootStates.isEmpty) {
                rootState = currentDiagramModel.rootStates.get(0)
            }            
        } else if (currentDiagramModel instanceof ModelChain) {
            val scc = currentDiagramModel.models.findFirst[ it instanceof SCCharts ] as SCCharts
            if (!scc.rootStates.empty) {
                rootState = scc.rootStates.head
            }
        }
        if(rootState === null) {
            return
        }
        val transitions = TakenTransitionSignaling.getTransitions(rootState)
        // For an emitted transition in the transition array,
        // look for the transition in the model with the corresponding index.
        var index = 0
        for(transitionArrayElement : transitionArray) {
            // The array contains the number of times that the transition has been taken in this tick
            if(transitionArrayElement.isJsonPrimitive && transitionArrayElement.asJsonPrimitive.isNumber) {
                val value = transitionArrayElement.asInt
                if(value > 0) {
                    // The transition has been taken at least once
                    try {
                        val traversedTransition = transitions.get(index)
                        traversedTransitions.add(traversedTransition)
                    } catch(IndexOutOfBoundsException e) {
                        throw new Exception("Could not acccess the 'taken transition array'. Please check that the shown diagram is for the simulated model.", e)
                    }
                }
            } else {
                throw new Exception("The 'taken transition array' has a incompatible type for diagram highlighting")
            }
            index++
        }
        
        // Calculate traversed states
        for(traversedTransition : traversedTransitions) {
            val source = traversedTransition.sourceState
            traversedStates.add(source)
            val target = traversedTransition.targetState
            traversedStates.add(target)
            // Mark all final states as traversed if this was a termination transition
            val isTerminationTransition = traversedTransition.preemption == PreemptionType.TERMINATION
            if(isTerminationTransition) {
                traversedStates.addAll(getFinalStates(source))
            }
        }
        
        // Calculate current states
        if(currentStates === null) {
            currentStates = newArrayList()
            val directInitialStates = getInitialStates(rootState)
            for(state : directInitialStates) {
                currentStates.enterState(state)
            } 
        }
        currentStates = calculateNewCurrentStates(currentStates, traversedTransitions)
        currentActiveDataflowRegions = calculateNewActiveEquations(currentStates, rootState)
    }
    
    /**
     * Calculates the current states from the last current states and taken transitions.
     * Note that this method must be called for EVERY tick in the simulation
     * because it depends on the last simulation state and is computed independently for each data pool.
     * 
     * @param lastCurrentStates The current states of the last tick
     * @param takenTransitions The transitions that have been taken in the last tick
     * @return the now current states
     */
    private def List<State> calculateNewCurrentStates(List<State> lastCurrentStates, List<Transition> takenTransitions) {
        val newCurrentStates = <State> newArrayList
        
        // Preprocessing for better performance of lookup
        val seenStates = <State> newHashSet
        val outgoingTransitionsForState = <State, List<Transition>> newHashMap
        for(trans : takenTransitions) {
            val source = trans.sourceState
            val outgoingTransitionsOfSource = outgoingTransitionsForState.getOrDefault(source, newArrayList)
            outgoingTransitionsOfSource.add(trans)
            outgoingTransitionsForState.put(trans.sourceState, outgoingTransitionsOfSource)
        }
        
        // Follow path of transitions from current states to the ending state, which is the new current state.
        // NOTE: This only works if the used transition for a state is unambiguous, i.e.,
        // there is at most one outgoing transition per state in this tick. 
        val states = lastCurrentStates
        while(!states.isNullOrEmpty) {
            val state = states.get(0)
            seenStates.add(state)
            val outgoingTransitions = outgoingTransitionsForState.getOrDefault(state, newArrayList)
            if(outgoingTransitions.size == 0) {
                // No outgoing transitions, thus the control flow stays here
                newCurrentStates.add(state)
                // This state is done
                states.remove(state)
            } else if(outgoingTransitions.size == 1) {
                // Exactly one outgoing transition, thus the next state is unambiguous
                val transition = outgoingTransitions.get(0)
                val next = transition.targetState

                // Leave state
                states.leaveState(state)
                
                // Enter next state
                states.enterState(next)
                
                // This transition is done
                outgoingTransitions.remove(transition)
            } else {
                // More than one outgoing state. It is not clear which path has been taken.
                System.err.println("The used control flow cannot be clearly determined for this tick. Diagram highlighting of current state will not work.")
                return newCurrentStates
            }
        }
        
        return newCurrentStates
    }
    
    /**
     * Leaves a state wrt. control flow.
     * If a state is left, all inner states are left as well.
     * 
     * @param states The list of states that have been entered
     * @param state The state that is left
     * @return the given list where the state and all its child states have been removed
     */
    private def void leaveState(List<State> states, State state) {
        // Add this state as traversed state if it was active
        if(states.contains(state)) {
            traversedStates.add(state)    
        }
        // Leave the state
        states.remove(state)
        // Also leave all child states
        val children = StateIterator.sccAllContainedStates(state)
        states.removeAll(children.toList)
    }
    
    /**
     * Enters a state wrt. control flow.
     * If a state is entered, all initial states of this state are entered as well.
     */
    private def void enterState(List<State> states, State state) {
        states.add(state)
        // Also enter initial child states
        val initialStates = getInitialStates(state)
        if(!initialStates.isNullOrEmpty) {
            for(initialState : initialStates) {
                enterState(states, initialState)
            }
        }
    }
    
    /**
     * Calculates the currently active data flow equations by including all dataflow regions of the active states.
     */
    def calculateNewActiveEquations(List<State> states, State rootState) {
        val result = <DataflowRegion> newHashSet
        for (state : states + newArrayList(rootState)) {
            for (dfRegion : state.regions.filter(DataflowRegion)) {
                result += dfRegion
            }
        }
        return result
    }
    
}
							