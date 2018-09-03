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
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
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
import de.cau.cs.kieler.core.model.DynamicTicks
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.kicool.compilation.VariableStore

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
    @Inject extension KExpressionsCompareExtensions
    @Inject extension KEffectsExtensions
    @Inject extension AnnotationsExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = ""

    // Global var names
    public static val DELTA_T_NAME = DynamicTicks.DELTA_T
    public static val SLEEP_T_NAME = DynamicTicks.SLEEP_T

    // Experimental Switches
    public static val NO_SLEEP_NAME = "NoSleep"
    public static val MAX_SLEEP_NAME = "DefaultSleep"
    public static val MAX_SLEEP_DEFAULT = 1000//Float.MAX_VALUE
    public static val SIMULATE_TIME_NAME = "SimulateSleep"
    public static val SIMULATE_TIME_DEFAULT = false
//    public static val CATCH_UP_NAME = "CatchUp"
//    public static val CATCH_UP_DEFAULT = false

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    def void transform(State rootState) {
        val allAnnotations = rootState.eAllContents.filter(Annotation).toList
        val noSleep = allAnnotations.exists[NO_SLEEP_NAME.equals(name)]
        val maxSleep = if (allAnnotations.exists[MAX_SLEEP_NAME.equals(name)]) Float.parseFloat(allAnnotations.findFirst[MAX_SLEEP_NAME.equals(name)].asStringAnnotation.values.head) else MAX_SLEEP_DEFAULT
        val simulateTime = if (allAnnotations.exists[SIMULATE_TIME_NAME.equals(name)]) true else SIMULATE_TIME_DEFAULT
        
        if (rootState.allStates.exists[variableDeclarations.exists[type == ValueType.CLOCK]]) {
            // Create time vars
            val deltaT = if (rootState.valuedObjectsList.exists[DELTA_T_NAME.equals(name)]) {
                val vo = rootState.valuedObjectsList.findFirst[DELTA_T_NAME.equals(name)]
                if (vo.initialValue === null) {
                    vo.initialValue = createFloatValue(0)
                }
                if (!vo.input || !vo.type.toString.equals(DynamicTicks.TYPE)) {
                    environment.errors.add("A variable with name " + DELTA_T_NAME + " already exists and is is not and input variable of type " + DynamicTicks.TYPE)
                } else {
                    environment.warnings.add("A variable with name " + DELTA_T_NAME + " already exists and is used.", rootState, true)
                }
                voStore.update(vo, DynamicTicks.TAG, VariableStore.TIME_FLOAT_SEC)
                vo
            } else {
                val vo = createValuedObject(DELTA_T_NAME)
                vo.initialValue = createFloatValue(0)
                rootState.declarations += createDeclaration => [
                    type = ValueType.get(DynamicTicks.TYPE)
                    input = true
                    valuedObjects += vo
                ]
                voStore.add(vo, SCCHARTS_GENERATED, DynamicTicks.TAG, VariableStore.TIME_FLOAT_SEC)
                vo
            }
            
            val sleepT = if (rootState.valuedObjectsList.exists[SLEEP_T_NAME.equals(name)]) {
                val vo = rootState.valuedObjectsList.findFirst[SLEEP_T_NAME.equals(name)]
                if (vo.initialValue === null) {
                    vo.initialValue = createFloatValue(0)
                }
                if (!vo.input || vo.type.toString.equals(DynamicTicks.TYPE)) {
                    environment.errors.add("A variable with name " + SLEEP_T_NAME + " already exists and is is not and input variable of type " + DynamicTicks.TYPE)
                } else {
                    environment.warnings.add("A variable with name " + SLEEP_T_NAME + " already exists and is used.", rootState, true)
                }
                voStore.update(vo, DynamicTicks.TAG, VariableStore.TIME_FLOAT_SEC)
                vo
            } else {
                val vo = createValuedObject(SLEEP_T_NAME)
                if (!noSleep) {
                    vo.initialValue = createFloatValue(0)
                    rootState.declarations += createDeclaration => [
                        type = ValueType.get(DynamicTicks.TYPE)
                        output = true
                        valuedObjects += vo
                    ]
                    voStore.add(vo, SCCHARTS_GENERATED, DynamicTicks.TAG, VariableStore.TIME_FLOAT_SEC)
                }
                vo
            }
            
            // Global sleep time handling
            if (!noSleep) {
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
                    clock.declaration.asVariableDeclaration.type = ValueType.get(DynamicTicks.TYPE)
                    voStore.update(clock, SCCHARTS_GENERATED, VariableStore.TIME_FLOAT_SEC)
                    if (clock.initialValue === null) clock.initialValue = createFloatValue(0)
                    
                    var region = state.controlflowRegions.head
                    if (state.controlflowRegions.size > 1) {
                        val regionsUsingClock = newLinkedList
                        for (r : state.controlflowRegions) {
                            var testRegion = r
                            while (testRegion.states.size == 1 && testRegion.states.head.outgoingTransitions.empty && testRegion.states.head.controlflowRegions.size == 1) {
                                testRegion = testRegion.states.head.controlflowRegions.head
                            }
                            if (testRegion.states.exists[
                                outgoingTransitions.filter[trigger !== null].exists[
                                    eAllContents.filter(ValuedObjectReference).exists[valuedObject == clock]
                                ]
                            ]) {regionsUsingClock += testRegion}
                        }
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
                        if (!noSleep) {
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
                            var thresholds = <Float>newLinkedList
                            if (constraints.keys.size == 1 && constraints.values.size == 1) {
                                var float lower = 0
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
                                thresholds += lower
                            } else {
                                if (!constraints.isInsignificant) {
                                    for (trans : constraints.keySet) {
                                        val constrs = constraints.get(trans)
                                        val bounds = <Float>newLinkedList

                                        for (constraint : constrs) {
                                            val op = constraint.operator
                                            val value = constraint.subExpressions.filter(Value).head
                                            val float fvalue = switch(value) {
                                                IntValue: value.value
                                                FloatValue: value.value
                                                default: {environment.errors.add("Unsupported value type.", value); 0.0f}
                                            }
                                            
                                            switch(op) {
                                                case GEQ: {
                                                    bounds += fvalue
                                                }
                                                case LEQ, 
                                                case LT: {
                                                    //skip
                                                }
                                                default: environment.errors.add("Malformed timing constraint. Operator "+op+" not supported.", constraint)
                                            }
                                        }
                                        
                                        // check soft bound pattern
                                        val parent = constrs.head.eContainer
                                        if (constrs.size == 2 &&
                                            parent instanceof OperatorExpression &&
                                            (parent as OperatorExpression).operator == OperatorType.LOGICAL_OR &&
                                            constrs.forall[it.eContainer == parent]
                                        ) {
                                            thresholds += bounds.max
                                        } else {
                                            thresholds += bounds
                                        }
                                    }
                                }
                            }
                            
                            if (!thresholds.empty) {
                                thresholds.sortInplace
                                for (threshold : thresholds.indexed) {
                                    val during = subState.createImmediateDuringAction
                                    during.trigger = createLEExpression(clock.reference, createFloatValue(threshold.value))
                                    during.createAssignment(sleepT, createSubExpression(createFloatValue(threshold.value), clock.reference)).operator = AssignOperator.ASSIGNMIN
                                }
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
    
    def boolean isInsignificant(HashMultimap<Transition, OperatorExpression> constraints) {
        if (constraints.keySet.size == 2 && constraints.values.size == 2) {
            val cA = constraints.values.get(0)
            val cB = constraints.values.get(1) 
            val oA = cA.eContainer
            val oB = cB.eContainer
            if (oA instanceof OperatorExpression) {
                if (oB instanceof OperatorExpression) {
                    if (oA.operator == OperatorType.LOGICAL_AND && oB.operator == OperatorType.LOGICAL_AND) {
                        val gA = oA.subExpressions.filter[it != cA].head
                        val gB = oB.subExpressions.filter[it != cB].head
                        val valueA = cA.subExpressions.filter(Value).head
                        if (valueA === null) return false
                        val float fvalueA = switch(valueA) {
                            IntValue: valueA.value
                            FloatValue: valueA.value
                            default: {environment.errors.add("Unsupported value type.", valueA); return false}
                        }
                        val valueB = cB.subExpressions.filter(Value).head
                        if (valueB === null) return false
                        val float fvalueB = switch(valueB) {
                            IntValue: valueB.value
                            FloatValue: valueB.value
                            default: {environment.errors.add("Unsupported value type.", valueB); return false}
                        }
                        if (gA.equals2(gB) &&
                            fvalueA == fvalueB &&
                            (
                            cA.operator == OperatorType.GEQ && cB.operator == OperatorType.LT ||
                            cB.operator == OperatorType.GEQ && cA.operator == OperatorType.LT
                            )
                        ) {
                            return true
                        }
                    }
                }
            }
        }
        return false
    }

}
