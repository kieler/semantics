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
    
    protected static val TICK_NAME = "tick"
    
    var StatebasedCCodeGeneratorStructModule struct
    var StatebasedCCodeGeneratorLogicModule logic
    @Accessors @Inject StatebasedCCodeSerializeHRExtensions serializer
    
    override configure() {
        struct = (parent as StatebasedCCodeGeneratorModule).struct as StatebasedCCodeGeneratorStructModule
        logic = (parent as StatebasedCCodeGeneratorModule).logic as StatebasedCCodeGeneratorLogicModule
    }
    
    def getName() {
        TICK_NAME + baseName + suffix
    }
    
    override generateInit() {
        code.add(
            MLC("The surrounding application should call " + getName + "() once per clock tick.",
                "The interface inside the TickData struct should be used to communicate with the logic.",
                "Set the inputs before you call " + getName + "() and read out the outputs afterwards.",
                "",
                "Invocation of the " + getName + "() includes the following steps:",
                "  - Communication with the simulation interface for the inputs",
                "  - Call of the logic function of the programm ",
                "  - Communication with the simulation interface for the outputs",
                "  - Additional tasks, such as register saves, if necessary"
            ),
            
            
            "void ", getName, "(", struct.getName, " *", struct.getVariableName, ")"
        )
        
        struct.forwardDeclarations.append(code).append(";\n\n")
        
        code.add(
            " {", NL
        )
        
        generateInitSetInputs(serializer)

        code.add(
            indentation, logic.getName, "(", struct.getVariableName, ");", NL
        )

        generateInitSetOutputs(serializer)
    }
    
    protected def void generateInitSetInputs(extension StatebasedCCodeSerializeHRExtensions serializer) {
        for (declaration : rootState.declarations.filter(VariableDeclaration).filter[ input ]) {
            for (valuedObject : declaration.valuedObjects) {
                code.add(
                    indentation, 
                    STRUCT_VARIABLE_NAME,
                    "->", 
                    REGION_INTERFACE_NAME,
                    ".",
                    valuedObject.name,
                    " = ",
                    STRUCT_VARIABLE_NAME,
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
                    STRUCT_VARIABLE_NAME,
                    "->",
                    valuedObject.name,
                    " = ",
                    STRUCT_VARIABLE_NAME,
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

    }
    
    override generateDone() {
        code.add(
            "}", NL
        ) 
    }
    
}