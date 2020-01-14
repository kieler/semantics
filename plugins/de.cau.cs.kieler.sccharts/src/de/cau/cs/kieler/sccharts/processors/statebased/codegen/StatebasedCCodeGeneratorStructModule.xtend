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
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions

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
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsStateExtensions
    @Accessors @Inject StatebasedCCodeSerializeHRExtensions serializer
    
    public static val STRUCT_CONTEXT_NAME = "context"
    public static val STRUCT_PRE_PREFIX = "_p"
    public static val STRUCT_INTERFACE_NAME_DEFAULT = "Iface"
    
    public static val FUNCTION_INLINE_VOID = "static inline void"
    public static val FUNCTION_INLINE_VOID_SP = "static inline void "
    
    public static val ENUM_STATES_SUFFIX = "State"
    public static val ENUM_STATES_RUNNING = "RUNNING"
    public static val ENUM_STATES_TRANSIENT = "STATE" 
    
    public static val THREAD_STATUS_ENUM_NAME = "ThreadStatus"
    public static val THREAD_STATUS_TERMINATED = "TERMINATED"       // was EMPTY
    public static val THREAD_STATUS_RUNNING = "RUNNING"
    public static val THREAD_STATUS_WAITING = "READY"         // was DISPATCHED
    public static val THREAD_STATUS_PAUSING = "PAUSING"
    
    public static val CONTEXT_DATA_NAME = "context"
    public static val CONTEXT_TYPE_NAME = "Context"
    public static val REGION_INTERFACE_NAME_DEFAULT = "iface"
    public static val REGION_ROOT_TERMINATED = "terminated"
    public static val REGION_THREADSTATUS = "threadStatus"
