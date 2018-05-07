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

import de.cau.cs.kieler.kexpressions.VariableDeclaration
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.ControlflowRegion
import java.util.Map
import de.cau.cs.kieler.sccharts.State
import java.util.List
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions

/**
 * C Code Generator Struct Module
 * 
 * Handles the creation of the data struct.
 * 
 * @author ssm
 * @kieler.design 2018-04-16 proposed 
 * @kieler.rating 2018-04-16 proposed yellow 
 * 
 */
class StatebasedCCodeGeneratorStructModule extends SCChartsCodeGeneratorModule {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsStateExtensions
    @Accessors @Inject StatebasedCCodeSerializeHRExtensions serializer
    
    public static val STRUCT_NAME = "TickData"
    public static val STRUCT_VARIABLE_NAME = "tickData"
    public static val STRUCT_PRE_PREFIX = "_p"
    public static val STRUCT_INTERFACE_NAME = "Interface"
    
    public static val ENUM_STATES_SUFFIX = "States"
    public static val ENUM_STATES_NONE = "NONE"
    public static val ENUM_STATES_RUNNING = "RUNNING"
    
    public static val THREAD_STATUS_ENUM = "ThreadStatus"
    public static val THREAD_STATUS_EMPTY = "EMPTY"
    public static val THREAD_STATUS_RUNNING = "RUNNING"
    public static val THREAD_STATUS_DISPATCHED = "DISPATCHED"
    public static val THREAD_STATUS_PAUSED = "PAUSED"
    
    public static val REGION_DATA_NAME = "regionData"
    public static val REGION_INTERFACE_NAME = "interface"
    public static val REGION_ROOT_THREADSTATUS = "threadStatus"
    public static val REGION_DATA_TYPE_SUFFIX = "Data"
    public static val REGION_ACTIVE_STATE = "activeState"
    public static val REGION_TICK_START_STATE = "tickStartState"
    public static val REGION_ACTIVE_PRIORITY = "activePriority"
    
    @Accessors StringBuilder tickData = new StringBuilder
    @Accessors StringBuilder forwardDeclarations = new StringBuilder
    @Accessors StringBuilder forwardDeclarationsLogic = new StringBuilder
    @Accessors StringBuilder stateData = new StringBuilder
    @Accessors StringBuilder threadData = new StringBuilder
    
    @Accessors List<ControlflowRegion> rootRegions = <ControlflowRegion> newLinkedList
    
    @Accessors Map<ControlflowRegion, String> regionNames = <ControlflowRegion, String> newHashMap
    @Accessors Map<ControlflowRegion, String> noneState = <ControlflowRegion, String> newHashMap
    
    var noneCounter = 0
    
    def getName() {
        STRUCT_NAME + baseName + suffix
    }
    
    def getVariableName() {
        STRUCT_VARIABLE_NAME
    }
    
    def protected separator() {
        "->"
    }    
    
    override generateInit() {
        code.add(
            "typedef enum {", NL,
            "  ",
            THREAD_STATUS_EMPTY,
            ", ",
            THREAD_STATUS_RUNNING,
            ", ",
            THREAD_STATUS_DISPATCHED,
            ", ",
            THREAD_STATUS_PAUSED, NL,
            "} ",
            THREAD_STATUS_ENUM,
            ";", NL, NL
        )
        
        code.add("typedef struct {", NL)
        
        tickData.add("typedef struct {", NL)
    }
    
    override generate() {
        generate(serializer)
    }
    
    protected def generate(extension StatebasedCCodeSerializeHRExtensions serializer) {
        // Add the declarations of the model.
        for (declaration : rootState.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if (declaration instanceof VariableDeclaration) {
                    val declarationType = if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) 
                        declaration.type.serializeHR
                        else declaration.hostType
                    var s = "";                        
                        
                    s += indentation + declarationType
                    s += " "
                    s += valuedObject.name
                    if (valuedObject.isArray) {
                        for (cardinality : valuedObject.cardinalities) {
                            s += "[" + cardinality.serializeHR + "]"
                        }
                    }
                    s += ";\n"
                    
                    code.add(s)
                    tickData.add(s)
                }
            }
        }
    }
    
    override generateDone() {
        tickData.add(
            NL, "  ", 
            STRUCT_INTERFACE_NAME,
            " ",
            REGION_INTERFACE_NAME,
            ";", NL, NL,
            "  ThreadStatus ",
            REGION_ROOT_THREADSTATUS,
            ";", NL
        )
        
        for (cfr : rootRegions) {
            tickData.add(
                "  ",
                getRegionName(cfr) + REGION_DATA_TYPE_SUFFIX,
                " ",
                getRegionName(cfr),
                ";", NL
            )
        }
        
        tickData.add(
            "} ",
            getName,
            ";", NL
        )
        
        code.add(
            "} ",
            STRUCT_INTERFACE_NAME,
            ";", NL
        )
        
        if (threadData.length > 0) code.nl
        code.append(threadData)
        
        code.append(tickData)
        
        if (forwardDeclarations.length > 0) code.nl
        code.append(forwardDeclarations)
        
        if (forwardDeclarationsLogic.length > 0) code.nl
        code.append(forwardDeclarationsLogic)
        
    }
    
    def getRegionName(ControlflowRegion cfr) {
        if (cfr.name.nullOrEmpty) "_region"+cfr.hashCode else cfr.name.hostcodeSafeName
    }
    
    def getStateName(State s, ControlflowRegion cfr) {
         cfr.regionName + s.name.hostcodeSafeName
    }
    
    def getStateName(State s) {
         s.name.hostcodeSafeName.toUpperCase
    }
    
    def generateThreadData(ControlflowRegion cfr, List<ControlflowRegion> children) {
        val name = cfr.regionName
        val noneStateName = ENUM_STATES_NONE + noneCounter++
        
        threadData.add(
            "typedef enum {", NL,
            "  ",
            noneStateName,
            ", "
        )
        
        for (state : cfr.states.indexed) {
            val stateName = state.value.stateName
            threadData.append(stateName)
            if (state.value.isHierarchical) {
                threadData.add(
                    ", ", 
                    stateName + ENUM_STATES_RUNNING
                )
            }
            if (state.key < cfr.states.size - 1) threadData.add(", ")
        }
        
        threadData.add(
            NL, "} ",
            name + ENUM_STATES_SUFFIX,
            ";", NL, NL
        ) 
        
        threadData.add(
            "typedef struct {", NL,
            indentation, name, ENUM_STATES_SUFFIX, " ", REGION_ACTIVE_STATE, ";", NL,
            indentation, name, ENUM_STATES_SUFFIX, " ", REGION_TICK_START_STATE, ";", NL,
            indentation, THREAD_STATUS_ENUM, " threadStatus;", NL,
            indentation, "int activePriority;", NL,
            indentation, STRUCT_INTERFACE_NAME, "* interface;", NL
        )
        
        if (children !== null && children.size > 0) {
            for (child : children) {
                val childName = child.getRegionName
                threadData.add(
                    indentation, childName, REGION_DATA_TYPE_SUFFIX, " ", childName, ";", NL
                )
            }
        }
        
        threadData.add(
            "} ",
            name, REGION_DATA_TYPE_SUFFIX,
            ";", NL, NL
        )
        
        regionNames.put(cfr, name)
        noneState.put(cfr, noneStateName)
    }
    
    def getNoneStateName(ControlflowRegion cfr) {
        noneState.get(cfr)
    }
}