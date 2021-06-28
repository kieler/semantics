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
package de.cau.cs.kieler.sccharts.processors.statebased.codegen

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*
import static de.cau.cs.kieler.sccharts.processors.statebased.codegen.StatebasedCCodeGeneratorStructModule.*

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
    
    var StatebasedCCodeGeneratorStructModule struct 
    var StatebasedCCodeGeneratorResetModule reset
    var StatebasedCCodeGeneratorTickModule tick 

    override configure() {
        struct = (parent as StatebasedCCodeGeneratorModule).struct as StatebasedCCodeGeneratorStructModule
        reset = (parent as StatebasedCCodeGeneratorModule).reset as StatebasedCCodeGeneratorResetModule
        tick = (parent as StatebasedCCodeGeneratorModule).tick as StatebasedCCodeGeneratorTickModule
        
        if (processorInstance.environment.getProperty(LOGIC_FUNCTION_NAME) == LOGIC_FUNCTION_NAME.^default) {
            name = moduleName
        }
    }
    
  
    @Accessors val functions = <StringBuilder> newLinkedList
    @Accessors val objectFunctionMap = <EObject, StringBuilder> newHashMap
    
    override generateInit() {
        init(serializer)
        indent(0)
        struct.forwardDeclarations.add(
            SLC(getName + "() contains the logic of the rootState of the statechart."),
            
            FUNCTION_INLINE_VOID_SP, getName, "(", struct.getName, " *", struct.getVariableName, ");",
            NL, NL
        )
    }
    
    override generate() {
        rootState.generateState("")
    }
    
    override generateDone() {
        for (function : functions) {
            code.append(function)
        }
    }
    
    def createNewFunction(EObject association) {
        val sb = new StringBuilder => [ functions += it ]
        objectFunctionMap.put(association, sb)
        return sb
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
            }      
        }
    }
    
    
    
    
    
    
    def void generateState(State state, String indentation) {
        if (state.isHierarchical) {
            generateSuperstateInit(state, indentation)
            generateSuperstateBody(state, indentation)
        } else {
            generateSimpleStateBody(state, indentation)            
        }
    }
    
    def generateSuperstateInit(State state, String indentation) {
        val parentCfr = state.eContainer
        val isRootState = if (parentCfr instanceof ControlflowRegion) false else true
        val function = if (isRootState) reset.rootStateInit else createNewFunction(state)
        val functionName = struct.getStateName(state)
        val contextDataName = if (parentCfr instanceof ControlflowRegion) struct.getContextTypeName(parentCfr) else struct.getName
        val inRegionCommentString = if (state.eContainer instanceof ControlflowRegion) 
            " in region " + struct.getRegionName(state.eContainer as ControlflowRegion) 
            else ""
        
        if (!isRootState) {    
            struct.forwardDeclarationsLogic.add(
                FUNCTION_INLINE_VOID_SP, functionName, "(", contextDataName,
                " *", CONTEXT_DATA_NAME, ");",
                LEC("State " + state.name + " " + inRegionCommentString + " logic"), NL ) 

            function.add(
                SLC("Init function of superstate " + state.name + inRegionCommentString), 
                
                FUNCTION_INLINE_VOID_SP, functionName, "(", contextDataName, " *", CONTEXT_DATA_NAME, ") {", NL
            )
            
            function.add(
                "  ", CONTEXT_DATA_NAME, "->activeState = ", struct.getStateEnumNameRunning(state), ";", NL
            )
        }
        
            
                
        for (cfr : state.regions.filter(ControlflowRegion)) {
            val cfrName = struct.getContextVariableName(cfr)
            val initialState = cfr.states.filter[ initial ].head
            val initialStateName = struct.getStateEnumName(initialState)
            val initialStatePriority = initialState.getStatePriority
            
            function.add(
                "  ", CONTEXT_DATA_NAME, "->", cfrName, ".", REGION_ACTIVE_STATE, " = ", 
                    initialStateName, ";", NL,
                "  ", CONTEXT_DATA_NAME, "->", cfrName, ".", REGION_DELAYED_ENABLED, " = 0;", NL,
                IFC(!leanMode, "  ", CONTEXT_DATA_NAME, "->", cfrName, ".", REGION_ACTIVE_PRIORITY, " = ",
                    initialStatePriority, ";", NL),
                "  ", CONTEXT_DATA_NAME, "->", cfrName, ".", REGION_THREADSTATUS,  " = ",
                    THREAD_STATUS_WAITING, ";", NL
            )
            
            if (isRootState) {
                if (initialStatePriority > reset.maxRootstatePriority) { 
                    reset.maxRootstatePriority = initialStatePriority   
                }                      
            }
        }
              
        if (!isRootState) {  
            function.add(
                "}", NL, NL 
            )
        }
    }
    
    
    def generateSuperstateBody(State state, String indentation) {
        val function = createNewFunction(state)
        val functionName = struct.getStateNameRunning(state)
        val parentCfr = state.eContainer
        val isRootState = !(parentCfr instanceof ControlflowRegion)
        val contextDataName = if (parentCfr instanceof ControlflowRegion) struct.getContextTypeName(parentCfr) else struct.getName
        val regionCount = state.regions.filter(ControlflowRegion).size
        val multiThreaded = regionCount > 1
        val inRegionCommentString = if (state.eContainer instanceof ControlflowRegion) 
            " in region " + struct.getRegionName(state.eContainer as ControlflowRegion) 
            else ""
        
            
                            
        function.add(
            SLC("Logic function of the superstate " + state.name + inRegionCommentString),
            FUNCTION_INLINE_VOID_SP, functionName, "(", contextDataName, " *", CONTEXT_DATA_NAME, ") {", NL,
            IFC(printDebug, "  printf(\"SUPERSTATE " + state.name + " \"); fflush(stdout);\n"));
        struct.forwardDeclarationsLogic.add(
            FUNCTION_INLINE_VOID_SP, functionName, "(", contextDataName, " *", CONTEXT_DATA_NAME, ");", NL
        );
            
        function.add(
            SLC("Set the thread status to waiting for the upcoming tick.")
        )
            
        if (multiThreaded) {
            
            if (!leanMode) {
                function.add(
                    SLC(4, "Calculate the highest active priority."),
                     "  int activePriority = "+ CONTEXT_DATA_NAME + "->" + REGION_ACTIVE_PRIORITY + ";", NL,
                     "  ", "int newActivePriority = 0;", NL,
                     NL
                )
            }

            val conditionalBuilder = new StringBuilder
            val pauseBuilder = new StringBuilder
            val pauseActivityBuilder = new StringBuilder
            for (cfr : state.regions.filter(ControlflowRegion).indexed) {
                cfr.value.generateControlflowRegion
            
                val contextName = struct.getContextVariableName(cfr.value)
                val regionName = struct.getRegionName(cfr.value)

                function.add(                    
                    "  ", "if (", CONTEXT_DATA_NAME, "->", contextName, ".threadStatus == ", 
                    THREAD_STATUS_WAITING, ") {", NL
                );
            
                if (!leanMode) {
                    function.add(
                        "    ", "if (", CONTEXT_DATA_NAME, "->", contextName, ".", REGION_ACTIVE_PRIORITY, " == ",
                            "activePriority) {", NL
                    )
                }
    
                function.add(
                    "      ", CONTEXT_DATA_NAME, "->", contextName, ".threadStatus = ",
                        THREAD_STATUS_RUNNING, ";", NL, 
                    SLC(6, "Call the logic code of thread " + regionName + "."), 
                    
                    "      ", regionName, "(&", CONTEXT_DATA_NAME, "->", contextName, ");", NL,
                    "    ", "}", NL
                )

                if (!leanMode) {                    
                    function.add(
                        "    ", "if (", CONTEXT_DATA_NAME, "->", contextName, ".threadStatus == ", THREAD_STATUS_WAITING, ") {", NL,
                        "      ", "if (", CONTEXT_DATA_NAME, "->", contextName, ".activePriority > newActivePriority) {", NL,
                        "       ", "newActivePriority = ", CONTEXT_DATA_NAME, "->", contextName, ".activePriority;", NL,
                        "      ", "}", NL,
                        "    ", "}", NL,
                        "  ", "}", NL
                    )
                }
                
                conditionalBuilder.add(
                    CONTEXT_DATA_NAME, "->", contextName, ".threadStatus == ", THREAD_STATUS_WAITING
                )
                if (cfr.key < regionCount - 1) {
                    conditionalBuilder.add(
                        " ||", NL, 
                        "    "
                    )
                }
                pauseBuilder.add(
                    CONTEXT_DATA_NAME, "->", contextName, ".threadStatus != ", THREAD_STATUS_WAITING
                )
                if (cfr.key < regionCount - 1) {
                    pauseBuilder.add(
                        " &&", NL, 
                        "    "
                    )
                }
                
                if (!leanMode) {
                    pauseActivityBuilder.add(
                        "    ", "if ((", CONTEXT_DATA_NAME, "->", contextName, ".activePriority > ", 
                            CONTEXT_DATA_NAME, "->activePriority) && ", NL, 
                        "      ", "(", CONTEXT_DATA_NAME, "->", contextName, ".threadStatus == ", THREAD_STATUS_PAUSING, "))", NL,
                        "      ",  CONTEXT_DATA_NAME, "->activePriority = ", CONTEXT_DATA_NAME, "->", contextName, ".activePriority;", NL
                    )
                }
            }

            if (!leanMode) {            
                function.add(NL,
                    "  ", CONTEXT_DATA_NAME, "->", "activePriority = newActivePriority;", NL,
                    IFC(printDebug, "  printf(\"APRIO %d \", " + CONTEXT_DATA_NAME, "->activePriority); fflush(stdout);\n"),
                     NL 
                )
                
                function.add(NL,
                    "  ", "if (", pauseBuilder.toString, ") {", NL,
                    pauseActivityBuilder.toString,
                    "  ", "}", NL
                )
            }
                
        } else { // Single-threaded
            val cfr = state.regions.filter(ControlflowRegion).head
            val contextName = struct.getContextVariableName(cfr)
            val regionName = struct.getRegionName(cfr)
            cfr.generateControlflowRegion
            
            function.add(
                "    ", CONTEXT_DATA_NAME, "->", contextName, ".threadStatus = ",
                    THREAD_STATUS_RUNNING, ";", NL,
                                      
                SLC(6, "Call the logic code of thread " + regionName + "."), 
                
                "    ", regionName, "(&", CONTEXT_DATA_NAME, "->", contextName, ");", NL
            )

            if (!isRootState && !leanMode) {
                function.add(
                    "  ", CONTEXT_DATA_NAME, "->", "activePriority = ", CONTEXT_DATA_NAME, "->", contextName, ".activePriority;", NL, 
                    IFC(printDebug, "  printf(\"APRIO %d \", " + CONTEXT_DATA_NAME, "->activePriority); fflush(stdout);\n"),
                    NL
                )
            }
                
        }
            
        if (!isRootState) {
            state.generateStateTransitions(function, indentation, serializer)
        } else {
            val terminationBuilder = new StringBuilder
            for (cfr : state.regions.filter(ControlflowRegion).indexed) {
                val contextName = struct.getContextVariableName(cfr.value)
                terminationBuilder.add(
                    CONTEXT_DATA_NAME, "->", contextName, ".threadStatus == ", THREAD_STATUS_TERMINATED
                )
                if (cfr.key < regionCount-1) 
                    terminationBuilder.add(" && ", NL, "    ")
            }
            function.add(NL,
                "  ", "if (", terminationBuilder.toString, ") {", NL,
                "    ", CONTEXT_DATA_NAME, "->", REGION_THREADSTATUS, " = ", THREAD_STATUS_TERMINATED, ";", NL,
                "  }", NL
            )
        }
        
        function.add(
            "}",
            NL, NL
        )
    } 
        
    
    def generateSimpleStateBody(State state, String indentation) {
        val function = createNewFunction(state)
        val functionName = struct.getStateName(state)
        val parentCfr = state.eContainer as ControlflowRegion
        val parentCfrName = struct.getRegionName(parentCfr)
        val contextDataName = if (parentCfr instanceof ControlflowRegion) struct.getContextTypeName(parentCfr) else struct.getName

                            
        function.add(
            SLC("Logic function of the simple state " + state.name + " in region " + parentCfrName),
            FUNCTION_INLINE_VOID_SP, functionName, "(", contextDataName, " *", CONTEXT_DATA_NAME, ") {", NL,
            IFC(printDebug, "  printf(\"STATE " + state.name + " \"); fflush(stdout);\n"));

        struct.forwardDeclarationsLogic.add(
            SLC("Logic function of the simple state " + state.name + " in region " + parentCfrName),
            FUNCTION_INLINE_VOID_SP, functionName, "(", contextDataName, " *", CONTEXT_DATA_NAME, ");", NL);
            
        state.generateStateTransitions(function, indentation, serializer)
        
        function.add(
            "}", NL, 
            NL
        )
    }
    
    
    def void generateControlflowRegion(ControlflowRegion cfr) {
        val regionName = struct.getRegionName(cfr)
        val contextName = struct.getContextTypeName(cfr)
        val function = createNewFunction(cfr)
        
        val singleState = cfr.states.size == 1 && (!cfr.states.head.isHierarchical)
        
        function.add(
            SLC("Function of region " + regionName), 
            
            FUNCTION_INLINE_VOID_SP, regionName, "(", contextName, " *", CONTEXT_DATA_NAME, ") {", NL,
            IFC(printDebug, "  printf(\"REGION " + regionName + " \"); fflush(stdout);\n"),
            
            SLC(2, "Cycle through the states of the region as long as this thread is set to RUNNING."), 
            "  while(", CONTEXT_DATA_NAME, "->threadStatus == RUNNING) {", NL,
            IFC(!singleState, "    switch(", CONTEXT_DATA_NAME, "->activeState) {", NL)
        )
        
        for (state : cfr.states) {
            val stateName = struct.getStateName(state)
            val stateEnumName = struct.getStateEnumName(state)
            
            if (!singleState) {
                function.add(
                    "      case ", stateEnumName, ":", NL
                )
            }
            
            state.generateState("        ")
            
            function.add(
                IFC(!singleState, "    "),
                "    ", stateName, "(", CONTEXT_DATA_NAME, ");", NL
            ) 
            
            if (!singleState) {
                if (!state.isHierarchical) {
                    function.add(
                        "        break;", NL, NL
                    ) 
    
                } else {
                    val stateNameRunning = struct.getStateNameRunning(state)
                    val stateEnumNameRunning = struct.getStateEnumNameRunning(state)
                    
                    function.add(
                        SLC(4, "It was a superstate reset, fall through."), NL,
                        "      case ", stateEnumName + ENUM_STATES_RUNNING, ":", NL, 
                        "        ", stateNameRunning, "(", CONTEXT_DATA_NAME, ");", NL,
                        "        break;", NL, NL
                    )    
                    
                }
            }
        }
        
        function.add(
            IFC(!singleState, "    }", NL),
            "  }", NL,
            "}", NL, NL
        )
        
        struct.forwardDeclarationsLogic.add(
            FUNCTION_INLINE_VOID_SP, regionName, "(", contextName, " *", CONTEXT_DATA_NAME, ");",
            LEC("Region " + regionName), 
            NL, NL
        ) 
    }
        
    
    def generateStateTransitions(State state, StringBuilder function, String indentation, 
        extension StatebasedCCodeSerializeHRExtensions serializer
    ) {
        val parentCfr = state.eContainer
        val contextDataName = if (parentCfr instanceof ControlflowRegion) struct.getContextTypeName(parentCfr) else struct.getName
             
        val transitionCount = state.outgoingTransitions.size             
                
        var hasImplicitSelfLoop = true //!state.isHierarchical
        var ifScopeIsOpen = false
        var scopeIndent = ""
        
      
        for (t : state.outgoingTransitions.indexed) {
            val index = t.key
            val transition = t.value
            
            var effects = ""
            for (effect : transition.effects.indexed) {
                effects += effect.value.serializeHR + NL
                if (transition.effects.size > 1 && effect.key < transition.effects.size - 1) {
                    effects += WS(2)
                } 
            }            

            valuedObjectPrefix = CONTEXT_DATA_NAME + "->" + struct.getRegionIfaceName + "->"              
            val isImmediate = transition.immediate
            val isSelfLoop = transition.sourceState == transition.targetState
            val hasTrigger = transition.trigger !== null
            val isDefaultTransition = (!hasTrigger || 
                (transition.trigger instanceof BoolValue && (transition.trigger as BoolValue).value == true))
                && (!transition.isTermination)  
            var transitionTrigger = ""
            if (!isDefaultTransition) { 
                if (transition.isTermination) {
                    transitionTrigger = state.createTerminationTrigger
                } else {
                    transitionTrigger = transition.trigger.serializeHR as String
                } 
            }
            val trigger = if (!isImmediate && !transition.isTermination) 
                    (if (hasTrigger) 
                    CONTEXT_DATA_NAME + "->" + REGION_DELAYED_ENABLED + " && (" + transitionTrigger + ")"
                    else CONTEXT_DATA_NAME + "->" + REGION_DELAYED_ENABLED) 
                else transitionTrigger
            if (isDefaultTransition && isImmediate) hasImplicitSelfLoop = false 
            

            
            val triggerPD = trigger.replaceAll(NL, "").replaceAll("\n", "")
            if (index == 0) { 
                if (!trigger.nullOrEmpty) {
                    function.add("  if (", trigger, ") {", NL,
                        IFC(printDebug, "  printf(\"TRIGGER " + triggerPD + " \"); fflush(stdout);\n")
                    )
                    
                    ifScopeIsOpen = true
                }    
            } else {
                if (!trigger.nullOrEmpty) {
                    function.add("  } else if (", trigger, ") {", NL,
                        IFC(printDebug, "  printf(\"TRIGGER " + triggerPD + " \"); fflush(stdout);\n")
                    )
                    ifScopeIsOpen = true
                } else if (isDefaultTransition) {
                    function.add("  } else {", NL
//                        IFC(printDebug, "  printf(\"ELSETRIGGER \"); fflush(stdout);\n")
                    )
                    hasImplicitSelfLoop = false
                    ifScopeIsOpen = true
                }
            }           
            if (ifScopeIsOpen) scopeIndent = "  "
        
         
            function.add(
                MLCii(4, 2,
                    IFC(transition.immediate, "Immediate "),
                    "Transition " + index + ": ", transition.sourceState.name, " to ", transition.targetState.name, NL,
                    IFC(!transitionTrigger.nullOrEmpty, "Trigger: " + transitionTrigger), 
                    IFC(!transition.effects.empty, "Effects: " + effects)
                )
            )
            struct.forwardDeclarationsLogic.add(
                MLCii(2, 2,
                        IFC(transition.immediate, "Immediate "),
                        "Transition " + index + ": ", transition.sourceState.name, " to ", transition.targetState.name, NL,
                        IFC(!transitionTrigger.nullOrEmpty, "Trigger: " + transitionTrigger), 
                        IFC(!transition.effects.empty, "Effects: " + effects)
                ), NL
            )
        
            if (transition.effects.size > 0) {
                for (effect : transition.effects) {
                    val effectText = "" //effect.serializeHR.toString.replaceAll("\"", "\\\"")
                    function.add(
                        scopeIndent, "  ", effect.serializeHR, ";", NL,
                        IFC(printDebug, "  printf(\"EFFECT " + effectText + " \"); fflush(stdout);\n")            
                    )
                }
            }
            
            function.add(
                scopeIndent, "  ", CONTEXT_DATA_NAME, "->", REGION_DELAYED_ENABLED, " = 0;", NL
            )                

            if (!isSelfLoop || transition.isTermination) {
                function.add(
                    scopeIndent, "  ", CONTEXT_DATA_NAME, "->activeState = ", struct.getStateEnumName(transition.targetState), ";", NL
                )
            }
            
            val sourcePrio = transition.sourceState.statePriority
            val targetPrio = transition.targetState.statePriority
            
            if (targetPrio != sourcePrio) {
                function.add(
                    "    ", CONTEXT_DATA_NAME, "->", REGION_ACTIVE_PRIORITY, " = ", 
                        targetPrio, ";", NL
                )
                
                if (targetPrio < sourcePrio) {
                    function.add(
                        "    ", CONTEXT_DATA_NAME, "->threadStatus = ", THREAD_STATUS_WAITING, ";", NL
                    )
                }
            } 
            valuedObjectPrefix = ""        
        }
        
        val allDelayed = state.outgoingTransitions.forall[ !isImmediate && !isTermination ]
        val implicitScope = ifScopeIsOpen// && !allDelayed
        
        if (ifScopeIsOpen) {
            if (hasImplicitSelfLoop) {
                function.add("  } else {", NL)
            } else {
                function.add("  }", NL)
            }
        }
            
        if (hasImplicitSelfLoop) {
            if (state.final) {
                function.add(
                    SLC(2, "The thread becomes inactive after this state is done."),
                    
                    if (implicitScope) "    " else "  ", CONTEXT_DATA_NAME, "->threadStatus = ", THREAD_STATUS_TERMINATED, ";", NL
                )                    
            } else {
                if (state.isHierarchical) {
                    
                    val conditionalBuilder = new StringBuilder
                    val regionCount = state.regions.filter(ControlflowRegion).size
                    for (cfr : state.regions.filter(ControlflowRegion).indexed) {
                        val contextName = struct.getContextVariableName(cfr.value)
                        conditionalBuilder.add(
                            CONTEXT_DATA_NAME, "->", contextName, ".threadStatus == ", THREAD_STATUS_WAITING
                        )
                        if (cfr.key < regionCount-1) 
                            conditionalBuilder.add(" || ", NL, "      ")
                    }                    

                    function.add(
                            if (implicitScope) "    " else "  ", 
                            "if (", conditionalBuilder, ") {", NL,
                            if (implicitScope) "      " else "    ", CONTEXT_DATA_NAME, "->threadStatus = ", THREAD_STATUS_WAITING, ";", NL,
                            if (implicitScope) "    " else "  ", "} else {", NL, 
                            if (implicitScope) "      " else "    ", CONTEXT_DATA_NAME, "->threadStatus = ", THREAD_STATUS_PAUSING, ";", NL,
                            if (implicitScope) "    " else "  ", " }", NL
                    )
                    
                } else {
                    function.add(
                        SLC(2, "The thread pauses after this state is done."),
                            
                            if (implicitScope) "    " else "  ", CONTEXT_DATA_NAME, "->threadStatus = ", THREAD_STATUS_PAUSING, ";", NL
                    )
                    
                    val contextName = struct.getContextVariableName(state.parentRegion)
                    
                    if (!leanMode) {
                        function.add(
                            "    ", CONTEXT_DATA_NAME, "->", REGION_ACTIVE_PRIORITY, " = ", 
                                state.statePriority, ";", NL,
                                IFC(printDebug, "    printf(\"PRIO " + contextName + " %d \", " + CONTEXT_DATA_NAME+"->"+REGION_ACTIVE_PRIORITY+ "); fflush(stdout);\n")
                        )               
                    }     
                }
            }
            if (implicitScope) { 
                function.add("  }", NL)
            }
        }
    }
    
    
    def createTerminationTrigger(State state) {
        val conditionalBuilder = new StringBuilder
        
        val regionCount = state.regions.filter(ControlflowRegion).size
        for (cfr : state.regions.filter(ControlflowRegion).indexed) {
            val cfrName = struct.getContextVariableName(cfr.value)
                           
            conditionalBuilder.add(
                CONTEXT_DATA_NAME, "->", cfrName, ".threadStatus == ", THREAD_STATUS_TERMINATED
            )
            if (cfr.key < regionCount - 1) {
                conditionalBuilder.add(
                    " &&", NL, 
                    "    "
                )
            }
        }
        
        return conditionalBuilder.toString
    }    
    
    
    
    
    
    
    
    
    

 
    private def int getStatePriority(State state) {
        return struct.getStatePriority(state)
    }
}