/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.codegen.statebased

import com.google.inject.Inject

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions

import static extension de.cau.cs.kieler.sccharts.processors.codegen.statebased.StatebasedCCodeGeneratorStructModule.*
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.BoolValue

/**
 * C Code Generator Logic Module
 * 
 * Handles the creation of the tick logic function.
 * 
 * @author ssm
 * @kieler.design 2018-04-16 proposed 
 * @kieler.rating 2018-04-16 proposed yellow 
 * 
 */
class StatebasedCCodeGeneratorLogicModule extends SCChartsCodeGeneratorModule {

    @Inject extension AnnotationsExtensions    
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    
    @Accessors @Inject StatebasedCCodeSerializeHRExtensions serializer
    
    static val LOGIC_NAME = "logic"
    
    var StatebasedCCodeGeneratorStructModule struct 
    var StatebasedCCodeGeneratorResetModule reset
    var StatebasedCCodeGeneratorTickModule tick 

    override configure() {
        struct = (parent as StatebasedCCodeGeneratorModule).struct as StatebasedCCodeGeneratorStructModule
        reset = (parent as StatebasedCCodeGeneratorModule).reset as StatebasedCCodeGeneratorResetModule
        tick = (parent as StatebasedCCodeGeneratorModule).tick as StatebasedCCodeGeneratorTickModule
    }
    
    override getName() {
        LOGIC_NAME + baseName + suffix
    }
    
    @Accessors val functions = <StringBuilder> newLinkedList
    
    override generateInit() {
        init(serializer)
        indent(0)
        code.add(
            MLC(getName + "() contains the logic of the modelled statechart without additional tasks",
                "such as communication with the simulation interface or register saves.",
                "It takes the actual interface together with current state of the state machine and",
                "calculates exactly one macro step of the system."
            ),
            
            "void ", getName, "(", struct.getName, " *", struct.getVariableName, ")"
        )
        
        struct.forwardDeclarations.append(code).append(";\n\n")
        
        code.add(
            " {", NL
        )
    }
    
    override generate() {
        val function = new StringBuilder
        
        rootState.generateState(function, "")
        
        code.append(function)
    }
    
    override generateDone() {
        indent(0)
        code.add(
            "}", NL, NL 
        )
        
        for (function : functions) {
            code.append(function)
        }
    }
    
    
    def void init(extension StatebasedCCodeSerializeHRExtensions serializer) {
        valuedObjectPrefix = ""
        
        rootState.createThreadData
    }
    
