/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.java

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.scg.processors.transformators.codegen.c.CCodeGeneratorLogicModule
import de.cau.cs.kieler.scg.processors.transformators.codegen.c.CCodeSerializeHRExtensions
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kexpressions.ValueType

/**
 * Java Code Generator Logic Module
 * 
 * Handles the creation of the tick logic function.
 * 
 * @author ssm
 * @kieler.design 2017-07-24 proposed 
 * @kieler.rating 2017-07-24 proposed yellow 
 * 
 */
class JavaCodeGeneratorLogicModule extends CCodeGeneratorLogicModule {
    
    @Inject JavaCodeSerializeHRExtensions javaSerializer
    
    override configure() {
        struct = (parent as JavaCodeGeneratorModule).struct as JavaCodeGeneratorStructModule
        reset = (parent as JavaCodeGeneratorModule).reset as JavaCodeGeneratorResetModule
        tick = (parent as JavaCodeGeneratorModule).tick as JavaCodeGeneratorTickModule
        
        indentationModifier = 1
        serializer = javaSerializer
    }

    override generateInit() {
        preVariables.clear
        
        indent(0)
        code.append("public void ").append(getName)
        code.append("(")
        code.append(")")
        
        code.append(" {\n")
    }
    
    override def void addPreVariable(OperatorExpression operatorExpression, extension CCodeSerializeHRExtensions serializer) {
        valuedObjectPrefix = ""
        prePrefix = JavaCodeGeneratorStructModule.STRUCT_PRE_PREFIX
        val name = operatorExpression.serializeHR 
        if (preVariables.contains(name)) return;
        val struct = this.struct as JavaCodeGeneratorStructModule
    
        // Add the pre variable to the variables hashes to mark it handled.    
        preVariables += name.toString
        VariableStore.store(processorInstance.environment).add(name, "guard", "preGuard").type = ValueType.BOOL
        
        // Add the variable to the data struct.
        struct.code.append(indentation +  "public boolean ")
        struct.code.append(name)
        struct.code.append(";\n")
        
        // Add the initialization in the reset function.
        reset.code.append(indentation + indentation).append(struct.getVariableName).append(struct.separator).append(name).append(" = false;\n")
        
        // Add the "register save" in the tick function.
        prePrefix = "_"
        tick.code.append(indentation + indentation)
        tick.code.append(struct.getVariableName).append(struct.separator).append(name).append(" = ")
        tick.code.append(struct.getVariableName).append(struct.separator).append(operatorExpression.serializeHR).append(";\n")
    }    
}