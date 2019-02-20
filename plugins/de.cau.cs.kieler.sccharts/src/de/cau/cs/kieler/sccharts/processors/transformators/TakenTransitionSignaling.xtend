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
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.iterators.StateIterator
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import java.util.List
import de.cau.cs.kieler.kexpressions.Declaration

/**
 * @author aas
 *
 */
class TakenTransitionSignaling extends SCChartsProcessor {
    
    public static val transitionArrayName = "_taken_transitions"
    
    @Inject
    extension KExpressionsDeclarationExtensions
    @Inject
    extension KExpressionsCreateExtensions
    @Inject
    extension KExtDeclarationExtensions
    @Inject
    extension SCChartsStateExtensions
    @Inject
    extension SCChartsControlflowRegionExtensions
    @Inject
    extension SCChartsTransitionExtensions
    @Inject 
    extension SCChartsScopeExtensions
    @Inject
    extension SCChartsActionExtensions
    @Inject
    extension KEffectsExtensions
    
    public static val ARRAY_SIZE = new Property<Integer>("takenTransitionSignaling.arraySize", 0)
    
    public static def List<Transition> getTransitions(State rootState) {
        // Get all transitions in the model
        val transitions = <Transition> newArrayList
        for(state : StateIterator.sccAllContainedStates(rootState).toIterable) {
            transitions.addAll(state.outgoingTransitions)
        }
        return transitions
    }
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.takenTransitionSignaling"
    }
    
    override getName() {
        "Taken Transition Signaling"
    }
    
    override process() {
        val model = getModel
        
        // Just consider the root state. Otherwise, the taken takenTransition interface will not be bound properly 
        // across reference states.          
        for (rootState : newArrayList(model.rootStates.head)) {
            // rename existing tt signals
            val nameCollisions = rootState.allScopes.toIterable.map[declarations].flatten.map[valuedObjects].flatten.filter[transitionArrayName.equals(name)]
            for (nameCollision : nameCollisions) {
                nameCollision.uniqueName
                voStore.update(nameCollision)
            }
            
            val transitions = rootState.getTransitions
            if(transitions.size > 0) {
                environment.setProperty(ARRAY_SIZE, transitions.size)
                // Create new root state to encapsule the behavior of the original model
                // als: I don't know why this needs to be encapsulated? -> deactivated it
                                
                // Create transition array
                val transitionArrayDecl = createIntDeclaration
                val transitionArray = rootState.createValuedObject(transitionArrayName, transitionArrayDecl)    
                // Create assignments to taken transition array
                rootState.createEmitForTakenTransitions(transitions, transitionArray)
                // Create reset
                val reset = rootState.createImmediateDuringAction
                // Add assignment to false for all variables in the transition array 
                val cardinalities = transitionArray.cardinalities
                if(!cardinalities.isNullOrEmpty) {
                    val card0 = cardinalities.get(0)
                    if(card0 instanceof IntValue) {
                        val arraySize = card0.getValue
                        for(var index = 0; index < arraySize; index++) {
                            val assignment = reset.createAssignment(transitionArray, createIntValue(0))            
                            assignment.setIndex(index)
                        }
                    }
                }
                
                // Regiser in VO Store
                voStore.update(transitionArray, SCCHARTS_GENERATED, "simulation")
            }
        }
    }
    
    private def void createEmitForTakenTransitions(State rootState, List<Transition> transitions, ValuedObject transitionArray) {
        // Index transitions and add effect, which sets the transition array at that index to true
        // if this transition is taken.
        var index = 0
        for(trans : transitions) {
            // variable + 1
            val assignment = trans.addAssignment(transitionArray.createAssignment(createIntValue(1), AssignOperator.ASSIGNADD))
            assignment.setIndex(index)
            index++
        }
        // Add the end of the loop, the index is equal to the number of transitions.
        // Set size of transition array.
        transitionArray.setIndex(index)
    }
    
    private def void setIndex(ValuedObject valuedObject, int cardinality) {
        val intValue = createIntValue(cardinality)
        valuedObject.cardinalities.clear
        valuedObject.cardinalities.add(intValue)
    }
    
    private def void setIndex(Assignment assignment, int index) {
        val intValue = createIntValue(index)
        assignment.indices.clear
        assignment.indices.add(intValue)
    }
}