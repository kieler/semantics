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
package de.cau.cs.kieler.sccharts.processors

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.definitions.DynamicTicks
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.PriorityProtocol
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.kexpressions.Expression

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

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
    @Inject extension SCChartsActionExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCompareExtensions
    @Inject extension KEffectsExtensions
    @Inject extension AnnotationsExtensions

    // This prefix is used for naming of all generated signals, states and regions
    public static final String GENERATED_PREFIX = ""
    
    // Global var names
    public static val DELTA_T_NAME = DynamicTicks.DELTA_T
    public static val SLEEP_T_NAME = DynamicTicks.SLEEP_T
    public static val DEVIATION_NAME = "deviation"

    // Experimental Switches
    public static val NO_SLEEP_NAME = "NoSleep"
    public static val MAX_SLEEP_NAME = "DefaultSleep"
    public static val MAX_SLEEP_DEFAULT = 1000//Float.MAX_VALUE
    public static val SIMULATE_TIME_NAME = "SimulateSleep"
    public static val SIMULATE_TIME_DEFAULT = false
    public static val DEVIATION_OUTPUT_NAME = "DeviationOutput"
    public static val DEVIATION_OUTPUT_DEFAULT = false
    public static val TIME_FORMAT_NAME = "TimePrintFormat"
    public static val TIME_FORMAT_DEFAULT = "%.4f"
    public static val INT_CLOCK_NAME = "IntegralClockType"
    public static val INT_CLOCK_NAME_2 = "IntegerClockType"
    public static val USE_SD_NAME = "ClocksUseSD"
    
    var isIntClockType = false

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    def void transform(State rootState) {
        val allAnnotations = rootState.eAllContents.filter(Annotation).toList
        val noSleep = allAnnotations.exists[NO_SLEEP_NAME.equalsIgnoreCase(name)]
        val maxSleep = if (allAnnotations.exists[MAX_SLEEP_NAME.equalsIgnoreCase(name)]) Double.parseDouble(allAnnotations.findFirst[MAX_SLEEP_NAME.equalsIgnoreCase(name)].asStringAnnotation.values.head) else MAX_SLEEP_DEFAULT
        val simulateTime = if (allAnnotations.exists[SIMULATE_TIME_NAME.equalsIgnoreCase(name)]) true else SIMULATE_TIME_DEFAULT
        val deviationOutput = if (allAnnotations.exists[DEVIATION_OUTPUT_NAME.equalsIgnoreCase(name)]) true else DEVIATION_OUTPUT_DEFAULT
        val timePrintFormat = if (allAnnotations.filter(StringAnnotation).exists[TIME_FORMAT_NAME.equalsIgnoreCase(name)]) allAnnotations.filter(StringAnnotation).findFirst[TIME_FORMAT_NAME.equalsIgnoreCase(name)].values.head else TIME_FORMAT_DEFAULT
        isIntClockType = allAnnotations.exists[INT_CLOCK_NAME.equalsIgnoreCase(name) || INT_CLOCK_NAME_2.equalsIgnoreCase(name) ]
        val clockType = ValueType.get(isIntClockType ? DynamicTicks.INT_TYPE : DynamicTicks.FLOAT_TYPE)
        val useSD = allAnnotations.exists[USE_SD_NAME.equalsIgnoreCase(name)]
        
        if (rootState.allStates.exists[variableDeclarations.exists[type == ValueType.CLOCK]]) {
            // Create time vars
            val deltaT = if (rootState.valuedObjectsList.exists[DELTA_T_NAME.equalsIgnoreCase(name)]) {
                val vo = rootState.valuedObjectsList.findFirst[DELTA_T_NAME.equalsIgnoreCase(name)]
                if (vo.initialValue === null) {
                    vo.initialValue = createClockValue(0)
                }
                if (!vo.input || vo.type !== clockType) {
                    environment.errors.add("A variable with name " + DELTA_T_NAME + " already exists and is is not and input variable of type " + clockType.literal)
                } else {
                    environment.warnings.add("A variable with name " + DELTA_T_NAME + " already exists and is used.", rootState, true)
                }
                if (!vo.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION) && !vo.declaration.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION)) {
                    vo.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                }
                voStore.update(vo, DynamicTicks.TAG)
                vo
            } else {
                val vo = createValuedObject(DELTA_T_NAME)
                vo.initialValue = createClockValue(0)
                rootState.declarations += createDeclaration => [
                    type = clockType
                    input = true
                    valuedObjects += vo
                ]
                vo.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                voStore.update(vo, SCCHARTS_GENERATED, DynamicTicks.TAG)
                vo
            }
            
            val sleepT = if (rootState.valuedObjectsList.exists[SLEEP_T_NAME.equalsIgnoreCase(name)]) {
                val vo = rootState.valuedObjectsList.findFirst[SLEEP_T_NAME.equalsIgnoreCase(name)]
                if (vo.initialValue === null) {
                    vo.initialValue = createClockValue(0)
                }
                if (!vo.input || vo.type !== clockType) {
                    environment.errors.add("A variable with name " + SLEEP_T_NAME + " already exists and is is not and input variable of type " + clockType.literal)
                } else {
                    environment.warnings.add("A variable with name " + SLEEP_T_NAME + " already exists and is used.", rootState, true)
                }
                if (!vo.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION) && !vo.declaration.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION)) {
                    vo.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                }
                voStore.update(vo, DynamicTicks.TAG)
                vo
            } else {
                val vo = createValuedObject(SLEEP_T_NAME)
                if (!noSleep) {
                    vo.initialValue = createClockValue(0)
                    rootState.declarations += createDeclaration => [
                        type = clockType
                        output = true
                        valuedObjects += vo
                    ]
                    vo.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                    voStore.update(vo, SCCHARTS_GENERATED, DynamicTicks.TAG)
                }
                vo
            }
            
            // DeviationOutput
            if(deviationOutput && !noSleep) {
                val vo = createValuedObject(DEVIATION_NAME).uniqueName
                vo.initialValue = createClockValue(0)
                rootState.declarations += createDeclaration => [
                    type = clockType
                    output = true
                    valuedObjects += vo
                ]
                vo.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                voStore.update(vo, SCCHARTS_GENERATED, DynamicTicks.TAG)
                
                rootState.createDuringAction => [
                    // calculate deviation
                    effects += createAssignment(vo, createSubExpression(deltaT.reference, createPreExpression(sleepT.reference)))
                ]
            }
            
            // Global sleep time handling
            if (!noSleep) {
                rootState.createImmediateDuringAction => [
                    // start sleep time collection
                    effects += createAssignment(sleepT, createClockValue(maxSleep))
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
                var sdDecls = <Declaration, Declaration>newHashMap
                for (clock : state.variableDeclarations.filter[type == ValueType.CLOCK].map[valuedObjects].flatten.toList) {
                    clock.declaration.asVariableDeclaration.type = clockType
                    if (!clock.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION) && !clock.declaration.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION)) {
                        clock.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                    }
                    voStore.update(clock, SCCHARTS_GENERATED)
                    if (clock.initialValue === null) clock.initialValue = createClockValue(0)
                    
                    if (useSD) {
                        // Increment clock globally -> SD for UIUR protocoll
                        if (!sdDecls.containsKey(clock.declaration)) {
                            val sdDecl = createScheduleDeclaration => [
                                name = "ClockIUR"
                                priorities += newArrayList(
                                    PriorityProtocol.CONFLICT,  // Clock increment
                                    PriorityProtocol.CONFLICT,  // Init (clock reset)
                                    PriorityProtocol.CONFLUENT  // Update
//                                    PriorityProtocol.CONFLUENT  // Read
                                )
                            ]
                            state.declarations.add(state.declarations.indexOf(clock.declaration) + 1, sdDecl)
                            sdDecls.put(clock.declaration, sdDecl)
                        }
                        val sd = createValuedObject(sdDecls.get(clock.declaration), clock.name + "SD")
                        
                        for (scope : state.allScopes.toIterable) {
                            for (access : scope.allContainedActions.map[eAllContents.filter(ValuedObjectReference).filter[valuedObject == clock]].flatten.toIterable) {
                                if (access.eContainer instanceof Assignment) {
                                    val asm = access.eContainer as Assignment
                                    if (asm.reference == access) {// write
                                        if ((access.eContainer as Assignment).operator == AssignOperator.ASSIGN) { // absolute
                                            asm.schedule += createScheduleReference(sd, 1)
                                        } else { // relative
                                            asm.schedule += createScheduleReference(sd, 2)
                                        }
                                    }
                                }
                            }
                            if (scope instanceof State) {
                                // sleep time
                                if (!noSleep) {
                                    scope.handleSleep(clock, sleepT)
                                }
                            }
                        }
                        
                        // increment                      
                        state.createDuringAction => [
                            it.createAssignment(clock, deltaT.reference) => [
                                operator = AssignOperator.ASSIGNADD
                                schedule += createScheduleReference(sd, 0)
                            ]
                        ]
                    } else {
                        // Increment clocks in each state -> no support of hierachy or concurrency
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
                                environment.errors.add("Cannot handle concurrent timed automata using the same clock. Add @" + USE_SD_NAME + " annotation for experimental support based on schduling directives.", state)
                            }
                        }
                        
                        if (region === null) {
                            environment.errors.add("Cannot handle concurrent or hierarchical timed automata using the same clock. Add @" + USE_SD_NAME + " annotation for experimental support based on schduling directives.", state)
                        } else {
                            for (subState : region.states.toList) {
                                // error case
                                if (subState.containsInnerActions || !subState.regions.nullOrEmpty) {
                                    if (subState.actions.exists[trigger?.eAllContents?.filter(ValuedObjectReference)?.exists[valuedObject == clock]] ||
                                        subState.controlflowRegions.exists[eAllContents?.filter(ValuedObjectReference)?.exists[valuedObject == clock]]) {
                                            environment.errors.add("Cannot handle hierarchical timed automata. Add @" + USE_SD_NAME + " annotation for experimental support based on SDs.", subState)
                                    }
                                }
                                
                                // time progress
                                subState.createDuringAction => [
                                    it.createAssignment(clock, deltaT.reference) => [operator = AssignOperator.ASSIGNADD]
                                ]
                                
                                // sleep time
                                if (!noSleep) {
                                    subState.handleSleep(clock, sleepT)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    def void handleSleep(State state, ValuedObject clock, ValuedObject sleepT) {
        val constraints = HashMultimap.<Transition, OperatorExpression>create
        val complexConstraints = <OperatorExpression>newArrayList
        for (trans : state.outgoingTransitions.filter[trigger !== null]) {
            for (vor : trans.trigger.eAllContents.filter(ValuedObjectReference).filter[valuedObject == clock].toIterable) {
                val exp = vor.eContainer
                if (exp instanceof OperatorExpression) {
                    if (exp.subExpressions.size == 2) {
                        if (exp.subExpressions.filter(ValuedObjectReference).size == 1 &&
                            exp.subExpressions.filter(Value).size == 1) {
                            constraints.put(trans, exp)
                        } else {
                            complexConstraints += exp
                        }
                    } else {
                        environment.errors.add("Malformed timing constraint.", vor)
                    }
                } else {
                    environment.errors.add("Malformed timing constraint.", vor)
                }
            }
        }
        
        // 1. Handle complex constraints
        for (constraint : complexConstraints) {
            val op1 = constraint.subExpressions.head
            val op2 = constraint.subExpressions.last
            var Expression exp = null
            if (op1 instanceof ValuedObjectReference) {
                if (op1.valuedObject === clock) {
                    exp = op2
                }
            }
            if (op2 instanceof ValuedObjectReference) {
                if (op2.valuedObject === clock) {
                    exp = op1
                }
            }
            if (exp === null) {
                environment.errors.add("Malformed timing constraint. No reference to clock.", constraint)
            } else {
                if (!(constraint.operator === OperatorType.GEQ && exp === op2 || constraint.operator === OperatorType.LEQ && exp === op1)) {
                    environment.errors.add("Malformed timing constraint. Operator "+constraint.operator+" not supported in clock comparison.", constraint)
                } else {
                    val during = state.createImmediateDuringAction
                    during.trigger = createLEExpression(clock.reference, exp.copy)
                    during.createAssignment(sleepT, createSubExpression(exp.copy, clock.reference)).operator = AssignOperator.ASSIGNMIN
                }
            }
            
        }
        
        // 2. Handle constant constraints
        var thresholds = <Double>newLinkedList
        // easy case
        if (constraints.keys.size == 1 && constraints.values.size == 1) {
            var double lower = 0
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
                    val bounds = <Double>newLinkedList

                    for (constraint : constrs) {
                        val op = constraint.operator
                        val value = constraint.subExpressions.filter(Value).head
                        val double fvalue = switch(value) {
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
                val during = state.createImmediateDuringAction
                during.trigger = createLEExpression(clock.reference, createClockValue(threshold.value))
                during.createAssignment(sleepT, createSubExpression(createClockValue(threshold.value), clock.reference)).operator = AssignOperator.ASSIGNMIN
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
                        val double fvalueA = switch(valueA) {
                            IntValue: valueA.value
                            FloatValue: valueA.value
                            default: {environment.errors.add("Unsupported value type.", valueA); return false}
                        }
                        val valueB = cB.subExpressions.filter(Value).head
                        if (valueB === null) return false
                        val double fvalueB = switch(valueB) {
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
    
    
    def createClockValue(Number n) {
        if (isIntClockType) {
            createIntValue(n.intValue)
        } else {
            createFloatValue(n.doubleValue)
        }
    }

}