//    public static val REGION_DATA_TYPE_SUFFIX = "Data"
    public static val REGION_ACTIVE_STATE = "activeState"
    public static val REGION_ACTIVE_PRIORITY = "activePriority"
    public static val REGION_PAUSE_PRIORITY = "pausePriority"
    public static val REGION_DELAYED_ENABLED = "delayedEnabled"
    
    @Accessors StringBuilder tickData = new StringBuilder
    @Accessors StringBuilder forwardDeclarations = new StringBuilder
    @Accessors StringBuilder forwardDeclarationsLogic = new StringBuilder
    @Accessors StringBuilder stateData = new StringBuilder
    @Accessors StringBuilder threadData = new StringBuilder
    
    @Accessors List<ControlflowRegion> rootRegions = <ControlflowRegion> newLinkedList
    
    @Accessors Map<ControlflowRegion, String> regionNames = <ControlflowRegion, String> newHashMap
    @Accessors Map<State, String> stateNames = <State, String> newHashMap
    @Accessors Map<State, String> stateEnumNames = <State, String> newHashMap
    @Accessors Map<ControlflowRegion, String> contextNames = <ControlflowRegion, String> newHashMap
    
    def getVariableName() {
        STRUCT_CONTEXT_NAME
    }
    
    def protected separator() {
        "->"
    }    
    
    override generateInit() {
        regionNames.clear
        stateNames.clear
        stateEnumNames.clear
        contextNames.clear
        
        stateEnumNames.put(createState, THREAD_STATUS_TERMINATED)
        stateEnumNames.put(createState, THREAD_STATUS_RUNNING)
        stateEnumNames.put(createState, THREAD_STATUS_WAITING)
        stateEnumNames.put(createState, THREAD_STATUS_PAUSING)
        
        code.addCLL(
            SLC("The chosen scheduling regime (IUR) uses four states to maintain the status of threads."),
            
            "typedef enum {", NL,
            "  ",
            THREAD_STATUS_TERMINATED, 
            ", ",
            LEC("thread is dead until spawned again (e.g. via fork)"), NL,
            
            "  ",
            THREAD_STATUS_RUNNING,
            ", ",
            LEC("thread is running"), NL,
            
            "  ", 
            THREAD_STATUS_WAITING,
            ", ",
            LEC("thread is waiting to be selected as running"), NL, 
            
            "  ", 
            THREAD_STATUS_PAUSING, 
            LEC("thread is paused for this tick instance"), NL,
            
            "} ",
            getThreadStatusName,
            ";", NL, NL
        )
        
        code.add(
            SLC("The interface of the program is used to communicate with the surrounding environment."),
            
            "typedef struct {", NL
        )
        
        tickData.add(
            SLC("Root level data of the program"),
            
            "typedef struct {", NL
        )
    }
    
    override generate() {
        generate(serializer)
    }
    
    protected def generate(extension StatebasedCCodeSerializeHRExtensions serializer) {
        
        val codeList = <String> newLinkedList
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
                    s += ";"
                    
                    codeList += s
                    if (declaration.input) codeList += LEC("Input")
                    if (declaration.output) codeList += LEC("Output") 
                    codeList += NL
                }
            }
        }
        
        code.addCLL(codeList.toArray)
    }
    
    override generateDone() {
        tickData.add(
            "  ", getIfaceName, " ", getRegionIfaceName, ";", NL, 
            IFC(!leanMode, "  int ", REGION_ACTIVE_PRIORITY, ";", NL),
            "  ", getThreadStatusName, " ", REGION_THREADSTATUS, ";", NL
        )
        
        for (cfr : rootRegions) {
            tickData.add(
                "  ", getContextTypeName(cfr), " ", getContextVariableName(cfr), ";", NL
            )
        }
        
        tickData.add(
            "} ", getName, ";", NL
        )
        
        code.add(
            "} ", getIfaceName, ";", NL
        )
        
        if (threadData.length > 0) code.nl
        code.append(threadData)
        
        code.append(tickData)
        
        if (forwardDeclarations.length > 0) {
            code.add(
                NL, NL,
                SLC("Forward declarations of the root level functions"), NL
            )
            code.append(forwardDeclarations)
        }
        
        if (forwardDeclarationsLogic.length > 0) {
           code.add(
                NL, 
                SLC("Forward declarations of the program structure functions")
            )
            code.append(forwardDeclarationsLogic)
        }
        
    }
    
    

    
    
    def generateThreadData(ControlflowRegion cfr, List<ControlflowRegion> children) {
        val regionName = cfr.getRegionName
        val contextTypename = cfr.getContextTypeName
        
        val statesSB = new StringBuilder
        val commentSB = new StringBuilder
        
        for (state : cfr.states.indexed) {
            val stateName = state.value.getStateEnumName
            statesSB.append(stateName)
            commentSB.append(state.value.name)
            if (state.value.isHierarchical) {
                statesSB.add(
                    ", ", 
                    stateName + ENUM_STATES_RUNNING
                )
            }
            if (state.key < cfr.states.size - 1) {
                statesSB.add(", ")
                commentSB.add(", ")
            }
        }
        
        threadData.add(
            SLC("This enum contains all states of the " + name + " region,"),
            SLC("namely " + commentSB.toString + "."),
            
            "typedef enum {", NL,
            "  ", statesSB.toString, NL, 
            "} ",
            regionName + ENUM_STATES_SUFFIX,
            ";", NL, NL
        )
        
        threadData.addCLL(
            SLC("The thread data of " + name),
            
            "typedef struct {", NL,
            indentation, getThreadStatusName, " threadStatus;", 
            LEC("status of the thread (see ThreadStatus enum)"), NL,
            
            indentation, regionName, ENUM_STATES_SUFFIX, " ", REGION_ACTIVE_STATE, ";", 
            LEC("the active state"), NL,
            
            IFC(!leanMode, indentation, "int ", REGION_ACTIVE_PRIORITY, ";", 
                LEC("active priority of the thread for scheduling"), NL),
            
            indentation, "char ", REGION_DELAYED_ENABLED, ";", 
            LEC("active state at the beginning of the tick"), NL,
            
            indentation, getIfaceName, "* ", getRegionIfaceName, ";", 
            LEC("pointer to the program interface for communication"), NL
        )
        
        if (children !== null && children.size > 0) {
            for (child : children) {
                threadData.add(
                    indentation, child.contextTypeName, " ", child.contextVariableName, ";", NL
                )
            }
        }
        
        threadData.add(
            "} ",
            contextTypename,
            ";", NL, NL
        )
    }
    
    def getRegionName(ControlflowRegion cfr) {
        if (regionNames.keySet.contains(cfr)) {
            return regionNames.get(cfr)
        } else {
            var name = "region" + if (cfr.name.nullOrEmpty) cfr.hashCode else cfr.name.hostcodeSafeName
            var counter = 2
            while (regionNames.values.contains(name)) {
                name = "region" + if (cfr.name.nullOrEmpty) cfr.hashCode else cfr.name.hostcodeSafeName + counter++    
            }
            name = getLogicRootStateNameAsPrefix + name
            regionNames.put(cfr, name)
            return name
        }
    }
    
    def getStateName(State s, ControlflowRegion cfr) {
        if (stateNames.keySet.contains(s)) {
            return stateNames.get(s)
        } else {
            var name = cfr.regionName + "_state" +s.name.hostcodeSafeName
            var counter = 2
            while (stateNames.values.contains(name)) {
                name = cfr.regionName + "_state" +s.name.hostcodeSafeName + counter++
            }           
            name = getLogicRootStateNameAsPrefix + name 
            stateNames.put(s, name)
            return name
        }
    }
    
    def getStateName(State s) {
        if (stateNames.keySet.contains(s)) {
            return stateNames.get(s)
        } else {
            val cfr = s.eContainer
            if (cfr instanceof ControlflowRegion) {
                return s.getStateName(cfr)
            }
            var name = "state" + s.name.hostcodeSafeName
            name = getLogicRootStateNameAsPrefix + name
            stateNames.put(s, name)
            return name
        }
    }
    
    def getStateEnumName(State s) {
        if (stateEnumNames.keySet.contains(s)) {
            return stateEnumNames.get(s)
        } else {
            var counter = 2
            var name = s.name.toUpperCase
            while (stateEnumNames.values.contains(name)) {
                name = s.name.toUpperCase + counter++
            }
            name = getLogicRootStateNameAsPrefix + name
            stateEnumNames.put(s, name)
            return name
        }
    }
    
    def getStateNameRunning(State s) {
        s.getStateName + ENUM_STATES_RUNNING.toLowerCase
    }
    
    def getStateEnumNameRunning(State s) {
        s.getStateEnumName + ENUM_STATES_RUNNING
    }

    def getContextTypeName(ControlflowRegion cfr) {
        if (contextNames.keySet.contains(cfr)) {
            return contextNames.get(cfr)
        } else {
            var name = cfr.name.hostcodeSafeName + CONTEXT_TYPE_NAME
            name = getLogicRootStateNameAsPrefix + name
            var upperCaseName = name.substring(0, 1).toUpperCase + name.substring(1)
            var counter = 2
            while (contextNames.values.contains(upperCaseName)) {
                upperCaseName = name.substring(0, 1).toUpperCase + name.substring(1) + counter++
            }
            contextNames.put(cfr, upperCaseName)
            return upperCaseName
        }
    }  
    
    def getContextVariableName(ControlflowRegion cfr) {
        cfr.getContextTypeName.toLowerCase
    }  
    
    protected def getLogicRootStateNameAsPrefix() {
        if (hasCustomNaming) {
            return (parent as StatebasedCCodeGeneratorModule).logic.getName
        }
        
        return ""
    }
    
    def getThreadStatusName() {
        getLogicRootStateNameAsPrefix + THREAD_STATUS_ENUM_NAME
    }
    
    def getIfaceName() {
        getLogicRootStateNameAsPrefix + STRUCT_INTERFACE_NAME_DEFAULT
    }
    
    def getRegionIfaceName() {
        getLogicRootStateNameAsPrefix + REGION_INTERFACE_NAME_DEFAULT
    }
    
//    private val ANNOTATION_PRIORITY = "optPrioIDs"
    val ANNOTATION_PRIORITY = "nodePrios"

    def int getStatePriority(State state) {
        if (state.hasAnnotation(ANNOTATION_PRIORITY)) {
            return state.getAnnotation(ANNOTATION_PRIORITY).asIntAnnotation.value
        } else {
            return 0
        }
    }    
}