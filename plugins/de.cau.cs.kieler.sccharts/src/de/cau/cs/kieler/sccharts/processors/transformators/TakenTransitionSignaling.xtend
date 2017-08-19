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
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.ValuedObject
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
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.transformators.takenTransitionSignaling"
    }
    
    override getName() {
        "Taken Transition Signaling"
    }
    
    override process() {
        val model = getModel
                
        for (rootState : model.rootStates) {
            // Get or create transition array
            val transitionArrayDecl = createIntDeclaration
            var transitionArray = rootState.getValuedObjectByName(transitionArrayName)
            if(transitionArray == null) {
                transitionArray = rootState.createValuedObject(transitionArrayName, transitionArrayDecl)    
            }
            
            rootState.createEmitForTakenTransitions(transitionArray)
            rootState.createResetRegion(transitionArray)
        }
    }
    
    public static def List<Transition> getTransitions(State rootState) {
        // Get all transitions in the model
        val transitions = <Transition> newArrayList
        for(state : StateIterator.sccAllContainedStates(rootState).toIterable) {
            transitions.addAll(state.outgoingTransitions)
        }
        return transitions
    }
    
    private def void createEmitForTakenTransitions(State rootState, ValuedObject transitionArray) {
        val transitions = rootState.getTransitions
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
        // Remember this property
        environment.setProperty(ARRAY_SIZE, index)
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
    
    private def void createResetRegion(State rootState, ValuedObject transitionArray) {
        // Add reset region in root state to set variables to false at start of tick
        val newRegion = rootState.createControlflowRegion("taken_transition_signaling_reset")
        val initState = newRegion.createState("init")
        initState.label = null
        initState.initial = true
        
        val pauseState = newRegion.createState("pause")
        // Create transition for the effects to reset the variables
        val resetTransition = initState.createTransitionTo(pauseState)
        resetTransition.immediate = true
        
        // Add assignment to false for all variables in the transition array 
        val cardinalities = transitionArray.cardinalities
        if(!cardinalities.isNullOrEmpty) {
            val card0 = cardinalities.get(0)
            if(card0 instanceof IntValue) {
                val arraySize = card0.getValue
                for(var index = 0; index < arraySize; index++) {
                    val assignment = resetTransition.createAssignment(transitionArray, createIntValue(0))            
                    assignment.setIndex(index)
                }
            }
        }
        
        // Create delayed transition back to init state
        pauseState.createTransitionTo(initState)
    }
}