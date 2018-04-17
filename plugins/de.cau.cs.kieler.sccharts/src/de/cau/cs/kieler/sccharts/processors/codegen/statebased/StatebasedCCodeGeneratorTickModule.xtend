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

import org.eclipse.xtend.lib.annotations.Accessors
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * C Code Generator Tick Module
 * 
 * Handles the creation of the tick function.
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
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
        code.append("void ").append(getName)
        code.append("(")
        code.append(struct.getName).append(" *").append(struct.getVariableName)
        code.append(")")
        
        struct.forwardDeclarations.append(code).append(";\n")
        
        code.append(" {\n")
        
        generateInitSetInputs(serializer)

        code.append(indentation).append(logic.getName).append("(").append(struct.getVariableName).append(");\n")

        generateInitSetOutputs(serializer)
    }
    
    protected def void generateInitSetInputs(extension StatebasedCCodeSerializeHRExtensions serializer) {
        for (declaration : rootState.declarations.filter(VariableDeclaration).filter[ input ]) {
            for (valuedObject : declaration.valuedObjects) {
                code.append(indentation)
                code.append(StatebasedCCodeGeneratorStructModule.STRUCT_VARIABLE_NAME)
                code.append("->")
                code.append(StatebasedCCodeGeneratorStructModule.REGION_INTERFACE_NAME)
                code.append(".")
                code.append(valuedObject.name)
                code.append(" = ")
                code.append(StatebasedCCodeGeneratorStructModule.STRUCT_VARIABLE_NAME)
                code.append("->")
                code.append(valuedObject.name)
                code.append(";\n")
            }
        }
        
        if (rootState.declarations.filter(VariableDeclaration).exists[ input ]) code.append("\n")
    }

    protected def void generateInitSetOutputs(extension StatebasedCCodeSerializeHRExtensions serializer) {
        if (rootState.declarations.filter(VariableDeclaration).exists[ output ]) code.append("\n")
        
        for (declaration : rootState.declarations.filter(VariableDeclaration).filter[ output ]) {
            for (valuedObject : declaration.valuedObjects) {
                code.append(indentation)
                code.append(StatebasedCCodeGeneratorStructModule.STRUCT_VARIABLE_NAME)
                code.append("->")
                code.append(valuedObject.name)
                code.append(" = ")
                code.append(StatebasedCCodeGeneratorStructModule.STRUCT_VARIABLE_NAME)
                code.append("->")
                code.append(StatebasedCCodeGeneratorStructModule.REGION_INTERFACE_NAME)
                code.append(".")
                code.append(valuedObject.name)
                code.append(";\n")
            }
        }
    }
    
    override generate() {

    }
    
    override generateDone() {
//        indent 
//        code.append(struct.getVariableName).append("->").append(AbstractGuardExpressions.GO_GUARD_NAME).append(" = 0;\n")
        code.append("}\n")
    }
    
}