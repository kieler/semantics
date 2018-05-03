/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsUniqueNameExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions

/**
 * SCCharts Timed Automata Transformation.
 * 
 * @author als
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class TimedAutomata extends SCChartsProcessor implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.timedautomata"
    }

    override getName() {
        "Timed Automata"
    }

    override process() {
        setModel(model.transform)
    }

    // -------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsUniqueNameExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension AnnotationsExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = ""

    // Global var names
    public static val DELTA_T_NAME = GENERATED_PREFIX + "deltaT"
    public static val SLEEP_T_NAME = GENERATED_PREFIX + "sleepT"

    // Experimental Switches
    public static val DYNAMIC_TICKS_NAME = "DynamicTicks"
    public static val DYNAMIC_TICKS_DEFAULT = false
    public static val MAX_SLEEP_NAME = "DefaultSleep"
    public static val MAX_SLEEP_DEFAULT = Integer.MAX_VALUE
    public static val SIMULATE_TIME_NAME = "SimulateSleep"
    public static val SIMULATE_TIME_DEFAULT = false
//    public static val CATCH_UP_NAME = "CatchUp"
//    public static val CATCH_UP_DEFAULT = false
    
    // External Annotations
    public static val DELTA_TIME_ANNOTATION = "InputDeltaTime"
    public static val SLEEP_TIME_ANNOTATION = "OutputSleepTime"

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    def void transform(State rootState) {
        val dynamicTicks = if (rootState.hasAnnotation(DYNAMIC_TICKS_NAME)) true else DYNAMIC_TICKS_DEFAULT
        val maxSleep = if (rootState.hasAnnotation(MAX_SLEEP_NAME)) Float.parseFloat(rootState.getAnnotation(MAX_SLEEP_NAME).asStringAnnotation.values.head) else MAX_SLEEP_DEFAULT
        val simulateTime = if (rootState.hasAnnotation(SIMULATE_TIME_NAME)) true else SIMULATE_TIME_DEFAULT
        
        if (rootState.allStates.exists[variableDeclarations.exists[type == ValueType.CLOCK]]) {
            // Create time vars
            val deltaT = createValuedObject(DELTA_T_NAME).uniqueName
            deltaT.initialValue = createFloatValue(0)
            rootState.declarations += createDeclaration => [
                type = ValueType.FLOAT
                input = true
                annotations += createTagAnnotation(DELTA_TIME_ANNOTATION)
                valuedObjects += deltaT
            ]
            
            val sleepT = createValuedObject(SLEEP_T_NAME).uniqueName
            if (dynamicTicks) {
                sleepT.initialValue = createFloatValue(0)
                rootState.declarations += createDeclaration => [
                    type = ValueType.FLOAT
                    output = true
                    annotations += createTagAnnotation(SLEEP_TIME_ANNOTATION)
                    valuedObjects += sleepT
                ]
            }
            
            // Global sleep time handling
            if (dynamicTicks) {
                rootState.createImmediateDuringAction => [
                    // start sleep time collection
                    effects += createAssignment(sleepT, createFloatValue(maxSleep))
                ]
            
                if (simulateTime) {
                    rootState.createDuringAction => [
                        // simulated time
                        effects += createAssignment(deltaT, createOperatorExpression(OperatorType.PRE) => [
                            subExpressions += sleepT.reference
                        ]) => [operator = AssignOperator.ASSIGN]
                    ]
                }
            }

            // Handle clock
            for (state : rootState.allStates.filter[variableDeclarations.exists[type == ValueType.CLOCK]].toList) {
                for (clock : state.variableDeclarations.filter[type == ValueType.CLOCK].map[valuedObjects].flatten.toList) {
                    clock.declaration.asVariableDeclaration.type = ValueType.FLOAT
                    if (clock.initialValue === null) clock.initialValue = createFloatValue(0)
                    
                    var region = state.controlflowRegions.head
                    if (state.controlflowRegions.size > 1) {
                        val regionsUsingClock = state.controlflowRegions.filter[
                            states.exists[
                                outgoingTransitions.filter[trigger !== null].exists[
                                    eAllContents.filter(ValuedObjectReference).exists[valuedObject == clock]
                                ]
                            ]
                        ]
                        region = regionsUsingClock.head
                        if (regionsUsingClock.size > 1) {
                            environment.errors.add("Cannot concurrent timed automata using the same clock.", state)
                        }
                    }
                    
                    for (subState : region.states.toList) {
                        // error case
                        if (subState.containsInnerActions || !subState.regions.nullOrEmpty) {
                            if (subState.actions.exists[trigger.eAllContents.filter(ValuedObjectReference).exists[valuedObject == clock]] ||
                                subState.controlflowRegions.exists[eAllContents.filter(ValuedObjectReference).exists[valuedObject == clock]]) {
                                    environment.errors.add("Cannot handle hierarchical timed automata.", subState)
                            }
                        }
                        
                        // time progress
                        subState.createDuringAction => [
                            it.createAssignment(clock, deltaT.reference) => [operator = AssignOperator.ASSIGNADD]
                        ]
                        
                        // sleep time
                        if (dynamicTicks) {
                            val constraints = HashMultimap.<Transition, OperatorExpression>create
                            for (trans : subState.outgoingTransitions.filter[trigger !== null]) {
                                for (vor : trans.trigger.eAllContents.filter(ValuedObjectReference).filter[valuedObject == clock].toIterable) {
                                    val exp = vor.eContainer
                                    if (exp instanceof OperatorExpression) {
                                        if (exp.subExpressions.size == 2 && 
                                            exp.subExpressions.filter(ValuedObjectReference).size == 1 &&
                                            exp.subExpressions.filter(Value).size == 1) {
                                            constraints.put(trans, exp)
                                        } else {
                                            environment.errors.add("Malformed timing constraint.", vor)
                                        }
                                    } else {
                                        environment.errors.add("Malformed timing constraint.", vor)
                                    }
                                }
                            }
                            
                            // easy case
                            var lower = 0.0
                            var upper = 0.0
                            if (constraints.keys.size == 1 && constraints.values.size == 1) {
                                val op = constraints.values.head.operator
                                if (op == OperatorType.GEQ || op == OperatorType.GT) {
                                    val value = constraints.values.head.subExpressions.filter(Value).head
                                    switch(value) {
                                        IntValue: lower = value.value
                                        FloatValue: lower = value.value
                                        default: environment.errors.add("Unsupported value type.", value)
                                    }
                                }
                                if (op == OperatorType.GT) {
                                    lower++
                                }
                            } else {
                                for (trans : constraints.keySet) {
                                    val constrs = constraints.get(trans)
                                    var OperatorType combine = null
                                    if (constrs.size > 1) {
                                        val parents = constrs.map[eContainer as Expression].toSet
                                        if (parents.size > 1 || 
                                            !(parents.head instanceof OperatorExpression) || 
                                            !#[OperatorType.LOGICAL_AND, OperatorType.LOGICAL_OR].contains((parents.head as OperatorExpression).operator)) {
                                                environment.errors.add("Malformed composed timing constraint.", trans)
                                        } else {
                                            combine = (constrs.head.eContainer as OperatorExpression).operator
                                        }
                                    }
                                    
                                    for (constraint : constraints.get(trans)) {
                                        val op = constraint.operator
                                        val value = constraints.values.head.subExpressions.filter(Value).head
                                        val double fvalue = switch(value) {
                                            IntValue: value.value
                                            FloatValue: value.value
                                            default: {environment.errors.add("Unsupported value type.", value); 0.0}
                                        }
                                        
                                        switch(op) {
                                            case GEQ: {
                                                lower = fvalue
                                            }
                                            case GT: {
                                                lower = fvalue + 1
                                            }
                                            case LEQ: {
                                                upper = fvalue - 1
                                            }
                                            case LT: {
                                                upper = fvalue
                                            }
                                        }
                                    }
                                }
                            }
                            
                            if (lower > upper) {
                                upper = 0
                            }
                            if (lower == upper) {
                                lower = -1
                            }
                            if (lower >= 0) {
                                val during = subState.createImmediateDuringAction
                                if (upper > 0) {
                                    during.trigger = createLEExpression(clock.reference, createFloatValue(upper as float))
                                }
                                during.createAssignment(sleepT, createSubExpression(createFloatValue(lower as float), clock.reference)).operator = AssignOperator.ASSIGNMIN
                            }
                        }
                    }
                    
//                    // Catch up
//                    if (state.hasAnnotation(CATCH_UP_NAME) || CATCH_UP_DEFAULT) {
//                        for (asm : state.eAllContents.filter(Assignment).filter[valuedObject == clock].toIterable) {
//                            if (asm.expression instanceof Value) {
//                            }
//                        }
//                    }
                }
            }
        }
    }

}
