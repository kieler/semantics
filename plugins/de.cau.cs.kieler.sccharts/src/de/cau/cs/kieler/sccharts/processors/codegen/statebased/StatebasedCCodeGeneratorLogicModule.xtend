/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
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
/**
 * C Code Generator Logic Module
 * 
 * Handles the creation of the tick logic function.
 * 
 * @author ssm
 * @kieler.design 2017-07-24 proposed 
 * @kieler.rating 2017-07-24 proposed yellow 
 * 
 */
class StatebasedCCodeGeneratorLogicModule extends SCChartsCodeGeneratorModule {
    
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
    
    def getName() {
        LOGIC_NAME + baseName + suffix
    }
    
    @Accessors val functions = <StringBuilder> newLinkedList
    
    override generateInit() {
        init(serializer)
        indent(0)
        code.append("void ").append(getName)
        code.append("(")
        code.append(struct.getName).append(" *").append(struct.getVariableName)
        code.append(")")
        
        struct.forwardDeclarations.append(code).append(";\n")
        
        code.append(" {\n")
    }
    
    override generate() {
        val function = new StringBuilder
        
        rootState.generateState(function, "")
        
        code.append(function)
    }
    
    override generateDone() {
        indent(0)
        code.append("}\n\n")
        
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
                
                reset.code.append("  ")
                reset.code.append(STRUCT_VARIABLE_NAME)
                reset.code.append("->")
                reset.code.append(struct.getRegionName(cfr))
                reset.code.append(".threadStatus = ")
                reset.code.append(THREAD_STATUS_RUNNING)
                reset.code.append(";\n")
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
        
        if (state.eContainer instanceof ControlflowRegion) {
            val parentCfr = state.eContainer as ControlflowRegion
            val functionName = struct.getStateName(state, parentCfr)
            val parentCfrName = struct.getRegionName(parentCfr)
            
            parentFunction.append(indentation)
            parentFunction.append(functionName)
            parentFunction.append("(");
            parentFunction.append(regionDataName)
//            parentFunction.append("->" + parentCfrName
            parentFunction.append(")");
            parentFunction.append(";\n")
            
            if (state.isHierarchical) {
                parentFunction.append("\n")
                parentFunction.append("      case ")
                parentFunction.append(stateName + ENUM_STATES_RUNNING)
                parentFunction.append(":\n")
                parentFunction.append(indentation)
                parentFunction.append(functionName + ENUM_STATES_RUNNING.toLowerCase)
                parentFunction.append("(");
                parentFunction.append(regionDataName)
                parentFunction.append(")");
                parentFunction.append(";\n")
                
                struct.forwardDeclarationsLogic.append("void ").append(functionName).append(ENUM_STATES_RUNNING.toLowerCase).
                    append("(" + parentCfrName + REGION_DATA_TYPE_SUFFIX + " *").
                    append(regionDataName).append(");\n") 
                
            }             
            
            function.append("void "); 
            function.append("" + functionName)
            function.append("(" + parentCfrName + REGION_DATA_TYPE_SUFFIX + " *");
            function.append(regionDataName)
            function.append(") {\n")
            
            struct.forwardDeclarationsLogic.append("void ").append(functionName).
                append("(" + parentCfrName + REGION_DATA_TYPE_SUFFIX + " *").
                append(regionDataName).append(");\n") 

            if (state.isHierarchical) {
                val runningName = functionName + ENUM_STATES_RUNNING.toLowerCase
                
                function.append("  ")
                function.append(REGION_DATA_NAME)
                function.append("->activeState = ")
                function.append(struct.getStateName(state) + StatebasedCCodeGeneratorStructModule.ENUM_STATES_RUNNING + ";\n")
                
                for (cfg : state.regions.filter(ControlflowRegion)) {
                    val cfgName = struct.getRegionName(cfg)
                    val initialState = cfg.states.filter[ initial ].head
                    val initialStateName = struct.getStateName(initialState)
                    
                    function.append("  ");
                    function.append(REGION_DATA_NAME)
                    function.append("->")
                    function.append(cfgName)
                    function.append(".activeState = ")
                    function.append(initialStateName) 
                    function.append(";\n")

                    function.append("  ");
                    function.append(regionDataName)
                    function.append("->")
                    function.append(cfgName)
                    function.append(".threadStatus = ")
                    function.append(THREAD_STATUS_RUNNING) 
                    function.append(";\n")
                }
                
                function.append("}\n\n")
                
                function.append("void "); 
                function.append(runningName)
                function.append("(" + parentCfrName + REGION_DATA_TYPE_SUFFIX + " *");
                function.append(regionDataName)
                function.append(") {\n")
            }
        }
        
        if (state.isHierarchical) {
            val regionCount = state.regions.filter(ControlflowRegion).size
            var indentation2 = ""
            
            for (cfr : state.regions.filter(ControlflowRegion).indexed) {
                val cfrName = struct.getRegionName(cfr.value)
                function.append("  ")
                function.append("if (")
                function.append(regionDataName)
                function.append("->" + cfrName)
                function.append(".threadStatus == ");
                function.append(THREAD_STATUS_PAUSED)
                function.append(") {\n")
                
                function.append("    " + indentation2)
                function.append(regionDataName)
                function.append("->" + cfrName)
                function.append(".");
                function.append(REGION_TICK_START_STATE)
                function.append(" = ");
                function.append(regionDataName)
                function.append("->" + cfrName)
                function.append(".");
                function.append(REGION_ACTIVE_STATE)
                function.append(";\n")
                
                function.append("    " + indentation2)
                function.append(regionDataName)
                function.append("->" + cfrName)
                function.append(".threadStatus = ");
                function.append(THREAD_STATUS_RUNNING)
                function.append(";\n  " + indentation2 + "}\n")
            }
            
            function.append("\n")
            
            if (regionCount > 1) {
                
                function.append("  ")
                function.append("do {\n")
                indentation2 += "  "
            }

            val dispatchBuilder = new StringBuilder
            val conditionalBuilder = new StringBuilder
            for (cfr : state.regions.filter(ControlflowRegion).indexed) {
                cfr.value.generateControlflowRegion
                
                val cfrName = struct.getRegionName(cfr.value)
                function.append("  " + indentation2)
                function.append(cfrName)
                function.append("(&")
                function.append(regionDataName)
                function.append("->" + cfrName)
                function.append(");\n")
                
                dispatchBuilder.append("  " + indentation2)
                dispatchBuilder.append("if (")
                dispatchBuilder.append(regionDataName)
                dispatchBuilder.append("->" + cfrName)
                dispatchBuilder.append(".threadStatus == ");
                dispatchBuilder.append(THREAD_STATUS_DISPATCHED)
                dispatchBuilder.append(") {\n")
                dispatchBuilder.append("    " + indentation2)
                dispatchBuilder.append(regionDataName)
                dispatchBuilder.append("->" + cfrName)
                dispatchBuilder.append(".threadStatus == ");
                dispatchBuilder.append(THREAD_STATUS_RUNNING)
                dispatchBuilder.append(";\n  " + indentation2 + "}\n")
                
                conditionalBuilder.append(regionDataName)
                conditionalBuilder.append("->" + cfrName)
                conditionalBuilder.append(".threadStatus == ");
                conditionalBuilder.append(THREAD_STATUS_RUNNING)
                if (cfr.key < regionCount - 1) {
                    conditionalBuilder.append(" ||\n    ")
                }
            }
            
            if (regionCount > 1) {
                function.append("\n")
                function.append(dispatchBuilder)
                function.append("  ")
                function.append("} while(")
                function.append(conditionalBuilder)
                function.append(");\n");
            }
            function.append("\n")
        } 
        
        // Transitions
        val hasDelayed = state.outgoingTransitions.exists[ !immediate ]
        if (hasDelayed) {
            function.append("  char inDepth = ")
            function.append(regionDataName)
            function.append("->tickStartState == ")
            function.append(stateName)
            function.append(";\n")
        }
        
        for (transition : state.outgoingTransitions.indexed) {
            transition.value.generateTransition(transition.key, function, "  ", serializer)
        }
        
//        val transitionCount = state.outgoingTransitions.size
        val handleImplicitTransitions =
            (state.outgoingTransitions.forall[trigger !== null]) || 
            (state.outgoingTransitions.forall[ !immediate ])
            
        if (handleImplicitTransitions) {
            if (state.outgoingTransitions.size > 0) { 
                function.append("  else\n")
                function.append("  {\n")
                function.append("    ")
                function.append(regionDataName)
                function.append("->threadStatus = ")
                function.append(THREAD_STATUS_PAUSED)
                function.append(";\n")
                function.append("  }\n")
            } else {
                if (state.final) {
//                    function.append("  ")
//                    function.append(regionDataName)
//                    function.append("->activeState = NONE;\n")                    
                    function.append("  ")
                    function.append(regionDataName)
                    function.append("->threadStatus = EMPTY;\n")                    
                } else {
                    function.append("  ")
                    function.append(regionDataName)
                    function.append("->threadStatus = ")
                    function.append(THREAD_STATUS_PAUSED)
                    function.append(";\n")
                }
            }
        } 
        
        if (state.eContainer instanceof ControlflowRegion) {
            function.append("}\n\n")
        }         
    }
    
