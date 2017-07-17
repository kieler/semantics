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
package de.cau.cs.kieler.sccharts.ptc

import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Region
import java.util.HashMap
import de.cau.cs.kieler.sccharts.Transition
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.sccharts.ControlflowRegion

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.Expression

/**
 * @author cmot
 * 
 */
class SCChartsAdditionalExtensions {

    @Inject
    extension SCChartsExtension

    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions

    // ------------------------------------------------------------------------
    // --         S I G N A L   &   V A R I A B L E   C R E A T I O N        --
    // ------------------------------------------------------------------------
    // Signals 
    def ValuedObject createSignal(Scope scope, String name, boolean input, boolean output, ValueType type) {
        return createValuedObject(scope, name, input, output, type, true)
    }

    def ValuedObject createPureSignal(Scope scope, String name, boolean input, boolean output) {
        return createSignal(scope, name, input, output, ValueType::PURE)
    }

    def ValuedObject createPureInputSignal(Scope scope, String name) {
        return createPureSignal(scope, name, true, false)
    }

    def ValuedObject createPureLocalSignal(Scope scope, String name) {
        return createPureSignal(scope, name, false, false)
    }

    def ValuedObject createPureOutputSignal(Scope scope, String name) {
        return createPureSignal(scope, name, false, true)
    }

    // Variables
    def ValuedObject createVariable(Scope scope, String name, boolean input, boolean output, ValueType type) {
        return createValuedObject(scope, name, input, output, type, false)
    }

    def ValuedObject createIntVariable(Scope scope, String name, boolean input, boolean output) {
        return createVariable(scope, name, input, output, ValueType::INT)
    }

    def ValuedObject createIntInputVariable(Scope scope, String name) {
        return createIntVariable(scope, name, true, false)
    }

    def ValuedObject createIntLocalVariable(Scope scope, String name) {
        return createIntVariable(scope, name, false, false)
    }

    def ValuedObject createIntOutputVariable(Scope scope, String name) {
        return createIntVariable(scope, name, false, true)
    }

    def ValuedObject createBoolVariable(Scope scope, String name, boolean input, boolean output) {
        return createVariable(scope, name, input, output, ValueType::BOOL)
    }

    def ValuedObject createBoolLocalVariable(Scope scope, String name, boolean input, boolean output) {
        return createBoolVariable(scope, name, false, false)
    }

    def ValuedObject createBooInputVariable(Scope scope, String name) {
        return createBoolVariable(scope, name, true, false)
    }

    def ValuedObject createBooOutputVariable(Scope scope, String name) {
        return createBoolVariable(scope, name, false, true)
    }

    // General ValuedObjects
    def ValuedObject createValuedObject(Scope scope, String name, boolean input, boolean output, ValueType type,
        boolean signal) {
        val declaration = KExpressionsFactory::eINSTANCE.createDeclaration
        declaration.input = input
        declaration.output = output
        declaration.type = type
        declaration.signal = signal
        scope.declarations.add(declaration)
        val valuedObject = createValuedObject(scope, name, declaration)
        return valuedObject
    }

    // ------------------------------------------------------------------------
    // --               D O U B L E    I N I T I A L                         --
    // ------------------------------------------------------------------------

    def void fixDeadStates(State rootState) {
        val toDelete = rootState.allContainedStates.filter[e|e.final && e.incomingTransitions.nullOrEmpty].toList
        
        for (state : toDelete) {
            state.remove
        }
        
    }


    def void fixMultipleEntry(State rootState) {
        val multiEntryRegions = rootState.allContainedControlflowRegions.filter[e | (e.states.filter[ee | ee.initial].toList.size) > 1]
        
        for (multiEntryRegion : multiEntryRegions) {
            val initialStates = multiEntryRegion.states.filter[e | e.initial].toList
            val additionalInitialState = multiEntryRegion.createInitialState("_I").uniqueName
            for (other : initialStates) {
                var Expression trigger = null
                other.initial = false
                if (other.outgoingTransitions.size == 1) {
                    trigger = other.outgoingTransitions.get(0).trigger.copy
                } 
                val auxiliaryTransition = additionalInitialState.createImmediateTransitionTo(other)
                if (trigger != null) {
                    auxiliaryTransition.setTrigger(trigger)
                }
            }
        }
        
        return
    }


    // ------------------------------------------------------------------------
    // --               H I E R A R C H Y   C R O S S I N G                  --
    // ------------------------------------------------------------------------
    /**
     * Eliminate hierarchy transitions
     */
    def void fixHierarchyCrossingTransitions(State rootState) {

        val hierarchyCrossingTransitions = rootState.allContainedTransitions.filter [ e |
            e.sourceState != null && e.targetState != null && e.sourceState.parentRegion != e.targetState.parentRegion
        ]

        val HashMap<Region, State> initialStates = new HashMap;

        var int counter = 0;
        for (transition : hierarchyCrossingTransitions) {
            counter++;
            transition.fixHierarchyCrossingTransition(initialStates, counter)
        }

    }

