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
    public static val EXT_WAKE_VAR = "wakeT"
    public static val SIM_WAKE_VAR = "simWakeT"
    public static val EXT_DELTA_T_VAR = "deltaT"
    public static val SIM_DELTA_T_VAR = "simDeltaT"
    // Local var names
    public static val DEVIATION_VAR = "deviation"

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    def void transform(State rootState) {
        if (rootState.allStates.exists[!actions.filter(TimerAction).empty]) {
            // Create VOs
            val extDeltaT = createValuedObject(EXT_DELTA_T_VAR).uniqueName
            rootState.declarations += createIntDeclaration => [
                input = true
                valuedObjects += extDeltaT
            ]
            val wake = createValuedObject(EXT_WAKE_VAR).uniqueName
            rootState.declarations += createIntDeclaration => [
                output = true
                valuedObjects += wake
            ]
            val simDeltaT = createValuedObject(SIM_DELTA_T_VAR).uniqueName
            val simWake = createValuedObject(SIM_WAKE_VAR).uniqueName
            rootState.declarations += createIntDeclaration => [
                output = true
                valuedObjects += simDeltaT
                valuedObjects += simWake
            ]

            // Handle period
            for (state : rootState.allStates.filter[!actions.filter(TimerAction).empty].toList) {
                val periods = state.actions.filter(TimerAction).toList
                state.actions.removeAll(periods)
                
                // Create clock
                val clocks = periods.map[createValuedObject("clock").uniqueName].immutableCopy
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
                    val clkRegion = state.createControlflowRegion(GENERATED_PREFIX + "GenClk")
                    val clkState = clkRegion.createInitialState(GENERATED_PREFIX + "GenClkState") => [final = true]
                    
                    val localTime = createValuedObject("localTime")
                    localTime.initialValue = createIntValue(0)
                    clkState.declarations += createIntDeclaration => [
                        valuedObjects += localTime
                    ]

                    clkState.createDuringAction => [
                        // Update time
                        createAssignment(localTime, simDeltaT.reference).operator = AssignOperator.ASSIGNADD
                        // Fire clock
                        createAssignment(clock, createGEQExpression(localTime.reference, period.trigger.copy))
                        // Reset time
                        createAssignment(localTime, createOperatorExpression(OperatorType.CONDITIONAL) => [
                            subExpressions += clock.reference
                            subExpressions += localTime.reference
                            subExpressions += createIntValue(0)
                        ]).operator = AssignOperator.ASSIGNSUB
                    ]
                    
                    clkState.createImmediateDuringAction => [
                        // Publish wake up
                        createAssignment(simWake, createSubExpression(period.trigger, localTime.reference)).operator = AssignOperator.ASSIGNMIN
                    ]
                }
            }
            
            // Add time simulation region
            val simRegion = rootState.createControlflowRegion(GENERATED_PREFIX + "SimTime").uniqueName
            val simState = simRegion.createState(GENERATED_PREFIX + "SimTimeState").uniqueName => [
                label = ""
                initial = true
                final = true
            ]
            val deviation = createValuedObject(DEVIATION_VAR).uniqueName
            deviation.initialValue = createIntValue(0)
            rootState.declarations += createIntDeclaration => [
                valuedObjects += deviation
            ]
            simState.createDuringAction => [
                // deviation to expected wake up
                createAssignment(deviation, createSubExpression(extDeltaT.reference, createPreExpression(wake.reference))).operator = AssignOperator.ASSIGNADD
                // Passed sim time
                // Assumption: No early wake up
                createAssignment(simDeltaT,createPreExpression(simWake.reference))
            ]
            simState.createImmediateDuringAction => [
                // start wake time collection
                createAssignment(simWake, createIntValue(DEFAULT_WAKE))
                // set wake time
                createAssignment(wake, createSubExpression(simWake.reference, deviation.reference))
                // assure wake time >= 0 (catch up case)
                createAssignment(wake, createIntValue(0)).operator = AssignOperator.ASSIGNMAX
            ]
        }

    }
    

                // Early wake up test
