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

import org.eclipse.xtend.lib.annotations.Accessors
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import static extension de.cau.cs.kieler.sccharts.processors.codegen.statebased.StatebasedCCodeGeneratorStructModule.*
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions

/**
 * C Code Generator Tick Module
 * 
 * Handles the creation of the tick function.
 * 
 * @author ssm
 * @kieler.design 2018-04-16 proposed 
 * @kieler.rating 2018-04-16 proposed yellow 
 * 
 */
class StatebasedCCodeGeneratorTickModule extends SCChartsCodeGeneratorModule {
    
    @Inject extension SCChartsStateExtensions
    
    protected static val TICK_NAME = "tick"
    
    var StatebasedCCodeGeneratorStructModule struct
    var StatebasedCCodeGeneratorLogicModule logic
    @Accessors @Inject StatebasedCCodeSerializeHRExtensions serializer
    
    override configure() {
        struct = (parent as StatebasedCCodeGeneratorModule).struct as StatebasedCCodeGeneratorStructModule
        logic = (parent as StatebasedCCodeGeneratorModule).logic as StatebasedCCodeGeneratorLogicModule
    }
    
    override getName() {
        TICK_NAME + baseName + suffix
    }
    
    override generateInit() {
        code.add(
            MLC("The surrounding application should call " + getName + "() once per clock tick.",
                "The interface inside the TickData struct should be used to communicate with the logic.",
                "Set the inputs before you call " + getName + "() and read out the outputs afterwards."
            ),
            
            
            "void ", getName, "(", struct.getName, " *", struct.getVariableName, ")"
        )
        
        struct.forwardDeclarations.append(code).append(";\n\n")
        
        code.add(
            " {", NL,
            IFC(printDebug, "  printf(\"\\nTICK \"); fflush(stdout);\n")
        )
        
        code.add(
            "  if (", STRUCT_CONTEXT_NAME, "->", REGION_ROOT_TERMINATED, ") return;", NL
        )
    }
    
    protected def void generateInitSetInputs(extension StatebasedCCodeSerializeHRExtensions serializer) {
        for (declaration : rootState.declarations.filter(VariableDeclaration).filter[ input ]) {
            for (valuedObject : declaration.valuedObjects) {
                code.add(
                    indentation, 
                    STRUCT_CONTEXT_NAME,
                    "->", 
                    REGION_INTERFACE_NAME,
                    ".",
                    valuedObject.name,
                    " = ",
                    STRUCT_CONTEXT_NAME,
                    "->",
                    valuedObject.name,
                    ";", NL
                )
            }
        }
        
        if (rootState.declarations.filter(VariableDeclaration).exists[ input ]) code.append("\n")
    }

    protected def void generateInitSetOutputs(extension StatebasedCCodeSerializeHRExtensions serializer) {
        if (rootState.declarations.filter(VariableDeclaration).exists[ output ]) code.append("\n")
        
        for (declaration : rootState.declarations.filter(VariableDeclaration).filter[ output ]) {
            for (valuedObject : declaration.valuedObjects) {
                code.add(
                    indentation,
                    STRUCT_CONTEXT_NAME,
                    "->",
                    valuedObject.name,
                    " = ",
                    STRUCT_CONTEXT_NAME,
                    "->",
                    REGION_INTERFACE_NAME,
                    ".",
                    valuedObject.name,
                    ";", NL
                )
            }
        }
    }
    
    override generate() {
        generateInitSetInputs(serializer)
        
        code.add(
            "  int newPriority;", NL, NL
        )
        
        for (cfr : rootState.regions.filter(ControlflowRegion).indexed) {
            val cfrName = struct.getContextVariableName(cfr.value)
            var prefix = STRUCT_CONTEXT_NAME
            prefix += "->"
            prefix += cfrName
            prefix += "."
                        
            setTickStart(prefix, cfr.value)
            
            code.add(
                "  if (", CONTEXT_DATA_NAME, "->", cfrName, ".", REGION_ACTIVE_PRIORITY, " > ",
                        CONTEXT_DATA_NAME, "->activePriority", ")", NL, 
                "    ", CONTEXT_DATA_NAME, "->activePriority = ", 
                            CONTEXT_DATA_NAME, "->", cfrName, ".", REGION_ACTIVE_PRIORITY, ";", NL
            )
        }        

        code.add(NL, "  do {", NL)

        code.add(
            indentation, "  ", struct.getStateNameRunning(rootState), "(", struct.getVariableName, ");", NL
        )

        val conditionalBuilder = new StringBuilder
        val regionCount = rootState.regions.filter(ControlflowRegion).size
        for (cfr : rootState.regions.filter(ControlflowRegion).indexed) {
            val contextName = struct.getContextVariableName(cfr.value)
            conditionalBuilder.add(
                CONTEXT_DATA_NAME, "->", contextName, ".threadStatus == ", THREAD_STATUS_WAITING
            )
            if (cfr.key < regionCount-1) 
                conditionalBuilder.add(" || ", NL, "    ")
        }
            
        code.add("  } while (" + conditionalBuilder + ");", NL, NL);

        generateInitSetOutputs(serializer)

    }
    
    protected def void setTickStart(String prefix, ControlflowRegion cfr) {
        var ctxName = struct.getContextVariableName(cfr);
        
        val conditionalBuilder = new StringBuilder
        val regionCount = rootState.regions.filter(ControlflowRegion).size

        val hierarchicalStates = cfr.states.filter[ isHierarchical ].toList
//        if (hierarchicalStates.size > 0) {
//            code.add(
//                "  ", "newPriority = ", prefix, REGION_ACTIVE_PRIORITY, ";", NL
//            )
//        }
        for (cfr2 : hierarchicalStates.map[ regions ].flatten.filter(ControlflowRegion)) {
            var prefix2 = prefix
            prefix2 += struct.getContextVariableName(cfr2) 
            prefix2 += "."
            setTickStart(prefix2, cfr2)
            
            
            conditionalBuilder.add(
                "    ", "if ((", prefix, struct.getContextVariableName(cfr2), ".activePriority > ",
                  prefix, REGION_ACTIVE_PRIORITY, ") &&", NL,
                "      (", prefix, struct.getContextVariableName(cfr2), ".", REGION_THREADSTATUS, " == ", THREAD_STATUS_WAITING, "))", NL,   
                
                "      ", prefix, REGION_ACTIVE_PRIORITY, " = ", prefix, struct.getContextVariableName(cfr2), ".activePriority;", NL 
            )
        }
        
      
        val conditional = conditionalBuilder.toString
        
        
        code.add(
          "  ", "if (", prefix, REGION_THREADSTATUS, " == ",THREAD_STATUS_PAUSING, ") {", NL,
          "    ", prefix, REGION_THREADSTATUS, " = ", THREAD_STATUS_WAITING, ";", NL,
//          IFC(hierarchicalStates.size > 0, "    ", prefix, REGION_ACTIVE_PRIORITY, " = 0;"), NL,
          IFC(!conditional.nullOrEmpty, conditional), 
          IFC(printDebug, "    printf(\"APRIO " + ctxName +" %d \", " + prefix, "activePriority); fflush(stdout);\n"),
          "    ", prefix, REGION_DELAYED_ENABLED, " = 1;", NL,
          "  ",  "}", NL            
        )
        
    } 
    
    override generateDone() {
        code.add(
            IFC(printDebug, "  printf(\"TICKEND \"); fflush(stdout);\n"),
            "}", NL
        ) 
    }
    
}