    def void generateTransition(Transition transition, int index,
        StringBuilder function, String indentation, extension StatebasedCCodeSerializeHRExtensions serializer
    ) {
        val isImmediate = transition.immediate
        val hasTrigger = transition.trigger !== null
        
        if (index > 0) function.append("} else {\n")
        function.append(indentation)
        if (hasTrigger) {
            function.append("if ")
            if (!isImmediate) function.append("(inDepth && ")
            valuedObjectPrefix = REGION_DATA_NAME + "->" + REGION_INTERFACE_NAME + "->" 
            function.append(transition.trigger.serialize)
            valuedObjectPrefix = ""
            if (!isImmediate) function.append(")")
            function.append(" {\n")
        } else if (!isImmediate) {
            function.append("if (inDepth) {\n")
        }
        
//        if (index > 0 || hasTrigger) function.append("{\n") 
        
        
        if (transition.effects.size > 0) {
            valuedObjectPrefix = REGION_DATA_NAME + "->" + 
                REGION_INTERFACE_NAME + "->"
                
            for (effect : transition.effects) {
                function.append(indentation + "  ")
                function.append(effect.serialize)
                function.append(";\n")
            }
            
            valuedObjectPrefix = ""
        }
        
//        function.append(indentation)
        
        if (transition.isTermination) {
            val state = transition.sourceState
            val conditionalBuilder = new StringBuilder
            
            val regionCount = state.regions.filter(ControlflowRegion).size
            for (cfr : state.regions.filter(ControlflowRegion).indexed) {
                val cfrName = struct.getRegionName(cfr.value)
                               
                conditionalBuilder.append(REGION_DATA_NAME)
                conditionalBuilder.append("->" + cfrName)
                conditionalBuilder.append(".threadStatus == ");
                conditionalBuilder.append(THREAD_STATUS_EMPTY)
                if (cfr.key < regionCount - 1) {
                    conditionalBuilder.append(" &&\n    ")
                }
            }
            
            function.append("if (")
            function.append(conditionalBuilder)
            function.append(") {\n")
            function.append("  ")
        }

        function.append(indentation)
        
        if (transition.targetState == transition.sourceState) {
            if (!transition.immediate) {
                function.append("  ")
                function.append(REGION_DATA_NAME)
                function.append("->threadStatus = PAUSED;\n");
                function.append("  }\n")
            }
        } else {
            if (hasTrigger || !isImmediate) function.append("  ")
            function.append(REGION_DATA_NAME)
            function.append("->activeState = ")
            function.append(struct.getStateName(transition.targetState))
            function.append(";\n")
            
            if (!isImmediate) {
                val parentCfr = transition.sourceState.parentRegion
                
                function.append("    ")
                function.append(REGION_DATA_NAME)
                function.append("->")
                function.append(REGION_TICK_START_STATE)
                function.append(" = ")
                function.append(struct.getNoneStateName(parentCfr))
                function.append(";\n")                
            }
            
            function.append("  }\n")
        }
        
        if (transition.isTermination) {
//            function.append(indentation)
//            function.append("}\n")
            function.append(indentation)
            function.append("else\n  {\n")
            function.append(indentation + "  ")
            function.append(REGION_DATA_NAME)
            function.append("->")
            function.append(REGION_ROOT_THREADSTATUS)
            function.append(" = ")
            function.append(THREAD_STATUS_PAUSED)
            function.append(";\n")
            function.append("  }\n")
        }
        
//        if (index > 0 || hasTrigger) function.append(indentation + "}\n")
    }
    
