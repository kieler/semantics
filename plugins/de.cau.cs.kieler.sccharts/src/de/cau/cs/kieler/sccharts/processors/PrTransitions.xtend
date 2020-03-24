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
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable

/**
 * 
 * @author ssm
 * @kieler.design 2017-12-05 proposed
 * @kieler.rating 2017-12-05 proposed yellow  
 */
class PrTransitions extends SCChartsProcessor implements Traceable {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsActionExtensions
    
    static val GENERATE_PREFIX = "__prT_"
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.prTransitions"
    }
    
    override getName() {
        "Pr Transitions"
    }
    
    override process() {
        val model = getModel
        
        for (rootState : model.rootStates) {
            rootState.transformPr   
        }
    }
    
    protected def transformPr(State state) {
        val prStates = state.getAllStates.filter[ outgoingTransitions.exists[ triggerProbability > 0 ] ].toList
        
        for (s : prStates) {
            s.transformPrState
        }
    }
    
    protected def transformPrState(State state) {
        val parentRegion = state.parentRegion
        val parentSuperstate = parentRegion.parentState
        val statePrefix = GENERATE_PREFIX + state.name + "_R"
        
        val prDeclaration = createVariableDeclaration(ValueType.BOOL) => [
            parentSuperstate.declarations += it
        ]
        
        val prRegion = state.createControlflowRegion(statePrefix)
        val prRandomDeclaration = createVariableDeclaration(ValueType.FLOAT) => [ prRegion.declarations += it ]
        val rVar = createValuedObject(prRandomDeclaration, "r")
        voStore.update(rVar, SCCHARTS_GENERATED)
        
        val initialState = prRegion.createState(statePrefix + "_Init", "Init").uniqueName => [
            initial = true
        ]
        val randomState = prRegion.createState(statePrefix + "_Random", "Random").uniqueName
        val delayInitState = prRegion.createState(statePrefix + "_RandomDelay", "DInit").uniqueName
        val delayState = prRegion.createState(statePrefix + "_RandomDelay", "DRandom").uniqueName
        initialState.createImmediateTransitionTo(randomState) => [
            effects += rVar.createAssignment(createRandomCall)
        ]
        randomState.createTransitionTo(delayInitState) 
        delayInitState.createImmediateTransitionTo(delayState) => [
            effects += rVar.createAssignment(createRandomCall)
        ]
        
        var prTransitions = state.outgoingTransitions.filter[ triggerProbability > 0 ].toList
        
        val newTransitionTriggers = <Transition, ValuedObject> newHashMap
        
        var actState = randomState
        for (prTransition : prTransitions.filter [ immediate ]) {
            val newTrigger = createValuedObject(prDeclaration, "T" + prTransition.priority)
            newTransitionTriggers.put(prTransition, newTrigger)
            
            actState = prTransition.createPrTransitionTree(actState, newTrigger, prRegion, rVar, statePrefix)                
        }
        if (actState !== randomState) actState.createTransitionTo(delayInitState)
        
        actState = delayState
        for (prTransition : prTransitions) {
            val newTrigger = if (newTransitionTriggers.keySet.contains(prTransition))
                newTransitionTriggers.get(prTransition) 
                else createValuedObject(prDeclaration, "T" + prTransition.priority)
            newTransitionTriggers.put(prTransition, newTrigger)
            
            actState = prTransition.createPrTransitionTree(actState, newTrigger, prRegion, rVar, statePrefix)                
        }
        
        for (prTransition : prTransitions) {
            prTransition.triggerProbability = 0
            prTransition.trigger = newTransitionTriggers.get(prTransition).reference
        }

        actState.createTransitionTo(delayInitState)       
    }
    
    protected def createPrTransitionTree(Transition prTransition, State actState, ValuedObject newTrigger, ControlflowRegion prRegion, ValuedObject rVar, String statePrefix) {
        val checkState = prRegion.createState(statePrefix + "_T" + prTransition.priority, "T" + prTransition.priority ).uniqueName
        val yesState = prRegion.createState(statePrefix + "_T" + prTransition.priority + "_Y", "T" + prTransition.priority + "_Y").uniqueName
        val noState = prRegion.createState(statePrefix + "_T" + prTransition.priority + "_N", "T" + prTransition.priority + "_N").uniqueName
        val prState = prRegion.createState(statePrefix + "_T" + prTransition.priority + "_D", "T" + prTransition.priority + "_P").uniqueName
        val incState = prRegion.createState(statePrefix + "_T" + prTransition.priority + "_D", "T" + prTransition.priority + "_I").uniqueName
        
        actState.createImmediateTransitionTo(checkState)
        
        checkState.createImmediateTransitionTo(yesState) => [
            trigger = prTransition.trigger.copy
        ]
        checkState.createImmediateTransitionTo(noState) => [
            effects += newTrigger.createAssignment(FALSE)
        ]
        yesState.createImmediateTransitionTo(prState) => [
            trigger = createLEExpression(rVar.reference, createFloatValue(prTransition.triggerProbability as float))
            effects += newTrigger.createAssignment(TRUE)
        ]
        yesState.createImmediateTransitionTo(incState) => [
            effects += rVar.createAssignment(createFloatValue(prTransition.triggerProbability as float), AssignOperator.ASSIGNSUB) 
            effects += newTrigger.createAssignment(FALSE)
        ]
        incState.createImmediateTransitionTo(noState)
        noState
    } 
    
}