    def void createThreadData(State state) {
        for (cfr : state.regions.filter(ControlflowRegion)) {
            val superstates = cfr.states.filter[ regions.size > 0 ].toList
            val children = <ControlflowRegion> newLinkedList
            for (s : superstates) {
                val c = s.regions.filter(ControlflowRegion).toList
                s.createThreadData
                                
                children.addAll(c)
            }
        
            struct.generateThreadData(cfr, children.toList)   
            
            if (!(state.eContainer instanceof ControlflowRegion)) {
                struct.rootRegions += cfr
                
                reset.code.add(
                    "  ", STRUCT_VARIABLE_NAME, "->", struct.getRegionName(cfr), ".threadStatus = ", 
                        THREAD_STATUS_PAUSING, ";", NL
                )
            }      
        }
    }
    
    
    def void generateState(State state, StringBuilder parentFunction, String indentation) {
        val isNested = state.eContainer instanceof ControlflowRegion
        val function = if (isNested)
            new StringBuilder => [ functions += it ]
            else parentFunction
        val regionDataName = if (!isNested) 
            STRUCT_VARIABLE_NAME
            else REGION_DATA_NAME
        
        val stateName = struct.getStateName(state)
        
        if (isNested) {
            val parentCfr = state.eContainer as ControlflowRegion
            val functionName = struct.getStateName(state, parentCfr)
            val parentCfrName = struct.getRegionName(parentCfr)
            
            parentFunction.add(
                indentation, functionName, "(", regionDataName, ");", NL 
            )
            
            if (state.isHierarchical) {
                parentFunction.add(
                    NL, "      ", "case ", 
                    stateName, ENUM_STATES_RUNNING, 
                    ":", NL,
                    indentation, functionName, ENUM_STATES_RUNNING.toLowerCase, "(", regionDataName, ");", NL
                )
                
                struct.forwardDeclarationsLogic.add(
                    "void ", functionName, ENUM_STATES_RUNNING.toLowerCase, "(", parentCfrName, REGION_DATA_TYPE_SUFFIX,
                     " *", regionDataName, ");",
                     LEC("State " + state.name + " in region " + parentCfrName + " logic"), 
                     NL
                 ) 
                
            }             
            
            function.add(
                SLC("Function of state " + state.name + " in region " + parentCfrName), 
                IFC(state.isHierarchical, SLC("This is a superstate.") + 
                    SLC("The function will initialize its children and ") +  
                    SLC("commits control to its logic function " + functionName + ENUM_STATES_RUNNING.toLowerCase + " afterwards.")
                ),
                
                "void ", functionName, "(", parentCfrName, REGION_DATA_TYPE_SUFFIX, " *", regionDataName, ") {", NL
            )
            
            struct.forwardDeclarationsLogic.add(
                "void ", functionName, "(", parentCfrName, REGION_DATA_TYPE_SUFFIX, " *", regionDataName, ");",
                LEC("State " + state.name + " in region " + parentCfrName),
                NL
            ) 

            if (state.isHierarchical) {
                val runningName = functionName + ENUM_STATES_RUNNING.toLowerCase
                
                function.add(
                    "  ", REGION_DATA_NAME, "->activeState = ", struct.getStateName(state), ENUM_STATES_RUNNING, ";", NL
                )
                
                for (cfr : state.regions.filter(ControlflowRegion)) {
                    val cfrName = struct.getRegionName(cfr)
                    val initialState = cfr.states.filter[ initial ].head
                    val initialStateName = struct.getStateName(initialState)
                    val noneStateName = struct.getNoneStateName(cfr)
                    
                    function.add(
                        "  ", REGION_DATA_NAME, "->", cfrName, ".", REGION_ACTIVE_STATE, " = ", 
                            initialStateName, ";", NL,
                        "  ", REGION_DATA_NAME, "->", cfrName, ".", REGION_TICK_START_STATE, " = ", 
                            noneStateName, ";", NL,
                        "  ", REGION_DATA_NAME, "->", cfrName, ".", REGION_ACTIVE_PRIORITY, " = ",
                            initialState.getStatePriority, ";", NL,
                        "  ", regionDataName, "->", cfrName, ".", REGION_ROOT_THREADSTATUS,  " = ",
                            THREAD_STATUS_WAITING, ";", NL
                    )
                }
                
                function.add(
                    "}", NL, NL 
                )
                
                function.add(
                    SLC("Logic function of the superstate " + state.name + " in region " + parentCfrName),
                    SLC("Function " + functionName + " will initialize its children and then, proceeds here."), 
                    
                    "void ", runningName, "(", parentCfrName, REGION_DATA_TYPE_SUFFIX, " *", regionDataName, ") {", NL
                )
            }
        }
        
        if (state.isHierarchical) {
            val regionCount = state.regions.filter(ControlflowRegion).size
            var indentation2 = ""
            
            function.add(
                MLCi(2, "Set the tick start state of all contained paused threads and", 
                    "set the thread status to waiting for the upcomiong tick."
                )
            )
            
            for (cfr : state.regions.filter(ControlflowRegion).indexed) {
                val cfrName = struct.getRegionName(cfr.value)
                function.add(
                    "  ", "if (", regionDataName, "->", cfrName, ".threadStatus == ",
                        THREAD_STATUS_PAUSING, ") {", NL
                )
                
                function.add(
                    "    ", indentation2, regionDataName, "->", cfrName, ".", REGION_TICK_START_STATE, " = ",
                        regionDataName, "->", cfrName, ".", REGION_ACTIVE_STATE, ";", NL
                )
                
                function.add(
                    "    ", indentation2, regionDataName, "->", cfrName, ".threadStatus = ", 
                        THREAD_STATUS_WAITING, ";", NL, "  ", indentation2, "}", NL
                )
            }
            
            function.add(
                NL
            )
            
            val multiThreaded = regionCount > 1
            function.add(
                SLC(2, "Loop as long as at least one thread is still waiting to execute."), 
                
                "  ", "do {", NL
            )
            indentation2 += "  "
            if (multiThreaded) {
                
                function.add(
                    MLCi(4, "Calculate the highest active priority.", 
                        "Therefore, look at every thread that is waiting and compare the priorities.",
                        "Afterwards, all threads with an active priority equal to the highest priority are", 
                        "eligible to run."
                    ),
                    
                    "    ",
                    "int activePriority = 0;", 
                    NL
                )
                for (cfr : state.regions.filter(ControlflowRegion)) {
                    val cfrName = struct.getRegionName(cfr)
                    
                    function.add(
                        "    ", "if (", regionDataName, "->", cfrName, ".", REGION_ROOT_THREADSTATUS, " == ",
                            THREAD_STATUS_WAITING, " &&", NL,
                        "      ", regionDataName, "->", cfrName, ".", REGION_ACTIVE_PRIORITY, " > ",
                            "activePriority", ") {", NL, 
                            "      ", "activePriority = ", 
                                regionDataName, "->", cfrName, ".", REGION_ACTIVE_PRIORITY, ";", NL, 
                            "    }", NL, NL 
                    )
                }
            }
            
            

            val conditionalBuilder = new StringBuilder
            for (cfr : state.regions.filter(ControlflowRegion).indexed) {
                cfr.value.generateControlflowRegion
                
                val cfrName = struct.getRegionName(cfr.value)
                
                if (multiThreaded) {
                    function.add(
                        "    ", "if (", regionDataName, "->", cfrName, ".", REGION_ACTIVE_PRIORITY, " == ",
                            "activePriority) {", NL
                    )
                    indentation2 += "  "
                }

                function.add(
                    "  ", indentation2, "if (", regionDataName, "->", cfrName, ".threadStatus == ", 
                        THREAD_STATUS_WAITING, ") {", NL,
                    "    ", indentation2, regionDataName, "->", cfrName, ".threadStatus = ",
                        THREAD_STATUS_RUNNING, ";", NL, 
                    "  ", indentation2, "}", NL 
                )
                
                function.add(NL, 
                    SLC(2 + indentation2.length, "Call the logic code of thread " + cfrName + "."), 
                    
                    "  ", indentation2, cfrName, "(&", regionDataName, "->", cfrName, ");", NL
                )
                
                if (multiThreaded) {
                    function.add(
                        "    }", NL, NL 
                    )    
                }
                
                conditionalBuilder.add(
                    regionDataName, "->", cfrName, ".threadStatus == ", THREAD_STATUS_WAITING
                )
                if (cfr.key < regionCount - 1) {
                    conditionalBuilder.add(
                        " ||", NL, 
                        "    "
                    )
                }
            }
            
            function.add(
                "  ", "} while(", conditionalBuilder, ");", NL,
                NL 
            )
        } 
        
        // Transitions
        val hasDelayed = state.outgoingTransitions.exists[ !immediate ]
        if (hasDelayed) {
            function.add(
                SLC(2, "inDepth becomes true if this state was already active at the beginning of the actual tick instance."), 
                
                "  char inDepth = ", regionDataName, "->tickStartState == ", stateName, ";", NL, NL
            )
        }
        val allDelayed = if (!hasDelayed) false else
            state.outgoingTransitions.forall[ !immediate && sourceState == targetState ] 
        
        for (transition : state.outgoingTransitions.indexed) {
            transition.value.generateTransition(transition.key, function, allDelayed, "  ", serializer)
        }
        
        val handleImplicitTransitions =
            (state.outgoingTransitions.forall[trigger !== null]) || 
            (state.outgoingTransitions.forall[ !immediate ])
            
        if (handleImplicitTransitions) {
            if (state.outgoingTransitions.size > 0) {
                if (allDelayed) {
                    function.add(NL, 
                        SLC(2, "The thread will enter a pause after this state is done."),  
                        "  ", regionDataName, "->threadStatus = ", THREAD_STATUS_PAUSING, ";", NL
                    )
                } else {
                    function.add(
                        "  else", NL, 
                        "  {", NL,
                        SLC(4, "Implicitly wait one tick if no transition was taken."),  
                        "    ", regionDataName, "->threadStatus = ", THREAD_STATUS_PAUSING, ";", NL,
                        "  }", NL
                    )
                }
            } else {
                if (state.final) {
                    function.add(
                        SLC(2, "The thread becomes inactive after this state is done."),
                        
                        "  ", regionDataName, "->threadStatus = ", THREAD_STATUS_INACTIVE, ";", NL
                    )                    
                } else {
                    function.add(
                        SLC(2, "The thread pauses after this state is done."),
                        
                        "  ", regionDataName, "->threadStatus = ", THREAD_STATUS_PAUSING, ";", NL
                    )
                }
            }
        } 
        
        if (state.eContainer instanceof ControlflowRegion) {
            function.add(
                "}", NL, NL 
            )
        }         
    }
    
