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

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
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
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import de.cau.cs.kieler.annotations.extensions.UniqueNameCache
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.sccharts.TimerAction
import de.cau.cs.kieler.kexpressions.ValuedObjectReference

/**
 * SCCharts During Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Timers extends SCChartsProcessor implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.timers"
    }

    override getName() {
        "Timers"
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

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    public static val DEFAULT_WAKE = Integer.MAX_VALUE
    // Global var names
    public static val EXT_WAKE_VAR = "_wakeT"
    public static val EXT_DELTA_T_VAR = "_deltaT"
    public static val EXT_ABS_T_VAR = "_absTime"
    // Local var names
//    public static val DEVIATION_VAR = "_deviation"
    // Experimental Switches
    public static val CATCH_UP = true
    public static val RELATIVE_TIME_REACTION = true
    public static val SIMULATED_TIME = true
    public static val ABSOLUTE_TIME_INPUT = true

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    def void transform(State rootState) {
        if (rootState.allStates.exists[!actions.filter(TimerAction).empty]) {
            // Create VOs
            val absTime = if (ABSOLUTE_TIME_INPUT) {
                val time =createValuedObject(EXT_ABS_T_VAR).uniqueName
                rootState.declarations += createIntDeclaration => [
                    input = true
                    valuedObjects += time
                ]
                time
            }
            val deltaT = createValuedObject(EXT_DELTA_T_VAR).uniqueName
            rootState.declarations += createIntDeclaration => [
                input = !ABSOLUTE_TIME_INPUT
                valuedObjects += deltaT
            ]
            val wake = createValuedObject(EXT_WAKE_VAR).uniqueName
            if (SIMULATED_TIME || ABSOLUTE_TIME_INPUT) {
                wake.initialValue = createIntValue(0)
            }
            rootState.declarations += createIntDeclaration => [
                output = true
                valuedObjects += wake
            ]
//            val simDeltaT = createValuedObject(SIM_DELTA_T_VAR).uniqueName
//            val simWake = createValuedObject(SIM_WAKE_VAR).uniqueName
//            rootState.declarations += createIntDeclaration => [
//                output = true
//                valuedObjects += simDeltaT
//                valuedObjects += simWake
//            ]

            // Handle period
            for (state : rootState.allStates.filter[!actions.filter(TimerAction).empty].toList) {
                val periods = state.actions.filter(TimerAction).toList
                state.actions.removeAll(periods)
                
                // Create clock
                val clocks = newArrayList
                var idx = 0
                for (p : periods) {
                    val vo = createValuedObject(if (periods.size > 1) "clock" + idx++ else "clock")
                    vo.initialValue = createBoolValue(false)
                    clocks += vo
                }
                state.declarations += createBoolDeclaration => [
                    valuedObjects += clocks
                ]
                
                // Guard regions
                for (clock : clocks) {
                    for(s : state.allStates.toIterable) {
                        for(a : s.actions.filter[!(it instanceof TimerAction)]) {
                            if (a.trigger === null) {
                                a.trigger = clock.reference
                            } else {
                                a.trigger = createLogicalAndExpression(clock.reference, a.trigger)
                            }
                        }
                        for(t : s.outgoingTransitions) {
                            if (t.trigger === null) {
                                t.trigger = clock.reference
                            } else {
                                t.trigger = createLogicalAndExpression(clock.reference, t.trigger)
                            }
                        }
                    }
                }
                
                // Generate clock
                for (pi : periods.indexed) {
                    val period = pi.value
                    val clock = clocks.get(pi.key)
                    
                    // Gen clk
//                    val clkRegion = state.createControlflowRegion(GENERATED_PREFIX + "GenClk")
//                    val clkState = clkRegion.createInitialState(GENERATED_PREFIX + "GenClkState") => [final = true]
                    
                    val absoluteThreshold = period.trigger.eAllContents.filter(ValuedObjectReference).empty
                    val threshold = createValuedObject(if (periods.size > 1) "threshold" + idx++ else "threshold")
                    if (absoluteThreshold) {
                        threshold.initialValue = period.trigger
                    }
                    val localTime = createValuedObject(if (periods.size > 1) "localTime" + idx++ else "localTime")
                    localTime.initialValue = createIntValue(0)
                    state.declarations += createIntDeclaration => [
                        valuedObjects += localTime
                        valuedObjects += threshold
                    ]
                    state.createImmediateDuringAction => [
                        // Update time
                        createAssignment(localTime, deltaT.reference).operator = AssignOperator.ASSIGNADD
                        // Calculate threshold
                        if (!absoluteThreshold) {
                            createAssignment(threshold, period.trigger).operator = AssignOperator.ASSIGN
                        }
                        // Fire clock
                        createAssignment(clock, createGEQExpression(localTime.reference, threshold.reference))
                        // Reset time
                        if (RELATIVE_TIME_REACTION) {
                            createAssignment(localTime, createOperatorExpression(OperatorType.CONDITIONAL) => [
                                subExpressions += clock.reference
                                if (CATCH_UP) {
                                    subExpressions += threshold.reference
                                    subExpressions += createIntValue(0)
                                } else {
                                    subExpressions += localTime.reference
                                    subExpressions += createIntValue(0)
                                }                               
                            ]).operator = AssignOperator.ASSIGNSUB
                        } else {
                            createAssignment(localTime, createOperatorExpression(OperatorType.CONDITIONAL) => [
                                subExpressions += clock.reference
                                subExpressions += createOperatorExpression(OperatorType.MOD) => [
                                    subExpressions += localTime.reference
                                    subExpressions += threshold.reference
                                ]
                                subExpressions += localTime.reference
                            ]).operator = AssignOperator.ASSIGN
                        }
                        // Publish wake up
                        createAssignment(wake, createSubExpression(period.trigger, localTime.reference)).operator = AssignOperator.ASSIGNMIN
                    ]
                    
//                    clkState.createImmediateDuringAction => [
//                        // Publish wake up
//                        createAssignment(simWake, createSubExpression(period.trigger, localTime.reference)).operator = AssignOperator.ASSIGNMIN
//                    ]
                }
            }
            
//            // Add time simulation region
//            val simRegion = rootState.createControlflowRegion(GENERATED_PREFIX + "SimTime").uniqueName
//            val simState = simRegion.createState(GENERATED_PREFIX + "SimTimeState").uniqueName => [
//                label = ""
//                initial = true
//                final = true
//            ]
//            val deviation = createValuedObject(DEVIATION_VAR).uniqueName
//            deviation.initialValue = createIntValue(0)
//            rootState.declarations += createIntDeclaration => [
//                valuedObjects += deviation
//            ]
//            simState.createDuringAction => [
//                // deviation to expected wake up
//                createAssignment(deviation, createSubExpression(extDeltaT.reference, createPreExpression(wake.reference))).operator = AssignOperator.ASSIGNADD
//                // Passed sim time
//                // Assumption: No early wake up
//                createAssignment(simDeltaT,createPreExpression(simWake.reference))
//            ]
//            simState.createImmediateDuringAction => [
//                // start wake time collection
//                createAssignment(simWake, createIntValue(DEFAULT_WAKE))
//                // set wake time
//                createAssignment(wake, createSubExpression(simWake.reference, deviation.reference))
//                // assure wake time >= 0 (catch up case)
//                createAssignment(wake, createIntValue(0)).operator = AssignOperator.ASSIGNMAX
//            ]
            rootState.createImmediateDuringAction => [
                // start wake time collection
                createAssignment(wake, createIntValue(DEFAULT_WAKE))
            ]
            
            if (ABSOLUTE_TIME_INPUT || SIMULATED_TIME) {
                rootState.createDuringAction => [
                    // calculate delta T
                    if (ABSOLUTE_TIME_INPUT) {
                        createAssignment(deltaT, createOperatorExpression(OperatorType.SUB) => [
                            subExpressions += absTime.reference
                            subExpressions += createOperatorExpression(OperatorType.PRE) => [
                                subExpressions += absTime.reference // Normally should be non immediate during
                            ]
                        ])
                    }
                    // simulated time
                    if (SIMULATED_TIME) {
                        createAssignment(deltaT, createOperatorExpression(OperatorType.CONDITIONAL) => [
                            subExpressions += createGEQExpression(deltaT.reference, createIntValue(0))
                            subExpressions += createOperatorExpression(OperatorType.PRE) => [
                                subExpressions += wake.reference // Normally should be non immediate during
                            ]
                            subExpressions += deltaT.reference
                        ]).operator = AssignOperator.ASSIGN
                    }
                ]
            }
            
        }

    }

}
