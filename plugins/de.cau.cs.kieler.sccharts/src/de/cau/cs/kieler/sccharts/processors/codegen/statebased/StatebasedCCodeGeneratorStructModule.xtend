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
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class StatebasedCCodeGeneratorStructModule extends SCChartsCodeGeneratorModule {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsStateExtensions
    @Accessors @Inject StatebasedCCodeSerializeHRExtensions serializer
    
    public static val STRUCT_NAME = "Interface"
    public static val STRUCT_VARIABLE_NAME = "interface"
    public static val STRUCT_PRE_PREFIX = "_p"
    
    public static val ENUM_STATES_SUFFIX = "States"
    public static val ENUM_STATES_NONE = "NONE"
    public static val ENUM_STATES_RUNNING = "RUNNING"
    
    public static val THREAD_STATUS_ENUM = "ThreadStatus"
    public static val THREAD_STATUS_EMPTY = "EMPTY"
    public static val THREAD_STATUS_RUNNING = "RUNNING"
    public static val THREAD_STATUS_DISPATCHED = "DISPATCHED"
    public static val THREAD_STATUS_PAUSED = "PAUSED"
    
    public static val REGION_DATA_NAME = "data"
    
    @Accessors StringBuilder forwardDeclarations = new StringBuilder
    @Accessors StringBuilder threadData = new StringBuilder
    
    @Accessors Map<ControlflowRegion, String> regionNames = <ControlflowRegion, String> newHashMap
    
    private var regionCounter = 0
  
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
        code.append("typedef enum ")
        code.append(THREAD_STATUS_ENUM)
        code.append(" {\n  ")
        code.append(THREAD_STATUS_EMPTY)
        code.append(", ")
        code.append(THREAD_STATUS_RUNNING)
        code.append(", ")
        code.append(THREAD_STATUS_DISPATCHED)
        code.append(", ")
        code.append(THREAD_STATUS_PAUSED)
        code.append("\n};\n\n")
        
        code.append("typedef struct {\n")
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
                    code.append(indentation + declarationType)
                    code.append(" ")
                    code.append(valuedObject.name)
                    if (valuedObject.isArray) {
                        for (cardinality : valuedObject.cardinalities) {
                            code.append("[" + cardinality.serializeHR + "]")
                        }
                    }
                    code.append(";\n")
                }
            }
        }
    }
    
    override generateDone() {
        code.append("} ").append(getName).append(";\n")
        
        if (threadData.length > 0) code.append("\n")
        code.append(threadData)
        
        if (forwardDeclarations.length > 0) code.append("\n")
        code.append(forwardDeclarations)
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
        
        threadData.append("typedef enum ");
        threadData.append(name + ENUM_STATES_SUFFIX) 
        threadData.append(" {\n  ")
        threadData.append(ENUM_STATES_NONE + ", ")
        for (state : cfr.states.indexed) {
            val stateName = state.value.stateName
            threadData.append(stateName)
            if (state.value.isHierarchical) {
                threadData.append(", " + stateName + ENUM_STATES_RUNNING)
            }
            if (state.key < cfr.states.size - 1) threadData.append(", ")
        }
        threadData.append("\n};\n\n")
        
        threadData.append("typedef struct {\n")
        threadData.append(indentation + name + ENUM_STATES_SUFFIX + " activeState;\n")
        threadData.append(indentation + name + ENUM_STATES_SUFFIX + " tickStartState;\n")
        threadData.append(indentation + THREAD_STATUS_ENUM + " threadStatus;\n")
        threadData.append(indentation + "int activePriority;\n")
        
        if (children !== null && children.size > 0) {
            for (child : children) {
                val childName = child.getRegionName
                threadData.append(indentation + childName + " " + childName + ";\n")
            }
        }
        
        threadData.append("} ")
        threadData.append(name)
        threadData.append(";\n\n")
        
        regionNames.put(cfr, name)
    }
}