    def void generateTransition(Transition transition, int index,
        StringBuilder function, boolean allDelayed, String indentation, extension StatebasedCCodeSerializeHRExtensions serializer
    ) {
        val isImmediate = transition.immediate
        val hasTrigger = transition.trigger !== null
        var indentationLength = indentation.length
        
        val triggerEffect = transition.serializeHR
        val defaultTransition = transition.trigger === null || 
            (transition.trigger instanceof BoolValue && (transition.trigger as BoolValue).value == true)  
        val transitionTrigger = if (defaultTransition) "" else transition.trigger.serializeHR
        val selfLoop = transition.sourceState == transition.targetState
        var effects = ""
        for (effect : transition.effects.indexed) {
            effects += effect.value.serializeHR + NL
            if (transition.effects.size > 1 && effect.key < transition.effects.size - 1) {
                effects += WS(9)
            } 
        }
         
        if (index > 0) {
            function.add(
//                "} else {", NL 
                "  else", NL 
//                "  " // for the comment
            )
            if (defaultTransition && isImmediate && !hasTrigger) {
                function.add(" {", NL)
            }
            indentationLength += 2
        }
        
        function.add(
            MLCii(indentationLength, 2,
                "Transition " + index + ": ",
                IFC(selfLoop, "It is a self-loop back to " + transition.targetState.name + "."),
                IFC(!selfLoop, "The target of this transition is state " + transition.targetState.name + "."),
                IFC(!defaultTransition, "Trigger: " + transitionTrigger),
                IFC(defaultTransition, "This is the default transition, the trigger is always true."),
                IFC(!transition.effects.empty, "Effects: " + effects),
                IFC(transition.immediate, "The transition is immediate.")
            )
        )
        struct.forwardDeclarationsLogic.add(
            MLCii(2, 2,
                "Transition " + index + ": ",
                IFC(selfLoop, "It is a self-loop back to " + transition.targetState.name + "."),
                IFC(!selfLoop, "The target of this transition is state " + transition.targetState.name + "."),
                IFC(!defaultTransition, "Trigger: " + transitionTrigger),
                IFC(defaultTransition, "This is the default transition, the trigger is always true."),
                IFC(!transition.effects.empty, "Effects: " + effects),
                IFC(transition.immediate, "The transition is immediate.") 
            ), NL
        )
        
        function.add(indentation)
        if (hasTrigger) {
            function.add("if ")
            if (!isImmediate || transition.trigger instanceof ValuedObjectReference) function.add("(")
            if (!isImmediate) function.add("inDepth && ")
            valuedObjectPrefix = REGION_DATA_NAME + "->" + REGION_INTERFACE_NAME + "->" 
            function.add(transition.trigger.serialize)
            valuedObjectPrefix = ""
            if (!isImmediate || transition.trigger instanceof ValuedObjectReference) function.add(")")
            function.add(
                " {", NL
            )
        } else if (!isImmediate) {
            function.add(
                "if (inDepth) {", NL
            )
        }
        
        if (transition.effects.size > 0) {
            valuedObjectPrefix = REGION_DATA_NAME + "->" + 
                REGION_INTERFACE_NAME + "->"
                
            for (effect : transition.effects) {
                function.add(
                    indentation, "  ", effect.serializeHR, ";", NL
                )
            }
            
            valuedObjectPrefix = ""
        }
        
        if (transition.isTermination) {
            val state = transition.sourceState
            val conditionalBuilder = new StringBuilder
            
            val regionCount = state.regions.filter(ControlflowRegion).size
            for (cfr : state.regions.filter(ControlflowRegion).indexed) {
                val cfrName = struct.getRegionName(cfr.value)
                               
                conditionalBuilder.add(
                    REGION_DATA_NAME, "->", cfrName, ".threadStatus == ", THREAD_STATUS_INACTIVE
                )
                if (cfr.key < regionCount - 1) {
                    conditionalBuilder.add(
                        " &&", NL, 
                        "    "
                    )
                }
            }
            
            function.add(
                "if (", conditionalBuilder.toString, ") {", NL, 
                "  "
            )
        }

        function.add(
            indentation
        )
        
        if (transition.targetState == transition.sourceState) {
            if (!transition.immediate) {
                if (allDelayed) {
                    function.add(
                        "}", NL
                    )
                } else {
                    function.add(
                        "  ", REGION_DATA_NAME, "->threadStatus = ", THREAD_STATUS_PAUSING, ";", NL,
                        "  }", NL
                    )
                }
            }
        } else {
            if (hasTrigger || !isImmediate) function.add("  ")
            function.add(
                REGION_DATA_NAME, "->activeState = ", struct.getStateName(transition.targetState), ";", NL
            )
            
            if (!isImmediate) {
                val parentCfr = transition.sourceState.parentRegion
                
                function.add(
                    "    ", REGION_DATA_NAME, "->", REGION_TICK_START_STATE, " = ", 
                        struct.getNoneStateName(parentCfr), ";", NL
                )                
            }
            
            val sourcePrio = transition.sourceState.statePriority
            val targetPrio = transition.targetState.statePriority
            
            if (targetPrio != sourcePrio) {
                function.add(
                    "    ", REGION_DATA_NAME, "->", REGION_ACTIVE_PRIORITY, " = ", 
                        targetPrio, ";", NL
                )
                
                if (targetPrio < sourcePrio) {
                    function.add(
                        "    ", REGION_DATA_NAME, "->threadStatus = ", THREAD_STATUS_WAITING, ";", NL
                    )
                }
            } 
            
            if (hasTrigger || !isImmediate || index > 0) function.add("  }\n")
        }
        
        if (transition.isTermination) {
            function.add(
                indentation, "}", NL,
                indentation, "else", NL, 
                "  {", NL,
                indentation, "  ", REGION_DATA_NAME, "->", REGION_ROOT_THREADSTATUS, " = ", THREAD_STATUS_PAUSING, ";", NL, 
                "  }", NL
            )
        }
        
//        function.add(
//            SLC(2, "End of transition " + index + " code (" + transition.serialize + ")")
//        )
        
    }
    
