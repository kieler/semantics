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

import org.eclipse.xtend.lib.annotations.Accessors
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import static extension de.cau.cs.kieler.sccharts.processors.statebased.codegen.StatebasedCCodeGeneratorStructModule.*
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
    
    var StatebasedCCodeGeneratorStructModule struct
    var StatebasedCCodeGeneratorLogicModule logic
    @Accessors @Inject StatebasedCCodeSerializeHRExtensions serializer
    
    override configure() {
        struct = (parent as StatebasedCCodeGeneratorModule).struct as StatebasedCCodeGeneratorStructModule
        logic = (parent as StatebasedCCodeGeneratorModule).logic as StatebasedCCodeGeneratorLogicModule
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
            "  if (!", STRUCT_CONTEXT_NAME, "->", REGION_THREADSTATUS, ") return;", NL
        )
    }
    
    protected def void generateInitSetInputs(extension StatebasedCCodeSerializeHRExtensions serializer) {
        for (declaration : rootState.declarations.filter(VariableDeclaration).filter[ input ]) {
            for (valuedObject : declaration.valuedObjects) {
                code.add(
                    indentation, 
                    STRUCT_CONTEXT_NAME,
                    "->", 
                    struct.getRegionIfaceName,
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
                    struct.getRegionIfaceName,
                    ".",
                    valuedObject.name,
                    ";", NL
                )
            }
        }
    }
    
    override generate() {
//        generateInitSetInputs(serializer)
        
        for (cfr : rootState.regions.filter(ControlflowRegion).indexed) {
            val cfrName = struct.getContextVariableName(cfr.value)
            var prefix = STRUCT_CONTEXT_NAME
            prefix += "->"
            prefix += cfrName
            prefix += "."
                        
            setTickStart(prefix, cfr.value)
        }        

        code.add(IFC(!leanMode, NL, "  do {", NL))

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
            
        code.add(IFC(!leanMode, "  } while (" + conditionalBuilder + ");", NL, NL));

//        generateInitSetOutputs(serializer)
    }
    
    protected def void setTickStart(String prefix, ControlflowRegion cfr) {
        var ctxName = struct.getContextVariableName(cfr);
        
        val regionCount = rootState.regions.filter(ControlflowRegion).size

        val hierarchicalStates = cfr.states.filter[ isHierarchical ].toList
        for (cfr2 : hierarchicalStates.map[ regions ].flatten.filter(ControlflowRegion)) {
            var prefix2 = prefix
            prefix2 += struct.getContextVariableName(cfr2) 
            prefix2 += "."
            setTickStart(prefix2, cfr2)
            
        }
      
        code.add(
          "  ", "if (", prefix, REGION_THREADSTATUS, " == ",THREAD_STATUS_PAUSING, ") {", NL,
          "    ", prefix, REGION_THREADSTATUS, " = ", THREAD_STATUS_WAITING, ";", NL,
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