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

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.TimerAction
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsUniqueNameExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

/**
 * SCCharts Timers Transformation.
 * 
 * @author als
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
    @Inject extension AnnotationsExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    public static val DEFAULT_WAKE = Integer.MAX_VALUE
    // Global var names
    public static val EXT_WAKE_VAR = "_wakeT"
    public static val EXT_DELTA_T_VAR = "_deltaT"
    public static val EXT_ABS_T_VAR = "_currentTime"
    public static val EXT_ABS_WAKE_VAR = "_nextWakeTime"
    // Local var names
//    public static val DEVIATION_VAR = "_deviation"
    // Experimental Switches
    public static val CATCH_UP = true
    public static val RELATIVE_TIME_REACTION = true
    public static val SIMULATED_TIME = false
    public static val ABSOLUTE_TIME_INPUT = false
    public static val ABSOLUTE_WAKE_OUTPUT = false
    
    // switches
    public var catch_up = CATCH_UP
    public var simulated_time = SIMULATED_TIME
    public var absolute_time_input = ABSOLUTE_TIME_INPUT    
    public var absolute_wake_output = ABSOLUTE_WAKE_OUTPUT    

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    def void transform(State rootState) {
        catch_up = if (rootState.hasAnnotation("NoCatchUp")) false else CATCH_UP
        simulated_time = if (rootState.hasAnnotation("SimulateTime")) true else SIMULATED_TIME
        absolute_time_input = if (rootState.hasAnnotation("AbsTimeInput")) true else ABSOLUTE_TIME_INPUT
        absolute_wake_output = if (rootState.hasAnnotation("AbsWakeOutput")) true else ABSOLUTE_WAKE_OUTPUT
        
        if (rootState.allStates.exists[!actions.filter(TimerAction).empty]) {
            // Create VOs
            val absTime = if (absolute_time_input) {
                val time = createValuedObject(EXT_ABS_T_VAR).uniqueName
                rootState.declarations += createIntDeclaration => [
                    input = true
                    valuedObjects += time
                ]
                time
            }
            val absWake = if (absolute_wake_output) {
                val time = createValuedObject(EXT_ABS_WAKE_VAR).uniqueName
                rootState.declarations += createIntDeclaration => [
                    output = true
                    valuedObjects += time
                ]
                time
            }
            val deltaT = createValuedObject(EXT_DELTA_T_VAR).uniqueName
            if (absolute_time_input) {
                deltaT.initialValue = createIntValue(0)
            }
            rootState.declarations += createIntDeclaration => [
                input = !absolute_time_input
                valuedObjects += deltaT
            ]
            val wake = createValuedObject(EXT_WAKE_VAR).uniqueName
            if (simulated_time || absolute_time_input) {
                wake.initialValue = createIntValue(0)
            }
            rootState.declarations += createIntDeclaration => [
                output = !absolute_wake_output
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
                                if (catch_up) {
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
                        createAssignment(wake, createSubExpression(threshold.reference, localTime.reference)).operator = AssignOperator.ASSIGNMIN
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
                // calculate delta T
                if (absolute_wake_output) {
                    createAssignment(absWake, createOperatorExpression(OperatorType.ADD) => [
                        subExpressions += absTime.reference
                        subExpressions += wake.reference
                    ])
                }
            ]
            
            if (absolute_time_input || simulated_time) {
                rootState.createDuringAction => [
                    // calculate delta T
                    if (absolute_time_input) {
                        createAssignment(deltaT, createOperatorExpression(OperatorType.CONDITIONAL) => [
                            subExpressions += createGTExpression => [
                                subExpressions += absTime.reference
                                subExpressions += createOperatorExpression(OperatorType.PRE) => [
                                    subExpressions += absTime.reference // Normally should be non immediate during
                                ]
                            ]
                            subExpressions += createOperatorExpression(OperatorType.SUB) => [
                                subExpressions += absTime.reference
                                subExpressions += createOperatorExpression(OperatorType.PRE) => [
                                    subExpressions += absTime.reference // Normally should be non immediate during
                                ]
                            ]
                            subExpressions += createIntValue(0)
                        ])
                    }
                    // simulated time
                    if (simulated_time) {
                        createAssignment(deltaT, createOperatorExpression(OperatorType.CONDITIONAL) => [
                            subExpressions += createLEQExpression(deltaT.reference, createIntValue(0))
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
