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
package de.cau.cs.kieler.sccharts.prom

import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.iterators.StateIterator
import de.cau.cs.kieler.sccharts.processors.transformators.TakenTransitionSignaling
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import de.cau.cs.kieler.simulation.ui.highlighting.DiagramHighlighter
import java.util.List

/**
 * Highlighter for SCCharts diagrams.
 * The traversed states and transitions are shown using the output of the TakenTransitionSignaling transformation.
 * Furthermore this information is used, to calculate and highlight states in which the control flow will continue in the next tick.
 * 
 * These states are called "current states" in the context of this highlighter.
 * Note however, that their content might not have been executed, for instance because the state was suspended in this tick.
 * 
 * @author aas
 *
 */
class SCChartsDiagramHighlighter extends DiagramHighlighter {
    
    /**
     * The traversed transitions.
     * This is a transition that has been used in this tick.
     */
    protected var List<Transition> traversedTransitions = <Transition> newArrayList
    /**
     * The traversed states.
     * These are the states that have been left by traversed transitions.
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
     * The highlighting style for traversed states and transitions
     */
    private static val KForeground traversedElementStyle = createTraversedElementStyle
    
    /**
     * The highlighting style for current states
     */
    private static val KForeground currentStateStyle = createCurrentStateStyle

    /**
     * {@inheritDoc}
     */    
    override getSupportedModelTypes() {
        return #[SCCharts]
    }
    
    /**
     * {@inheritDoc}
     */
    override initialize(DataPool pool) {
        currentStates = null
    }
    
    /**
     * {@inheritDoc}
     */
    override stop() {
        unhighlightDiagram
    }
    
    /**
     * {@inheritDoc}
     */
    override update(DataPool pool) {
        // Remove highlighting
        unhighlightDiagram        
        // Calculate the simulation controlflow to determine what must be highlighted
        calculateSimulationControlFlow(pool)
        // If there is no control flow then there is nothing to highlight
        if(traversedTransitions.isNullOrEmpty && traversedStates.isNullOrEmpty && currentStates.isNullOrEmpty) {
            return
        }
        // Find the graph elements in the diagram for the EObjects that should be highlighted
        val traversedGraphElements = getGraphElements(traversedTransitions + traversedStates)
        val currentGraphElements = if(currentStates.isNullOrEmpty)
                                       newArrayList
                                   else
                                       getGraphElements(#[] + currentStates)
        // Highlight traversed elements
        for (graphElement : traversedGraphElements) {
            highlightElement(graphElement, traversedElementStyle)
        }
        // Highlight current elements
        for (graphElement : currentGraphElements) {
            highlightElement(graphElement, currentStateStyle)
        }
    }
    
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
    private def void calculateSimulationControlFlow(DataPool pool) {
        // Reset traversed elements
        traversedTransitions.clear
        traversedStates.clear
        // Get the traversed transitions array from the data pool
        if(pool == null) {
            return
        }
        val transitionArrayVariable = pool.getVariable(TakenTransitionSignaling.transitionArrayName)
        if(transitionArrayVariable == null || !(transitionArrayVariable.value instanceof NDimensionalArray)) {
            return
        }
        val transitionArray = transitionArrayVariable.value as NDimensionalArray
        
        // Get the transitions in the SCChart in the same manner as the taken transition signaling
        var State rootState
        val currentDiagramModel = diagramViewContext.inputModel
        if(currentDiagramModel instanceof SCCharts) {
            if(!currentDiagramModel.rootStates.isEmpty) {
                rootState = currentDiagramModel.rootStates.get(0)
            }            
        }
        if(rootState == null) {
            return
        }
        val transitions = TakenTransitionSignaling.getTransitions(rootState)
        // For an emitted transition in the transition array,
        // look for the transition in the model with the corresponding index.
        var index = 0
        for(transitionArrayElement : transitionArray.elements) {
            // The array contains the number of times that the transition has been taken in this tick
            val value = transitionArrayElement.value
            if(value instanceof Integer) {
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
            traversedStates.add(traversedTransition.sourceState)
        }
        
        // Calculate current states
        if(currentStates == null) {
            currentStates = getInitialStates(rootState)    
        }
        currentStates = calculateNewCurrentStates(currentStates, traversedTransitions)
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
     * Returns the direct initial child states of a given state.
     * 
     * @param rootState The state
     * @return the direct child states of the given root state that are initial states 
     */
    private def List<State> getInitialStates(State rootState) {
        val initialStates = <State> newArrayList
        for(region : rootState.regions) {
            if(region instanceof ControlflowRegion) {
                val initState = region.states.findFirst[it.isInitial]
                if(initState != null) {
                    initialStates.add(initState)
                }
            }
        }
        return initialStates
    }
}