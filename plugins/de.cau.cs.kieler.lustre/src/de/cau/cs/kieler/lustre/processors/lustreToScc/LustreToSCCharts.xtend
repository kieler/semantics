/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.processors.lustreToScc

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.extensions.LustreUtilityExtensions
import de.cau.cs.kieler.lustre.lustre.AState
import de.cau.cs.kieler.lustre.lustre.ATransition
import de.cau.cs.kieler.lustre.lustre.AnAction
import de.cau.cs.kieler.lustre.lustre.Assertion
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.lustre.lustre.StateValuedObject
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions

/**
 * @author lgr
 *
 */
class LustreToSCCharts extends CoreLustreToSCC {

    @Inject extension LustreUtilityExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    
    override getId() {
        return "de.cau.cs.kieler.lustre.processors.lustreToSCC.dataFlow"
    }

    override getName() {
        return "Lustre to SCCharts"
    }

    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }

    override processEquation(Equation equation, State state) {
        var dataflowRegion = getDataflowRegionFromState(state)
        
        var assignment = getAssignmentForEquation(equation, state)
        if (assignment !== null) {
            dataflowRegion.equations += assignment
        }
    }
    
    override processAssertion(Assertion assertion, State state) {
        try {
            val transformedAssertion = transformExpression(assertion.expr, state)
            val assertionAnnotation = AnnotationsFactory::eINSTANCE.createStringAnnotation => [
                name = "Assume"
                values += transformedAssertion?.stringRepresentation
            ]

            state.annotations += assertionAnnotation
        } catch (Exception e) {
            environment.warnings.add("A problem occurred in the transformation of the assertion: " +
                assertion.expr.stringRepresentation, e)
        }
    }

    override processAutomaton(Automaton automaton, State state) {
        var controlflowRegion = state.createControlflowRegion("")

        for (AState lusState : automaton.states) {
            var newState = createState => [
                name = lusState.valuedObject.name
            ]
            newState.initial = lusState.initial
            controlflowRegion.states += newState
            lustreStateToScchartsStateMap.put(lusState.valuedObject as StateValuedObject, newState)
        }

        for (AState lusState : automaton.states) {
            processState(lusState, lustreStateToScchartsStateMap.get(lusState.valuedObject))
        }
    }
    
    protected def processState(AState lusState, State state) {
        for (constVariable : lusState.constants) {
            state.declarations += constVariable.createConstantDeclaration(state)
        }

        for (variable : lusState.variables) {
            state.declarations += variable.createVariableDeclarationFromLustre(state)
        }

        for (Assignment equation : lusState.equations) {
            processEquation(equation as Equation, state)
        }

        for (Expression assertionExpr : lusState.assertions) {
            processAssertion((assertionExpr as Assertion), state)
        }

        for (Automaton automaton : lusState.automatons) {
            processAutomaton(automaton, state)
        }

        for (ATransition transition : lusState.transitions) {
            processTransition(transition, state)
        }
    }

    protected def processTransition(ATransition transition, State source) {

        for (AnAction action : transition.actions) {
            var newTransition = createTransition => [
                sourceState = source
                targetState = lustreStateToScchartsStateMap.get(action.nextState)
            ]

            var trigger = transformExpression(action.condition, source)
            if (trigger !== null) {
                newTransition.trigger = trigger
            }

            for (Effect effect : action.effects) {
                if (effect instanceof Equation) {
                    var assignment = getAssignmentForEquation(effect, source.root as State)
                    if (assignment !== null) {
                        newTransition.effects.add(assignment)
                    }
                }
            }
            
            if (transition.strong) {
                newTransition.preemption = PreemptionType.STRONGABORT
            }
            if (action.history) {
                newTransition.history = HistoryType.DEEP
            }
        }
    }
}