    def void generateControlflowRegion(ControlflowRegion cfr) {
        val cfrName = struct.getRegionName(cfr)
        val function = new StringBuilder => [ functions += it ]
        
        function.append("void "); 
        function.append("" + cfrName)
        function.append("(" + cfrName + REGION_DATA_TYPE_SUFFIX + " *");
        function.append(REGION_DATA_NAME)
        function.append(") {\n")
//        function.append("  while(data->activeState != NONE || !paused) {\n")
        function.append("  while(")
        function.append(REGION_DATA_NAME)
        function.append("->threadStatus == RUNNING) {\n")
        function.append("    switch(")
        function.append(REGION_DATA_NAME)
        function.append("->activeState) {\n")
        for (state : cfr.states) {
            val stateName = struct.getStateName(state)
            
            function.append("      case ")
            function.append(stateName)
            function.append(":\n")
            
            state.generateState(function, "        ")
            
            function.append("        break;\n\n")    
        }
        function.append("    }\n")
        function.append("  }\n")
        function.append("}\n\n")
        
        struct.forwardDeclarationsLogic.append("void ").append(cfrName).
            append("(" + cfrName + REGION_DATA_TYPE_SUFFIX + " *").
            append(REGION_DATA_NAME).append(");\n") 
        
    }

    
}