    def void generateControlflowRegion(ControlflowRegion cfr) {
        val cfrName = struct.getRegionName(cfr)
        val function = new StringBuilder => [ functions += it ]
        
        function.add(
            SLC("Function of region " + cfrName), 
            
            "void ", cfrName, "(", cfrName, REGION_DATA_TYPE_SUFFIX, " *", REGION_DATA_NAME, ") {", NL,
            
            SLC(2, "Cycle through the states of the region as long as this thread is set to RUNNING."), 
            "  while(", REGION_DATA_NAME, "->threadStatus == RUNNING) {", NL,
            "    switch(", REGION_DATA_NAME, "->activeState) {", NL
        )
        for (state : cfr.states) {
            val stateName = struct.getStateName(state)
            
            function.add(
                "      case ", stateName, ":", NL
            )
            
            state.generateState(function, "        ")
            
            function.add(
                "        break;", NL, NL
            )    
        }
        function.add(
            "    }", NL,
            "  }", NL,
            "}", NL, NL
        )
        
        struct.forwardDeclarationsLogic.add(
            "void ", cfrName, "(", cfrName, REGION_DATA_TYPE_SUFFIX, " *", REGION_DATA_NAME, ");",
            LEC("Region " + cfrName), 
            NL, NL
        ) 
    }
 
    private def int getStatePriority(State state) {
        return struct.getStatePriority(state)
    }
}