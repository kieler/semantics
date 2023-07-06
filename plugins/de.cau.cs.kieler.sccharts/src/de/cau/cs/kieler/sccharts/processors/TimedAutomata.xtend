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
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.PriorityProtocol
import de.cau.cs.kieler.kexpressions.Schedulable
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.OdeAction
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import org.eclipse.emf.ecore.EObject

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
    public static val DEVIATION_NAME = "lag"

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
    public static val PASSIVE_NAME = "Passive"
    public static val LOGICAL_NAME = "Logical"
    public static val NO_SLEEP_SD_COPY = "DoNotCopySDForSleep"
    
    var isIntClockType = false

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    def void transform(State rootState) {
        val allAnnotations = rootState.eAllContents.filter(Annotation).toList
        
        val noSleep = allAnnotations.exists[NO_SLEEP_NAME.equalsIgnoreCase(name)]
        val simulateTime = if (allAnnotations.exists[SIMULATE_TIME_NAME.equalsIgnoreCase(name)]) true else SIMULATE_TIME_DEFAULT
        val deviationOutput = if (allAnnotations.exists[DEVIATION_OUTPUT_NAME.equalsIgnoreCase(name)]) true else DEVIATION_OUTPUT_DEFAULT
        val timePrintFormat = if (allAnnotations.filter(StringAnnotation).exists[TIME_FORMAT_NAME.equalsIgnoreCase(name)]) allAnnotations.filter(StringAnnotation).findFirst[TIME_FORMAT_NAME.equalsIgnoreCase(name)].values.head else TIME_FORMAT_DEFAULT
        
        // Get max sleep
        val maxSleep = if (allAnnotations.exists[MAX_SLEEP_NAME.equalsIgnoreCase(name)]) {
            val value = allAnnotations.findFirst[MAX_SLEEP_NAME.equalsIgnoreCase(name)].asStringAnnotation.values.head
            if (!value.nullOrEmpty) {
                try {
                    Double.parseDouble(value)
                } catch (NumberFormatException e) {
                    value
                }
            } else {
                MAX_SLEEP_DEFAULT
            }
        } else {
            MAX_SLEEP_DEFAULT
        }
        
        // Get clock type
        val intAnnoClockType = allAnnotations.findLast[INT_CLOCK_NAME.equalsIgnoreCase(name) || INT_CLOCK_NAME_2.equalsIgnoreCase(name) ]
        isIntClockType = intAnnoClockType !== null
        val intHostClockType = if (isIntClockType && intAnnoClockType instanceof StringAnnotation && !intAnnoClockType.asStringAnnotation.values.isEmpty) {
            intAnnoClockType.asStringAnnotation.values.head
        } else {
            null
        }
        val clockType = if (intHostClockType !== null) {
            ValueType.HOST
        } else if (isIntClockType) {
            ValueType.get(DynamicTicks.INT_TYPE)
        } else {
            ValueType.get(DynamicTicks.FLOAT_TYPE)
        }
        
        val useSD = allAnnotations.exists[USE_SD_NAME.equalsIgnoreCase(name)]
        
        val hasClocks = rootState.allStates.exists[hasClocks]
        val hasODEs = rootState.allStates.exists[actions.exists[it instanceof OdeAction]]
        
        if (hasClocks || hasODEs) {
            // Create deltaT
            val deltaT = if (rootState.findDeltaT !== null) {
                val vo = rootState.findDeltaT
                if (vo.initialValue === null) {
                    vo.initialValue = createClockValue(0)
                }
                if (!vo.input || (vo.type !== clockType && vo.type !== ValueType.TIME)) {
                    environment.errors.add("A variable with name " + DELTA_T_NAME + " already exists and is not an input variable of type " + clockType.literal)
                } else {
                    environment.infos.add("A variable with name " + DELTA_T_NAME + " already exists and is used.", rootState, true)
                }
                if (!vo.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION) && !vo.declaration.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION)) {
                    vo.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                }
                voStore.update(vo, DynamicTicks.TAG)
                vo // return
            } else {
                val vo = createValuedObject(DELTA_T_NAME)
                vo.initialValue = createClockValue(0)
                rootState.declarations += createDeclaration => [
                    type = clockType
                    hostType = intHostClockType
                    input = true
                    valuedObjects += vo
                ]
                vo.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                voStore.update(vo, SCCHARTS_GENERATED, DynamicTicks.TAG)
                vo // return
            }
            
            if (hasClocks) {
                // Create sleepT
                val sleepT = if (rootState.valuedObjectsList.exists[SLEEP_T_NAME.equalsIgnoreCase(name)]) {
                    val vo = rootState.valuedObjectsList.findFirst[SLEEP_T_NAME.equalsIgnoreCase(name)]
                    if (vo.initialValue === null) {
                        vo.initialValue = createClockValue(0)
                    }
                    if (!vo.output || (vo.type !== clockType && vo.type !== ValueType.TIME)) {
                        environment.errors.add("A variable with name " + SLEEP_T_NAME + " already exists and is not an output variable of type " + clockType.literal)
                    } else {
                        environment.infos.add("A variable with name " + SLEEP_T_NAME + " already exists and is used.", rootState, true)
                    }
                    if (!vo.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION) && !vo.declaration.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION)) {
                        vo.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                    }
                    voStore.update(vo, DynamicTicks.TAG)
                    vo // return
                } else {
                    val vo = createValuedObject(SLEEP_T_NAME)
                    if (!noSleep) {
                        vo.initialValue = createClockValue(0)
                        rootState.declarations += createDeclaration => [
                            type = clockType
                            hostType = intHostClockType
                            output = true
                            valuedObjects += vo
                        ]
                        vo.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                        voStore.update(vo, SCCHARTS_GENERATED, DynamicTicks.TAG)
                    }
                    vo // return
                }
                
                // DeviationOutput
                val deviation = if((deviationOutput || rootState.allStates.exists[it.hasClocks && it.clocks.exists[it.declaration.hasAnnotation(LOGICAL_NAME)]]) && !noSleep) {
                    val vo = createValuedObject(DEVIATION_NAME).uniqueName
                    vo.initialValue = createClockValue(0)
                    rootState.declarations += createDeclaration => [
                        type = clockType
                        hostType = intHostClockType
                        valuedObjects += vo
                        if (deviationOutput) {
                            output = true
                        }
                    ]
                    vo.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                    voStore.update(vo, SCCHARTS_GENERATED, DynamicTicks.TAG)
                    
                    rootState.createDuringAction => [
                        // calculate deviation
                        effects += createAssignment(vo, createConditionalExpression(
                            createGTExpression(deltaT.reference, createPreExpression(sleepT.reference)),
                            createSubExpression(deltaT.reference, createPreExpression(sleepT.reference)),
                            createIntValue(0)
                        ))
                    ]
                    
                    vo // return
                } else {
                    null
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
                        
                // Transform time type
                for (d : rootState.eAllContents.filter(Declaration).toList) {
                    if (d instanceof MethodDeclaration) {
                        if (d.returnType == ValueType.TIME) {
                            d.returnType = clockType
                            d.returnHostType = intHostClockType
                        }
                    } else if (d instanceof VariableDeclaration) {
                        if (d.type == ValueType.TIME) {
                            d.type = clockType
                            d.hostType = intHostClockType
                            d.valuedObjects.forEach[voStore.update(it)]
                        }
                    }
                }
    
                // Handle clock
                for (state : rootState.allStates.filter[it.hasClocks].toList) {
                    var sdDecls = <Declaration, Declaration>newHashMap
                    for (clock : state.clocks) {
                        clock.declaration.asVariableDeclaration.type = clockType
                        clock.declaration.asVariableDeclaration.hostType = intHostClockType
                        if (!clock.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION) && !clock.declaration.hasAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION)) {
                            clock.addStringAnnotation(VariableStore.PRINT_FORMAT_ANNOTAION, timePrintFormat)
                        }
                        voStore.update(clock, SCCHARTS_GENERATED)
                        if (clock.initialValue === null) clock.initialValue = createClockValue(0)
                        
                        if (!clock.declaration.hasAnnotation(PASSIVE_NAME)) {
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
                                        if (access.topmostReference.eContainer instanceof Assignment) {
                                            val asm = access.topmostReference.eContainer as Assignment
                                            if (asm.reference == access || asm.reference.eAllContents.contains(access)) {// write
                                                if (asm.operator == AssignOperator.ASSIGN) { // absolute
                                                    asm.schedule += createScheduleReference(sd, 1)
                                                } else { // relative
                                                    asm.schedule += createScheduleReference(sd, 2)
                                                }
                                            }
                                        }
                                    }
                                    if (scope instanceof State) {
                                        if (!scope.connector) {
                                            // sleep time
                                            if (!noSleep) {
                                                scope.handleSleep(clock, sleepT, deviation)
                                            }
                                        }
                                    }
                                }
                                
                                // increment                      
                                state.createDuringAction => [
                                    val asm = createAssignment
                                    it.effects += asm
                                    asm.operator = AssignOperator.ASSIGNADD
                                    asm.schedule += createScheduleReference(sd, 0)
                                    asm.reference = clock.fullReference
                                    if (clock.declaration.hasAnnotation(LOGICAL_NAME)) {
                                        asm.expression = createAddExpression(
                                            createPreExpression(deviation.reference),
                                            createSubExpression(deltaT.reference, deviation.reference)
                                        )
                                    } else {
                                        asm.expression = deltaT.reference
                                    }
                                ]
                            } else {
                                // Increment clocks in each state -> no support of hierarchy or concurrency
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
                                    for (subState : region.states.filter[!it.connector].toList) {
                                        // error case
                                        if (subState.containsInnerActions || !subState.regions.nullOrEmpty) {
                                            if (subState.actions.exists[trigger?.eAllContents?.filter(ValuedObjectReference)?.exists[valuedObject == clock]] ||
                                                subState.controlflowRegions.exists[eAllContents?.filter(ValuedObjectReference)?.exists[valuedObject == clock]]) {
                                                    environment.errors.add("Cannot handle hierarchical timed automata. Add @" + USE_SD_NAME + " annotation for experimental support based on SDs.", subState)
                                            }
                                        }
                                        
                                        // time progress
                                        subState.createDuringAction => [
                                            val asm = createAssignment
                                            it.effects += asm
                                            asm.operator = AssignOperator.ASSIGNADD
                                            asm.reference = clock.fullReference
                                            if (clock.declaration.hasAnnotation(LOGICAL_NAME)) {
                                                asm.expression = createAddExpression(
                                                    createPreExpression(deviation.reference),
                                                    createSubExpression(deltaT.reference, deviation.reference)
                                                )
                                            } else {
                                                asm.expression = deltaT.reference
                                            }
                                        ]
                                        
                                        // sleep time
                                        if (!noSleep && !subState.connector) {
                                            subState.handleSleep(clock, sleepT, deviation)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    def void handleSleep(State state, ValuedObject clock, ValuedObject sleepT, ValuedObject deviation) {
        val constraints = HashMultimap.<Transition, OperatorExpression>create
        val complexConstraints = <OperatorExpression>newArrayList
        for (trans : state.outgoingTransitions.filter[trigger !== null]) {
            for (vor : trans.trigger.eAllContents.filter(ValuedObjectReference).filter[valuedObject == clock].toIterable) {
                var EObject exp = vor.topmostReference.eContainer
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
                if (op1.lowermostReference.valuedObject === clock) {
                    exp = op2
                }
            }
            if (op2 instanceof ValuedObjectReference) {
                if (op2.lowermostReference.valuedObject === clock) {
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
                    during.trigger = createLEExpression(clock.fullReference, exp.copy)
                    if (clock.declaration.hasAnnotation(LOGICAL_NAME)) {
                        during.createAssignment(sleepT, 
                            createSubExpression(exp.copy, createAddExpression(clock.fullReference, deviation.reference))
                        ).operator = AssignOperator.ASSIGNMIN
                    } else {
                        during.createAssignment(sleepT, 
                            createSubExpression(exp.copy, clock.fullReference)
                        ).operator = AssignOperator.ASSIGNMIN
                    }
                    if (state.hasAnnotation(NO_SLEEP_SD_COPY)) {
                        during.eAllContents.filter(Schedulable).forEach[schedule.clear]
                    } else if (!constraint.schedule.empty) {
                        during.trigger.schedule += constraint.schedule.map[it.copy]
                        during.effects.head.schedule += constraint.schedule.map[it.copy]
                    }
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
                during.trigger = createLEExpression(clock.fullReference, createClockValue(threshold.value))
                if (clock.declaration.hasAnnotation(LOGICAL_NAME)) {
                    during.createAssignment(sleepT, 
                        createSubExpression(createClockValue(threshold.value), createAddExpression(clock.fullReference, deviation.reference))
                    ).operator = AssignOperator.ASSIGNMIN
                } else {
                    during.createAssignment(sleepT, 
                        createSubExpression(createClockValue(threshold.value), clock.fullReference)
                    ).operator = AssignOperator.ASSIGNMIN
                }
            }
        }
    }

    def hasClocks(State state) {
        return state.declarations.exists[
            if (it instanceof ClassDeclaration) {
                return it.allNestedValuedObjects.exists[it.declaration instanceof VariableDeclaration && it.variableDeclaration.type == ValueType.CLOCK]
            } else if (it instanceof VariableDeclaration) {
                return type == ValueType.CLOCK
            } else {
                return false
            }
        ]
    }

    def getClocks(State state) {
        val clocks = newArrayList
        // in state
        clocks += state.variableDeclarations.filter[type == ValueType.CLOCK].map[valuedObjects].flatten
        // in class
        clocks += state.declarations.filter(ClassDeclaration).map[getAllNestedValuedObjects].flatten.filter[it.declaration instanceof VariableDeclaration && it.variableDeclaration.type == ValueType.CLOCK]
        
        return clocks       
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
    
    def dispatch createClockValue(Number n) {
        if (isIntClockType) {
            createIntValue(n.intValue)
        } else {
            createFloatValue(n.doubleValue)
        }
    }
    
    def dispatch createClockValue(String s) {
        createTextExpression(s)
    }
    
    def ValuedObjectReference fullReference(ValuedObject vo) {
        var ref = vo.reference
        if (!vo.cardinalities.empty) {
            environment.errors.add("Cannot yet handle array of clocks.", vo)
        }
        while (ref.valuedObject.declaration.enclosingClass !== null) {
            val clazz = ref.valuedObject.declaration.enclosingClass
            val subRef = ref
            ref = clazz.valuedObjects.head.reference
            ref.subReference = subRef
            
            if (clazz.valuedObjects.size() > 1) {
                environment.errors.add("Cannot yet handle clocks in class with multiple instantiations.", vo)
            }
            if (!clazz.valuedObjects.head.cardinalities.empty) {
                environment.errors.add("Cannot yet handle clocks in arrays of class.", vo)
            }
        }
        return ref
    }
    
    static def findDeltaT(State rootState) {
        rootState.declarations.filterNull.map[valuedObjects].flatten.findFirst[DELTA_T_NAME.equalsIgnoreCase(name)]
    }
}
