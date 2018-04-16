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
        code.append(struct.getName).append("* ").append(struct.getVariableName)
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
        }
    }
    
    
    def void generateState(State state, StringBuilder parentFunction, String indentation) {
        val function = if (state.eContainer instanceof ControlflowRegion) 
            new StringBuilder => [ functions += it ]
            else parentFunction
        
        val stateName = struct.getStateName(state)
        
        if (state.eContainer instanceof ControlflowRegion) {
            val parentCfr = state.eContainer as ControlflowRegion
            val functionName = struct.getStateName(state, parentCfr)
            val parentCfrName = struct.getRegionName(parentCfr)
            
            parentFunction.append(indentation)
            parentFunction.append(functionName)
            parentFunction.append("(data->" + parentCfrName +")");
            parentFunction.append(";\n")
            
            if (state.isHierarchical) {
                parentFunction.append("\n")
                parentFunction.append("      case ")
                parentFunction.append(stateName + StatebasedCCodeGeneratorStructModule.ENUM_STATES_RUNNING)
                parentFunction.append(":\n")
                parentFunction.append(indentation)
                parentFunction.append(functionName + StatebasedCCodeGeneratorStructModule.ENUM_STATES_RUNNING.toLowerCase)
                parentFunction.append("(data->" + parentCfrName +")");
                parentFunction.append(";\n")
            }             
            
            function.append("void "); 
            function.append("" + functionName)
            function.append("(" + parentCfrName + "* data)");
            function.append(" {\n")

            if (state.isHierarchical) {
                val runningName = functionName + StatebasedCCodeGeneratorStructModule.ENUM_STATES_RUNNING.toLowerCase
                
                function.append("  data->activeState = ")
                function.append(struct.getStateName(state) + StatebasedCCodeGeneratorStructModule.ENUM_STATES_RUNNING + ";\n")
                
                for (cfg : state.regions.filter(ControlflowRegion)) {
                    val cfgName = struct.getRegionName(cfg)
                    val initialState = cfg.states.filter[ initial ].head
                    val initialStateName = struct.getStateName(initialState)
                    
                    function.append("  data->")
                    function.append(cfgName)
                    function.append(".activeState = ")
                    function.append(initialStateName) 
                    function.append(";\n")
                }
                
                function.append("}\n\n")
                
                function.append("void "); 
                function.append(runningName)
                function.append("(" + parentCfrName + "* data)");
                function.append(" {\n")
            }
        }
        
        if (state.isHierarchical) {

            for (cfr : state.regions.filter(ControlflowRegion)) {
                
                cfr.generateControlflowRegion
                
                val cfrName = struct.getRegionName(cfr)
                function.append("  ")
                function.append(cfrName)
                function.append("(")
                function.append("data->" + cfrName)
                function.append(");\n")
            }
        } 
        
        // Transitions
        val hasDelayed = state.outgoingTransitions.exists[ !immediate ]
        if (hasDelayed) {
            function.append("  char inDepth = data->tickStartState == ")
            function.append(stateName)
            function.append(";\n")
        }
        
        for (transition : state.outgoingTransitions.indexed) {
            transition.value.generateTransition(transition.key, function, "  ", serializer)
        }
        
        if (state.outgoingTransitions.forall[trigger !== null]) {
            if (state.outgoingTransitions.size > 0) { 
                function.append("  else\n")
                function.append("  {\n")
                function.append("    data->paused = 1;\n");
                function.append("  }\n")
            } else {
                if (state.final) {
                    function.append("  data->activeState = EMPTY;\n")                    
                } else {
                    function.append("  data->paused = 1;\n");
                }
            }
        } 
        
        if (state.eContainer instanceof ControlflowRegion) {
            function.append("};\n\n")
        }         
    }
    
    def void generateTransition(Transition transition, int index,
        StringBuilder function, String indentation, extension StatebasedCCodeSerializeHRExtensions serializer
    ) {
        val isImmediate = transition.immediate
        val hasTrigger = transition.trigger !== null
        
        function.append(indentation)
        if (index > 0) function.append("else ")
        if (hasTrigger) {
            function.append("if (")
            if (!isImmediate) function.append("inDepth && ")
            function.append(transition.trigger.serialize)
            if (!isImmediate) function.append(")")
            function.append(") ")
        } else if (!isImmediate) {
            function.append("if (inDepth) ")
        }
        
        if (index > 0 || hasTrigger) function.append("{\n") 
        
        
        for (effect : transition.effects) {
            function.append(indentation + "  ")
            function.append(effect.serialize)
            function.append(";\n")
        }
        
        function.append(indentation + "  ")
        if (transition.targetState == transition.sourceState) {
            if (!transition.immediate) {
                function.append("    data->paused = 1;\n");
            }
        } else {
            function.append("data->activeState = ")
            function.append(struct.getStateName(transition.targetState))
        }
        function.append(";\n")
        
        if (index > 0 || hasTrigger) function.append(indentation + "}\n")
    }
    
    def void generateControlflowRegion(ControlflowRegion cfr) {
        val cfrName = struct.getRegionName(cfr)
        val function = new StringBuilder => [ functions += it ]
        
        function.append("void "); 
        function.append("" + cfrName)
        function.append("(" + cfrName + "* data)");
        function.append(" {\n")
        function.append("  while(data->activeState != EMPTY || !paused) {\n")
        function.append("    switch(data->activeState) {\n")
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
    }

    
}