    /**
     *  First calculate route which is a List of states
     */
    def void fixHierarchyCrossingTransition(Transition transition, HashMap<Region, State> initialStates, int counter) {
        val List<State> routeFromStart = new ArrayList()
        val List<State> routeToEnd = new ArrayList()
        val sharedParentRegion = transition.calculateHierarchyCrossingTransitionRoute(routeFromStart, routeToEnd,
            transition.sourceState, transition.targetState)

        val originalSource = transition.sourceState
        val originalTarget = transition.targetState

        // Create a control flow signal
        val signalName = "_e" + counter; // ("_" + originalSource.id + "_to_" + originalTarget.id).fixId
        val ctrlSignal = sharedParentRegion.parentState.createSignal(signalName, false, false, ValueType::PURE)
        var endState = originalTarget
        if (routeToEnd.length > 0) {
            endState = routeToEnd.head

            // Create entry transition for each state
            routeToEnd.add(originalTarget)
            for (var i = 0; i < routeToEnd.length - 1; i++) {
                val routeState = routeToEnd.get(i);
                val nextState = routeToEnd.get(i + 1);

                if (routeState.hierarchical) {
                    // val nextNextState = routeToEnd.get(i+2)
                    val regionInsideRouteState = nextState.parentRegion

                    var State initialState = null
                    if (nextState.initial) {
                        initialState = nextState
                    } else {
                        if (!initialStates.containsKey(regionInsideRouteState)) {
                            // Remember a possible previously existing initial state
                            var originalInitialState = regionInsideRouteState.states.filter[e|e.initial].toList;
                            // Create a new artificial initial state (re-used for all interlevel transitions
                            // that's why we remember it in the hash map
                            initialState = regionInsideRouteState.createInitialState("_I").uniqueName
                            initialStates.put(regionInsideRouteState, initialState)
                            // If there was an initial state before, then connect it now
                            if (originalInitialState.size > 0) {
                                initialState.createTransitionTo(originalInitialState.get(0)).immediate2
                                originalInitialState.get(0).initial = false
                            }
                        }
                        initialState = initialStates.get(regionInsideRouteState)
                        val routeTransition = initialState.createTransitionTo(nextState)
                        routeTransition.immediate = true
                        routeTransition.setTrigger(ctrlSignal.reference);
                    }

                }
            }
        }

        if (routeFromStart.length > 0) {
            // Needs abort
            // Weak abort last state of routeFromStart to first state of routeToEnd
            //
            // Create a weak abort from the last state of routeFromStart to the first state of routeToEnd
            val abortTransition = routeFromStart.last.createTransitionTo(endState)
            // If original transition was immediate, then also the abort transition shall be immediate
            abortTransition.immediate = transition.immediate
            abortTransition.setTrigger(ctrlSignal.reference);
            // Set the target of the original transition to a new dummy state
            val exitState = originalSource.parentRegion.createState("_exit").uniqueName
            transition.targetState = exitState
            transition.immediate = true
        // Add control flow signal as an effect here
            transition.effects.add(ctrlSignal.emit)
        } else {
            // Not needs abort:
            // Connect original transition directly with first state of routeToEnd
            transition.targetState = endState
            transition.effects.add(ctrlSignal.emit)
        }

    }

    def Region calculateHierarchyCrossingTransitionRoute(Transition transition, List<State> routeFromStart,
        List<State> routeToEnd, State start, State end) {
        // End of recursion if same parent region
        if (start.parentRegion == end.parentRegion) {
            // Just end here but return parent region
            return start.parentRegion
        } else {
            var startHierarchyLevel = start.hierarchyLevel
            var endHierarchyLevel = end.hierarchyLevel
            var updatedStart = start
            var updatedEnd = end

            if (startHierarchyLevel > endHierarchyLevel) {
                // start state deeper than end state
                // => go up from start state until levels are equal
                while (startHierarchyLevel > endHierarchyLevel) {
                    updatedStart = start.parentRegion.parentState
                    startHierarchyLevel--
                    // TODO: is this necessary?
                    routeFromStart.add(updatedStart) // Append list
                }
            } else if (endHierarchyLevel > startHierarchyLevel) {
                // end state deeper than start state
                // => go up from end state until levels are equal
                while (endHierarchyLevel > startHierarchyLevel) {
                    updatedEnd = end.parentRegion.parentState
                    endHierarchyLevel--
                    routeToEnd.add(0, updatedEnd) // Prepand list
                }
            } else if (endHierarchyLevel == startHierarchyLevel) {
                // end state and start state same depth but
                // different parent.
                // => Go up with both states until we reach same parent
                updatedStart = start.parentRegion.parentState
                updatedEnd = end.parentRegion.parentState
            }

            // Note: At this point both, updateStart & updatedEnd have
            // same hierarchy level but possibly not the same parent.
            //
            // Do recursive call here
            return transition.calculateHierarchyCrossingTransitionRoute(routeFromStart, routeToEnd, updatedStart,
                updatedEnd)
        }

    }

    /**
     * Caclculate the hierarchy level for a state.
     */
    def int getHierarchyLevel(State state) {
        if (state.parentRegion == null) {
            return 0
        } else {
            return 1 + state.parentRegion.parentState.hierarchyLevel
        }
    }

}
