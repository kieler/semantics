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
package de.cau.cs.kieler.sccharts.text.sct.sctgenerator

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import org.eclipse.emf.ecore.EObject
import com.google.inject.Singleton

/**
 * @author ssm
 * 
 */
@Singleton
class ModelGenerator {

    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsExtension
    @Inject extension SCTGenerator

    private static val STATE_PREFIX = "S"
    private static val REGION_PREFIX = "R"
    private static val INPUT_PREFIX = "I"
    private static val OUTPUT_PREFIX = "O"
    
    private val generatorExtensions = SCTGenerator.registeredExtensions

    def createModel(String id) {
        var int statesLeft = SCTGenerator.NUMBER_OF_STATES.random
        val int inputs = SCTGenerator.NUMBER_OF_INPUTS.random
        val int outputs = SCTGenerator.NUMBER_OF_INPUTS.random

        val rootState = createSCChart => [
            it.id = id
            it.label = id
            it.declarations += createDeclaration(ValueType.BOOL) => [ decl | 
                decl.input = true
                for (var int i = 0; i < inputs; i++) {
                    val j = i
                    decl.valuedObjects += createValuedObject => [it.name = INPUT_PREFIX + j]
                }
                generatorExtensions.forEach[ onDeclarationCreate(decl) ]
            ]
            it.declarations += createDeclaration(ValueType.BOOL) => [ decl |
                decl.output = true
                for (var int i = 0; i < outputs; i++) {
                    val j = i
                    decl.valuedObjects += createValuedObject => [it.name = OUTPUT_PREFIX + j]
                }
                generatorExtensions.forEach[ onDeclarationCreate(decl) ]
            ]
        ]

        rootState.createRegions(0, statesLeft)
        generatorExtensions.forEach[ onModelCreate(rootState) ]
        rootState
    }

    private def void createRegions(State state, int hierarchy, int statesLeft) {
        val regionCount = 1 + SCTGenerator.CHANCE_FOR_CONCURRENCY.random

        var regionStateCounter = statesLeft
        for (var int i = 0; i < regionCount; i++) {
            var regionStateCount = regionStateCounter
            if (i < regionCount - 1) {
                regionStateCount = random(2, regionStateCounter / regionCount)
            }
            val region = createControlflowRegion(state, REGION_PREFIX + i)
            region.createStates(hierarchy + 1, regionStateCount)

            val states = region.states.filter[final != true].toList

            for (s : states) {
                val int transitions = 1 + SCTGenerator.CHANCE_FOR_TRANSITION.random
                for (var int t = 1; t < transitions; t++) {
                    s.createCompleteTransition(states.get(states.size.random)) =>
                        [
                            if (SCTGenerator.CHANCE_FOR_IMMEDIATE.random != 0) {
                                if ((it.eContainer.asState != it.targetState) &&
                                    !((it.eContainer.asState.incomingTransitions.filter[immediate].size > 0) &&
                                        (it.targetState.outgoingTransitions.filter[immediate].size > 0))) {
                                    it.immediate = true
                                }
                            }
                        ]
                }
            }
            
            generatorExtensions.forEach[ onRegionCreate(region) ]
        }
    }

    private def createStates(ControlflowRegion region, int hierarchy, int statesLeft) {
        var stateCounter = 0

        var lastState = region.createState(STATE_PREFIX + stateCounter) => [initial = true]
        stateCounter++

        while (stateCounter + 1 < statesLeft) {
            var newState = region.createState(STATE_PREFIX + stateCounter)

            stateCounter++

            lastState.createCompleteTransition(newState)

            if (SCTGenerator.CHANCE_FOR_SUPERSTATE.random(hierarchy) && stateCounter + 2 < statesLeft) {
                val stateCost = random(1, statesLeft - 1)
                newState.createRegions(hierarchy, stateCost)
                stateCounter += stateCost
            }

            lastState = newState
            val newStateFinal = newState
            generatorExtensions.forEach[ onStateCreate(newStateFinal) ]
        }

        var newState = region.createState(STATE_PREFIX + stateCounter) => [final = true]
        lastState.createCompleteTransition(newState)
    }

    private def createTransitionTrigger(Transition transition) {
        val triggerDepth = SCTGenerator.CHANCE_FOR_EXPRESSION.random
        if(triggerDepth == 0) return transition

        val rootState = (transition.eContainer as State).getRootState
        transition.trigger = createTriggerExpression(rootState.declarations.filter[input == true].head, triggerDepth)
        generatorExtensions.forEach[ onExpressionCreate(transition.trigger) ]
        transition
    }

    private def Expression createTriggerExpression(Declaration declaration, int triggerDepth) {
        if (triggerDepth > 1) {
            createOperatorExpression => [
                it.operator = if(Math.random < 0.5) OperatorType.LOGICAL_AND else OperatorType.LOGICAL_OR
                it.subExpressions += createTriggerExpression(declaration, triggerDepth - 1)
                it.subExpressions += createTriggerExpression(declaration, triggerDepth - 1)
            ]
        } else {
            declaration.valuedObjects.get(declaration.valuedObjects.size.random).reference
        }
    }

    private def createTransitionEffects(Transition transition) {
        var effectCount = SCTGenerator.CHANCE_FOR_EXPRESSION.random
        if(effectCount == 0) return transition

        val rootState = (transition.eContainer as State).getRootState
        for (var int i = 0; i < effectCount; i++) {
            transition.effects += createEffectExpression(rootState.declarations.filter[output == true].head)
            generatorExtensions.forEach[
                onExpressionCreate(transition.effects.last.asAssignment.expression)
            ]
        }
        transition
    }

    private def Assignment createEffectExpression(Declaration declaration) {
        createAssignment(
            declaration.valuedObjects.get(declaration.valuedObjects.size.random),
            if(Math.random < 0.5) TRUE else TRUE
        )
    }

    private def createTransition(State sourceState, State targetState) {
        val transition = SCChartsFactory::eINSTANCE.createTransition()
        transition.targetState = targetState
        sourceState.outgoingTransitions += transition
        transition
    }
    
    private def createCompleteTransition(State sourceState, State targetState) {
        createTransition(sourceState, targetState) => [ transition | 
            transition.createTransitionTrigger
            transition.createTransitionEffects
            if (transition.sourceState.isSuperstate)
                transition.type = TransitionType.TERMINATION
            generatorExtensions.forEach[ onTransitionCreate(transition) ]        
        ]
    }

    private def isSuperstate(State state) {
        state.regions.size > 0
    }

    private def asState(EObject obj) {
        obj as State
    }
    
    private def asAssignment(EObject obj) {
        obj as Assignment
    }

}