//                effects += createAssignment(deviation) => [ // ext time passed
//                    operator = AssignOperator.ASSIGNADD
//                    expression = extDeltaT.reference
//                ]
//                effects += createAssignment(simDeltaT) => [ // sim time passed
//                    expression = createOperatorExpression(OperatorType.CONDITIONAL) => [
//                        subExpressions += createGEQExpression(deviation.reference, createPreExpression(wake.reference))
//                        subExpressions += createPreExpression(wake.reference) // good wake up
//                        subExpressions += createIntValue(0) // early weak up
//                    ]
//                ]
//                effects += createAssignment(deviation) => [ // new deviation
//                    operator = AssignOperator.ASSIGNSUB
//                    expression = simDeltaT.reference
//                ]
//                effects += createAssignment(wake) => [ // set wake time
//                    expression = createOperatorExpression(OperatorType.CONDITIONAL) => [
//                        subExpressions += createNEExpression(deviation.reference, createIntValue(0))
//                        subExpressions += createSubExpression(simWake.reference, deviation.reference) // good wake up
//                        subExpressions += createSubExpression(createPreExpression(wake.reference), deviation.reference) // early weak up
//                    ]
//                    expression = createIntValue(MINIMUM_WAKE)
//                ]

    def void transformRVH(State rootState) {
        if (rootState.allScopes.exists[!actions.filter(TimerAction).empty]) {
            // Create VOs
            val t_val = createValuedObject("tUsec_val").uniqueName
            rootState.declarations += createIntDeclaration => [
                input = true
                valuedObjects += t_val
            ]
            val wake = createValuedObject("wakeUsec").uniqueName
            rootState.declarations += createIntDeclaration => [
                output = true
                valuedObjects += wake
            ]

            // add simulation time region
            val simregion = rootState.createControlflowRegion(GENERATED_PREFIX + "SimTime")
            val simstate = simregion.createState(GENERATED_PREFIX + "SimTime", "") => [
                initial = true
                final = true
            ]
            val p = createValuedObject("pUsec").uniqueName
            rootState.declarations += createIntDeclaration => [
                valuedObjects += p
            ]
            val pMin = createValuedObject("pMinUsec").uniqueName
            pMin.initialValue = createIntValue(9999999)
            rootState.declarations += createIntDeclaration => [
                valuedObjects += pMin
            ]
            simstate.createDuringAction => [
                createAssignment(wake, createIntValue(9999999))
                createAssignment(p, t_val.reference)
                createAssignment(t_val, createPreExpression(wake.reference))
                createAssignment(p, createSubExpression(t_val.reference, p.reference))
                createAssignment(pMin, p.reference).operator = AssignOperator.ASSIGNMIN
            ]

            // Handle period
            for (state : rootState.allStates.filter[!actions.filter(TimerAction).empty].toList) {
                val periods = state.actions.filter(TimerAction).toList
                if (periods.size > 1) environment.errors.add("Multiple timer action in same state", state)
                val period = periods.head
                state.actions.removeAll(periods)

                // Create clock
                val clk = createValuedObject("clk").uniqueName
                state.declarations += createBoolDeclaration => [
                    valuedObjects += clk
                ]
                
                // Guard regions
                for(s : state.allStates.toIterable) {
                    for(a : s.actions.filter[!(it instanceof TimerAction)]) {
                        if (a.trigger === null) {
                            a.trigger = clk.reference
                        } else {
                            a.trigger = createLogicalAndExpression(clk.reference, a.trigger)
                        }
                    }
                    for(t : s.outgoingTransitions) {
                        if (t.trigger === null) {
                            t.trigger = clk.reference
                        } else {
                            t.trigger = createLogicalAndExpression(clk.reference, t.trigger)
                        }
                    }
                }
                
                // Gen clk
                val clkRegion = state.createControlflowRegion(GENERATED_PREFIX + "GenClk")
                val clkState = clkRegion.createInitialState(GENERATED_PREFIX + "GenClkState") =>[final = true]
                
                val myWakeUsec = createValuedObject("myWakeUsec").uniqueName
                myWakeUsec.initialValue = createIntValue(0)
                clkState.declarations += createIntDeclaration => [
                    valuedObjects += myWakeUsec
                ]
                val s_val = createValuedObject("s_val").uniqueName
                val s_wake = createValuedObject("s_wake").uniqueName
                clkState.declarations += createIntDeclaration => [
                    valuedObjects += s_val
                    valuedObjects += s_wake
                ]
                
                clkState.createImmediateDuringAction => [
                    trigger = createGTExpression(myWakeUsec.reference, createIntValue(0))
                    createAssignment(wake, myWakeUsec.reference).operator = AssignOperator.ASSIGNMIN
                ]
                
                val timerRegion = clkState.createControlflowRegion(GENERATED_PREFIX + "Timer", "")
                val timerState = timerRegion.createInitialState(GENERATED_PREFIX + "Timer")
                
                timerState.createTransitionTo(timerState) => [
                    trigger = createGEQExpression(t_val.reference, myWakeUsec.reference)
                    createAssignment(clk, createBoolValue(true))
                ]
                timerState.createEntryAction => [
                    createAssignment(s_val, createIntValue(0))
                    createAssignment(s_wake, period.trigger)
                    createAssignment(myWakeUsec, createAddExpression(
                            createSubExpression(
                                s_wake.reference,
                                s_val.reference
                            ),
                            t_val.reference
                        )
                    )
                ]
                timerState.createDuringAction => [
                    createAssignment(clk, createBoolValue(false))
                ]
            }
        }

    }

}
